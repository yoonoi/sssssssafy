package programmers;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 호텔방배정2 {
	
	static long[] answer;
	
	static Set<Long> rooms = new HashSet<>();
	
	static int cnt = 0;
	
	public static void solution(long k, long[] room_number) {
		cnt ++;
		System.out.println();
		System.out.println(cnt + " 번째 =================");
		answer = new long[room_number.length];
		
		// answer의 인덱스용
		int idx = 0;
		
		// 종료조건
		if(answer[answer.length - 1] != 0) return;
		
		
		// 1 ~ k까지 중복없이 Set에 저장 및 정렬
		for(long i=1; i<=k; i++) rooms.add(i);
		
		
		for(int i=0; i<room_number.length; i++) {
			
			if(rooms.contains(room_number[i])) {
				answer[idx++] = room_number[i];
				rooms.remove(room_number[i]);
				
				if(rooms.size() == k - answer.length) {
					System.out.println("종료");
					return;
				}
				
				System.out.println(i + "번쨰 인덱스");
				System.out.println(rooms);
				
				
				
			} else {
				room_number[i] += 1;
				solution(k, room_number);
			}
			
		}

	}

	
	public static void main(String[] args) {
		
		long[] arr = {1, 3, 4, 1, 3, 1};
		

		solution(10, arr);
		
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i]);
		}
		
	}
}
