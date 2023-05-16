package week02;

import java.io.*;
import java.util.StringTokenizer;

public class _10812_ {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int basket[] = new int[n];
        int rbasket[] = new int[n];

        for(int i = 0 ; i < basket.length ; i++) {
            basket[i] = i + 1;
        }

        for(int r = 0 ; r < m ; r++) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken()) - 1;   // 첫번째값
            int j = Integer.parseInt(st.nextToken()) - 1;   // 끝값
            int k = Integer.parseInt(st.nextToken()) - 1;   // 중간값
            int l = i;

            for (int s = 0; s < j - i + 1; s++) {
                // k~j 까지 값 배열에 저장
                if (k + s <= j) {  // 중간값 + 반복횟수 <= 끝값보다 작을떄까지만
                    rbasket[s + i] = basket[k + s];
                }
                // i~k 까지 값 배열에 저장
                else {
                    rbasket[s + i] = basket[l];
                    l++;
                }
            }
            for (int t = 0; t < n; t++) {
                if (rbasket[t] != 0) {
                    basket[t] = rbasket[t];
                }
            }
        }

        for(int u = 0 ; u < n ; u++) {
            bw.write(basket[u] + " ");
        }


        br.close();
        bw.flush();

    }
}
