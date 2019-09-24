package com.lxy.fanxing.erase;

public class Erased<T> {

	//泛型擦除导致泛型失去类了某些操作能力1 2 3
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
