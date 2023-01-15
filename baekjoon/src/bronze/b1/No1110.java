package bronze.b1;

import java.util.Scanner;

public class No1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int inputNum = num; // 처음 들어온 수 저장해놓을 변수
		int cnt = 0; 
		
		while(true) {
			int cycleNum = 0;
			
			// num의 각 자리수 더하기
			cycleNum = num / 10 + num % 10;
			
			// 각각 오른쪽 수로 새로운 수 만들기
			num = (num % 10) * 10 + cycleNum % 10;
			
			cnt++;
			
			if(inputNum == num) break;
		}
		System.out.println(cnt);
		
	}
}
