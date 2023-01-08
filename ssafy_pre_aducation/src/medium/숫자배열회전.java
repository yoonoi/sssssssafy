package medium;

import java.util.Scanner;

public class 숫자배열회전 {
	
	public static int[][] rotate(int[][] arr){
		int[] rotArr = new int[arr.length * arr.length];
		int idx = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=arr.length - 1; j>=0; j--) {
				rotArr[idx++] = arr[j][i];
			}
		}
		idx = 0;
		int[][] newArr = new int[arr.length][arr.length];

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				newArr[i][j] = rotArr[idx++];
			}
		}
		return newArr;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int cnt=1; cnt<=t; cnt++) {
			int size = sc.nextInt();
			int[][] arr = new int[size][size];
			for(int i=0; i<size; i++) {
				for(int j=0; j<size; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.printf("#%d\n", cnt);
			
			for(int i=0; i<size; i++) {
				for(int j=0; j<3; j++) {
					arr = rotate(arr);
					for(int k=0; k<size; k++) {
						System.out.print(arr[i][k]);
					}
					System.out.print(" ");
				}
				arr = rotate(arr);
				System.out.println();
			}
		}
	}
}
