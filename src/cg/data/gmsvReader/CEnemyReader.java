package cg.data.gmsvReader;

import java.io.File;
import java.util.Collection;

import org.tool.server.ioc.IOCBean;

import com.google.common.collect.Range;

import cg.base.conf.ConfEnemy;
import cg.base.loader.IOCBeanType;
import cg.base.util.MathUtil;
import cg.data.item.DropItemGroup;
import cg.data.item.DropItemGroup.DropItem;
import cg.data.sprite.EnemyInfo;

@IOCBean(type=IOCBeanType.READER)
class CEnemyReader extends BaseObjectReader<EnemyInfo, ConfEnemy> {

	private static class CEnemyInfo implements EnemyInfo {
		
		private String name;
		
		private String[] aiParams;
		
		private int enemyId, enemybaseId, aiId, gainExp, battleScore, enemyTalk;
		
		private Range<Short> level, amount;
		
		private boolean canCatch;
		
		private DropItemGroup dropItemGroup, stealItemGroup;
		
		private byte[] actionCode;
		
		private int[] summonCode;
		
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

	@Override
	Class<ConfEnemy> getFromClass() {
		return ConfEnemy.class;
	}

	@Override
	EnemyInfo transform(ConfEnemy s) {
		CEnemyInfo ret = new CEnemyInfo();
		ret.name = s.getName();
		ret.aiParams = s.getAiParams().split(";");
		ret.enemyId = s.getEnemyId();
		ret.enemybaseId = s.getEnemybaseId();
		ret.level = MathUtil.createRange(s.getMinLevel(), s.getMaxLevel());
		ret.amount = MathUtil.createRange(s.getMinAmount(), s.getMaxAmount());
		ret.aiId = s.getAiId();
		ret.gainExp = s.getGainExp();
		ret.battleScore = s.getBattleScore();
		ret.canCatch = s.getCanCatch();
		int[] drops = s.getDrops();
		int[] dropRates = s.getDropRates();
		DropItem[] dropItems = new DropItem[drops.length];
		for (int i = 0;i < drops.length;i++) {
			dropItems[i] = new CDropItem(drops[i], dropRates[i]);
		}
		ret.dropItemGroup = new CDropItemGroup(dropItems);
		int[] steals = s.getSteals();
		int[] stealRates = s.getStealRates();
		DropItem[] stealItems = new DropItem[steals.length];
		for (int i = 0;i < stealItems.length;i++) {
			stealItems[i] = new CDropItem(steals[i], stealRates[i]);
		}
		ret.stealItemGroup = new CDropItemGroup(stealItems);
		ret.actionCode = s.getActionCodes();
		ret.summonCode = s.getSummonCodes();
		ret.enemyTalk = s.getEnemyTalk();
		return ret;
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
