package silver.s4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class No1920_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		HashSet<Integer> set = new HashSet<>();
		
		while(st.hasMoreTokens()) {
			int token = Integer.parseInt(st.nextToken());
			set.add(token);
		}
		
		int m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		while(st.hasMoreTokens()) {
			int result = 0;
			
			int token = Integer.parseInt(st.nextToken());
			if (set.contains(token)) result = 1;
			System.out.println(result);
		}
	}

}
