package week2;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class B1260 {

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static boolean[] check;
    static int[][] arr;

    static int N, M, V;

    static Queue<Integer> q = new LinkedList<>();
    public static void dfs(int k) throws IOException {
        check[k] = true;
        bw.write(k + " ");

        for(int i = 1; i <= N; i++){
            if(arr[k][i] == 1 && check[i] != true){
                dfs(i);
            }
        }
    }

    public static void bfs(int k) throws IOException {
        q.add(k);
        check[k] = true;

        while(!q.isEmpty()){
            k = q.poll();
            bw.write(k + " ");

            for(int i = 0; i <= N; i++){
                if(arr[k][i] == 1 && check[i] != true){
                    q.add(i);
                    check[i] = true;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        String[] input = in.split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        V = Integer.parseInt(input[2]);

        arr = new int[N + 1][N + 1];
        check = new boolean[N + 1];

        for(int i = 0; i < M; i++){
            String[] axis = br.readLine().split(" ");
            int a = Integer.parseInt(axis[0]);
            int b = Integer.parseInt(axis[1]);

            arr[a][b] = arr[b][a] = 1;
        }

        dfs(V);
        bw.write("\n");
        check = new boolean[N + 1];
        bfs(V);
        bw.write("\n");

        bw.flush();
        bw.close();
    }
}
