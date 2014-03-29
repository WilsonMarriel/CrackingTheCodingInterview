
public class Program_17_11 {
	
	static int rand5(){
		return (int)(Math.random() * 4);
	}
	
	public static int rand7(){
		//random number from 0 to 24
		int rand25 = rand5()*5 + rand5();
		
		if(rand25 < 21) return rand25%7;
		else return rand7();
	}

	public static void main(String[] args) {
		System.out.println(rand7());
	}

}
