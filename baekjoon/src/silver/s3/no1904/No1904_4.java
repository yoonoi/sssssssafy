package silver.s3.no1904;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No1904_4 {
	
	static int[] arr = {0, 1, 2};
	
	public static void fibonacci(int k) {
		
		if(k >= 3) {
			arr = Arrays.copyOf(arr, k+1);
		}
		
		// % 15746 여기 하는거랑 밑에하는거 집가서확인
		for(int i=3; i<=k; i++) {
			arr[i] = (arr[i-1] + arr[i-2]) % 15746;
		}
		
		System.out.println(arr[k]);
	}
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		fibonacci(n);
	}

}
