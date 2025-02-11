package com.example.Solution;

import java.util.stream.IntStream;

public class Solution29 {

    // 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
    // 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
    // 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

   static public int[] solution(int[] arr) {
        int[] answer = {};

        // arr 길이가 1이면 무조건 [-1] 리턴
        if (arr.length == 1) {
            return new int[]{-1};
        }

        // 임시로 arr[0] 값을 최솟값으로 가정하고 min 변수로 설정
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            // arr[0]보다 더 작은 값이 있으면 min 갱신
            if (arr[i] < min) {
                min = arr[i];
            }
        }


        // min 을 제거한 새 배열 생성
        int[] newArr = new int[arr.length - 1];

        // min 을 제외하고 배열 복사
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min){
                newArr[idx++] = arr[i];
            }
        }
        answer = newArr;


        // 스트림 쓰는 방법
        int newMin = min;
        int[] newArr2 = IntStream.range(0, arr.length)
                .filter(i -> arr[i] != newMin)
                .map(i -> arr[i])
                .toArray();

        answer = newArr2;



        return answer;
    }


}
