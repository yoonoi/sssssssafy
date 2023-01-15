package silver.s4;

import java.util.Scanner;

public class No2839 {
	
	public static int method(int n) {
		int cnt = 0;
		int input = n;
		
		while(true) {
			int inputNum = n;
			
			cnt += n / 5;
			n %= 5;
			cnt += n / 3;
			n %= 3;
			
			if(n != 0) {
				if(inputNum % 3 == 0) {
					if(inputNum == input) {
						cnt = inputNum / 3;
						break;
					}
					else {
						cnt += inputNum / 3;
						break;						
					}
				}
				else if(inputNum > 5) {
					n = inputNum - 5;
					cnt = 1;
					continue;
				} else {
					cnt = -1;
					break;
				}
			} else break;			
		}
		return cnt;
	}

	public static void main(String[] args) {
		// 설탕 배달
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(method(n));
		
	}
}
