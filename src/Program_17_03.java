
public class Program_17_03 {
	
	public static int factorialTrailingZeros(int n){
		if(n < 0) return -1;
		int fives = 0;
		int fivePow = 5;
		while(fivePow <= n){
			fives += n/fivePow;
			fivePow *= 5;
		}
		return fives;
	}

	public static void main(String[] args) {
		System.out.println(factorialTrailingZeros(1234567890));
	}
}
