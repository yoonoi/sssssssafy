package easy;

import java.util.Scanner;

public class 평균값구하기2071 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=1; i<=T; i++) {
			int sum = 0;
			
			for(int j=0; j<10; j++) {
				int num = sc.nextInt();
				sum += num;
			}
			//System.out.printf("#%d %d\n", i, Math.round(sum/10)); sum/10은 몫만 나오니까 sum/10.0을 해줘야함
			System.out.printf("#%d %d\n", i, Math.round(sum/10.0));			
		}
	}

}
