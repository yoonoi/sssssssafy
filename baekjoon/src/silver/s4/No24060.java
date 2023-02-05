package silver.s4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No24060 {
	// 구글링
	
	static int[] arr, tmp;
	static int count = 0;
	static int result = -1;
	static int k;
	
	public static void main(String[] args) throws IOException {
		// 시간 초과 -> BufferedReader & StringTokenizer 변경
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); // n
		
		k = Integer.parseInt(st.nextToken()); // k 
		
		st = new StringTokenizer(br.readLine());
		
		arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());  // 여기까지 배열 받기
		
		
		// 같은 크기의 임시배열 생성
		tmp = new int[n];
		
		// 정렬
		// arr 배열의 인덱스 0 부터 마지막 n-1까지 병합정렬
		mergeSort(arr, 0, n - 1);
		
		System.out.println(result);
		
	}
	
	// 합병정렬
	//										 인덱스 0	  인덱스 n-1
	public static void mergeSort(int[] arr, int first, int last) {
		if (count > k) return;
		if (first < last) {
			int mid = (first + last) / 2;
			
			mergeSort(arr, first, mid);
			mergeSort(arr, mid + 1, last); // 배열 길이를 반으로 나눈다
			
			merge(arr, first, mid, last);
		}
	}
	
	// arr(0~mid)와 arr(mid+1~n-1)을 병합하여 arr을 오름차순 정렬된 상태로 만든다.
	// arr1,2는 이미 오름차순으로 정렬되어 있다.
	public static void merge(int[] arr, int first, int mid, int last) {
		int i = first;
		int j = mid + 1;
		int t = 0;
		
		while (i <= mid && j <= last) {
			if(arr[i] <= arr[j]) {
				tmp[t] = arr[i];
				i++;
			}else {
				tmp[t] = arr[j];
				j++;
			}
			t++;
		}
		
		// 왼쪽 배열 부분이 남은 경우
		while (i <= mid) 
			tmp[t++] = arr[i++];

		// 오른쪽 배열 부분이 남은 경우
		while (j <= last) 
			tmp[t++] = arr[j++];

		i = first;
		t = 0;

		// 결과를 arr에 저장
		while (i <= last) {
			count++;
			if (count == k) {
				result = tmp[t];
				break;
			} 
			arr[i++] = tmp[t++];
		}

	}
	
}
