package com.alg.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 2022-10-18(Tue)
 * baokjun10870: 피보나치 수 5
 * 문제: 피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다.
 *       그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
 *       이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.
 *       n=17일때 까지 피보나치 수를 써보면 다음과 같다.
 *       0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
 *       n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 n이 주어진다. n은 20보다 작거나 같은 자연수 또는 0이다.
 * 출력: 첫째 줄에 n번째 피보나치 수를 출력한다.
 */

public class Day97 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    System.out.println(fibonacci(n));
  }

  static int fibonacci(int n) {
    if (n == 0) {
      return 0;
    }

    if (n == 1) {
      return 1;
    }

    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}

/*
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());

      int[] fibonacci = new int[n + 1];   // F(0) 부터 시작하므로 N + 1 크기 생성

      for(int i = 0; i < fibonacci.length; i++) {
        // F(0) 과 F(1) 은 각각 0 과 1 로 초기화
        if(i == 0) fibonacci[0] = 0;
        else if(i == 1) fibonacci[1] = 1;            
        else fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
      }

    System.out.println(fibonacci[n]);
 */
