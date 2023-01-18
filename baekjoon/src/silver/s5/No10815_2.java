package silver.s5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class No10815_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		HashSet<Integer> set = new HashSet<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		
		System.out.println(set);
		
		int m = Integer.parseInt(br.readLine());
	
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<m; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			boolean having = false;
			
			if(set.contains(num)) having = true;
			
			if(having) {
				System.out.print(1 + " ");
			} else {
				System.out.print(0 + " ");
			}
		}
	}

}
