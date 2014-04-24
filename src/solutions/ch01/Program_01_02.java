package solutions.ch01;

public class Program_01_02 {

	public static void reverse(char[] str){
		for(int i = 0; i < str.length/2; i++){
			char aux = str[i];
			str[i] = str[str.length - i - 1];
			str[str.length - i - 1] = aux;
		}
	}
	
	public static void main(String[] args) {
		char[] str = "1234567890".toCharArray();
		reverse(str);
		System.out.println(str);
	}
}
