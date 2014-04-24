package tree.binary.search;

public class test {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree(new Integer[]{3,2,5,1,-1,-4,-6,0,7,-10});
		bst.print();
		bst.delete(2);
		bst.delete(-6);
		bst.print();
		bst.delete(0);
		bst.delete(-10);
		bst.delete(7);
		bst.delete(-1);
		bst.print();
	}

}
