import linked.list.objects.*;
public class Program_02_05_partial {

	public static LinkedList<Integer> sumBackwards(LinkedList<Integer> a, LinkedList<Integer> b){
		LinkedList<Integer> c = new LinkedList<Integer>();
		Node<Integer> nc = c.header;
		Node<Integer> na = a.header;
		Node<Integer> nb = b.header;
		
		int va, vb, carry = 0;
		
		while(true){
			if(na == null) va = 0;
			else va = na.data;
			if(nb == null) vb = 0;
			else vb = nb.data;
			nc.data = (carry + va + vb)%10;
			carry = (carry + va + vb)/10;
			if(na != null) na = na.next;
			if(nb != null) nb = nb.next;
			if(!(na == null && nb == null && carry == 0)){
				nc.next = new Node<Integer>();
				nc = nc.next;
			}
			else break;
		}
		return c;
	}
	
	public static LinkedList<Integer> sumForwards(LinkedList<Integer> a, LinkedList<Integer> b){
		//TODO: Implement FOLLOW UP
		return sumBackwards(b,a);
	}

	public static void main(String[] args) {
		sumBackwards(new LinkedList<Integer>(new Integer[]{9,7,8,8}), new LinkedList<Integer>(new Integer[]{8,9,9,9})).print();
		sumForwards(new LinkedList<Integer>(new Integer[]{9,7,8,8}), new LinkedList<Integer>(new Integer[]{8,9,9,9})).print();
	}

}
