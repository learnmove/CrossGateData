package cg.data.gmsvReader;

import java.lang.reflect.Method;
import java.util.List;

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
			S[] array = arrayFromText == null ? null : (S[]) arrayFromText.invoke(null, projectData);
			if (array == null) {
				Method arrayFromExcel = clz.getMethod("arrayFromExcel", IExcelProvider.class);
				array = arrayFromExcel == null ? null : (S[]) arrayFromExcel.invoke(null, projectData);
			}
			return ObjectReader.transform(array, this::transform);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	abstract Class<S> getFromClass();
	
	abstract T transform(S s);

}
