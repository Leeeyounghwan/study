package week02;

import java.io.*;

public class _2903_ {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write((int)Math.pow(Math.pow(2,n) + 1, 2) + "\n");
        br.close();
        bw.flush();
        bw.close();

    }
}
