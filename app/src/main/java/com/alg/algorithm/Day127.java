package com.alg.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 2022-11-22(Tue)
 * baokjun10808: 알파벳 개수
 * 문제: 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각 알파벳이 단어에 몇 개가 포함되어 있는지 구하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
 * 출력: 단어에 포함되어 있는 a의 개수, b의 개수, …, z의 개수를 공백으로 구분해서 출력한다.
 */

public class Day127 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int[] count = new int[26];

    String input = br.readLine();

    for (int i = 0; i < input.length(); i++) {
      count[input.charAt(i) - 97] += 1;
    }

    for (int i = 0; i < count.length; i++) {
      sb.append(count[i]);
      sb.append(" ");
    }

    System.out.println(sb);
  }
}