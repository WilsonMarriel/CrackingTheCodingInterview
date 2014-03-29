import java.util.HashSet;


public class Program_09_05 {
	static HashSet<String> permutations = new HashSet<String>();
	
	static void permutation(String old_str, String new_str){
		if(old_str.length() == 0){
			if(new_str.length() == 0) return;
			else{ 
				permutations.add(new_str);
				return;
			}
		}
		for(int i = 0; i < old_str.length(); i++){
			permutation(old_str.substring(0,i) + old_str.substring(i + 1), old_str.charAt(i) + new_str);
		}
	}
	
	public static void getPermutations(String str){
		permutation(str, "");
	}

	public static void main(String[] args) {
		//if the string have a lot of repeated char, its better to sort first then grant that you don't iterate through the same substrings more than once
		//this method is good for distinct chars, but not for repeated
		//its o(n!)
		getPermutations("abbcccddd");
		for (String s : permutations) {
		    System.out.println(s);
		}
		System.out.println();
		System.out.println(permutations.size());
	}

}
