
public class Program_01_05 {
	
	public static String compress(String str){
		StringBuffer cstr = new StringBuffer();
		int i = 0;
		int length = str.length();
		while(i<length){
			char c = str.charAt(i);
			int count = 0;
			while(i<length && c==str.charAt(i)) 
			{
				i++;
				count++;
			}
			cstr.append(c);
			cstr.append(count);
		}
		if(cstr.length()>=length) return str;
		return cstr.toString();
	}

	public static void main(String[] args) {
		String a = "aabcccccaaa";
		System.out.println(compress(a));
	}
}
