package com.lxy.fanxing.erase;

public class ErasedForPayment<T> {

	public  void f(Object args)
	{
		Class<T> clazzt = null; //�ó�ʼ��
		if (clazzt.isInstance(args)) {
			try {
				T newInstance = clazzt.newInstance();//T =new T(); //2
			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  		}	
	} 
}
