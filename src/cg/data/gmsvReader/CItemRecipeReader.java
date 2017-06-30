package cg.data.gmsvReader;

import java.io.File;
import java.util.Collection;
import java.util.List;

import org.tool.server.ioc.IOCBean;

import cg.base.conf.ConfItemRecipe;
import cg.base.conf.IConfItemRecipe;
import cg.base.item.ItemRecipe;
import cg.base.item.ItemRecipe.MaterialInfo;
import cg.base.loader.IOCBeanType;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;

@IOCBean(type=IOCBeanType.READER)
class CItemRecipeReader implements ObjectReader<ItemRecipe> {

	@Override
	public List<ItemRecipe> read(ProjectData projectData) {
		return ObjectReader.transform(ConfItemRecipe.arrayFromExcel(projectData), s -> { return new CItemRecipe(s); });
	}
	
	private static class CItemRecipe implements ItemRecipe {
		
		private String name;
		
		private short id;
		
		private int itemId;
		
		private short skillId;
		
		private MaterialInfo[] materials;
		
		public CItemRecipe(IConfItemRecipe conf) {
			name = conf.getName();
			id = conf.getId();
			itemId = conf.getItemId();
			skillId = conf.getSkillId();
			// 4 {0, 1, 10, 15, 45, 60, 120}
			int[] materialIds = conf.getMaterialIds();
			byte[] needAmounts = conf.getNeedAmounts();
			materials = new MaterialInfo[materialIds.length];
			for (int i = 0;i < materials.length;i++) {
				materials[i] = new CMaterialInfo(materialIds[i], needAmounts[i]);
			}
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public short getId() {
			return id;
		}

		@Override
		public int getItemId() {
			return itemId;
		}

		@Override
		public short getSkillId() {
			return skillId;
		}

		@Override
		public MaterialInfo[] getMaterials() {
			return materials;
		}
		
	}
	
	private static class CMaterialInfo implements MaterialInfo {
		
		private final int itemId;
		
		private final byte needAmount;
		
		public CMaterialInfo(int itemId, byte needAmount) {
			this.itemId = itemId;
			this.needAmount = needAmount;
		}

		@Override
		public int getItemId() {
			return itemId;
		}

		@Override
		public byte getNeedAmount() {
			return needAmount;
		}
		
	}

	@Override
	public void output(File outFile, Collection<ItemRecipe> collection)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
