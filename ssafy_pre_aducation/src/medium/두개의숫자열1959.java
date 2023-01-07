package medium;

import java.util.Scanner;

public class 두개의숫자열1959 {

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
				
				for(int k=0; k<Math.min(size1, size2); k++) sum += a[k]*b[k];
				
				if(sum > max_sum) max_sum = sum;
				
				if(Math.min(size1, size2) == size1) {
					System.arraycopy(b, 1, b, 0, b.length - 1);
				} else {
					System.arraycopy(a, 1, a, 0, a.length - 1);
				}
			}
			System.out.printf("#%d %d\n", i, max_sum);
		}
	}
}
