public class Program_05_05 {
	
	public static int countDiffBits(int a, int b){
		int count = 0;
		for(int c = a ^ b; c != 0; c = c & (c - 1)) count++;
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(countDiffBits(0b101011, 31));
	}
}
