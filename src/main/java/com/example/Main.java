package com.example;

import com.example.Solution.Solution25;
import com.example.Solution.Solution26;

public class Main {
    public static void main(String[] args) {

        Solution25 solution25 = new Solution25();
        int[] absolutes = {10, 20, 30};
        boolean[] signs = {false, true, false};
        System.out.println("Solution25: " + solution25.solution(absolutes, signs));


        Solution26 solution26 = new Solution26();
        System.out.println("Solution26: " + solution26.solution("010123456789"));



    }

}