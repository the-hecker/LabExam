
public class CheckNumbers {
	public static void main(String[] args) {
		CheckNumbers c = new CheckNumbers();
		int number = 3;
		System.out.println(c.evenInteger(number));
		System.out.println(c.isPrime(number));
		
		
	}
	public static String evenInteger(int number) {
		if(number % 2 == 0) {
			return "Even Number";
		}
		return "Not Even Number";
	}
	
	 public static boolean isPrime(int n)
	    {
	        if (n <= 1) {
	            return false;
	        }
	        for (int i = 2; i < n; i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	  
	        return true;
	    }
}
