package silver.s5;

import java.util.Scanner;

public class No2167 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] arr = new int[n][m];
		
		// 입력받은 값 배열에 할당
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int k = sc.nextInt();
		
		// k번 반복문
		for(int tc=0; tc<k; tc++) {
			int i = sc.nextInt();	int j = sc.nextInt();
			int x = sc.nextInt();	int y = sc.nextInt();		
			
			// 1 ~ k번 반복마다 배열합 초기화
			int arrSum = 0;
			
			// (행,열) (i,j) ~ (x,y) 배열합 누적  --> 인덱스는 0부터 시작이라 -1 해줌 
			for(int r=i-1; r<x; r++) {
				for(int c=j-1; c<y; c++) {
					arrSum += arr[r][c];
				}
			}
			
			System.out.println(arrSum);
		}
		
	}
}
