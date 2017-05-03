package cg.data.battle.skill;

import java.util.Map;

import cg.data.resource.ProjectData;
import cg.data.resource.ProjectDataListener;

import com.google.common.collect.Maps;

public class CShots implements ProjectDataListener {
	
	private final Map<String, Shot> shots;
	
	public CShots() {
		shots = Maps.newHashMap();
		shots.put(SkillLevelData.TECH_SpiracleShot, new CSpiracleShot());
		shots.put(SkillLevelData.TECH_RandomShot, new CRandomShot());
	}
	
	public Shot getShot(SkillLevelData skillData) {
		return getShot(skillData.getTechType());
	}
	
	public Shot getShot(String techType) {
		return shots.get(techType);
	}

	@Override
	public void reload(ProjectData projectData) throws Exception {
		for (Shot shot : shots.values()) {
			if (shot instanceof ProjectDataListener) {
				((ProjectDataListener) shot).reload(projectData);
			}
		}
	}

}
