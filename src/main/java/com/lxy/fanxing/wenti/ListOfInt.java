package com.lxy.fanxing.wenti;

import java.util.ArrayList;
import java.util.Arrays;

import com.lxy.fanxing.methods.Generator;

public class ListOfInt {

	public ListOfInt() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	//�κλ������Ͷ�������Ϊ���ͣ����������װ��
	ArrayList<Integer> list=new ArrayList<Integer>(Arrays.<Integer>asList(1,2,3,4,5));
	
	for (int integer : list) {
		System.out.println(integer);
	}

}
}
