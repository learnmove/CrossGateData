package cg.data.resource.inputStream;

import java.net.URI;

import cg.data.resource.Reloadable;

public interface InputStreamHandler<T> extends Reloadable {
	
	void addURI(URI uri);
	
	T get(String name);
	
	void clear();

}
