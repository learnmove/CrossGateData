package cg.data.gmsvReader;

import java.lang.reflect.Method;
import java.util.List;

import com.google.common.collect.Lists;

import cg.base.io.IExcelProvider;
import cg.base.io.ITextProvider;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;

public abstract class BaseObjectReader<T, S> implements ObjectReader<T> {
	
	@Override
	@SuppressWarnings("unchecked")
	public final List<T> read(ProjectData projectData) {
		Class<S> clz = getFromClass();
		
		Method arrayFromText;
		try {
			arrayFromText = clz.getMethod("arrayFromText", ITextProvider.class);
		} catch (NoSuchMethodException e) {
			arrayFromText = null;
		}
		
		try {
			List<S> array = arrayFromText == null ? null : (List<S>) arrayFromText.invoke(null, projectData);
			if (array == null) {
				Method arrayFromExcel = clz.getMethod("arrayFromExcel", IExcelProvider.class);
				array = arrayFromExcel == null ? null : (List<S>) arrayFromExcel.invoke(null, projectData);
			}
			List<T> list = Lists.transform(array, this::transform);
			readFinish(projectData);
			return list;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	protected void readFinish(ProjectData projectData) {}
	
	abstract Class<S> getFromClass();
	
	abstract T transform(S s);

}
