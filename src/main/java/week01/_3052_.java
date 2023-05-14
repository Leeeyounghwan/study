package week01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class _3052_ {
    public static void main(String[] args) throws IOException {

        // HashSet 사용방법
        // HashSet 은 자바 Collection 중 Set 의 파생클래스이다.
        // HashSet은 중복되는 원소를 넣을 경우 하나만 저장한다. --> 중복원소를 허용하지 않는다.
        // HashSet 은 순서 개념이 없다.공

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hs = new HashSet<Integer>();

        for(int i = 0 ; i < 10 ; i++) {
            hs.add(Integer.parseInt(br.readLine()) % 42);
        }

        System.out.println(hs.size());

        br.close();

    }
}
