package com.alg.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 2022-09-14(Wed)
 * baokjun2941: 크로이티아 알파벳
 * 문제: 예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.
 *       예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다.
 *       단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
 *       dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 
 *       위 목록에 없는 알파벳은 한 글자씩 센다.
 * 입력: 첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 단어의 길이는 2보다 크거나 같고, 15보다 작거나 같다.
 * 출력: 첫째 줄에 다이얼을 걸기 위해서 필요한 최소 시간을 출력한다.
 */


public class Day64x {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    int len = str.length();
    int count = 0;

    for (int i = 0; i < len; i++) {
      char ch = str.charAt(i);

      if (ch == 'c' && i < len - 1) {
        if (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
          i++;
        }
      }

      else if (ch == 'd' && i < len - 1) {
        if (str.charAt(i + 1) == '-') {
          i++;
        } else if (str.charAt(i + 1) == 'z' && i < len - 2) {
          if (str.charAt(i + 2) == '=') {
            i += 2;
          }
        }
      }

      else if ((ch == 'l' || ch == 'n') && i < len - 1) {
        if (str.charAt(i + 1) == 'j') {
          i++;
        }
      }

      else if ((ch == 's' || ch == 'z') && i < len - 1) {
        if (str.charAt(i + 1) == '=') {
          i++;
        }
      } 

      count++;
    }
    System.out.println(count);
  }
}
