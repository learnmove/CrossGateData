package cg.data.gmsvReader;

import java.io.File;
import java.util.Collection;

import org.tool.server.ioc.IOCBean;

import cg.base.conf.ConfCreatureGarbled;
import cg.base.conf.IConfCreatureGarbled;
import cg.base.loader.IOCBeanType;
import cg.data.gmsvReader.CGarbledReader.Garbled;

@IOCBean(type=IOCBeanType.READER)
public class CGarbledReader extends BaseObjectReader<Garbled, ConfCreatureGarbled> {
	
	public static class Garbled {
		
		public final String garbled, realWord;
		
		Garbled(IConfCreatureGarbled conf) {
			this(conf.getContent().split(" ")[0], conf.getContent().split(" ")[1]);
		}
		
		Garbled(String garbled, String realWord) {
			this.garbled = garbled;
			this.realWord = realWord;
		}
		
	}

	@Override
	public void output(File outFile, Collection<Garbled> collection)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	Class<ConfCreatureGarbled> getFromClass() {
		return ConfCreatureGarbled.class;
	}

	@Override
	Garbled transform(ConfCreatureGarbled s) {
		return new Garbled(s);
	}

}
