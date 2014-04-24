package solutions.ch09;
import java.math.BigInteger;


public class Program_09_01_BigInteger {
	
	public static BigInteger getStepsCount(int n){
		if(n == 0) return BigInteger.valueOf(0);
		if(n == 1) return BigInteger.valueOf(1);
		
		BigInteger[] stair_length = new BigInteger[2];
		
		stair_length[0] = BigInteger.valueOf(0);
		stair_length[1] = BigInteger.valueOf(1);
		
		for(int i = 2; i <= n; i++){
			stair_length[i%2] = stair_length[0].add(stair_length[1]);
		}
		return stair_length[n%2];
	}
	
	public static void main(String[] args) {
		System.out.println(getStepsCount(100));
	}
}
