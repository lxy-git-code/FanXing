package com.lxy.fanxing.StackList;

public class StackList<T> {

	class Node<U> {
		U next;
		Node<U> node;

		public Node(U next, Node<U> node) {
			super();
			this.next = next;
			this.node = node;
		}

		public Node() {
			super();
			this.next = null;
			this.node = null;
		}

		boolean isEmpty() {
			return next == null && node == null;

		}

	}
	private Node<T> top=new Node<T>();
	void push(T item) {
		top=new Node<T>(item, top);
	}
	T pop()
	{
		T next = top.next;
        if(!top.isEmpty())
		top=top.node;
        return next;
	}
	public static void main(String[] args) {
		StackList<String> list = new StackList<String>();
		list.push("1");
		list.push("2");
		list.push("3");
		list.push("4");
		

		System.out.println(list.pop());
		System.out.println(list.pop());
		System.out.println(list.pop());
		System.out.println(list.pop());
		System.out.println(list.pop());
	}
}
