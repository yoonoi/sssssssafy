package silver.s4.no1920;

import java.util.Scanner;

public class No1920_sol2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		if(input == 4 || input == 7) System.out.println(-1);
		else if(input % 5 == 0) System.out.println(input / 5);
		else if(input % 5 == 1 || input % 5 == 3) System.out.println(input / 5 + 1);
		else if(input % 5 == 2 || input % 5 == 4) System.out.println(input / 5 + 2);
		
		
	}

}
