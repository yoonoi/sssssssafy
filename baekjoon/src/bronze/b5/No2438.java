package bronze.b5;

import java.util.Scanner;

public class No2438 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		for(int i=0; i<size; i++) {
			for(int j=i; j>=0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
