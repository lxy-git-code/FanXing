package com.lxy.fanxing.interfaces;

import java.util.Iterator;
import java.util.Random;

class CoffeeGenertor implements Generator<Coffee>,Iterable<Coffee> {

//
private Class[] types= {
com.lxy.fanxing.interfaces.Coffee.Americano.class,
com.lxy.fanxing.interfaces.Coffee.Cappuccion.class,
com.lxy.fanxing.interfaces.Coffee.Latte.class,
com.lxy.fanxing.interfaces.Coffee.Mocha.class
};

private static  Random rand=new Random(47);

private int size=0;
private Coffee coffee=new Coffee(); 
public CoffeeGenertor() {
	super();
}

public CoffeeGenertor(int size) {
	super();
	this.size = size;
}

public Coffee next()
{
	try {
		return (Coffee) types[rand.nextInt(types.length)].getConstructors()[0].newInstance(coffee);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} return null;
}


	/*
	 * public class CoffeeIteator implements Iterable<Coffee>{ int count=size;
	 * 
	 * public CoffeeIteator() { super(); }
	 * 
	 * public boolean hasNext() { return count>0; }
	 * 
	 * public Coffee next() { count--; return (Coffee) CoffeeGenertor.this.next(); }
	 * 
	 * @Override public Iterator<Coffee> iterator() { // TODO Auto-generated method
	 * stub return null; }
	 * 
	 * }
	 * 
	 * @SuppressWarnings("unchecked")
	 * 
	 * @Override public Iterator<Coffee> iterator() { // TODO Auto-generated method
	 * stub return new CoffeeIteator(); }
	 */
@Override
public Iterator<Coffee> iterator() {
	// TODO Auto-generated method stub
	return null;
}

 	public static void main(String[] args) {
      CoffeeGenertor coffeeGenertor = new CoffeeGenertor();
      for(int i=0;i<4;i++) {

    	  System.out.println(coffeeGenertor.next());
      }
      
      CoffeeGenertor coffeeGenertor2 = new CoffeeGenertor(5);
      Iterator<Coffee> iterator = coffeeGenertor2.iterator();
      while(iterator.hasNext())
      {	  
    	  System.out.println(iterator.next());
      }
 	}

}
