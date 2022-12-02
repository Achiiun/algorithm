package com.alg.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 2022-12-02(Fri)
 * baokjun1145: 적어도 대부분의 배수
 * 문제: N!에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수를 구하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 N이 주어진다. (0 ≤ N ≤ 500)
 * 출력: 첫째 줄에 구한 0의 개수를 출력한다.
 */

public class Day134 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int num = Integer.parseInt(br.readLine());
    int count = 0;

    while (num >= 5) {
      count += num / 5;
      num /= 5;
    }
    System.out.println(count);
  }

}