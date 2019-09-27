package com.lxy.tongpeifu;

public class Holder<T> {
private T value;
public Holder() {}
public Holder(T value) {
	super();
	this.value = value;
}
public T getValue() {
	return value;
}
public void setValue(T value) {
	this.value = value;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((value == null) ? 0 : value.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	
	return value.equals(obj);
}



}
