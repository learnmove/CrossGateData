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

import cg.base.animation.AnimationReader;
import cg.base.conf.ConfAnimation;
import cg.base.conf.IConfAnimation;
import cg.base.image.ImageReader;
import cg.base.io.ResourceInfo;
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
		ImageReader imageReader = projectData.getImageManager().getImageReader();
		AnimationReader animationReader = projectData.getAnimationReader();
		try {
			IConfAnimation[] confAnimations = ConfAnimation.arrayFromExcel(projectData);
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
				animationInfo.addAnimationInfo(animationReader.getResourceInfo(confAnimation.getAnimationGlobalId()));
				animationInfo.addHeadInfo(imageReader.getImageDictionary(confAnimation.getHeadGlobalId()));
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
		
		private ResourceInfo[] animationsInfo, headsInfo;

		@Override
		public byte getRoleId() {
			return roleId;
		}

		@Override
		public byte getGender() {
			return gender;
		}

		@Override
		public ResourceInfo[] getAnimationsInfo() {
			return animationsInfo;
		}

		@Override
		public ResourceInfo[] getHeadsInfo() {
			return headsInfo;
		}
		
		public void addAnimationInfo(ResourceInfo resourceInfo) {
			if (resourceInfo != null) {
				if (animationsInfo == null) {
					animationsInfo = new ResourceInfo[]{resourceInfo};
				} else {
					ResourceInfo[] ret = new ResourceInfo[animationsInfo.length + 1];
					System.arraycopy(animationsInfo, 0, ret, 0, animationsInfo.length);
					ret[animationsInfo.length] = resourceInfo;
					animationsInfo = ret;
				}
			}
		}
		
		public void addHeadInfo(ResourceInfo resourceInfo) {
			if (resourceInfo != null) {
				if (headsInfo == null) {
					headsInfo = new ResourceInfo[]{resourceInfo};
				} else {
					ResourceInfo[] ret = new ResourceInfo[headsInfo.length + 1];
					System.arraycopy(headsInfo, 0, ret, 0, headsInfo.length);
					ret[headsInfo.length] = resourceInfo;
					headsInfo = ret;
				}
			}
		}

		@Override
		public byte getSelectPageIndex() {
			return pageIndex;
		}
		
	}

	@Override
	public void output(File outFile, Collection<RoleAnimationInfo> collection) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
