package silver.s5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class No2751_3 {
	// 3. 더 줄여보기
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		/*
		 * System.out.println()만으로 출력하면 시간초과가 발생하므로
		 * StringBuilder를 사용해서 실행시간을 줄여준다.
		 */
		StringBuilder sb = new StringBuilder();
		
		/* 
		 * Arrays.sort()는 dual-pivot Quicksort 알고리즘을 사용
		 * Collections.sort()는 Timesort정렬을 사용
		 * 		Timesort 정렬은 삽입정렬과 반복합형 알고리즘 2개를 함께 사용하여
		 * 		최악 시간복잡도 O(nlogn)을 보장한다.
		 */
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list);
		
		for(int i : list) {
			sb.append(i).append("\n");
		}
		System.out.println(sb);
		
	}

}
