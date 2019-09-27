package com.lxy.fanxing.bianjie;

public class Soild <T extends Demension&Hascolor&Weight> extends ColorDemension<T> {

int Getweight() {
	
	return item.weight();
}

public Soild() {
	super();
	// TODO Auto-generated constructor stub
}

public Soild(T item) {
	super(item);
	// TODO Auto-generated constructor stub
}


}
