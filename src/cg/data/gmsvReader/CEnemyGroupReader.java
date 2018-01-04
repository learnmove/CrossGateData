package cg.data.gmsvReader;

import java.io.File;
import java.util.Collection;

import org.tool.server.ioc.IOCBean;

import cg.base.conf.ConfGroup;
import cg.base.loader.IOCBeanType;
import cg.base.util.MathUtil;
import cg.data.sprite.EnemyGroup;
import cg.data.sprite.EnemyGroup.SingleGroupInfo;

@IOCBean(type=IOCBeanType.READER)
class CEnemyGroupReader extends BaseObjectReader<EnemyGroup, ConfGroup> {
	
	private static class CEnemyGroup implements EnemyGroup {
		
		private String name;
		
		private byte[] enemyLocals;
		
		private int id;
		
		private int needItemId;
		
		private int notNeedItemId;
		
		private SingleGroupInfo[] singleGroupInfos;

		@Override
		public String getName() {
			return name;
		}

		@Override
		public int getId() {
			return id;
		}

		@Override
		public int getNeedItemId() {
			return needItemId;
		}

		@Override
		public int getForbitItemId() {
			return notNeedItemId;
		}

		@Override
		public SingleGroupInfo[] getSingleGroupInfos() {
			return singleGroupInfos;
		}

		@Override
		public byte[] getEnemyLocals() {
			return enemyLocals;
		}
		
	}
	
	private static class CSingleGroupInfo implements SingleGroupInfo {
		
		private int enemyId;
		
		private byte rate;
		
		private boolean isMustAppear;
		
		public CSingleGroupInfo(int enemyId, byte rate, boolean isMustAppear) {
			this.enemyId = enemyId;
			this.rate = rate;
			this.isMustAppear = isMustAppear;
		}

		@Override
		public int getEnemyId() {
			return enemyId;
		}

		@Override
		public byte getRate() {
			return rate;
		}

		@Override
		public boolean getIsMustAppear() {
			return isMustAppear;
		}
		
	}

	@Override
	public void output(File outFile, Collection<EnemyGroup> collection) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	Class<ConfGroup> getFromClass() {
		return ConfGroup.class;
	}

	@Override
	EnemyGroup transform(ConfGroup s) {
		CEnemyGroup ret = new CEnemyGroup();
		ret.name = s.getName();
		String[] locals = s.getEnemyLocals().split(",");
		ret.enemyLocals = new byte[EnemyGroup.ENEMY_MAX_COUNT];
		for (int i = 0;i < EnemyGroup.ENEMY_MAX_COUNT;i++) {
			ret.enemyLocals[i] = locals.length > i && locals[i].length() > 0 ? MathUtil.stringToByte(locals[i]) : EnemyGroup.LOCAL_RANDOM;
		}
		ret.id = s.getId();
		ret.needItemId = s.getNeedItemId();
		ret.notNeedItemId = s.getNotNeedItemId();
		int[] enemyIds = s.getEnemyIds();
		byte[] rates = s.getRates();
		boolean[] isMustAppears = s.getIsMustAppears();
		int size = 0;
		for (int i = 0;i < enemyIds.length;i++, size++) {
			if (enemyIds[i] <= 0) {
				break;
			}
		}
		ret.singleGroupInfos = new SingleGroupInfo[size];
		for (int i = 0;i < size;i++) {
			ret.singleGroupInfos[i] = new CSingleGroupInfo(enemyIds[i], rates[i], isMustAppears[i]);
		}
		return ret;
	}

}
