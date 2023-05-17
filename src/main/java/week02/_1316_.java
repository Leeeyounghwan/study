package week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1316_ {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i = 0 ; i < n ; i++) {
            if(check()) {
                cnt++;
            }
        }
        System.out.println(cnt);

        br.close();
    }

    public static boolean check() throws IOException {
        boolean[] check = new boolean[26];
        int prev = 0;
        String s = br.readLine();

        for(int i = 0 ; i < s.length() ; i++) {
            int now = s.charAt(i);

            // 앞선 문자와 현재 문자가 같지 않다면
            if(prev != now) {
                if(!check[now - 'a']) { // 해당 문자가 처음 나오는 경우,
                    check[now - 'a'] = true;
                    prev = now;
                }
                else {
                    return false;
                }
            }
        }

        return true;
    }
}
