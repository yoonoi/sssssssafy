package silver.s4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No10828 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<tc; i++) {
			String input = br.readLine();
			
			switch(input.split(" ")[0]) {
			case "push" :
				stack.push(Integer.parseInt(input.split(" ")[1]));
				break;
			case "pop" :
				if(stack.empty()) {
					System.out.println(-1);
				} else {
					//System.out.println(stack.peek());
					System.out.println(stack.pop());					
				}
				break;
			case "size" :
				System.out.println(stack.size());
				break;
			case "empty" :
				if(stack.empty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;
			case "top" :
				if(stack.empty()) {
					System.out.println(-1);
				} else {
					System.out.println(stack.peek());
				}
				break;
			}
		}
	}

}
