package com.yuntian.study.day01;

import java.util.Arrays;

public class Day01 {
    public static void main(String[] args) {
        int[] scores = {89, -23, 64, 91, 119, 52, 73};
        System.out.print("考试成绩的前三名为：");
        Day01 test = new Day01();
        test.getarrays(scores);
    }

    public void getarrays(int[] scores) {
        Arrays.sort(scores);
        int count = 1;
        for (int i = scores.length - 1; i >= 0 && count <= 3; i--) {
            if (scores[i] < 0 || scores[i] > 100) {
                continue;
            }
            count++;
            System.out.println(scores[i]);
        }
    }
}