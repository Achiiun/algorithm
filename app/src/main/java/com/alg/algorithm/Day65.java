package com.alg.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 2022-09-15(Thu)
 * baokjun1316: 그룹 단어 체커
 * 문제: 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
 *       예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고,
 *       kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
 *       aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
 *       단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다.
 *       둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
 * 출력: 첫째 줄에 그룹 단어의 개수를 출력한다.
 */

public class Day65 {

  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException {

    int count = 0;
    int n = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {
      if (check() == true) {
        count++;
      }
    }
    System.out.println(count);
  }

  public static boolean check() throws IOException {
    boolean[] check = new boolean[26];
    int prev = 0;
    String str = br.readLine();

    for (int i = 0; i < str.length(); i++) {
      int now = str.charAt(i);

      // 이전 문자가 현재 문자와 같지 않다면
      if (prev != now) {

        // 해당 문자가 처음 나오는 경우 (false인 경우)
        if (check[now - 'a'] == false) {
          check[now - 'a'] = true;
          prev = now;

          //해당 문자가 이미 나온적이 있는 경우 (true인 경우)
        } else {
          return false;
        }

        // 이전 문자와 i번째 문자가 동일하다면 (연속된 문자)
      } else {
        continue;
      }
    }
    return true;
  }
}
