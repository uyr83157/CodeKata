package com.example.Solution;

public class Solution27 {

   static public String solution(String phone_number) {
        // 기본 요구 양식
        String answer = "";

        // 전체 폰 번호 길이
        int n = phone_number.length();

        // 모자이크 할 길이
        int star = n - 4;

        // 동적 문자열 선언
        StringBuilder newPhone = new StringBuilder();

        // 모자이크 할 길이 만큼 *표 모자이크 처리
        for (int i = 0; i < star; i++) {
            newPhone.append("*");
        }

        // 전체 폰 번호에서 모자이크할 길이 만큼 뺀 번호
        // substring(n): 앞에서 부터 n개의 인덱스 만큼 뺌
        String phoneLast4 = phone_number.substring(star);

        // 기존에 만들어 놓은 *표 모자이크 처리 한 문자열에 뒷번호 추가
        newPhone.append(phoneLast4);

        answer = newPhone.toString();

        return answer;
    }

}
