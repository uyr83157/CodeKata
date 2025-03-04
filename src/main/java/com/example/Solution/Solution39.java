package com.example.Solution;

public class Solution39 {

    // 최대공약수와 최소공배수
    // 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
    // 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
    // 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int x = get(n, m);
        int y = (n * m) / x;

        answer[0] = x;
        answer[1] = y;

        return answer;
    }

    // 최대 공약수 구하기 (유클리드 호제법)
    private int get(int n, int m) {

        // 큰 수가 0이 될때 까지 반복
        while (m != 0) {

            //나누고 나머지를 a에 저장
            int a = n % m;

            // 나머지를 m에 넘기고, n에 m 값을 넣고 반복
            n = m;
            m = a;
        }
        return n;
    }

}
