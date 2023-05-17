package week02;

import java.io.*;

public class _2941_ {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int len = s.length();
        int count = 0;

        for(int i = 0 ; i < len ; i++) {
            char c = s.charAt(i);
            if(c == 'c' && i < len-1) {
                if(s.charAt(i+1) == '=' || s.charAt(i+1) == '-') {
                    i++;
                }
            }
            else if(c == 'd' && i < len-1) {
                if(s.charAt(i + 1) == '-') {
                    i++;
                }
                else if(s.charAt(i + 1) == 'z' && i < len-2) {
                    if(s.charAt(i + 2) == '=') {
                        i += 2;
                    }
                }
            }
            else if((c == 'l' || c == 'n') && i < len-1) {
                if(s.charAt(i + 1) == 'j') {
                    i++;
                }
            }
            else if((c == 's' || c == 'z') && i < len-1) {
                if(s.charAt(i + 1) == '=') {
                    i++;
                }
            }
            count++;
        }
        System.out.println(count);

    }
}
