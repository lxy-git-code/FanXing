package com.lxy.fanxing.wenti;

import java.util.ArrayList;
import java.util.Arrays;

import com.lxy.fanxing.methods.Generator;

public class ListOfInt {

	public ListOfInt() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	//任何基本类型都不能作为泛型，必须是其包装类
	ArrayList<Integer> list=new ArrayList<Integer>(Arrays.<Integer>asList(1,2,3,4,5));
	
	for (int integer : list) {
		System.out.println(integer);
	}

}
}
