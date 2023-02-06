package silver.s3.no1904;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1904_2 {
	
	static int[] arr = new int[1100000];

	
	public static void fibonacci(int k) {
		
		for(int i=3; i<=k; i++) {
			arr[i] = (arr[i-1] + arr[i-2]) % 15746;
		}
		
		System.out.println(arr[k]);
	}
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		arr[1] = 1;
		arr[2] = 2;
		
		fibonacci(n);
	}

}
