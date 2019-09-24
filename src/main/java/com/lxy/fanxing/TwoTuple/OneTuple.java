package com.lxy.fanxing.TwoTuple;

import com.lxy.fanxing.TwoTuple.Sequence.Innerclass;

public class OneTuple <T>{
final T t ;

public OneTuple(T t) {
	super();
	this.t = t;
}

@Override
public String toString() {
	return "OneTuple [t=" + t + "]";
}

public static void main(String[] args) {
	Innerclass innerclass = new Sequence().new Innerclass();
	OneTuple<Innerclass> oneTuple = new OneTuple<Sequence.Innerclass>(innerclass);
	System.out.println(innerclass);
}
}
