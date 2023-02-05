package programmers;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 호텔방배정3 {
	// 재귀쓰니까 효율성 더떨어지는거 실화?
	
	static long[] answer;
	
	static Set<Long> rooms = new HashSet<>();
	
	public static long[] solution(long k, long[] room_number) {
		
		answer = new long[room_number.length];
		
		// answer의 인덱스용
		int idx = 0;
		
		// 1 ~ k까지 중복없이 Set에 저장 및 정렬
		for(long i=1; i<=k; i++) rooms.add(i);
		
		
		for(int i=0; i<room_number.length; i++) {
			
			if(rooms.contains(room_number[i])) {
				answer[idx++] = room_number[i];
				rooms.remove(room_number[i]);
				
			} else {
				room_number[i] += 1;
				solution(k, room_number);
			}
			
			// 종료조건
			if(answer[answer.length - 1] != 0) break;
		}
		
		return answer;
	}

	
	public static void main(String[] args) {
		
		long[] arr = {1, 3, 4, 1, 3, 1};
		

		solution(10, arr);
		
		System.out.println(Arrays.toString(answer));
		
	}
}
