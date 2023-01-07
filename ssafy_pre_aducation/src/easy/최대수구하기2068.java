package easy;

import java.util.Scanner;

public class 최대수구하기2068 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		
		for(int i=0; i<cnt; i++) {
			int max = 0;
			for(int j=0; j<10; j++) {
				int tmp = sc.nextInt();
				if(max < tmp) max = tmp;
			}
			System.out.printf("#%d %d", i, max);
		}
	}

}
