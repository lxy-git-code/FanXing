package com.lxy.tongpeifu;

import java.util.ArrayList;

public class TongPeiFu {
	//�޷�ͨ������ʵ�ִ�������
static <T>	 ArrayList<? extends T> writeTo(ArrayList<? extends T> list,T item)
	{
		list.add(item);
	}
	
	public static void main(String[] args) {
		ArrayList<? extends Fruit> list=new ArrayList<Apple>();
		Fruit apple = new Apple();
		/**
		 * <?  extends Fruit>ͨ�����ʾFruit�����������Ͱ����Լ�
		 * 
		 * ��Ϊadd���ܵ�ʾ���Ͳ���<? extends Fruit>,��������֪���������ҪFruit����һ������
		 * ���ͣ����Ա�����Ȼ����԰�null��ӽ�ȥ������û������
		 * 
		 * ��contains��indexOf���ܵĲ�����Object������˲�Ӱ��
		 */
		list.add(apple);
		list.add(new Fruit());
		list.add(null);
		list.contains(new Apple());
		
	}
}
