package com.lxy.fanxing.bianjie;


public class ColorDemension<T extends Demension&Hascolor > extends Colored<T> {

public int getX() {
	return item.x;
}

public int getY() {
	return item.y;
}

public int getZ() {
	return item.z;
}

public ColorDemension() {
	super();
	// TODO Auto-generated constructor stub
}

public ColorDemension(T item) {
	super(item);
	// TODO Auto-generated constructor stub
}

}
