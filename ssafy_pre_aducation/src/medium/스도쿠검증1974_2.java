package medium;

import java.util.Scanner;

public class 스도쿠검증1974_2 {
	
	public static int[] miniBox(int[][] array, int a, int b) {
		int[] boxTmpArr = new int[9];
		int index = 0;
		for(int i=a*3; i<3+a*3; i++) {
			for(int j=b*3; j<3+b*3; j++) boxTmpArr[index++] = array[i][j];
		}
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
				for(int j=0; j<arr[i].length; j++) arr[i][j] = sc.nextInt();
			}
			
			// 결과값 디폴트 : 1, 중복 有 : 0
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
			for(int a=0; a<3; a++) {
				for(int b=0; b<3; b++) {
					int[] tmp = miniBox(arr, a, b);
					for(int i=0; i<tmp.length; i++) {
						for(int j=0; j<i; j++) if(tmp[i] == tmp[j]) result = 0;
					}
				}
			}
			
			System.out.printf("#%d %d\n", x, result);
		}
	}
}
