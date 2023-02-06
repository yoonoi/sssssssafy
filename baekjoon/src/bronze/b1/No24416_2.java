package bronze.b1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No24416_2 {
	
	public static int fibonacci(int n) {
		
		int[] fibos = new int[n+1];
		fibos[1] = fibos[2] = 1;
		
		for(int i=3; i<=n; i++) {
			fibos[i] = fibos[i-1] + fibos[i-2];
		}
		
		return fibos[n];
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.print(fibonacci(n) + " " + (n-2));
		
	}
	
}
