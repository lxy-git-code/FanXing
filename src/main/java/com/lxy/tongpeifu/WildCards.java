package com.lxy.tongpeifu;

public class WildCards {
static void rawArgs(Holder holder,Object arg) {
	/*������֪��Holder<T>��һ���������ͣ���Ȼ����Holder����������ԭ�����͡�
	 *��������֪��setValue(T t)������Object���Ͳ����ǲ���ȫ�ġ�
	 *����holder��ԭ���������Կ��Դ��κ����Ͳ�����setValue(T t)
	 *�ö��󶼻ᱻ����ת��ΪObject����
	 *����:������ۺ�ʱʹ����ԭ�����ͱ���������������
	 *
	 */
	holder.setValue(arg);
	holder.setValue(new WildCards());//����Holder��ԭ����set���Դ��κ���
	Object value = holder.getValue();
}

static void unBoundArg(Holder<?> holder,Object arg) {
	/*
	 * Holder<?> holder���е�ʱ�ض�����ֻ�Ǿ������Ͳ���������ܴ���Object����
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
/*Holder<? extends T> holder�����κ���չ��T�Ķ����holder,���TʱFruit��ô
 * holder������Holder<apple>��Ϊ�˷�ֹ��Orange���Ͷ������Holder<apple>��
 * setValue()����(����˵�κν���������Ͳ����ķ���)�����ɵ��á�
 * 
 * ��������֪��Holder<? extends Fruit>������Fruit����getValue(����˵�κξ���������Ͳ���
 * ����ֵ�ķ���)���������
*/

	holder.setValue(arg);
	T value = holder.getValue();
	return value;
	}

static <T> T wildSuperType(Holder<? super T> holder ,T arg)
{
	/*Holder<? super T>���Գ����κ�T�Ļ����͵����������setValue()���Խ���T��
	 * ��Ϊ�κι��������Ķ���(�൱��setValue(<? super T> value)�� value�����Զ�̬������ 
	 * �ڵ�������ǣ�<? super T>������T�ĸ��࣬��ô������Tû���⡣
	 * 
	 * ����T getValue()���ص�������<? super T>�������κ�T�ĳ���Ψһ��ȫ�ľ���Object,
	 * 
	 * 
	 * 
	 * */
	
	holder.setValue(arg);
	T value = (T) holder.getValue();//�����ⳬ��תΪ�������з��յĲ�һ������ת��
	return value;
	}
}
