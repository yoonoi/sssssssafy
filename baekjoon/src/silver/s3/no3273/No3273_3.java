package silver.s3.no3273;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class No3273_3 {
	public static void main(String[] args) throws IOException {
		// 3. Stringtokenizer 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0; i<n; i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		
		int x = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		
		for(int i : set) {
			int j = x - i;
			if(set.contains(j)) cnt++;
		}
		
		cnt /= 2;
		System.out.println(cnt);
	}
}