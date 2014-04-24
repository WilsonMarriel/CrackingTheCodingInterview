package tree.binary.search;

public class BinarySearchTree {
	public Node root;
	
	public BinarySearchTree(){
		root = new Node();
	}
	
	public BinarySearchTree(Integer data){
		root = new Node(data);
	}
	
	public BinarySearchTree(Integer[] dataset){
		for(Integer data: dataset)
			insert(data);
	}
	
	public BinarySearchTree(Node root){
		this.root = root;
	}
	
	public boolean insert(Integer data){
		if(root == null) root = new Node(data);
		Node n = root;
		while(true){
			if(data == n.data) return false;//already there
			else if(data > n.data){
				if(n.right != null) n = n.right;
				else {
					n.right = new Node(data);
					return true;
				}
			}
			else {
				if(n.left != null) n = n.left;
				else {
					n.left = new Node(data);
					return true;
				}
			}
		}
	}
	
	public boolean delete(Integer data){
		if(root == null) return false;
		Node n = root;
		Node parent = null;
		while(data != n.data){
			if(data > n.data){
				if(n.right != null){
					parent = n;
					n = n.right;
				}
				else return false;
			}
			else if(data < n.data){ 
				if(n.left != null){
					parent = n;
					n = n.left;
				}
				else return false;
			}
		}
		
		if(n.right == null && n.left == null){
			if(parent == null) root = null;
			else if(parent.right == n) parent.right = null;
			else parent.left = null;
			return true;
		}
		else if(n.right == null){
			if(parent == null) root = n.left;
			else if(parent.right == n) parent.right = n.left;
			else parent.left = n.left;
		}
		else if(n.left == null){
			if(parent == null) root = n.right;
			else if(parent.right == n) parent.right = n.right;
			else parent.left = n.right;
		}
		else{
			Node next_n = n.left;
			Node next_parent = n;
			while(next_n.right != null){
				next_parent = next_n;
				next_n = next_n.right;
			}
			if(next_parent.right == n) next_parent.right = next_n.left;
			else next_parent.left = next_n.left;
			next_n.right = n.right;
			next_n.left = n.left;
			if(n == root) root = next_n;
			else{
				if(parent == null) root = next_n;
				else if(parent.right == n) parent.right = next_n;
				else parent.left = next_n;
			}
		}
		return true;
	}
	
	public int getDepth(){
		return getDepth(root);
	}
	private int getDepth(Node p){
		if(p == null) return 0;
		int h1 = getDepth(p.left);
		int h2 = getDepth(p.right);
		
		if(h1 > h2)return h1 + 1;
		else return h2 + 1;
	}
	
	public void print(){
		Node n = root;
		print(n, "");
		System.out.println("--------------------------\n");
	}
	
	private void print(Node n, String prefix) {
	    if (n == null) {
		    System.out.println(prefix + "+- <null>");
		    return;
	    }
	    System.out.println(prefix + "+- " + n.data);
	    print(n.right, prefix + "|  ");
	    print(n.left, prefix + "|  ");
	}
}
