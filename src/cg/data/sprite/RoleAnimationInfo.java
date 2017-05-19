package cg.data.sprite;

import cg.base.io.ResourceInfo;

public interface RoleAnimationInfo {
	
	byte NO_SELECT_PAGE = -1;
	
	byte getRoleId();
	
	byte getGender();
	
	byte getSelectPageIndex();
	
	ResourceInfo[] getAnimationsInfo();
	
	ResourceInfo[] getHeadsInfo();

}
