package com.lxy.fanxing.TwoTuple;

/*����ͨ���̳�ʵ�ָ�����Ԫ��*/
public class ThreeTuple<T, K, A, B> extends TwoTuple<T, K> {
	final A a;
	final B b;

	public ThreeTuple(T t, K k, A a, B b) {
		super(t, k);
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		return "ThreeTuple [a=" + a + ", b=" + b + ", t=" + t + ", k=" + k + "]";
	}

}
