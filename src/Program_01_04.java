
public class Program_01_04 {

	public static void changeSpaces(char[] str, int length){
		int pos;int spaces = 0;
		for(int i=0;i<length;i++){
			if(str[i]==' ') spaces++;
		}
		pos = length + 2*spaces-1;
		for(int i=length-1;i>=0;i--){
			if(str[i]==' '){
				str[pos--]='0';str[pos--]='2';str[pos--]='%';
			} else str[pos--]=str[i];
		}
	}
	public static void main(String[] args) {
		char[] str = new char[200];
		str[0] = 'a';
		str[1] = ' ';
		str[2] = ' ';
		str[3] = 'b';
		str[4] = 'a';
		str[5] = ' ';
		str[6] = 'c';
		str[7] = 'a';
		str[8] = 't';
		str[9] = ' ';
		str[10] = ' ';
		str[11] = ' ';
		str[12] = 'e';
		str[13] = ' ';
		str[14] = '-';
		str[15] = '1';
		changeSpaces(str, 16);
		System.out.println(str);
		
	}
}