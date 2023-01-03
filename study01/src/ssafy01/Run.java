package ssafy01;

import java.util.Arrays;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		while(true) {
			System.out.print("숫자 입력 : ");
			int idx = sc.nextInt(); sc.nextLine();
			if(idx == 0) break;
			
			int[] arr = new int[10];
			String[] tmpArr = new String[10];
			
			for(int i=0; i<idx; i++) {
				System.out.print("10개의 숫자 띄어쓰기 구분 후 입력 : ");
				String str = sc.nextLine();
				tmpArr = str.split(" ");
				
				// 문자열배열 숫자배열로 변환하기
				for(int j=0; j<tmpArr.length; j++) {
					arr[j] = Integer.parseInt(tmpArr[j]);
				}
				
				// 숫자배열 전체 합 구하기
				int sum = 0;

				for(int j=0; j<arr.length; j++) {
					sum += arr[j];
				}
				
				// 숫자배열 평균 구하기
				int avg = sum / arr.length;
				
				System.out.println("#" + (i+1) + " " + avg);
			}
			
		}
		
		
		
		 
		 
		 
	}
}
