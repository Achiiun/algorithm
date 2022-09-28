package com.alg.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 2022-09-28(Wed)
 * baokjun1929: 소수 구하기
 * 문제: M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다.
 *       (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.
 * 출력: 한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
 */

public class Day78 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    StringTokenizer st = new StringTokenizer(br.readLine()," ");
    int M = Integer.parseInt(st.nextToken());
    int N = Integer.parseInt(st.nextToken());

    boolean[] prime = new boolean[N + 1];

    for(int i = 2; i <= N; i++) {
      if(prime[i]) continue;

      if(i >= M) sb.append(i).append('\n');

      for(int j = i + i; j <= N; j += i) {
        prime[j] = true;
      }
    }

    System.out.println(sb);
  }

}