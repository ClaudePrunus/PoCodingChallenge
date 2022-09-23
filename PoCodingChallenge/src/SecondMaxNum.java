import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SecondMaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int secNum = sc.nextInt();
		for (int i = 0; i < secNum; i++) {
			ArrayList<Integer> three = new ArrayList<Integer>(3);
			three.add(0, sc.nextInt());
			three.add(1, sc.nextInt());
			three.add(2, sc.nextInt());
			
			Collections.sort(three);;
			System.out.println(three.get(1));
			
			sc.close();
		}
	}

}
