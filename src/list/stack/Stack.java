package list.stack;

import list.singlylinked.Node;

public class Stack<T> {
	private Node<T> top;
	
	public T pop(){
		if(top == null) return null;
		Node<T> popped = top;
		top = top.next;
		return popped.data;
	}
	
	public T peak(){
		return top.data;
	}
	
	public void push(T data){
		Node<T> oldtop = top;
		top = new Node<T>(data);
		top.next = oldtop;
	}
	
	public void print(){
		Node<T> n = top;
		while(n!=null){
			System.out.print("(" + n.data + ")->");
			n = n.next;
		}
		System.out.println("null");
	}
}
