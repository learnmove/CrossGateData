package cg.data.gmsvReader;

import static cg.data.map.Warp.createWarp;

import java.io.File;
import java.util.Collection;

import org.tool.server.ioc.IOCBean;

import cg.base.conf.ConfWarp;
import cg.base.loader.IOCBeanType;
import cg.data.map.Warp;

@IOCBean(type=IOCBeanType.READER)
class CWarpReader extends BaseObjectReader<Warp, ConfWarp> {

	@Override
	public void output(File outFile, Collection<Warp> collection)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	Class<ConfWarp> getFromClass() {
		return ConfWarp.class;
	}

	@Override
	Warp transform(ConfWarp s) {
		return createWarp(s.getId(), s.getSourceMapId(), s.getSourceMapEast(), s.getSourceMapSouth(), 
				s.getTargetMapId(), s.getTargetMapEast(), s.getTargetMapSouth(), 0);
	}

}
