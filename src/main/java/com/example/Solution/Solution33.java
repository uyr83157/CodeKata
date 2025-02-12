package com.example.Solution;

public class Solution33 {

    // 약수의 개수와 덧셈
    // 두 정수 left와 right가 매개변수로 주어집니다.
    // left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고,
    // 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.

    public int solution(int left, int right) {
        int answer = 0;

        for(int i = left; i <= right; i++) {

            // 약수의 개수가 짝수 = 제곱수가 완전제곱수가 아님 = 더하기
            // 약수의 개수가 홀수 = 제곱수가 완전제곱수 = 빼기
            // 임의 수 n의 완전제곱수인지 판단법 = n의 제곱근이 정수인지 확인
            // 제곱근 구하는 법 = Math.sqrt(n) 사용

            // 임의 수 i에 대하여 제곱근 구함
            double n = Math.sqrt(i);

            // 제곱근에 대하여 int 일때와 비교하여 정수인지 판단
            if(n == (int)n){

                // 정수면 빼기
                answer -= i;
            } else {
                // 정수가 아니면 더하기
                answer += i;
            }

        }

        return answer;
    }

}
