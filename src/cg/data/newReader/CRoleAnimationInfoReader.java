package cg.data.newReader;

import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tool.server.ioc.IOCBean;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import cg.base.conf.ConfAnimation;
import cg.base.conf.IConfAnimation;
import cg.base.loader.IOCBeanType;
import cg.base.sprite.Unit;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;
import cg.data.sprite.RoleAnimationInfo;

@IOCBean(type=IOCBeanType.READER)
class CRoleAnimationInfoReader implements ObjectReader<RoleAnimationInfo> {
	
	private static final Logger log = LoggerFactory.getLogger(CRoleAnimationInfoReader.class);

	@Override
	public List<RoleAnimationInfo> read(ProjectData projectData) {
		try {
			List<IConfAnimation> confAnimations = ConfAnimation.arrayFromExcel(projectData);
			Map<Byte, CRoleAnimationInfo> indexs = Maps.newTreeMap();
			for (IConfAnimation confAnimation : confAnimations) {
				CRoleAnimationInfo animationInfo;
				byte roleId = confAnimation.getRoleId();
				if (indexs.containsKey(roleId)) {
					animationInfo = indexs.get(roleId);
				} else {
					animationInfo = new CRoleAnimationInfo();
					animationInfo.roleId = roleId;
					indexs.put(roleId, animationInfo);
				}
				animationInfo.addAnimationId(confAnimation.getAnimationGlobalId());
				animationInfo.addHeadId(confAnimation.getHeadGlobalId());
				animationInfo.gender = confAnimation.getGender().equals("男") ? Unit.GENDER_MALE : Unit.GENDER_FEMALE;
				animationInfo.pageIndex = confAnimation.getPage();
			}
			return Lists.newArrayList(indexs.values());
		} catch (Exception e) {
			log.error("", e);
			return null;
		}
	}
	
	private static class CRoleAnimationInfo implements RoleAnimationInfo {
		
		private byte roleId, gender, pageIndex;
		
		private int[] animationIds, headIds;

		@Override
		public byte getRoleId() {
			return roleId;
		}

		@Override
		public byte getGender() {
			return gender;
		}
		
		public void addAnimationId(int id) {
			if (id > 0) {
				if (animationIds == null) {
					animationIds = new int[]{id};
				} else {
					int[] ret = new int[animationIds.length + 1];
					System.arraycopy(animationIds, 0, ret, 0, animationIds.length);
					ret[animationIds.length] = id;
					animationIds = ret;
				}
			}
		}
		
		public void addHeadId(int id) {
			if (id > 0) {
				if (headIds == null) {
					headIds = new int[]{id};
				} else {
					int[] ret = new int[headIds.length + 1];
					System.arraycopy(headIds, 0, ret, 0, headIds.length);
					ret[headIds.length] = id;
					headIds = ret;
				}
			}
		}

		@Override
		public byte getSelectPageIndex() {
			return pageIndex;
		}

		@Override
		public int[] getAnimationIds() {
			return animationIds;
		}

		@Override
		public int[] getHeadIds() {
			return headIds;
		}
		
	}

	@Override
	public void output(File outFile, Collection<RoleAnimationInfo> collection) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
