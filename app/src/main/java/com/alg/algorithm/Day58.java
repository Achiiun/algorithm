package com.alg.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 2022-09-08(Thu)
 * baokjun4344
 * 문제: 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
 * 입력: 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
 *      둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고,
 *      이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 * 출력: 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
 */


public class Day58 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] arr;
    StringTokenizer st;

    for (int i = 0; i < n; i++) {
        st = new StringTokenizer(br.readLine(), " ");

        int student = Integer.parseInt(st.nextToken());

        arr = new int[student];

        double sum = 0;

        for (int j = 0; j < student; j++) {
            int val = Integer.parseInt(st.nextToken());
            arr[j] = val;
            sum += val;
        }

        double avrg = sum / student;
        double count = 0;

        for (int j = 0; j < student; j++) {
            if (arr[j] > avrg) {
                count++;
            }
        }

        System.out.printf("%.3f%%\n", (count/student)*100);
    }
  }
}
