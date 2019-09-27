package com.lxy.fanxing.bianjie;

import java.awt.Color;

public class Colored<T extends Hascolor>  {
T item;

public Colored(T item) {
	super();
	this.item = item;
}

public Colored() {
	super();
}

public Color color()
{
	return item.getColor();}
}
