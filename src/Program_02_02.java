import UsefulClasses.LinkedList;
import UsefulClasses.Node;

public class Program_02_02 {
	
	public static LinkedList<Integer> ll = new LinkedList<Integer>(new Integer[]{0,1,2,3,4,5,6,7,8,9,10,11,12});
	
	public static Node<Integer> kthToLast(int k){
		if(ll.header == null || k < 0) return null;
		Node<Integer> p1=ll.header,p2;
		while(k-->0){
			if(p1.next == null) return null;
			p1 = p1.next;			
		}
		p2 = ll.header;
		while(p1.next != null){
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2;
	}

	public static void main(String[] args) {
		ll.print();
		Node<Integer> n = kthToLast(4);
		if(n == null) System.out.println("null");
		else System.out.println(n.data);
	}
}
