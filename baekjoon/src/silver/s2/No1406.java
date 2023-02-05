package silver.s2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class No1406 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Character> list = new ArrayList<>();

		String str = br.readLine();
		
		for(int i=0; i<str.length(); i++) {
			list.add(str.charAt(i));
		}
		
		int cur = list.size(); // 커서 위치 인덱스( 0 ~ size )
		
		int m = Integer.parseInt(br.readLine());
		for(int tc=0; tc<m; tc++) {
			String input = br.readLine();
			
			switch(input.split(" ")[0]) {
			case "L":
				if(cur > 0) cur -= 1;
				break;
			case "D":
				if(cur < list.size()) cur += 1;
				break;
			case "B":
				if(cur > 0) {
					list.remove(cur - 1);
					cur -= 1;
				}
				break;
			case "P":
				list.add(cur, input.split(" ")[1].charAt(0));
				cur += 1;
				break;
			}
		}
		
		for(char c : list) {
			System.out.print(c);
		}
		
	}
}
