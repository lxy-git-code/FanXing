package com.lxy.tongpeifu;

import com.lxy.fanxing.interfaces.Generator;

public class FArray {
	
	static <T> T[] fill(T[] a,Generator<T> gen)
	{
		for(int i=0;i<a.length;i++)
		{
			
			a[i]=gen.next();
		}
		
		return a;
	}
	
	
	public FArray() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	
}
}
