package cg.data.sprite;

public interface RoleAnimationInfo {
	
	byte NO_SELECT_PAGE = -1;
	
	byte getRoleId();
	
	byte getGender();
	
	byte getSelectPageIndex();
	
	int[] getAnimationIds();
	
	int[] getHeadIds();

}
