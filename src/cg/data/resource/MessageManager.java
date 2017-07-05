package cg.data.resource;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import cg.base.conf.ConfMsg;
import cg.base.conf.IConfMsg;
import cg.data.gmsvReader.CGarbledReader.Garbled;
import gnu.trove.impl.unmodifiable.TUnmodifiableIntObjectMap;
import gnu.trove.map.TIntObjectMap;
import gnu.trove.map.hash.TIntObjectHashMap;

public class MessageManager implements ProjectDataListener {
	
	private static final int NO_MESSAGE = 0;
	
	private static final Logger log = LoggerFactory.getLogger(MessageManager.class);
	
	private TIntObjectMap<String> messages;
	
	private Map<String, String> garbleds;

	@Override
	public void reload(ProjectData  projectData) throws Exception {
		loadMessage(projectData);
		loadGarbled(projectData);
	}
	
	private void loadMessage(ProjectData  projectData) {
		TIntObjectMap<String> messages = new TIntObjectHashMap<>();
		IConfMsg[] confs = ConfMsg.arrayFromExcel(projectData);
		for (int i = 0;i < confs.length;i++) {
			messages.put(confs[i].getId(), confs[i].getContent());
		}
		this.messages = new TUnmodifiableIntObjectMap<>(messages);
	}
	
	private void loadGarbled(ProjectData  projectData) {
		Map<String, String> garbleds = Maps.newHashMap();
		List<Garbled> list = projectData.read(Garbled.class);
		for (int i = 0;i < list.size();i++) {
			Garbled garbled = list.get(i);
			garbleds.put(garbled.garbled, garbled.realWord);
		}
		this.garbleds = ImmutableMap.copyOf(garbleds);
	}
	
	public String getMessage(int msgId) {
		if (msgId != NO_MESSAGE && !messages.containsKey(msgId)) {
			log.warn("Message [{}] is null.", msgId);
			return "";
		}
		return messages.get(msgId);
	}
	
	public String getRealWord(String garbled) {
		return garbleds.get(garbled);
	}

}
