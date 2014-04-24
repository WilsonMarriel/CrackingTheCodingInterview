package solutions.ch01;
import java.util.Arrays;
import java.util.BitSet;


public class Program_01_07 {
	
	public static void setZeros(int [][] matrix){
		int nrows = matrix.length;
		int ncolumns = matrix[0].length;
		BitSet rows = new BitSet(nrows);
		BitSet columns = new BitSet(ncolumns);
		
		for(int i = 0; i < nrows; i++){
			for(int j = 0; j < ncolumns; j++){
				if(matrix[i][j] == 0){
					rows.set(i);
					columns.set(j);
				}
			}
		}
		for(int i = 0; i < nrows; i++){
			for(int j = 0; j < ncolumns; j++){
				if(rows.get(i) || columns.get(j)){
					matrix[i][j] = 0;
				}
			}
		}		
	}

	public static void main(String[] args) {
		int[][] matrix = new int[][]{
		        new int[] { 1, 2, 3, 4, 5},
		        new int[] { 6, 7, 0, 9, 0},
		        new int[] { 11, 12, 13, 14, 15},
		        new int[] { 16, 17, 18, 19, 0},
		        new int[] { 21, 22, 23, 0, 25}
		    };
		System.out.println(Arrays.deepToString(matrix));		
		setZeros(matrix);
		System.out.println(Arrays.deepToString(matrix));
	}

}
