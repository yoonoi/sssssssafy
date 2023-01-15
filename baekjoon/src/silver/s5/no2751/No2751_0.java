package silver.s5.no2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class No2751_0 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 여러가지 방법 다 복습
		// 1. 제일 기본 Scanner 사용
		/*
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		for(int i : arr) {
			System.out.println(i);
		}
		*/
		
		// 2. BufferedReader & Collection & StringBuilder 사용하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<num; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list);
		for(int i : list) {
			sb.append(i).append("\n");
		}
		
		System.out.print(sb);
		
	}

}
