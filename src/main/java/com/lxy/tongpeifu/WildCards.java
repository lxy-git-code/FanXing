package com.lxy.tongpeifu;

public class WildCards {
static void rawArgs(Holder holder,Object arg) {
	/*编译器知道Holder<T>是一个泛型类型，虽然法里Holder被声明生了原生类型。
	 *但编译器知道setValue(T t)方法传Object类型参数是不安全的。
	 *由于holder是原生类型所以可以传任何类型参数给setValue(T t)
	 *该对象都会被向上转型为Object对象。
	 *结论:因此无论何时使用了原生类型编译器都会放弃检测
	 *
	 */
	holder.setValue(arg);
	holder.setValue(new WildCards());//由于Holder是原生的set可以传任何类
	Object value = holder.getValue();
}

static void unBoundArg(Holder<?> holder,Object arg) {
	/*
	 * Holder<?> holder持有的时特定类型只是具体类型不清楚，不能传递Object类型
	 */
	holder.setValue(arg);
	holder.setValue(new WildCards());
	Object value = holder.getValue();
}

static <T> T exact1(Holder<T> holder) {
	return holder.getValue();
}

static <T> T exact1(Holder<T> holder,T t) {
	holder.setValue(t);
	return holder.getValue();
}

static <T> T wildSubType(Holder<? extends T> holder  ,T arg)
{
/*Holder<? extends T> holder持有任何扩展自T的对象的holder,如果T时Fruit那么
 * holder可以是Holder<apple>，为了防止将Orange类型对象放入Holder<apple>，
 * setValue()方法(或者说任何接收这个类型参数的方法)都不可调用。
 * 
 * 但是你仍知道Holder<? extends Fruit>至少是Fruit所以getValue(或者说任何具有这个类型参数
 * 返回值的方法)都是允许的
*/

	holder.setValue(arg);
	T value = holder.getValue();
	return value;
	}

static <T> T wildSuperType(Holder<? super T> holder ,T arg)
{
	/*Holder<? super T>可以持有任何T的基类型的容器，因此setValue()可以接收T。
	 * 因为任何工作与基类的对象(相当于setValue(<? super T> value)， value都可以动态的作用 
	 * 于导出类就是，<? super T>类型是T的父类，那么传子类T没问题。
	 * 
	 * 但是T getValue()返回的类型是<? super T>可以是任何T的超类唯一安全的就是Object,
	 * 
	 * 
	 * 
	 * */
	
	holder.setValue(arg);
	T value = (T) holder.getValue();//将任意超类转为子类是有风险的不一定可以转向
	return value;
	}
}
