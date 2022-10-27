package com.alg.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 2022-10-27(Thu)
 * baokjun2566: 최댓값
 * 문제: <그림 1>과 같이 9×9 격자판에 쓰여진 81개의 자연수 또는 0이 주어질 때, 
 *       이들 중 최댓값을 찾고 그 최댓값이 몇 행 몇 열에 위치한 수인지 구하는 프로그램을 작성하시오.
 *       예를 들어, 다음과 같이 81개의 수가 주어지면 이들 중 최댓값은 90이고, 이 값은 5행 7열에 위치한다.
 * 입력: 첫째 줄부터 아홉 번째 줄까지 한 줄에 아홉 개씩 수가 주어진다. 주어지는 수는 100보다 작은 자연수 또는 0이다.
 * 출력: 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 위치한 행 번호와 열 번호를 빈칸을 사이에 두고 차례로 출력한다.
 *       최댓값이 두 개 이상인 경우 그 중 한 곳의 위치를 출력한다.
 */

public class Day106 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[][] arr = new int[9][9];

    // 배열에 값 대입
    for (int i = 0; i < 9; i++) {
      String[] strArr = br.readLine().split(" "); 
      for (int j = 0; j < 9; j++) {
        arr[i][j] = Integer.parseInt(strArr[j]);
      }
    }

    int num = 0;
    int rowOrder = 0;
    int columnOrder = 0;

    // 배열 최댓값 구하기
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        if (num < arr[i][j]) {
          num = arr[i][j];
          rowOrder = i;
          columnOrder = j;
        }
      }
    }

    System.out.println(num);
    // index 는 0부터 시작하기 때문에 +1 
    System.out.println((rowOrder + 1) + " " + (columnOrder + 1));
  }
}