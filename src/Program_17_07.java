import java.util.ArrayList;
import java.util.HashMap;


public class Program_17_07 {
	static String[] thousands = new String[]{
			"Thousand", 
			"Million", 
			"Billion", /*not in int range - >>*/"Trillion", "Quadrillion", "Quintillion", "Sextillion", "Septillion", "Octillion", "Nonillion", "Decillion", "Undecillion", "Duodecillion", "Tredecillion", "Quattuordecillion", "Quindecillion", "Sexdecillion", "Septendecillion", "Octodecillion", "Novemdecillion", "Vigintillion"
		};
	static final HashMap<Integer, String> primitiveNumbers = new HashMap<Integer, String>()
		{
			private static final long serialVersionUID = 1L;
			{
		        put(0, "Zero");
		        put(1, "One");
		        put(2, "Two");
		        put(3, "Three");
		        put(4, "Four");
		        put(5, "Five");
		        put(6, "Six");
		        put(7, "Seven");
		        put(8, "Eight");
		        put(9, "Nine");
		        put(10, "Ten");
		        put(11, "Eleven");
		        put(12, "Twelve");
		        put(13, "Thirteen");
		        put(15, "Fifteen");
		        put(18, "Eighteen");
		        put(20, "Twenty");
		        put(30, "Thirty");
		        put(40, "Forty");
		        put(50, "Fifty");
		        put(80, "Eighty");
		    }
		};

	
	public static void spellNumber(int num){
		ArrayList<Integer> t_nums = new ArrayList<Integer>();
		String str_num = "";
		if(num < 0){
			str_num += "Negative ";
			num = -num;
		}
		
		while(num / 1000 != 0){
			t_nums.add(num % 1000);
			num = num / 1000;
		}
		t_nums.add(num);
		
		for(int i = t_nums.size() - 1; i >= 0; i--){
			num = t_nums.get(i);
			if(num != 0){
				str_num += spellHundredsNumber(num);
				if(i > 0) str_num += " " + thousands[i-1] + " ";
			}
		}
		System.out.println(str_num);
	}
	
	static String spellHundredsNumber(int num){
		if(primitiveNumbers.containsKey(num)) return primitiveNumbers.get(num);
		String num_str = "";
		if(num/100 != 0) num_str = primitiveNumbers.get(num / 100) + " Hundred ";
		num = num % 100;
		if(primitiveNumbers.containsKey(num)) num_str += primitiveNumbers.get(num);
		else if(num < 20) num_str += primitiveNumbers.get(num - 10) + "teen";
		else{
			if(primitiveNumbers.containsKey(num / 10 * 10)) num_str += primitiveNumbers.get(num / 10 * 10) + " " + primitiveNumbers.get(num % 10);
			else{
				num_str += primitiveNumbers.get(num / 10) + "ty";
				if(num % 10 != 0) num_str +=  " " + primitiveNumbers.get(num % 10);
			}
		}
		return num_str;
	}

	public static void main(String[] args) {
		spellNumber(1345008022);
	}

}
