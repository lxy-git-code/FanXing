package com.lxy.tongpeifu;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UnboundWildCards1 {
static List a;
static List<?> b;
static List<? extends Object> c;
static Map<?,String> d;//通配符也可以是一个参数是任何类型，另一个参数是指定类型



static void assign(List list) {//原生
	a=list;
	b=list;
	c=list; //未检查list是否能转换为List<? extends Object>
	
}
static void assign2(List<?> list) //无界通配符
{
	a=list;
	b=list;
	c=list;
	
}
static void assign3(List<? extends Object> list) //边界为Object
{
	a=list;
	b=list;
	c=list;
	
}
public static void main(String[] args) {

	
	/*通常情况下编译器很少关心使用的是原生类还是<?>,List与List<?>看起来是相同的事物，
	 *因为会进行泛型擦除到他的第一个边界而List<?>看起来相当于List<Object>与原生类型一样
	 *List表示持有任何Object类型的原生List,
	 *List<?>表示持有某种 特定类型的非原生List,只是这种类型我们不知道。
	 *List<?>意义在于我们不想使用原生类型，但这种情况下是可以持有任何类型的引用的
	 */
	UnboundWildCards1.assign(new ArrayList());
	UnboundWildCards1.assign2(new ArrayList());
	UnboundWildCards1.assign3(new ArrayList());
}

}
