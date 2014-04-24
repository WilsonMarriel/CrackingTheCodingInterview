package solutions.ch04;
import tree.binary.BinaryTree;
import tree.binary.Node;

public class Program_04_01 {
		public static BinaryTree<Integer> bt = new BinaryTree<Integer>();
		
		public static int getDepth(Node<Integer> p){
			if(p == null) return 0;
			int h1 = getDepth(p.left);
			if(h1 == -1) return -1;
			int h2 = getDepth(p.right);
			if(h2 == -1) return -1;
			
			if(h1 >= h2){
				if(h1 - h2 < 2) return h1 + 1;
				return -1;
			} else {
				if(h2 - h1 < 2) return h2 + 1;
				return -1;
			}
		}
		
		public static boolean isBalanced(){
			if(getDepth(bt.root) == -1) return false;
			return true;
		}

	public static void main(String[] args) {
		bt.root.data = 0;
		bt.root.left = new Node<Integer>(1);
		bt.root.right = new Node<Integer>(2);
		bt.root.left.left = new Node<Integer>(3);
		bt.root.right.left = new Node<Integer>(4);
		bt.root.left.right = new Node<Integer>(5);
		bt.root.right.right = new Node<Integer>(6);
		bt.root.right.right.right = new Node<Integer>(7);
		bt.root.left.right.left = new Node<Integer>(8);
		bt.root.right.right.right.left = new Node<Integer>(9);
		bt.root.right.right.right.left.right = new Node<Integer>(10);
		bt.root.right.right.right.left.right.left = new Node<Integer>(11);
		
		bt.print();
		System.out.println();
		System.out.println();
		System.out.println(isBalanced());
	}

}
