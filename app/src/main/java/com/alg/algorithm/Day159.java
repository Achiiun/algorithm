package com.alg.algorithm;

/*
 * 2023-05-067(Sun)
 * 문제: 정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다.
 *       배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.
 * 제한: 3 ≤ numbers의 길이 ≤ 20
 *       direction은 "left" 와 "right" 둘 중 하나입니다.
 */

class Day159 {
  public int[] solution(int[] numbers, String direction) {
    int[] answer = new int[numbers.length];

    if (direction.equals("right")) {
      for (int i = 1; i < numbers.length; i++) {
        answer[0] = numbers[numbers.length - 1];
        answer[i] = numbers[i - 1];
      }
    } else {
      for (int i = 1; i < numbers.length; i++) {
        answer[i - 1] = numbers[i];
        answer[numbers.length - 1] = numbers[0];
      }
    }

    return answer;
  }
}