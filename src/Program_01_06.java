import java.util.Arrays;


public class Program_01_06 {
	
	public static void rotate90(int[][] image){
		int n = image.length;
		for(int i = 0; i < n/2; i++){
			for(int j = 0; j <= n/2; j++){
				int aux_next, aux_current = image[i][j], xf = i, yf = j, xt, yt;
				for(int c = 0; c < 4; c++){
					xt = yf;
					yt = n - 1 - xf;
					aux_next = image[xt][yt];
					image[xt][yt] = aux_current;
					aux_current = aux_next;
					xf = xt;
					yf = yt;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[][] image = new int[][]{
	        new int[] { 1, 2, 3, 4, 5},
	        new int[] { 6, 7, 8, 9, 10},
	        new int[] { 11, 12, 13, 14, 15},
	        new int[] { 16, 17, 18, 19, 20},
	        new int[] { 21, 22, 23, 24, 25}
	    };
		System.out.println(Arrays.deepToString(image));		
		rotate90(image);
		System.out.println(Arrays.deepToString(image));
	}
}
