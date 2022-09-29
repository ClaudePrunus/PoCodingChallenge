import java.util.Arrays;

public class LargestGap {
	
	public static void findGap(int[] arr) {
		int gap = 0;
		Arrays.sort(arr);
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] - arr[i - 1] > gap) {
				gap = arr[i] - arr[i - 1];
			}
			
		}
		System.out.println(gap);
	}
	public static void main(String[] args) {

		findGap(new int[] {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5});
		findGap(new int[] {14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7});
		findGap(new int[] {13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9});
	}

	
}
