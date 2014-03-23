import list.singlylinked.objects.LinkedList;
import list.singlylinked.objects.Node;


public class Program_02_03 {
	public static LinkedList<Integer> ll = new LinkedList<Integer>(new Integer[]{0,1,2,3,4,5,6,7,8,9,10,11,12});
	
	public static void removeNode(Node<Integer> n){
		if(n.next == null){
			n.data = null;
			return;
		}
		n.data = n.next.data;
		n.next = n.next.next;
	}

	public static void main(String[] args) {
		ll.print();
		Node<Integer> last = ll.head;
		while(last.next != null) last = last.next;
		removeNode(ll.head.next.next.next);//last);
		ll.print();
	}

}
