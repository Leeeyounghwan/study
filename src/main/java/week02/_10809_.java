package week02;

import java.io.*;

public class _10809_ {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int arr[] = new int[26];

        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = -1;
        }

        String s = br.readLine();

        for(int j = 0; j < s.length() ; j++) {
            char c = s.charAt(j);

            if(arr[c-'a'] == -1) {
                arr[c - 'a'] = j;
            }
        }

        for(int k = 0 ; k < arr.length ; k++) {
            System.out.print(arr[k] + " ");
        }


        br.close();
    }
}
