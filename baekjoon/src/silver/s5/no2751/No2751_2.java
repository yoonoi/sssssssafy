package silver.s5.no2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No2751_2 {
	// 2. BufferedReader 사용해서 실행시간 줄이기
	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();
		
		// 수 정렬하기2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}

}
