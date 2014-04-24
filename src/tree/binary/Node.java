package tree.binary;

public class Node<T> {
	
	public Node<T> parent;
	public Node<T> right;
	public Node<T> left;
	
	public T data;
	
	public Node(){
		this.data = null;
	}
	
	public Node(T data){
		this.data = data;
	}
}
