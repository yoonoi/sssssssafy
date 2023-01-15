package silver.s4;

import java.util.Scanner;

public class No2839_2 {
	
	public static int method(int n) {
		int cnt1 = 0;
		int cnt2 = 0;
		int inputNum = n;
		
		while(true) {
			int input = n;
			
			cnt1 = n / 5;
			n %= 5;
			cnt1 += n / 3;
			n %= 3;
			
			if(input % 3 == 0) {
				cnt2 = input / 3;
				if(n != 0) {
					if(inputNum == input) cnt1 = cnt2;
					else cnt1 += cnt2;
				}
				break;
			} else if(n != 0) {
				if(input > 5) {					
					cnt1 = 1;
					n = input - 5;
					cnt2 = 0;
					continue;
				} else {
					cnt1 = -1;
					break;
				}
			} else break;
		}
		return cnt1;
	}

	public static void main(String[] args) {
		// 설탕 배달
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(method(n));		
		
	}
}
