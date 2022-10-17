package com.alg.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 2022-10-17(Mon)
 * baokjun10872: 팩토리얼
 * 문제: 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.
 * 출력: 첫째 줄에 N!을 출력한다.
 */

public class Day96 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    int sum = 1;

    // n이 0이 아닐 때 까지 1씩 감소하면서 sum에 반복적으로 곱한다.
    while (n != 0) {
      sum *= n;
      n--;
    }

    System.out.println(sum);
  }
}


/*
 * 재귀 방법
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int sum = factorial(N);
        System.out.println(sum);

    }

    public static int factorial(int N) {
        if(N <= 1) return 1;    // 재귀 종료조건
        return N * factorial(N - 1);        
    }
 */