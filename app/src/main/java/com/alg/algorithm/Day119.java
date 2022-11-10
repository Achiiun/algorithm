package com.alg.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 2022-11-10(Thu)
 * baokjun10817: 세 수
 * 문제: 정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
 *       1. X가 3으로 나누어 떨어지면, 3으로 나눈다.
 *       2. X가 2로 나누어 떨어지면, 2로 나눈다.
 *       3. 1을 뺀다.
 *       정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.
 * 입력: 첫째 줄에 1보다 크거나 같고, 106보다 작거나 같은 정수 N이 주어진다.
 * 출력: 첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다.
 */

public class Day119 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    System.out.println(recur(N, 0));
  }

  static int recur(int N, int count) {
    // N이 2 미만인 경우 누적된 count값을 반환
    if (N < 2) {
      return count;
    }
    return Math.min(recur(N / 2, count + 1 + (N % 2)), recur(N / 3, count + 1 + (N % 3)));

  }
}