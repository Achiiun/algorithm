/*
 * 2022-07-13(Wed)
 * baokjun1152
 * 문제: 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 
 *       이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
 * 입력: 첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열의 길이는 1,000,000을 넘지 않는다. 
 *       단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 또한 문자열은 공백으로 시작하거나 끝날 수 있다.
 * 출력: 첫째 줄에 단어의 개수를 출력한다.
 */

package com.alg.algorithm;

public class Day2 {
  public static void main(String[] args) {
    System.out.println("문자열을 입력하시오.");

    java.util.Scanner keyboardInput = new java.util.Scanner(System.in);
    String str;
    int result = 0;

    str = keyboardInput.nextLine();

    for (int i = 0; i < str.length(); i++) {
      if(str.charAt(i) == ' ') {
        result++;
      }
    }
    if (str.charAt(0) != ' ' && str.charAt(str.length() - 1) != ' ') {
      result++;
    }
    if (str.charAt(0) == ' ' && str.charAt(str.length() - 1) == ' ') {
      result--;
    }
    System.out.printf("단어의 개수는 %d개 입니다.",result);
  }
}