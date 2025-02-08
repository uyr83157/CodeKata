package com.example.Solution;

public class Solution26 {

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0; // 합계를 저장할 임의 변수

        for (int i = 0; i < absolutes.length; i++) {
            // + 이면 ture, - 이면 false
            answer += signs[i] ? absolutes[i] : -absolutes[i];
        }
        return answer;
    }

}
