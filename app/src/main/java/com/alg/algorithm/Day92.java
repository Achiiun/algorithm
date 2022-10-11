package com.alg.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 2022-10-12(Wed)
 * baokjun1193: 분수찾기
 * 문제: 이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
 *       X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.
 * 출력: 첫째 줄에 분수를 출력한다. 
 */

public class Day92 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int x = Integer.parseInt(br.readLine());

    int cross_count = 1; // 해당 범위의 대각선 칸 개
    int prev_count_sum = 0; // 해당 대각선 직전 대각선 까지의 칸의 누적 합

    while (true) {

      // 직선 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
      if (x <= prev_count_sum + cross_count) {

        // 홀수일 경우
        if (cross_count % 2 == 1) {
          // 분자: 대각선상 내의 블럭 개수 - (x번째 - 직전 대각선까지의 블럭 개수 - 1)
          // 분모: x번째 - 직전 대각선까지의 블럭 개수
          System.out.println((cross_count - (x - prev_count_sum - 1)) + "/" + (x - prev_count_sum));
          break;
        }

        // 짝수일 경우
        else {
          // 분자: x번째 - 직전 대각선까지의 블럭 개수
          // 분모: 대각선상 내의 블럭 개수 - (x번째 - 직전 대각선까지의 블럭 개수 - 1)
          System.out.println((x - prev_count_sum) + "/" + (cross_count - (x - prev_count_sum - 1)));
          break;
        }

      } else {
        prev_count_sum += cross_count;
        cross_count++;
      }
    }
  }
}

