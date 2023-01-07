package easy;

import java.util.Scanner;

public class 자릿수더하기2058 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			while(true) {
				System.out.print("1 ~ 9999 까지의 자연수 입력 : ");
				int N = sc.nextInt();
				
				if(N >= 1 && N <= 9999) {
					int result = 0;
					
					while(N > 0) {
						result += N % 10;
						N /= 10;
					}
					
					/*
					result += N % 10;
					result += (N / 10) % 10;
					result += (N / 100) % 10;
					result += (N / 1000) % 10;
					*/
					
					System.out.println(result);
					break;
				} else {
					System.out.println("1 ~ 9999 까지의 자연수 재입력하세요.");
					continue;
				}
			}
		} catch (Exception e) {
			System.out.println("정수를 입력하지 않아 에러 발생");
		}
		
	}

}
