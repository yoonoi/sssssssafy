package silver.s4.no2839;

import java.util.Scanner;

public class No2839_sol {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int numF = n / 5;
		int numT = (n - 5 * numF) / 3;
		
		while((numF * 5 + numT * 3) != n) {
			numF -= 1;
			numT = (n - 5 * numF) / 3;
			if(numF <= 0) {
				numF = -1;
				break;
			}
		}
		
		System.out.println(numF);
		System.out.println(numT);
	}

}
