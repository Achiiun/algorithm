package com.alg.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 2023-01-08(Sun)
 * baokjun11719: 그대로 출력하기 2
 * 문제: 입력 받은 대로 출력하는 프로그램을 작성하시오.
 * 입력: 입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다.
 *       각 줄은 100글자를 넘지 않으며, 빈 줄이 주어질 수도 있고, 각 줄의 앞 뒤에 공백이 있을 수도 있다.
 * 출력: 입력받은 그대로 출력한다.
 */

public class Day148 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s;
    while ((s = br.readLine()) != null) {
      System.out.println(s);
    }
  }
}