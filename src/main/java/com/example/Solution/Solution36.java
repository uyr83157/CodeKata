package com.example.Solution;

public class Solution36 {

    // 문자열 다루기 기본
    // 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
    // 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

    public boolean solution(String s) {
        boolean answer = true;

        int n = s.length();

        // (n != 4 $$ n != 6) 해도 됨
        if (!(n == 4 || n == 6)) {
            return false;
        }

        // Character.isDigit(): 주어진 문자가 숫자인지 아닌지 판단함 => 하나라도 숫자가 아니면 false 반환
        for (int i = 0; i < n; i++) {
            if(!(Character.isDigit(s.charAt(i)))){
                return false;
            }
        }

        return answer;
    }


}
