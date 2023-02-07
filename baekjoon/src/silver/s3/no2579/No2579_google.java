package silver.s3.no2579;

import java.util.Scanner;

public class No2579_google {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] stair = new int[301];
        int[] score = new int[301];
        for (int i = 1; i <= N; i++)
            stair[i] = sc.nextInt();

        score[1] = stair[1];
        score[2] = stair[1] + stair[2];
        score[3] = Math.max(stair[1], stair[2]) + stair[3];

        for (int n = 4; n <= N; n++) {
            score[n] = Math.max(score[n - 3] + stair[n - 1], score[n - 2]) + stair[n];
        }

        // 어차피 마지막 계단 무조건 밟으니까 마지막 계단에서 최댓값을 출력하는거구나...
        System.out.println(score[N]);
    }
}