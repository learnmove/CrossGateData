package cg.data.gmsvReader;

import java.io.File;
import java.util.Collection;
import java.util.List;

import org.tool.server.ioc.IOCBean;

import cg.base.conf.ConfTitleName;
import cg.base.conf.IConfTitleName;
import cg.base.loader.IOCBeanType;
import cg.base.sprite.Title;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;

@IOCBean(type=IOCBeanType.READER)
class CTitleReader implements ObjectReader<Title> {
	
	@Override
	public List<Title> read(ProjectData projectData) {
		return ObjectReader.transform(ConfTitleName.arrayFromExcel(projectData), s -> { return new CTitle(s); });
	}
	
	private static class CTitle implements Title {
		
		private short id;
		
		private String name;
		
		public CTitle(IConfTitleName conf) {
			id = conf.getId();
			name = conf.getName();
		}

		@Override
		public short getId() {
			return id;
		}

		@Override
		public String getName() {
			return name;
		}
		
	}

	@Override
	public void output(File outFile, Collection<Title> collection)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
