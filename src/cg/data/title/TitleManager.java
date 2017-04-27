package cg.data.title;

import java.util.Collection;
import java.util.List;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import cg.base.sprite.Title;
import cg.data.resource.ProjectData;
import cg.data.resource.ProjectDataListener;
import gnu.trove.map.TShortObjectMap;
import gnu.trove.map.hash.TShortObjectHashMap;

public class TitleManager implements ProjectDataListener {
	
	private TShortObjectMap<Title> titles;
	
	private Multimap<Short, TitleConfig> titleConfigs;
	
	public TitleManager() {
		titles = new TShortObjectHashMap<>();
		titleConfigs = ArrayListMultimap.create();
	}

	@Override
	public void reload(ProjectData projectData) throws Exception {
		loadTitle(projectData);
		loadTitleConfig(projectData);
	}
	
	private void loadTitle(ProjectData projectData) {
		titles.clear();
		List<Title> list = projectData.read(Title.class);
		for (Title title : list) {
			titles.put(title.getId(), title);
		}
	}
	
	private void loadTitleConfig(ProjectData projectData) {
		titleConfigs.clear();
		List<TitleConfig> list = projectData.read(TitleConfig.class);
		for (TitleConfig titleConfig : list) {
			short titleId = titleConfig.getTitleId();
			titleConfigs.put(titleId, titleConfig);
		}
	}
	
	public Title getTitle(short id) {
		return titles.get(id);
	}
	
	public Collection<TitleConfig> getTitleConfig(short id) {
		return titleConfigs.get(id);
	}

}
