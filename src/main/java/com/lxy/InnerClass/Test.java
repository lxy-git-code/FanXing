package com.lxy.InnerClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;



public class Test {

	public class Innerclass1 {



		@Override
		public String toString() {
			return "Innerclass1 [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
		

	}

	static class Innerclass2 {

		@Override
		public String toString() {
			return "Innerclass2 [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}

	}

	class Innerclass3 {

	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Constructor<Test.Innerclass1>[] constructors = (Constructor<Innerclass1>[]) com.lxy.InnerClass.Test.Innerclass1.class.getConstructors();
		int modifiers = constructors[0].getModifiers();
		Innerclass1 innerclass1 = constructors[0].newInstance(new Test());
		Innerclass2 innerclass2 = com.lxy.InnerClass.Test.Innerclass2.class.newInstance();
	System.out.println(innerclass1);
	System.out.println(innerclass2);
	}
}
