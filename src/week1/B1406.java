package week1;

import java.io.*;
import java.util.*;

public class B1406 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Character> l = new LinkedList<Character>();
        String input = br.readLine();
        int n = Integer.parseInt(br.readLine());


        for(int i = 0; i < input.length(); i++)
        {
            l.add(input.charAt(i));
        }

        ListIterator<Character> iter = l.listIterator();
        while(iter.hasNext())
        {
            iter.next();
        }

        for(int c = 0; c < n; c++){
            String in = br.readLine();
            char cmd = in.charAt(0);
            if(cmd == 'P'){
                iter.add(in.charAt(2));
            }
            else if(cmd == 'B'){
                if(iter.hasPrevious()){
                    iter.previous();
                    iter.remove();
                }
            }
            else if(cmd == 'L'){
                if(iter.hasPrevious())
                    iter.previous();
            }
            else if(cmd == 'D'){
                if(iter.hasNext())
                    iter.next();
            }
        }

        for(Character c : l){
            bw.write(c);
        }

        bw.flush();
        bw.close();

    }
}
