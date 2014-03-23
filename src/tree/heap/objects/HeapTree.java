package tree.heap.objects;

import java.util.ArrayList;

public class HeapTree {
	private ArrayList<Integer> nodes;
	
	public HeapTree(){
		nodes = new ArrayList<Integer>();
	}
	
	public HeapTree(Integer[] dataset){
		nodes = new ArrayList<Integer>();
		for(Integer i = 0; i < dataset.length; i++)
			push(dataset[i]);
	}
	
	private Integer right(Integer i){
		return 2*i+2;
	}
	
	private Integer left(Integer i){
		return 2*i+1;
	}	
	
	private boolean hasRight(Integer i){
		return right(i) < nodes.size();
	}
	
	private boolean hasLeft(Integer i){
		return left(i) < nodes.size();
	}	
	
	private Integer parent(Integer i){
		return (i-1)/2;
	}
	
	private boolean hasParent(Integer i){
		return i != 0;
	}
	
	private void swap(Integer a, Integer b){
		Integer aux = nodes.get(b);
		nodes.set(b, nodes.get(a));
		nodes.set(a, aux);
	}
	
	public void push(Integer data){
		nodes.add(data);
		balance(false);
	}
	
	public Integer pop(){
		int popped = nodes.get(0);
		swap(0, nodes.size() - 1);
		nodes.remove(nodes.size() - 1);
		balance(true);
		return popped;
	}
	
	private void balance(boolean isPop){
		if(!isPop){
			Integer n = nodes.size() - 1;
			while(hasParent(n) && (nodes.get(n) > nodes.get(parent(n)))){
				swap(n, parent(n));
				n = parent(n);
			}
		}else{
			Integer n = 0;
			while(hasRight(n) || hasLeft(n)){
				if(hasRight(n) && hasLeft(n) && ((nodes.get(n) < nodes.get(right(n))) || (nodes.get(n) < nodes.get(left(n))))){
					if(nodes.get(right(n)) > nodes.get(left(n))){
						swap(n, right(n));
						n = right(n);
					}
					else {
						swap(n, left(n));
						n = left(n);
					}
				}
				else if(hasRight(n) && (nodes.get(n) < nodes.get(right(n)))){
					swap(n, right(n));
					n = right(n);
				}
				else if(hasLeft(n) && (nodes.get(n) < nodes.get(left(n)))){
					swap(n, left(n));
					n = left(n);
				}
				else break;
			}
		}	
	}
	
	public void print(){
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println();
		print(0, "");
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println();
	}
	
	private void print(Integer n, String prefix) {
		if(n >= nodes.size()){
		    System.out.println(prefix + "+- <null>");
		    return;
	    }
	    System.out.println(prefix + "+- " + nodes.get(n));
	    print(right(n), prefix + "|  ");
	    print(left(n), prefix + "|  ");
	}
}
