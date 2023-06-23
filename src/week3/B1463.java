package week3;

import java.util.Scanner;

public class B1463 {

    static int N;
    static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        dp = new int[1000001];

        dp[2] = 1;
        dp[3] = 1;

        for(int i = 4; i <= 1000000; i++){

            int temp = dp[i-1] + 1;
            if(i % 3 == 0){
                temp = Math.min(dp[i/3] + 1, temp);
            }
            if(i % 2 == 0){
                temp = Math.min(dp[i/2] + 1, temp);
            }
            dp[i] = temp;
        }

        System.out.println(dp[N]);


    }
}
