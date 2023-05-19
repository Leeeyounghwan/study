package week02;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class _10757_ {
    public static void main(String[] args) throws IOException {
        // BigInteger 사용법
        // long형의 길이를 넘는 정수를 입력 받을 때 사용.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        BigInteger A = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());

        bw.write((A.add(B)) + "");

        br.close();
        bw.flush();
        bw.close();
    }
}
