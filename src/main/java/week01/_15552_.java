package week01;

import java.io.*;
import java.util.StringTokenizer;

public class _15552_ {
    public static void main(String[] args) throws IOException {

        // Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
        // BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < t ; i++) {
            st = new StringTokenizer(br.readLine());
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }

        bw.flush();

    }
}
