package com.lxy.fanxing.TwoTuple;

public class TwoTuple<T,K> {
/*t,k��������Ϊfianl�������Ԫ������TwoTuple��ֻ�ܶ�ȡ�����ܶ��丳ֵ����֤�˶���İ�ȫ��*/	
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
