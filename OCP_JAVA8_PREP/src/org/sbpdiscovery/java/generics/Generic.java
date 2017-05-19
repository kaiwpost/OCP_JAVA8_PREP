package org.sbpdiscovery.java.generics;


/**
 * @author Kai W. Post, SBP Medical Discovery Institute, 2017
 */
public class Generic<K, V> {
	
	private K key;
	private V value;
	
	public Generic(K key, V value) {
		super();
		setKey(key);
		setValue(value);
	}

	public void setKey(K key) {
		this.key = key;
	}
	
	public void setValue(V value) {
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
}
