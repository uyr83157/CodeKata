package com.example.Solution;

public class Solution37 {

    // 행렬의 덧셈
    // 행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다.
    // 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        // 행렬 덧셈 = 같은 위치의 값을 그대로 더하는 것을 의미
        // java 에서 2차원 배열 = 배열의 배열
        // => 0번 인덱스 안에서 또 배열이 있음, 1번 인덱스 안에서 또 배열이 있음 ...

        int row1 = arr1.length; // 배열의 길이 = 행의 개수
        int col1 = arr1[0].length; // 특정 인덱스 배열의 길이 = 열의 개수

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }


}
