package week02;

import java.io.*;
import java.util.StringTokenizer;

public class _4344_ {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        double sum = 0, avg = 0, cnt = 0;

        for(int i = 0 ; i < n ; i++) {
            sum = 0;
            cnt = 0;
            st = new StringTokenizer(br.readLine(), " ");
            int s = Integer.parseInt(st.nextToken());
            int arr[] = new int[s];

            for(int j = 0 ; j < s ; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }
            avg = sum / s;
            for(int k = 0 ; k < s ; k++) {
                if(arr[k] > avg) {
                    cnt++;
                }
            }
            double totalAvg = ((cnt/s) * 100);
            bw.write(String.format("%.3f", totalAvg) + "%\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
