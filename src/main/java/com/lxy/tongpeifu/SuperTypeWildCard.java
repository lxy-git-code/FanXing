package com.lxy.tongpeifu;

import java.util.ArrayList;

public class SuperTypeWildCard {
	//超类边界放松了在可以向方法传递的参数时做的限制，<? extend T>就不行
 static <T> ArrayList<? super T> writeTo(ArrayList<? super T> list,T item)
{
	list.add(item);
	return list;
	

}
public static void main(String[] args) {
	ArrayList<? super GreenApple> list=new ArrayList<Apple>();
	ArrayList<? super GreenApple> list2=new ArrayList<Fruit>();
SuperTypeWildCard.writeTo(list, new GreenApple());

SuperTypeWildCard.writeTo(list2, new GreenApple());
}
}
