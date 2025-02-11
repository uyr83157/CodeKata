package com.example.Solution;

public class Solution30 {

    // 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
    // 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.


   static public String solution(String s) {
        String answer = "";

        int n = s.length();

        int n2 = n/2;

        // 주의: 삼항 연산자는 값을 반환 하는 연산자지, 문장을 실행하는 연산자가 아님
        // substring(A, B): 시작 인덱스(A, 포함), 종료 인덱스(B, 미포함)를 기준으로 문자열 추출 (주의: 인덱스는 0부터 시작)
        answer = (n%2 == 0) ? s.substring(n2-1, n2+1) : String.valueOf(s.charAt(n2));

        return answer;
    }


}
