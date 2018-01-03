package cg.data.resource;

import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

public interface ObjectReader<T> {
	
	List<T> read(ProjectData projectData);
	
	void output(File outFile, Collection<T> collection) throws Exception;
	
	static <S, T> List<T> transform(S[] array, Function<S, T> transform) {
		List<T> list = Lists.newArrayListWithCapacity(array.length);
		for (S s : array) {
			list.add(transform.apply(s));
		}
		return ImmutableList.copyOf(list);
	}

}
