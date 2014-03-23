package list.queue.objects;

import list.singlylinked.objects.Node;

public class Queue<T> {
	public Node<T> head;
	public Node<T> tail;
	
	public Queue() {
		head = null;
		tail = null;
	}
	
	public T pop(){
		if(head == null) return null;
		Node<T> popped = head;
		head = head.next;
		return popped.data;
	}

	public void push(T data){
		tail.next = new Node<T>(data);
		tail = tail.next;
	}

	public Queue(T[] dataset){
		for(int i = dataset.length - 1; i >= 0; i--){
			push(dataset[i]);
		}
	}

	public void print(){
		Node<T> n = head;
		while(n!=null){
			System.out.print("(" + n.data + ")->");
			n = n.next;
		}
		System.out.println("null");
	}
}
