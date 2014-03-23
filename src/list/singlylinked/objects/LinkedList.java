package list.singlylinked.objects;

public class LinkedList<T> {
	public Node<T> head;
	
	public LinkedList() {
		head = null;
	}

	public LinkedList(T[] dataset){
		for(int i = dataset.length - 1; i >= 0; i--){
			Node<T> n = new Node<T>(dataset[i]);
			n.next = head;
			head = n;
		}
	}

	public void print(){
		Node<T> n = head;
		while(n!=null){
			System.out.print("(" + n.data + ")->");
			n = n.next;
		}
		System.out.println("null");
	}
}
