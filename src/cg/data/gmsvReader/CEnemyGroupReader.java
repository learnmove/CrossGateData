package cg.data.gmsvReader;

import java.io.File;
import java.util.Collection;
import java.util.List;

import org.tool.server.ioc.IOCBean;

import cg.base.conf.ConfGroup;
import cg.base.conf.IConfGroup;
import cg.base.loader.IOCBeanType;
import cg.base.util.MathUtil;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;
import cg.data.sprite.EnemyGroup;
import cg.data.sprite.EnemyGroup.SingleGroupInfo;

@IOCBean(type=IOCBeanType.READER)
class CEnemyGroupReader implements ObjectReader<EnemyGroup> {

	@Override
	public List<EnemyGroup> read(ProjectData projectData) {
		return ObjectReader.transform(ConfGroup.arrayFromExcel(projectData), s -> { return new CEnemyGroup(s); });
	}
	
	private static class CEnemyGroup implements EnemyGroup {
		
		private String name;
		
		private byte[] enemyLocals;
		
		private int id;
		
		private int needItemId;
		
		private int notNeedItemId;
		
		private SingleGroupInfo[] singleGroupInfos;
		
		public CEnemyGroup(IConfGroup conf) {
			name = conf.getName();
			String[] locals = conf.getEnemyLocals().split(",");
			enemyLocals = new byte[ENEMY_MAX_COUNT];
			for (int i = 0;i < ENEMY_MAX_COUNT;i++) {
				enemyLocals[i] = locals.length > i && locals[i].length() > 0 ? MathUtil.stringToByte(locals[i]) : LOCAL_RANDOM;
			}
			id = conf.getId();
			needItemId = conf.getNeedItemId();
			notNeedItemId = conf.getNotNeedItemId();
			int[] enemyIds = conf.getEnemyIds();
			byte[] rates = conf.getRates();
			boolean[] isMustAppears = conf.getIsMustAppears();
			int size = 0;
			for (int i = 0;i < enemyIds.length;i++, size++) {
				if (enemyIds[i] <= 0) {
					break;
				}
			}
			singleGroupInfos = new SingleGroupInfo[size];
			for (int i = 0;i < size;i++) {
				singleGroupInfos[i] = new CSingleGroupInfo(enemyIds[i], rates[i], isMustAppears[i]);
			}
		}

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
	public void output(File outFile, Collection<EnemyGroup> collection)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
