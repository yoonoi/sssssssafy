package silver.s3.no3273;

import java.util.ArrayList;
import java.util.Scanner;

public class No3273 {
	public static void main(String[] args) {
		// 1. Scanner 사용하기(시간초과)
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}
		
		int x = sc.nextInt();
		
		int cnt = 0;
		
		for(int i : list) {
			int j = x - i;
			if(list.contains(j)) {
				cnt++;
			}
		}
		cnt /= 2;
		System.out.println(cnt);
		
		Runtime.getRuntime().gc();
		long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.print(usedMemory + " bytes");
	}
}
