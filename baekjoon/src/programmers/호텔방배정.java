package programmers;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// 재귀없이
public class 호텔방배정 {
	
	// 1번부터 k번까지 방 번호
	// room_number : 원하는 방번호
	public static long[] solution(long k, long[] room_number) {

		long[] answer = new long[room_number.length];
		
		// answer의 인덱스용
		int idx = 0;
		
		Set<Long> rooms = new HashSet<>();
		
		// 1 ~ k까지 중복없이 Set에 저장 및 정렬
		for(long i=1; i<=k; i++) {
			rooms.add(i);
		}
		
		for(int i=0; i<room_number.length; i++) {
			// 해당 방 번호가 아직 있으면
			if(rooms.contains(room_number[i])) {
				// answer 에 저장 후
				answer[idx++] = room_number[i];
				// Set에서 제거
				rooms.remove(room_number[i]);
			} 
			// 원하는 방번호가 이미 나갔으면 
			else {
				// 방번호에 1을 더해주고 continue
				room_number[i] += 1;
				i--;
				continue;
			}
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		
		long[] arr = {1, 3, 4, 1, 3, 1};
		
		System.out.println(Arrays.toString(solution(10, arr)));
		
	}
}
