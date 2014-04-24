package solutions.ch02;
import list.singlylinked.*;

public class Program_02_04 {
	
	public static void partitionList(LinkedList<Integer> ll, int x){
		LinkedList<Integer> lower = new LinkedList<Integer>();
		LinkedList<Integer> higher = new LinkedList<Integer>();
		
		Node<Integer> n = ll.head;
		Node<Integer> lp = null;
		Node<Integer> hp = null;
		while(n != null){
			if(n.data < x){
				if(lower.head == null){
					lp = new Node<Integer>(n.data);
					lower.head = lp;
				}else{
					lp.next = new Node<Integer>(n.data);
					lp = lp.next;
				}
			} else {
				hp = new Node<Integer>(n.data);
				hp.next = higher.head;
				higher.head = hp;
			}
			n = n.next;
		}
		if(lp != null){
			lp.next = hp;
			ll.head = lower.head;
		}
	}

	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<Integer>(new Integer[]{0,10,45,2,3,55,34,8,7,6,5,4,9,8,7,6});
		ll.print();
		partitionList(ll, 30);
		ll.print();
	}
}
