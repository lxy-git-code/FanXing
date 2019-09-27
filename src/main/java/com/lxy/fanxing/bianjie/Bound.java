package com.lxy.fanxing.bianjie;

import java.awt.Color;

public class Bound extends Demension implements Hascolor,Weight{
	Color color;
	
	public Bound(int x, int y, int z) {
		super(x, y, z);
		this.color=new Color(x, y, z);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int weight() {
		// TODO Auto-generated method stub
		return x+y+z;
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return this.color;
	}
public static void main(String[] args) {
	Bound bound = new Bound(1, 1, 1);
	
	Soild<Bound> soild = new Soild<Bound>(bound);
	
	System.out.println(soild.Getweight());
	System.out.println(soild.getX());
	System.out.println(soild.getY());
	System.out.println(soild.getZ());
	System.out.println(soild.color());
}
}
