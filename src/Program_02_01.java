import list.singlylinked.objects.*;

public class Program_02_01 {
	
	public static void removeNext(Node<Integer> n){
		n.next = n.next.next;
	}

	public static void removeDuplicates(Node<Integer> head){
		Node<Integer> walker = head;
		Node<Integer> runner;
		while(walker.next != null){
			runner = walker;
			while(runner.next != null){
				if(runner.next.data == walker.data){
					removeNext(runner);
				} else runner = runner.next;
			}
			walker = walker.next;
		}
	}

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>(new Integer[]{0,1,2,3,2,1,0,0,0,2,2,5,6,1,1,7,8,9,1,2,3,4,5,6,7,8,9,0});
		ll.print();
		removeDuplicates(ll.head);
		ll.print();
	}

}
