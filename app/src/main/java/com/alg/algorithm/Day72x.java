package com.alg.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 2022-09-22(Thu)
 * baokjun2741: N찍기
 * 문제: 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
 * 출력: 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
 */

public class Day72x {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int start = 1;

    for (int i = 0; i < n; i++) {
      System.out.println(start);
      start++;
    }
  }
}
