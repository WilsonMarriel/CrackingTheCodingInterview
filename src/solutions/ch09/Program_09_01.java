package solutions.ch09;

public class Program_09_01 {
	
	public static int getStepsCount(int n){
		if(n == 0) return 1;
		if(n == 1) return 1;
		if(n == 2) return 2;
		
		int[] stair_length = new int[3];
		
		stair_length[0] = 1;
		stair_length[1] = 1;
		stair_length[2] = 2;
		
		for(int i = 3; i <= n; i++){
			stair_length[i%3] = stair_length[0] + stair_length[1] + stair_length[2];
		}
		return stair_length[n%3];
	}
	
	public static void main(String[] args) {
		System.out.println(getStepsCount(1000));
	}
}
