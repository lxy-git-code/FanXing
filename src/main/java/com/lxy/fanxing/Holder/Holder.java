package com.lxy.fanxing.Holder;

import java.util.Date;

/*Holder ֻ�ܽ��չ̶�����*/
public class Holder {

	private AutoMobile mobile;

	public Holder(AutoMobile mobile) {
		super();
		this.mobile = mobile;
	}

	AutoMobile get() {
		return mobile;
	}

	/* Holder ���Խ����κ��࣬����һ�����Ƕ��������ĳһ������ */
	public class Holder2 {
		private Object obj;

		public Holder2(Object obj) {
			super();
			this.obj = obj;
		}

		Object get() {
			return mobile;
		}
	}

	/* Holder ����ָ������ĳһ���� */
	public class Holder3<T> {
		T t;

		public Holder3(T t) {
			super();
			this.t = t;
		}

		T get() {
			return t;
		}

	}

	public class Holder4<T, K, V> {
		T t;
		K k;
		V v;

		public Holder4(T t, K k, V v) {
			super();
			this.t = t;
			this.k = k;
			this.v = v;
		}

		T getT() {
			return t;
		}

		K getK() {
			return k;
		}

		V getv() {
			return v;
		}

	}

	public static void main(String[] args) {
		AutoMobile mobile = new AutoMobile();
		Holder holder = new Holder(mobile);
		holder.get();
		
		Holder2 holder2 = holder.new Holder2(mobile);
		holder2.get();
		
		/*Holder3����װ����������*/
		Holder3<AutoMobile> holder3 = holder.new Holder3<AutoMobile>(mobile);
		holder3.get();
		Date date = new Date();
		
		Holder3<Date> holder3_2 = holder.new Holder3<Date>(date);
		holder3_2.get();
		
		holder.new Holder4<Date, Date, Date>(date,date,date);
	}
}
