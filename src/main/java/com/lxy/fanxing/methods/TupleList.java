package com.lxy.fanxing.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class TupleList<K,V,T,M> extends ArrayList<FourTuple<K,V,T,M>> {

	
	@Override
	public String toString() {
		return "TupleList [toString()=" + super.toString() + "]";
	}

	public static void main(String[] args) {
	TupleList<String,Boolean,Integer,Date> list = new TupleList<String, Boolean, Integer, Date>();
	FourTuple<String,Boolean,Integer,Date> tuple = new FourTuple<String,Boolean,Integer,Date> (String.class,Boolean.class,Integer.class,Date.class);
	boolean add = list.add(tuple);
	
	for (FourTuple<String,Boolean,Integer,Date> fourTuple : list) {
		System.out.println(fourTuple);
	}
}

}
