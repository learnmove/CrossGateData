package cg.data.gmsvReader;

import java.io.File;
import java.util.Collection;
import java.util.List;

import org.tool.server.ioc.IOCBean;

import cg.base.loader.IOCBeanType;
import cg.base.util.MathUtil;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;
import cg.data.sprite.Message;

import com.google.common.collect.Lists;

@IOCBean(type=IOCBeanType.READER)
class CMessageReader implements ObjectReader<Message> {

	@Override
	public List<Message> read(ProjectData projectData) {
		String[] lines = projectData.getTextResource("msg");
		List<Message> messages = Lists.newArrayListWithCapacity(lines.length);
		for (String line : lines) {
			messages.add(new CMessage(line));
		}
		return messages;
	}
	
	private static class CMessage implements Message {
		
		private int id;
		
		private String content;
		
		public CMessage(String line) {
			String[] infos = line.split("\t", -2);
			id = MathUtil.stringToInt(infos[0]);
			content = infos[1];
		}

		@Override
		public int getId() {
			return id;
		}

		@Override
		public String getContent() {
			return content;
		}

		@Override
		public int get() {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}

	@Override
	public void output(File outFile, Collection<Message> collection)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
