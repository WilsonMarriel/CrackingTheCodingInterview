package linked.list.objects;

public class LinkedList<T> {
	public Node<T> header;
	
	public LinkedList() {
		header = new Node<T>();
	}

	public LinkedList(T[] dataset){
		for(int i = dataset.length - 1; i >= 0; i--){
			Node<T> n = new Node<T>(dataset[i]);
			n.next = header;
			header = n;
		}
	}

	public void print(){
		Node<T> n = header;
		while(n!=null){
			System.out.print("(" + n.data + ")->");
			n = n.next;
		}
		System.out.println("null");
	}
}
