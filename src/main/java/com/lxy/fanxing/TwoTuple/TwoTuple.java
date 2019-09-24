package com.lxy.fanxing.TwoTuple;

public class TwoTuple<T,K> {
/*t,k对象都声明为fianl，因此在元组容器TwoTuple中只能读取而不能对其赋值。保证了对象的安全性*/	
	final T t;
	final K k;
	public TwoTuple(T t, K k) {
		super();
		this.t = t;
		this.k = k;
	}
	@Override
	public String toString() {
		return "TwoTuple [t=" + t + ", k=" + k + "]";
	}
	
	

}
