package silver.s5;

import java.util.Scanner;

public class No1978_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int cnt = 0;
		
		for(int i=0; i<num; i++) {
			
			int tmp = sc.nextInt();
			boolean bool = false;
			
			if(tmp == 1) bool = true;
			
			for(int j=2; j<tmp; j++) {
				if(tmp % j == 0) {
					bool = true;
					break;
				}
			}
			
			if(!bool) cnt++;
			
		}
		System.out.println(cnt);
		
	}

}
