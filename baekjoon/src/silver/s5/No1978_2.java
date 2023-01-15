package silver.s5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1978_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// Scanner 없이 풀어보기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int cnt = 0;
		
		while(st.hasMoreTokens()) {
			int token = Integer.parseInt(st.nextToken());
			boolean bool = true;
			
			if(token == 1) bool = false;
			for(int i=2; i<token; i++) {
				if(token % i == 0) {
					bool = false;
					break;
				}
			}
			
			if(bool) cnt++;
		}
		System.out.println(cnt);
		
	}

}
