import java.util.regex.Pattern;

public class CheckPinAndFactoral {
	
	//1. check pin
	static boolean isValidate(String pin) {
		return Pattern.matches("^[0-9]{4,6}", pin);
	}
	
	//2. check factorial
	static boolean isFactorial(int f) {
		for (int i = 1;; i++) {
			if(f % i == 0) {
				f /= i;
			} else {
				break;
			}
		}
		
		if (f == 1) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		//pin
		String[] pin = {"121317", "1234", "45135", "89abc1", "900876", "4983"};
		//check whether it is true or not
		for(String a: pin) {
			System.out.println("Is it a valid pin? " + isValidate(a));
		}
		//num for factorial
		Integer[] fac = {2, 27, 24};
		//check whether it is factorial or not
		for(int n: fac) {
			System.out.println("Is it a factorial? " + isFactorial(n));
		}
	}
}
