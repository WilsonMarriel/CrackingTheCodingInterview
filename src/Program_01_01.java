import java.util.HashSet;


public class Program_01_01 {
	
	public static int DIFFERENT_CHAR = 256;//ASCII
	
	public static boolean hasAllUnique(String str){
		if(str.length() > DIFFERENT_CHAR) return false;
		
		HashSet<Character> set = new HashSet<Character>();
		
		for(int i = 0; i < str.length(); i++){
			if(set.contains(str.charAt(i))) return false;
			else set.add(str.charAt(i));
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(hasAllUnique("qwertyuiopasdfghjkzxcvbnm1234567890-=[];"));
	}
}
