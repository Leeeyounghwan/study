package week02;

import java.io.*;

public class _10988_ {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        sb.append(br.readLine());
        if(sb.toString().equals(sb.reverse().toString())) {
            bw.write(1 + "\n");
        }
        else {
            bw.write(0 + "\n");
        }


        br.close();
        bw.flush();
        bw.close();
    }
}
