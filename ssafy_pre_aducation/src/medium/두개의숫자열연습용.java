package medium;

import java.util.Arrays;
import java.util.Scanner;

public class 두개의숫자열연습용 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		for(int i=1; i<=cnt; i++) {
			int size1 = sc.nextInt();
			int size2 = sc.nextInt();
			
			int[] a = new int[size1];
			int[] b = new int[size2];
			
			for(int j=0; j<size1; j++) a[j] = sc.nextInt();
			for(int j=0; j<size2; j++) b[j] = sc.nextInt();
			
			int max_sum = 0;
			
			for(int j=0; j<=Math.abs(size1 - size2); j++) {
				int sum = 0;
				
				for(int k=0; k<Math.min(size1, size2); k++) {
					System.out.printf("a[%d]%d * b[%d]%d = %d\n", k, a[k], k, b[k], a[k]*b[k]);
					sum += a[k]*b[k];					
				}
				
				System.out.println("max_sum : " + max_sum);
				System.out.println("sum : " + sum);
				
				if(sum > max_sum) max_sum = sum;
				
				if(Math.min(size1, size2) == size1) {
					System.arraycopy(b, 1, b, 0, b.length - 1);
				} else {
					System.arraycopy(a, 1, a, 0, a.length - 1);
				}
				
				System.out.println("max_sum : " + max_sum);
			}
			
				/*
				System.out.printf("%d * %d = %d\n", a[k], b[k], a[k]*b[k]);
				sum += a[k]*b[k];
				
				System.out.printf("%d * %d = %d\n", a[k], b[k+1], a[k]*b[k+1]);
				sum2 += a[k]*b[k+1];
				
				System.out.printf("%d * %d = %d\n", a[k], b[k+2], a[k]*b[k+2]);
				sum3 += a[k]*b[k+2];
				*/
					
			System.out.printf("#%d \n", i);
		}
	}
}
