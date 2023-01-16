package silver.s4;

import java.util.Scanner;

public class No2839_3 {
	public static int method(int n) {
		int cnt = 0;
		
		if(n >= 5) {
			if(n % 5 == 0) {
				cnt += n / 5;
			}
			else if(n % 5 == 1) {
				cnt += 2;
				cnt += (n - 6) / 5;
			}
			else if(n % 5 == 2) {
				if(n != 7) {
					cnt += 4;
					cnt += (n - 12) / 5;
				} else cnt = -1;
			}
			else if(n % 5 == 3) {
				cnt += n / 5;
				cnt += 1;
			}
			else if(n % 5 == 4) {
				cnt += 3;
				cnt += (n - 9) / 5;
			}
		} else if (n % 3 == 0) {
			cnt += n / 3;
		} else {
			cnt = -1;
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(method(n));
	}
}
