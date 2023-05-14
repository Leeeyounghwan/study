package week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1719_ {
    public static void main(String[] args) throws IOException {

        // 정올 1719번 별찍기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int mid = n / 2 + 1;

        if(n > 100 || n%2 != 1) {
            System.out.println("INPUT ERROR!");
            return;
        }


        StringBuilder s = new StringBuilder();

        for(int i = 0 ; i < mid ; i++) {
            for(int j = 0 ; j < i ; j++) {
                s.append(" ");
            }
            for(int k = 0 ; k <= i ; k++) {
                s.append("*");
                if (k != 0) {
                    s.append("*");
                }
            }
            s.append("\n");
        }

        for(int i = mid - 2 ; i >= 0 ; i--) {
            for(int j = 0 ; j < i ; j++) {
                s.append(" ");
            }
            for(int k = 0 ; k <= i ; k++) {
                s.append("*");
                if (k != 0) {
                    s.append("*");
                }
            }
            s.append("\n");
        }

        System.out.print(s);

        br.close();
    }
}
