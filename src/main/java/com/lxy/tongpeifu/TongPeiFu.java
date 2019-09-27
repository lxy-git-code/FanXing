package com.lxy.tongpeifu;

import java.util.ArrayList;

public class TongPeiFu {
	//无法通过方法实现传参限制
static <T>	 ArrayList<? extends T> writeTo(ArrayList<? extends T> list,T item)
	{
		list.add(item);
	}
	
	public static void main(String[] args) {
		ArrayList<? extends Fruit> list=new ArrayList<Apple>();
		Fruit apple = new Apple();
		/**
		 * <?  extends Fruit>通配符表示Fruit的任意子类型包括自己
		 * 
		 * 因为add接受的示范型参数<? extends Fruit>,编译器不知道你具体是要Fruit的哪一个具体
		 * 类型，所以报错。当然你可以把null添加进去不过这没有意义
		 * 
		 * 而contains和indexOf接受的参数是Object类型因此不影像
		 */
		list.add(apple);
		list.add(new Fruit());
		list.add(null);
		list.contains(new Apple());
		
	}
}
