package tree.binary.objects;

public class BinaryTree<T> {
	public Node<T> root;
	
	public BinaryTree(){
		root = new Node<T>();
	}
	
	public BinaryTree(T data){
		root = new Node<T>(data);
	}
	
	public BinaryTree(Node<T> root){
		this.root = root;
	}
	
	public int getDepth(){
		return getDepth(root);
	}
	private int getDepth(Node<T> p){
		if(p == null) return 0;
		int h1 = getDepth(p.left);
		int h2 = getDepth(p.right);
		
		if(h1 > h2)return h1 + 1;
		else return h2 + 1;
	}
	
	public void print(){
		Node<T> n = root;
		print(n, "");
	}
	
	private void print(Node<T> n, String prefix) {
	    if (n == null) {
	    System.out.println(prefix + "+- <null>");
	    return;
	    }
	    System.out.println(prefix + "+- " + n.data);
	    print(n.right, prefix + "|  ");
	    print(n.left, prefix + "|  ");
	}
}
