import tree.binary.objects.BinaryTree;
import tree.binary.objects.Node;


public class Program_04_03 {

	public static BinaryTree<Integer> toBinarySearchTree(int[] dataset){
		return new BinaryTree<Integer>(toBST(dataset, 0, dataset.length));		
	}
	
	public static Node<Integer> toBST(int[] dataset, int start, int length){
		if(length == 0) return null;
		Node<Integer> n = new Node<Integer>(dataset[start + length/2]);
		n.left = toBST(dataset, start, length/2);
		n.right = toBST(dataset, start + length/2 + 1, length - length/2 - 1);
		return n;
	}
	public static void main(String[] args) {
		
		toBinarySearchTree(new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12}).print();
	}

}
