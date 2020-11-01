
public class Fraction {
	private static int num = 1;
	private static int den = 2;
	
	public Fraction() {
		num = 1;
		den = 2;
		
	// First Fraction = 1/2	
			
		}
	
	public Fraction(int num, int den) {
		
	}
	
	// ADDITION METHOD
	public void sum(int num2, int den2) {
		int numresult = num * den2 + num2 * den;
		int denresult = den * den2;
		System.out.println(num + "/" + den + " + " + num2 + "/" + den2 + " = " +numresult + "/" + denresult);
		
	}	
	
	// SUBTRACTION METHOD
	public void diff(int num2, int den2) {
		int numresult = num * den2 - num2 * den;
		int denresult = den * den2;
		System.out.println(num + "/" + den + " - " + num2 + "/" + den2 + " = " +numresult + "/" + denresult);
		
	}
		
	// MULTIPLICATION METHOD
	public void prod(int num2, int den2) {
		int numresult = num * num2;
		int denresult = den * den2;
		System.out.println(num + "/" + den + " * " + num2 + "/" + den2 + " = " + numresult + "/" + denresult);
		
	}
	
	// DIVISION METHOD	
	public void quot(int num2, int den2) {
		int numresult = num * den2;
		int denresult = den * num2;
		System.out.println(num + "/" + den + " / " + num2 + "/" + den2 + " = " + numresult + "/" + denresult);
	}
	

	}
