package com.lxy.fanxing.erase;

public class Erased<T> {

	//���Ͳ������·���ʧȥ����ĳЩ��������1 2 3
	public static void f(Object args)
	{
		if (args instanceof T) //1
			T var=new T(); //2
		    T[] array=new T[8]; //3
	}
	public Erased() {
		// TODO Auto-generated constructor stub
	}

}
