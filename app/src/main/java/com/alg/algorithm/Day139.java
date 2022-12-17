package com.alg.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 2022-12-17(Sat)
 * baokjun11727: 2xn 타일링2
 * 문제: 2×n 직사각형을 1×2, 2×1과 2×2 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)
 * 출력: 첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
 */

public class Day139 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    int[] dp = new int[1001];

    dp[1] = 1;
    dp[2] = 3;

    for (int i = 3; i <= n; i++) {
      dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10007;
    }

    System.out.println(dp[n]);
  }

}