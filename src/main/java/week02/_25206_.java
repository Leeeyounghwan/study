package week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _25206_ {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String[] sub = new String[20];
        double[] hak = new double[20];
        String[] grade = new String[20];
        double[] score = new double[20];
        double sumScore = 0.0;
        double sumHak = 0.0;

        for(int i = 0 ; i < 20 ; i++) {
            st = new StringTokenizer(br.readLine());
            sub[i] = st.nextToken();
            hak[i] = Double.parseDouble(st.nextToken());
            grade[i] = st.nextToken();
        }

        for(int j = 0 ; j < 20 ; j++) {
            if(grade[j].equals("P")) {
                continue;
            }
            else {
                switch(grade[j]) {
                    case "A+" :
                        score[j] = hak[j] * 4.5;
                        sumScore += score[j];
                        sumHak += hak[j];
                        break;
                    case "A0" :
                        score[j] = hak[j] * 4.0;
                        sumScore += score[j];
                        sumHak += hak[j];
                        break;
                    case "B+" :
                        score[j] = hak[j] * 3.5;
                        sumScore += score[j];
                        sumHak += hak[j];
                        break;
                    case "B0" :
                        score[j] = hak[j] * 3.0;
                        sumScore += score[j];
                        sumHak += hak[j];
                        break;
                    case "C+" :
                        score[j] = hak[j] * 2.5;
                        sumScore += score[j];
                        sumHak += hak[j];
                        break;
                    case "C0" :
                        score[j] = hak[j] * 2.0;
                        sumScore += score[j];
                        sumHak += hak[j];
                        break;
                    case "D+" :
                        score[j] = hak[j] * 1.5;
                        sumScore += score[j];
                        sumHak += hak[j];
                        break;
                    case "D0" :
                        score[j] = hak[j];
                        sumScore += score[j];
                        sumHak += hak[j];
                        break;
                    case "F" :
                        score[j] = hak[j] * 0.0;
                        sumScore += score[j];
                        sumHak += hak[j];
                        break;
                }
            }
        }
        System.out.println(String.format("%.6f",(sumScore/sumHak)));

    }
}
