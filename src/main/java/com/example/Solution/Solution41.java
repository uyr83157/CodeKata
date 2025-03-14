package com.example.Solution;

public class Solution41 {
    /*
    이상한 문자 만들기

    문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
    각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
    각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
     */


    public String solution(String s) {
        String answer = "";
        int index = 0; // 각 단어 내에서 현재 문자의 순서를 나타내는 변수
        String[] array = s.split(""); // 문자열 s를 한글자씩 분리하여 문자열 배열을 생성 (공백포함)

        for(String word : array) { // 위에서 정의한 문자 배열을 순회
            index = word.contains(" ") ? 0 : index + 1; // 문자 배열에서 공백을 만나면 단어 인덱스 초기화, 아니면 쭉 진행
            answer += index%2 == 0 ? word.toLowerCase() : word.toUpperCase(); // 짝수 순서의 단어는 대문자, 홀수는 소문자로 변환
            // 주의: 인덱스는 0부터 시작하기에 인덱스가 짝수면 단어는 홀수번째 단어, 인덱스가 홀수면 단어는 짝수번째 단어
        }
        return answer;
    }


}
