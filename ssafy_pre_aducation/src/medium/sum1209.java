package medium;

import java.util.Scanner;

public class sum1209 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int a=0; a<10; a++) {
			int no = sc.nextInt();
			
			int[][] arr = new int[100][100];
			
			for(int i=0; i<100; i++) {
				for(int j=0; j<100; j++) arr[i][j] = sc.nextInt();
			}
			
			int rowMax = 0;
			int colMax = 0;
			int crossMax1 = 0;
			int crossMax2 = 0;
			
			for(int i=0; i<arr.length; i++) {
				int rowSum = 0;
				int colSum = 0;
				
				for(int j=0; j<arr[i].length; j++) {
					rowSum += arr[i][j];
					colSum += arr[j][i];
					if(i == j) crossMax1 += arr[i][j];
					if(i + j == arr.length - 1) crossMax2 += arr[i][j];
				}
				if(rowSum > rowMax) rowMax = rowSum;
				if(colSum > colMax) colMax = colSum;
			}
			
			System.out.printf("#%d %d\n", no, Math.max(Math.max(rowMax, colMax), Math.max(crossMax1, crossMax2)));
		}
	}
}
