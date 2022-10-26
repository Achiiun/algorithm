package com.alg.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 2022-10-26(Wed)
 * baokjun2738: 행렬 덧셈
 * 문제: N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 행렬의 크기 N 과 M이 주어진다. 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다.
 *       이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다.
 *       N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.
 * 출력: 첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.
 */

public class Day105 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    int[][] A = new int[n][m];
    int[][] B = new int[n][m];

    // 행렬 A
    for (int i = 0; i < n; i++ ) {
      st = new StringTokenizer(br.readLine(), " ");
      for (int j = 0; j < m; j++) {
        A[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    // 행렬 B
    for (int i = 0; i < n; i++ ) {
      st = new StringTokenizer(br.readLine(), " ");
      for (int j = 0; j < m; j++) {
        B[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        sb.append(A[i][j] + B[i][j] + " ");
      }
      sb.append('\n');
    }

    System.out.println(sb.toString());
  }
}