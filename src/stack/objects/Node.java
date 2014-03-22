package stack.objects;

public class Node<T> {
	
	public Node<T> next;

	public T data;
	
	public Node(){
		this.data = null;
	}
	
	public Node(T data){
		this.data = data;
	}
}
