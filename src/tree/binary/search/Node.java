package tree.binary.search;

public class Node {
	
	public Node right;
	public Node left;
	
	public Integer data;
	
	public Node(){
		this.data = null;
	}
	
	public Node(Integer data){
		this.data = data;
	}
	
	public Node(Integer data, Node left, Node right){
		this.data = data;
		this.left = left;
		this.right = right;
	}
}
