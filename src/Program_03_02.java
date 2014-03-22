import stack.objects.Node;

public class Program_03_02 {
	private static Node<Integer> top;
	private static Node<Integer> min;
	
	public static Integer pop(){
		if(top == null) {print(); return null;}
		Node<Integer> popped = top;
		top = top.next;
		if(popped.data == min.data){
			min = min.next;
		}
		print();
		return popped.data;
	}
	
	public static void push(Integer data){
		Node<Integer> oldtop = top;
		top = new Node<Integer>(data);
		top.next = oldtop;
		
		if(min == null) min = new Node<Integer>(data);
		else if(data <= min.data){
			Node<Integer> oldmin = min;
			min = new Node<Integer>(data);
			min.next = oldmin;
		}
		print();
	}
	
	public static Integer min(){
		if(min != null) return min.data;
		return null;
	}
	
	public static void print(){
		Node<Integer> n = top;
		while(n!=null){
			System.out.print("(" + n.data + ")->");
			n = n.next;
		}
		System.out.println("null");
		System.out.println("min = " + min());
	}
	
	public static void main(String[] args) {
		push(2);
		push(3);pop();
		push(1);
		push(1);
		push(1);pop();pop();pop();pop();pop();pop();pop();pop();
		push(0);
		push(4);pop();
		push(5);
		push(2);
		push(1);pop();
		push(4);
		push(0);
		push(-3);
		push(-1);pop();pop();
		push(0);pop();pop();pop();		
	}
}
