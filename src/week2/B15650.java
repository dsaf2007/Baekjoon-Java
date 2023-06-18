package week2;

import java.util.Scanner;

public class B15650 {

    static int n, m;
    static int[] arr;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n+1];
        visited = new boolean[n+1];

        dfs(1);

    }

    public static void dfs(int k){
        if(k == m + 1){
            for(int i = 1; i <= m; i++){
                System.out.print(arr[i] + " ");
            }System.out.print("\n");
        }
        else{
            for(int i = 1; i <= n; i++){
                if(!visited[k] && arr[k-1] < i){
                    visited[k] = true;
                    arr[k] = i;
                    dfs(k+1);
                    visited[k] = false;
                }
            }
        }
    }
}
