package moking.interviews;

import java.util.ArrayList;

public class BiggestAscendingSequence {

	public static void longestIncreasingSequence(int[] sequence){
		ArrayList<ArrayList<Integer>> map =  new ArrayList<ArrayList<Integer>>(sequence.length);
		
		for(int i = sequence.length - 1; i >= 0; i--){
			if(map.size() == 0) {
				ArrayList<Integer> to_add = new ArrayList<Integer>();
				to_add.add(sequence[i]);
				map.add(0, to_add);
			}
			else{
				int biggest = -1;
				for(int j = 0; j < map.size(); j++){
					if(sequence[i] > map.get(j).get(0)) continue;
					else{
						if(biggest == -1) biggest = j;
						else if(map.get(biggest).size() < map.get(j).size()) biggest = j;
					}
				}
				ArrayList<Integer> to_add = new ArrayList<Integer>();
				to_add.add(sequence[i]);
				if(biggest != -1) to_add.addAll(map.get(biggest));
				map.add(0, to_add);
			}	
		}

		int biggest = -1;
		for(int j = 0; j < map.size(); j++){
			if(biggest == -1) biggest = j;
			else if(map.get(biggest).size() < map.get(j).size()) biggest = j;
		}
		System.out.println(map.get(biggest).toString());
	}

	public static void main(String[] args) {
		longestIncreasingSequence(new int[]{3,2,6,4,5,1});
		longestIncreasingSequence(new int[]{3,2,6,4,5,-2,-1,0,1,2,3,4,6,7,8,9,10,8,3,6,1,12,13,5,6,2,1,18});
	}

}
