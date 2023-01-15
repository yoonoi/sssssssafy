package bronze.b1;

import java.util.Scanner;

public class No1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		int[] arr = new int[tc];
		for(int i=0; i<tc; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) max = arr[i];
		}
		
		double sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += (double)arr[i]/max * 100;
		}
		
		System.out.println(sum/tc);
		
	}

}
