package com.lxy.fanxing.interfaces;



public class Coffee {
private static long counter=0;
private final long id=counter++;
@Override
public String toString() {
	return this.getClass().getSimpleName()+" [id=" + id + "]";
}

public class Latte extends Coffee{}
public class Americano extends Coffee{}
public class Cappuccion extends Coffee{}
public class Mocha extends Coffee{}

}
