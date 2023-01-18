package silver.s3.no3273;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class No3273_2 {
	public static void main(String[] args) throws IOException {
		// 2. BufferedReader 와 set 사용하기
		// 메모리 초과
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String tmp = br.readLine();
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0; i<n; i++) {
			set.add(Integer.parseInt(tmp.split(" ")[i]));
		}
		
		int x = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		
		for(int i : set) {
			int j = x - i;
			if(set.contains(j)) cnt++;
		}
		
		cnt /= 2;
		System.out.println(cnt);
		
		Runtime.getRuntime().gc();
		long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.print(usedMemory + " bytes");
	}
}
