package easy;

import java.util.Arrays;
import java.util.Scanner;

public class 중간값찾기2063 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if(N % 2 != 0 && N >= 9 && N <= 199) {
			int[] arr = new int[N];
			
			for(int i=0; i<N; i++) arr[i] = sc.nextInt();
			
			Arrays.sort(arr);
			System.out.println(arr[N/2]);
		}     
	}

}
