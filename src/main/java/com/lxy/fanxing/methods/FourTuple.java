package com.lxy.fanxing.methods;

import java.lang.reflect.InvocationTargetException;

public class FourTuple<K,V,T,M> {
K k;
V v;
T t;
M m;
Class<T> clazzt;
Class<V> clazzv;
Class<K> clazzk;
Class<M> clazzm;

	@Override
public String toString() {
	return "FourTuple [k=" + k + ", v=" + v + ", t=" + t + ", m=" + m + "]";
}


	public FourTuple(Class<K> clazzk,Class<V> clazzv,Class<T> clazzt,Class<M> clazzm) {
		// TODO Auto-generated constructor stub
        try {
			k=clazzk.newInstance();
			v=(V) clazzv.getConstructors()[0].newInstance(false);
			t=(T) clazzt.getConstructors()[0].newInstance(0);
			m=clazzm.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}

}
