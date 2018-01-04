package cg.data.gmsvReader;

import java.io.File;
import java.util.Collection;

import org.tool.server.ioc.IOCBean;

import cg.base.conf.ConfItemRecipe;
import cg.base.item.ItemRecipe;
import cg.base.item.ItemRecipe.MaterialInfo;
import cg.base.loader.IOCBeanType;

@IOCBean(type=IOCBeanType.READER)
class CItemRecipeReader extends BaseObjectReader<ItemRecipe, ConfItemRecipe> {
	
	private static class CItemRecipe implements ItemRecipe {
		
		private String name;
		
		private short id;
		
		private int itemId;
		
		private short skillId;
		
		private MaterialInfo[] materials;

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

	@Override
	Class<ConfItemRecipe> getFromClass() {
		return ConfItemRecipe.class;
	}

	@Override
	ItemRecipe transform(ConfItemRecipe s) {
		CItemRecipe ret = new CItemRecipe();
		ret.name = s.getName();
		ret.id = s.getId();
		ret.itemId = s.getItemId();
		ret.skillId = s.getSkillId();
		// 4 {0, 1, 10, 15, 45, 60, 120}
		int[] materialIds = s.getMaterialIds();
		byte[] needAmounts = s.getNeedAmounts();
		ret.materials = new MaterialInfo[materialIds.length];
		for (int i = 0;i < ret.materials.length;i++) {
			ret.materials[i] = new CMaterialInfo(materialIds[i], needAmounts[i]);
		}
		return ret;
	}

}
