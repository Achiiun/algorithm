package com.alg.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 2022-10-20(Thu)
 * baokjun2447: 별 찍기 - 10
 * 문제: 재귀적인 패턴으로 별을 찍어 보자. N이 3의 거듭제곱(3, 9, 27, ...)이라고 할 때, 크기 N의 패턴은 N×N 정사각형 모양이다.
 *       크기 3의 패턴은 가운데에 공백이 있고, 가운데를 제외한 모든 칸에 별이 하나씩 있는 패턴이다.
 *       ***
 *       * *
 *       ***
 *       N이 3보다 클 경우, 크기 N의 패턴은 공백으로 채워진 가운데의 (N/3)×(N/3) 정사각형을 크기 N/3의 패턴으로 둘러싼 형태이다.
 *       예를 들어 크기 27의 패턴은 예제 출력 1과 같다.
 * 입력: 첫째 줄에 N이 주어진다. N은 3의 거듭제곱이다. 즉 어떤 정수 k에 대해 N=3k이며, 이때 1 ≤ k < 8이다.
 * 출력: 첫째 줄부터 N번째 줄까지 별을 출력한다.
 */

public class Day99 {
  static char[][] arr;

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    arr = new char[n][n];

    star(0, 0, n, false);

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        sb.append(arr[i][j]);
      }

      sb.append('\n');
    }

    System.out.println(sb);
  }

  static void star(int x, int y, int n, boolean blank) {

    // 공백칸일 경우
    if (blank) {
      for (int i = x; i < x + n; i++) {
        for (int j = y; j < y + n; j++) {
          arr[i][j] = ' ';
        }
      }
      return;
    }

    // 더이상 쪼갤 수 없는 블럭일 때
    if (n == 1) {
      arr[x][y] = '*';
      return;
    }

    int size = n / 3; // 해당 블록의 한 칸을 담을 변수를 의미
    int count = 0; // 별 출력 누적을 의미
    for (int i = x; i < x + n; i += size) {
      for (int j = y; j < y + n; j += size) {
        count++;
        if (count == 5) { // 공백 칸일 경우
          star(i, j, size, true);
        } else {
          star (i, j, size, false);
        }
      }
    }
  }
}