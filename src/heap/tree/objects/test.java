package heap.tree.objects;
import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		HeapTree ht = new HeapTree(new Integer[]{-3, 5, 0, -2, 4, 7, 0, -10, 800, 56, -600});
		ht.push(900);
		ht.push(90);
		ht.push(50);
		ht.push(4);
		ht.push(90000);
		ArrayList<Integer> maxes = new ArrayList<Integer>();
		maxes.add(ht.pop());
		maxes.add(ht.pop());
		maxes.add(ht.pop());
		maxes.add(ht.pop());
		maxes.add(ht.pop());
		maxes.add(ht.pop());
		maxes.add(ht.pop());
		maxes.add(ht.pop());
		maxes.add(ht.pop());
		maxes.add(ht.pop());
		ht.print();
		System.out.println(maxes.toString());
	}

}
