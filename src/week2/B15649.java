package week2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class B15649 {

    static int n, m;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int[] arr;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n+1];
        visited = new boolean[n+1];

        dfs(0);
        bw.flush();
        bw.close();
    }

    public static void dfs(int k) throws IOException {
        if(k == m){
            for(int i = 0; i < m; i++){
                bw.write(arr[i] + " ");
            }bw.write("\n");
        }
        else {
            for(int i = 1; i <= n; i++){
                if(!visited[i]){
                    visited[i] = true;
                    arr[k] = i;
                    dfs(k + 1);
                    visited[i] = false;
                }
            }
        }
    }
}
