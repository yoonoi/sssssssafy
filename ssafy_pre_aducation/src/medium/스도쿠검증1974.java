package medium;

import java.util.Arrays;
import java.util.Scanner;

public class 스도쿠검증1974 {
	
	public static int[] miniBox(int[][] array, int a, int b) {
		int[] boxTmpArr = new int[9];
		int index = 0;
		for(int i=a*3; i<3+a*3; i++) {
			for(int j=b*3; j<3+b*3; j++) boxTmpArr[index++] = array[i][j];
		}
		Arrays.sort(boxTmpArr);
		return boxTmpArr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		// 테스트 케이스 T번만큼
		for(int x=1; x<=T; x++) {
			
			// 스도쿠 9 X 9 배열에 넣기
			int[][] arr = new int[9][9];
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			int result = 1;
			
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					for(int k=0; k<j; k++) {
						if(arr[i][j] == arr[i][k]) result = 0; // 가로줄 비교
						if(arr[j][i] == arr[k][i]) result = 0; // 세로줄 비교
					}
				}
			}
			
			// 3X3 상자 비교
			int[] tmp = {1, 2, 3, 4, 5, 6, 7, 8, 9};
			
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					int idx = 0;
					while(idx < 9) {
						if(miniBox(arr, i, j)[idx] != tmp[idx++]) result = 0;
					}
				}
			}
			System.out.printf("#%d %d\n", x, result);
		}
	}
}
