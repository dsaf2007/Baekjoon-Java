package week3;

import java.io.*;
import java.util.Scanner;

public class B1149 {

    static int N;
    static int[] R, G, B;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        R = new int[N+1];
        G = new int[N+1];
        B = new int[N+1];

        for(int n = 0; n < N; n++){
            String[] temp = br.readLine().split(" ");
            R[n] = Integer.parseInt(temp[0]);
            G[n] = Integer.parseInt(temp[1]);
            B[n] = Integer.parseInt(temp[2]);
        }

        for(int i = 1; i < N; i++){
            R[i] += Math.min(G[i-1],B[i-1]);
            G[i] += Math.min(R[i-1],B[i-1]);
            B[i] += Math.min(R[i-1],G[i-1]);
        }

        System.out.println(Math.min(B[N-1],Math.min(R[N-1], G[N-1])));





    }
}
