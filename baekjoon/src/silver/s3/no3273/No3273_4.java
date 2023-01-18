package silver.s3.no3273;

import java.io.*;
import java.util.*;

public class No3273_4 {
	
	static int n, x, j, cnt;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0; i<n; i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		
		x = Integer.parseInt(br.readLine());
		
		cnt = 0;
		
		for(int i : set) {
			j = x - i;
			if(set.contains(j)) cnt++;
		}
		
		System.out.println(cnt / 2);
	}
}
