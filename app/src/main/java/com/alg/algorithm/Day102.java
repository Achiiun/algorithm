package com.alg.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 2022-10-23(Sun)
 * baokjun2581: 소수
 * 문제: 자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
 *       예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61이 된다.
 * 입력: 입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.
 *       M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.
 * 출력: M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다. 
 *       단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.
 */

public class Day102 {

  public static boolean prime[];

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int m = Integer.parseInt(br.readLine());
    int n = Integer.parseInt(br.readLine());

    prime = new boolean[n + 1];
    get_prime();

    int sum = 0;
    int min = Integer.MAX_VALUE;
    for (int i = m; i <= n; i++) {
      if (prime[i] == false) { // false = 소수
        sum += i;
        if (min == Integer.MAX_VALUE) { // 첫 소수가 최솟값
          min = i;
        }   
      }
    }

    if (sum == 0) {
      System.out.println(-1);
    }

    else {
      System.out.println(sum);
      System.out.println(min);
    }
  }

  public static void get_prime() {
    prime[0] = true;
    prime[1] = true;

    for (int i = 2; i <= Math.sqrt(prime.length); i++) {
      if (prime[i]) {
        continue; // 이미 체크된 배열일 경우 skip
      }
      for (int j = i * i; j < prime.length; j += i) {
        prime[j] = true;
      }
    }
  }
}