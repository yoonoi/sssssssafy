package silver.s4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


// 병합정렬
// 일단 반으로 나누고 나중에 합쳐서 정렬하기

public class No24060_2 {
	
	public static int[] sorted; // 정렬 배열은 반드시 전역 변수로 선언
	
	public static int result = -1; 
	
	static int cnt = 0;
	static int k;
	
	
	// 일단 반으로 나누는 함수 -> 재귀함수 이용
	public static void mergeSort(int[] arr, int start, int end) {
		
		if(cnt > k) return;
		
		// 크기가 1보다 큰 경우
		if(start < end) {
			
			int mid = (start + end) / 2;
			
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
			
			// 정렬된 두 배열을 나중에 합쳐주기
			merge(arr, start, mid, end);
		}
	}
	
	
	// 이미 정렬된 두 배열을 합쳐서 새롭게 정렬하는 함수
	public static void merge(int[] arr, int m, int mid, int n) {
		
		int i = m;
		int j = mid + 1;
		int p = m;
		
		// 작은 순서대로 배열에 삽입
		while(i <= mid && j <= n) {
			if(arr[i] <= arr[j]) {
				sorted[p] = arr[i];
				i++;
			} else {
				sorted[p] = arr[j];
				j++;
			}
			p++;
		}
		
		// 남은 데이터도 삽입
		while(i <= mid) {
			sorted[p++] = arr[i++];
		}
		
		while(j <= n) {
			sorted[p++] = arr[j++];
		}
		
		i = m;
		p = 0;
		
		while(i <= n) {
			cnt++;
			if(cnt == k) {
				result = sorted[p];
				break;
			}
			arr[i++] = sorted[p++];
		}
		
		
//		// i가 먼저 끝났을 때(오른쪽 정렬이 남았을 때)
//		if(i > mid) {
//			for(int t=j; t<=n; t++) {
//				sorted[p++] = arr[t];
//			}
//		// j가 먼저 끝났을 떄(왼쪽 정렬이 남았을 때) ---> 그냥 else로 써도되나?
//		} else {
//			for(int t=i; t<=mid; t++) {
//				sorted[p++] = arr[i];
//			}
//		}
//		
//		// 정렬된 배열을 삽입
//		for(int t=m; t<=n; t++) {
//			arr[t] = sorted[t];
//		}
		
	}
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[n];
		sorted = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		mergeSort(arr, 0, n-1);
		
		System.out.println(result);
		
	}
	
}
