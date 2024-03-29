package com.alg.algorithm;

import java.util.Arrays;

/*
 * 2023-05-13(Sat)
 * 문제: 정수 배열 numbers가 매개변수로 주어집니다.
 *       numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
 * 제한: 0 ≤ numbers의 원소 ≤ 10,000
 *       2 ≤ numbers의 길이 ≤ 100
 */

class Day160 {
  public int solution(int[] numbers) {
    Arrays.sort(numbers);
    return numbers[numbers.length-1]* numbers[numbers.length-2];
  }
}