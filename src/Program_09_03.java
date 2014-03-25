
public class Program_09_03 {
	
	public static int magicIndex(int[] int_array){
		int i = 0;
		while(i < int_array.length){
			if(i == int_array[i]) return i;
			if(i > int_array[i]) i++;
			else i = int_array[i];
		}
		return -1;
	}
	
	public static int magicIndexDistinct(int[] int_array){
		int i = 0;
		while(i < int_array.length){
			if(i == int_array[i]) return i;
			if(i > int_array[i]) i++;
			else return -1;
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(magicIndex(new int[]{-1,2,5,5,5,5,5}));
		System.out.println(magicIndexDistinct(new int[]{-1,0,1,2,6,7,8}));
	}
}
