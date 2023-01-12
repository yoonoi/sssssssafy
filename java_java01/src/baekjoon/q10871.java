package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class q10871 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int x = sc.nextInt();
		
		for(int i=0; i<tc; i++) {
			int num = sc.nextInt(); 
			if(num < x) System.out.print(num + " ");
		}
	}

}
