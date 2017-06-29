package cg.data.gmsvReader;

import java.io.File;
import java.util.Collection;
import java.util.List;

import org.tool.server.ioc.IOCBean;

import com.google.common.collect.Range;

import cg.base.conf.ConfEnemy;
import cg.base.conf.IConfEnemy;
import cg.base.loader.IOCBeanType;
import cg.base.util.MathUtil;
import cg.data.item.DropItemGroup;
import cg.data.item.DropItemGroup.DropItem;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;
import cg.data.sprite.EnemyInfo;

@IOCBean(type=IOCBeanType.READER)
class CEnemyReader implements ObjectReader<EnemyInfo> {

	@Override
	public List<EnemyInfo> read(ProjectData projectData) {
		return ObjectReader.transform(ConfEnemy.arrayFromExcel(projectData), s -> { return new CEnemyInfo(s); });
	}
	
	private static class CEnemyInfo implements EnemyInfo {
		
		private String name;
		
		private String[] aiParams;
		
		private int enemyId, enemybaseId, aiId, gainExp, battleScore, enemyTalk;
		
		private Range<Short> level, amount;
		
		private boolean canCatch;
		
		private DropItemGroup dropItemGroup, stealItemGroup;
		
		private byte[] actionCode;
		
		private int[] summonCode;
		
		public CEnemyInfo(IConfEnemy conf) {
			name = conf.getName();
			aiParams = conf.getAiParams().split(";");
			enemyId = conf.getEnemyId();
			enemybaseId = conf.getEnemybaseId();
			level = MathUtil.createRange(conf.getMinLevel(), conf.getMaxLevel());
			amount = MathUtil.createRange(conf.getMinAmount(), conf.getMaxAmount());
			aiId = conf.getAiId();
			gainExp = conf.getGainExp();
			battleScore = conf.getBattleScore();
			canCatch = conf.getCanCatch();
			int[] drops = conf.getDrops();
			int[] dropRates = conf.getDropRates();
			DropItem[] dropItems = new DropItem[drops.length];
			for (int i = 0;i < drops.length;i++) {
				dropItems[i] = new CDropItem(drops[i], dropRates[i]);
			}
			dropItemGroup = new CDropItemGroup(dropItems);
			int[] steals = conf.getSteals();
			int[] stealRates = conf.getStealRates();
			DropItem[] stealItems = new DropItem[steals.length];
			for (int i = 0;i < stealItems.length;i++) {
				stealItems[i] = new CDropItem(steals[i], stealRates[i]);
			}
			stealItemGroup = new CDropItemGroup(stealItems);
			actionCode = conf.getActionCodes();
			summonCode = conf.getSummonCodes();
			enemyTalk = conf.getEnemyTalk();
		}
		
		@Override
		public String getEnemyName() {
			return name;
		}

		@Override
		public int getEnemyId() {
			return enemyId;
		}

		@Override
		public int getEnemyBaseId() {
			return enemybaseId;
		}

		@Override
		public int getAiId() {
			return aiId;
		}

		@Override
		public int getGainExp() {
			return gainExp;
		}

		@Override
		public DropItemGroup getDropItems() {
			return dropItemGroup;
		}

		@Override
		public DropItemGroup getStealItems() {
			return stealItemGroup;
		}

		@Override
		public byte[] getActionCode() {
			return actionCode;
		}

		@Override
		public int[] getSummonCode() {
			return summonCode;
		}

		@Override
		public int getEnemyTalk() {
			return enemyTalk;
		}

		@Override
		public Range<Short> getLevelRange() {
			return level;
		}

		@Override
		public Range<Short> getAmount() {
			return amount;
		}

		@Override
		public String[] getAiParams() {
			return aiParams;
		}

		@Override
		public int getBattleScore() {
			return battleScore;
		}

		@Override
		public boolean getCanCatch() {
			return canCatch;
		}
		
	}

	@Override
	public void output(File outFile, Collection<EnemyInfo> collection)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}

class CDropItem implements DropItem {
	
	private int itemId, rate;
	
	public CDropItem(int itemId, int rate) {
		this.itemId = itemId;
		this.rate = rate;
	}

	public int getItemId() {
		return itemId;
	}

	public int getRate() {
		return rate;
	}

	@Override
	public int getMaxCount() {
		return MIN_COUNT;
	}

}

class CDropItemGroup implements DropItemGroup {
	
	private DropItem[] dropItems;
	
	private int totalRate;
	
	public CDropItemGroup(DropItem[] dropItems) {
		this.dropItems = dropItems;
		for (DropItem dropItem : dropItems) {
			totalRate += dropItem.getRate();
		}
	}

	@Override
	public DropItem[] getDropItems() {
		return dropItems;
	}

	@Override
	public int getTotalRate() {
		return totalRate;
	}
	
}
