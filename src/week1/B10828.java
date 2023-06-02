package week1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.Scanner;

public class B10828 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> s = new Stack<Integer>();
        for (int c = 0; c < N; c++) {
            String cmd = sc.next();
            if (cmd.equals("push")) {
                int input = sc.nextInt();
                s.push(input);
            }
            else if (cmd.equals("pop")){
                if(s.empty()){
                    bw.write("-1\n");
                }
                else{
                    bw.write(s.pop() + "\n");
                }
            }
            else if (cmd.equals("size")){
                bw.write(s.size() + "\n");
            }
            else if (cmd.equals("empty")){
                if(s.empty())
                    bw.write("1\n");
                else
                    bw.write("0\n");
            }
            else if(cmd.equals("top")){
                if(s.empty())
                    bw.write("-1\n");
                else
                    bw.write(s.peek() + "\n");
            }
        }

    }
}
