package bronze.b1;

import java.util.Scanner;

public class No4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 테스트 케이스의 개수
		int c = sc.nextInt();
		
		// 테스트 케이스의 개수만큼 반복문
		for(int i=0; i<c; i++) {
			
			int num = sc.nextInt(); // 각 케이스마다 학생의 수
			int[] scores = new int[num]; // 학생수만큼 배열 생성
			// 학생수만큼 반복문 돌려 배열에 할당
			for(int j=0; j<scores.length; j++) {
				scores[j] = sc.nextInt();
			}
			
			// 전체 성적의 합
			int sum = 0;
			for(int j=0; j<scores.length; j++) {
				sum += scores[j];
			}
			
			// 평균
			double avg = (double)sum / num;
			
			// 평균 넘는 학생 수 카운트하기
			int avgCnt = 0;
			for(int j=0; j<scores.length; j++) {
				if(scores[j] > avg) avgCnt ++;
			}
			
			System.out.printf("%.3f%%\n", (double)avgCnt / num * 100);
		}

	}

}
