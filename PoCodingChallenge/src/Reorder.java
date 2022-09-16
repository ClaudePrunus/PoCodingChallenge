import java.util.Arrays;
import java.util.Collections;

public class Reorder {
	
	public static int[] reorder(int[] digits, String order) {
		if(order.equals("asc")) {
			Arrays.sort(digits);
			return digits;
		} else if(order.equals("desc")) {
			Arrays.sort(digits, Collections.reverseOrder());
			return digits;
		}
		return digits;
	}
}
