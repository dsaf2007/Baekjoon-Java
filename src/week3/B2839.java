package week3;

import java.util.Scanner;

public class B2839 {
    static int N;
    static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        dp = new int[5001];
        dp[1] = 9999;
        dp[2] = 9999;
        dp[4] = 9999;
        dp[3] = 1;
        dp[5] = 1;
        for(int i = 6; i <=5000; i++){
            int a = 9999, b = 9999;
            if(dp[i -3] != 9999){
                a = dp[i-3] + 1;
            }
            if(dp[i-5] != 9999){
                b = dp[i-5] + 1;
            }
            dp[i] = Math.min(a,b);
        }
        System.out.println(dp[N] == 9999 ? -1 : dp[N]);
    }
}
