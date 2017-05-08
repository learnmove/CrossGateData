package cg.data.newReader;

import cg.data.battle.skill.SkillInfo;
import cg.data.resource.MessageManager;
import cg.data.resource.ObjectReader;
import cg.data.sprite.RoleAnimationInfo;

public final class NewReaders {
	
	private NewReaders() {}
	
	public static ObjectReader<RoleAnimationInfo> createRoleAnimationInfoReader() {
		return new CRoleAnimationInfoReader();
	}
	
	public static ObjectReader<SkillInfo> createSkillInfoReader(MessageManager messageManager) {
		return new CSkillInfoReader(messageManager);
	}

}
