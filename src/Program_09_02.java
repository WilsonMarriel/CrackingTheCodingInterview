import java.util.Arrays;


public class Program_09_02 {
	
	static int path_counter;
	static int[][] fields;
	
	
	static boolean canMoveTo(int x, int y){
		return !(fields == null || y >= fields.length ||
				x >= fields[y].length ||
				fields[y][x] != 0);
	}
		
	public static int countPaths(int[][] matrix){
		fields = matrix;
		if(!canMoveTo(0, 0)) return 0;
		path_counter = 0;
		findPaths(0, 0);
		return path_counter;
	}
	
	static void findPaths(int x, int y){
		if(y == fields.length - 1 && x == fields[y].length - 1){
			path_counter++;
			return;
		}
		if(canMoveTo(x + 1, y)) findPaths(x + 1, y);
		if(canMoveTo(x, y + 1)) findPaths(x, y + 1);
	}

	public static void main(String[] args) {
		int[][] matrix = new int[][]{
		        new int[] { 0, 0, 0, 0, 0},
		        new int[] { 0, 45, 0, -25, 0},
		        new int[] { 0, 0},
		        new int[] { 0, 0, 0, 0, 0},
		        new int[] { 0, 2, 0, 0, 0},
		        new int[] { 0, 7, 0, 0, 0},
		        new int[] { 0, 4, 0, 0, 0},
		        new int[] { 0, 1, 0, 0, 0}
		    };
		// in this solution matrix lines DON'T need to have the same size
		// without the follow up, do all 0's or could just calculate C(x+y,x) = (x+y)!/(x!y!)
		System.out.println(Arrays.deepToString(matrix));
		System.out.println(countPaths(matrix));
	}

}
