package cg.data.resource.inputStream;

import java.net.URI;

public interface InputStreamHandler<T> {
	
	void addURI(URI uri);
	
	T get(String name);

}
