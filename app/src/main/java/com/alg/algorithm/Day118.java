package com.alg.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 2022-11-09(Wed)
 * baokjun10817: 세 수
 * 문제: 세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 
 * 입력: 첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)
 * 출력: 두 번째로 큰 정수를 출력한다.
 */

public class Day118 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int[] arr = new int[3];

    for (int i = 0; i < 3; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    for (int i = 0; i < 2; i++) {
      for (int j = i + 1; j < 3; j++) {
        if (arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    System.out.println(arr[1]);
  }
}