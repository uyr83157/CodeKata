package com.example.Solution;

import java.util.Arrays;

public class Solution34 {

    // 문자열 내림차순으로 배치하기
    // 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
    //s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

   static public String solution(String s) {
        String answer = "";

        // 문자열 s를 문자 배열로 변환
        char[] s2 = s.toCharArray();

        // 배열을 오름차순으로 정렬
        Arrays.sort(s2);

        // 배열을 뒤집음
        int n1 = 0, n2 = s2.length - 1;
        while (n1<n2){
            char temp = s2[n1];
            s2[n1] = s2[n2];
            s2[n2] = temp;
            n1 ++;
            n2 --;
        }

        // 배열을 다시 문자열로 변환
        answer = String.valueOf(s2);


        return answer;
    }


}
