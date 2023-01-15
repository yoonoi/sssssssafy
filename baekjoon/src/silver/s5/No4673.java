package silver.s5;

import java.util.ArrayList;

public class No4673 {
	
	public static int findSelfNum(int num) {
		int newNum = num;
		for(int i=0; i<=4; i++) {
			newNum += num % 10;
			num /= 10;
		}
		return newNum;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=1; i<=10000; i++) {
			list.add(findSelfNum(i));
			if(!list.contains(i)) System.out.println(i);
		}
	}
}
