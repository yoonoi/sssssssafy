package medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최빈수구하기1204_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			int no = Integer.parseInt(br.readLine());
			int[] arr = new int[101];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<1000; j++) {
				int tmp = Integer.parseInt(st.nextToken());
				arr[tmp]++;
			}
			
			int max = 0;
			for(int j=0; j<arr.length; j++) {
				if(arr[j] >= arr[max]) max = i;
			}
			
			System.out.printf("#%d %d\n", no, max);
			
		}
	}
}
