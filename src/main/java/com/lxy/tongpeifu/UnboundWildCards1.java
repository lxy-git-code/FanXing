package com.lxy.tongpeifu;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UnboundWildCards1 {
static List a;
static List<?> b;
static List<? extends Object> c;
static Map<?,String> d;//ͨ���Ҳ������һ���������κ����ͣ���һ��������ָ������



static void assign(List list) {//ԭ��
	a=list;
	b=list;
	c=list; //δ���list�Ƿ���ת��ΪList<? extends Object>
	
}
static void assign2(List<?> list) //�޽�ͨ���
{
	a=list;
	b=list;
	c=list;
	
}
static void assign3(List<? extends Object> list) //�߽�ΪObject
{
	a=list;
	b=list;
	c=list;
	
}
public static void main(String[] args) {

	
	/*ͨ������±��������ٹ���ʹ�õ���ԭ���໹��<?>,List��List<?>����������ͬ�����
	 *��Ϊ����з��Ͳ��������ĵ�һ���߽��List<?>�������൱��List<Object>��ԭ������һ��
	 *List��ʾ�����κ�Object���͵�ԭ��List,
	 *List<?>��ʾ����ĳ�� �ض����͵ķ�ԭ��List,ֻ�������������ǲ�֪����
	 *List<?>�����������ǲ���ʹ��ԭ�����ͣ�������������ǿ��Գ����κ����͵����õ�
	 */
	UnboundWildCards1.assign(new ArrayList());
	UnboundWildCards1.assign2(new ArrayList());
	UnboundWildCards1.assign3(new ArrayList());
}

}
