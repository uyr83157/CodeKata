package com.example.Solution;

public class Solution28 {

    // 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
    // numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.

   static public int solution(int[] numbers) {
        int answer = -1;

        // 결과를 저장할 변수를 초기화
        int sum = 0;

        // 0부터 9까지 숫자를 하나 씩 확인
        for (int i = 0; i <= 9; i++) {

            // i가 numbers 배열에 존재하는지 확인 하기 위한 변수 초기화
            boolean numberCheck = false;

            // numbers 배열을 하나 씩 꺼내서 확인
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == i) {
                    // 일치하면 true 반환
                    numberCheck = true;
                    break;
                }
            }

            // numberCheck 가 ture 면 sum 에 추가
            if (!numberCheck) {
                sum += i;
            }


        }

        answer = sum;

        return answer;
    }


}
