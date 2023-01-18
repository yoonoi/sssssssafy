package silver.s5;

import java.util.Scanner;

public class No10815 {

	public static void main(String[] args) {
		// 시간 초과
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] have = new int[n];
		
		for(int i=0; i<n; i++) {
			have[i] = sc.nextInt();
		}
		
		int m = sc.nextInt();
		for(int i=0; i<m; i++) {
			int num = sc.nextInt();
			
			boolean having = false;
			
			for(int j=0; j<n; j++) {
				if(num == have[j]) {
					having = true;
					break;
				}
			}
			
			if(having) {
				System.out.print(1 + " ");
			} else {
				System.out.print(0 + " ");
			}
		}
		
		
	}

}
