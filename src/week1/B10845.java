package week1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B10845 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> q = new LinkedList<Integer>();
        int temp = 0;

        for (int c = 0; c < n; c++) {
            String cmd = sc.next();
            if (cmd.equals("push")) {
                int input = sc.nextInt();
                q.add(input);
                temp = input;
            }
            else if (cmd.equals("pop")){
                if(q.isEmpty()){
                    bw.write("-1\n");
                }
                else{
                    bw.write(q.poll() + "\n");
                }
            }
            else if (cmd.equals("size")){
                bw.write(q.size() + "\n");
            }
            else if (cmd.equals("empty")){
                if(q.isEmpty())
                    bw.write("1\n");
                else
                    bw.write("0\n");
            }
            else if(cmd.equals("front")){
                if(q.isEmpty())
                    bw.write("-1\n");
                else
                    bw.write(q.peek() + "\n");
            }
            else if(cmd.equals("back")){
                if(q.isEmpty())
                    bw.write("-1\n");
                else
                    bw.write(temp + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
