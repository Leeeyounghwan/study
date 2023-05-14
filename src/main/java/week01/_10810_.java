package week01;

import java.io.*;
import java.util.StringTokenizer;

public class _10810_ {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int arr[] = new int[n];

        for(int l = 0 ; l < m ; l++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            for(int o = i - 1 ; o < j ; o++) {
                arr[o] = k;
            }
        }

        for(int k = 0 ; k < arr.length ; k++) {
            bw.write(arr[k] + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
