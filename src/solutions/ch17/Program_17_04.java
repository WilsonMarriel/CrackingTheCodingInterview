package solutions.ch17;

public class Program_17_04 {

	public static double max(double a, double b){
		return ((int)(a/b))*a + ((int)(b/a))*b;
	}
	public static void main(String[] args) {
		System.out.print(max(13.344, 13.34399999999999/*10E-14 precision?*/));
	}

}
