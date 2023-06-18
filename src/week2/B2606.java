package week2;

import java.io.*;

public class B2606 {

    static int[][] map;
    static boolean[] visit;
    static int N,M,V;
    static int result = 0;

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void dfs(int k){
        visit[k] = true;

        for(int i = 1; i <= N; i++){
            if(map[k][i] == 1 && visit[i] != true){
                result++;
                dfs(i);
            }
        }
        return;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        V = 1;
        map = new int[N+1][N+1];
        visit = new boolean[N+1];

        for(int i = 0; i < M; i++){
            String[] temp = br.readLine().split(" ");
            int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);
            map[a][b] = map[b][a] = 1;
        }

        dfs(V);
        //System.out.println(result);
        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
    }
}
