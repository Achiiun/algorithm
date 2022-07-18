/*
 * 2022-07-18(Mon)
 * baokjun10869
 * 문제: 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
 * 입력: 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
 * 출력: 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
 */
package com.alg.algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Day7 {
  public static void main (String[] args) throws IOException {
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(input);

    String str = br.readLine();
    StringTokenizer st = new StringTokenizer(str, " ");

    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());

    System.out.println(A + B);
    System.out.println(A - B);
    System.out.println(A * B);
    System.out.println(A / B);
    System.out.println(A % B);
  }
}

