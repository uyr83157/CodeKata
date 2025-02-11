package com.example.Solution;

public class Solution31 {

    // 수박수박수박수박수박수?
    // 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
    // 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.


    static public String solution(int n) {
        String answer = "";
        StringBuilder answer2 = new StringBuilder();

        for (int i = 1; i <= n; i++) {

            answer2.append((i % 2 != 0) ? "A" : "B");
        }

        answer = answer2.toString();

        return answer;
    }


}
