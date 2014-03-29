
public class Program_17_01 {
	
	public static void swap(int[] to_swap){
		to_swap[0] = to_swap[0] + to_swap[1];
		to_swap[1] = to_swap[0] - to_swap[1];
		to_swap[0] = to_swap[0] - to_swap[1];
	}

	public static void main(String[] args) {
		int[] to_swap = new int[]{55, 80};
		System.out.println(to_swap[0] + ", " + to_swap[1]);
		swap(to_swap);
		System.out.println(to_swap[0] + ", " + to_swap[1]);
	}
}
