package com.example.Solution;

public class Solution40 {

    /* 3진법 뒤집기
     * 자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후,
     * 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
     */

    public int solution(int n) {
        int answer = 0;

        // 3진법으로 변환
        String a = Integer.toString(n, 3);

        // 그걸 뒤집음
        StringBuilder b = new StringBuilder(a).reverse();

        // 그걸 다시 10진법으로 변환
        answer = Integer.parseInt(b.toString(), 3);

        return answer;
    }


}
