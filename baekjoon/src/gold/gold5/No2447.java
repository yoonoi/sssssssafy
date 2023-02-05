package gold.gold5;

import java.util.Scanner;

public class No2447 {
	// 별찍기 - 10
	
	static char[][] arr;
	
	
	// 재귀함수 만들때 void로 하기
	// 그래야 종료조건에서 return으로 끝낼수가 있으니까! (최소단위 생각하기)
	public static void stars(int n, int startRow, int startCol) {
		
		// 종료조건(최소단위)
		if(n == 3) {
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(i == 1 && j == 1) {
						arr[i + startRow][j + startCol] = ' ';
						continue;
					}
					arr[i + startRow][j + startCol] = '*';
				}
			}
			return;
		}

		// 재귀
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(!(i == 1 && j == 1)) {
					stars(n/3, startRow + n/3 * i, startCol + n/3 * j);
				} else {
					// 공백넣는 코드
					makeSpacebar(n/3, startRow + n/3 * i, startCol + n/3 * j);
				}
			}
		}
	}
	
	// 가운데 정사각형 공백넣기
	public static void makeSpacebar(int n, int startRow, int startCol) {
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i + startRow][j + startCol] = ' ';
			}
		}
	}
	
	public static void main(String[] args) {
		
		int n = new Scanner(System.in).nextInt();
		arr = new char[n][n];
		
		stars(n, 0, 0);
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
