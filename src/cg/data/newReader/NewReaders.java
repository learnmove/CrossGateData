package cg.data.newReader;

import cg.data.battle.skill.SkillInfo;
import cg.data.resource.AnimationReaderCreator;
import cg.data.resource.MessageManager;
import cg.data.resource.ObjectReader;
import cg.data.sprite.RoleAnimationInfo;

public final class NewReaders {
	
	private NewReaders() {}
	
	public static ObjectReader<RoleAnimationInfo> createRoleAnimationInfoReader(AnimationReaderCreator animationReaderCreator) {
		return new CRoleAnimationInfoReader(animationReaderCreator);
	}
	
	public static ObjectReader<SkillInfo> createSkillInfoReader(MessageManager messageManager) {
		return new CSkillInfoReader(messageManager);
	}

}
