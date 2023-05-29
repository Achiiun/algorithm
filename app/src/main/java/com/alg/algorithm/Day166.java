package com.alg.algorithm;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 2023-05-29(Mon)
 * 문제: array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요
 *       divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
 * 제한: arr은 자연수를 담은 배열입니다.
 *       정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
 *       divisor는 자연수입니다.
 *       array는 길이 1 이상인 배열입니다.
 */

class Day166 {
  public int[] solution(int[] arr, int divisor) {
    int[] answer = {0};

    ArrayList<Integer> list = new ArrayList<Integer>();

    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % divisor == 0) {
        list.add(arr[i]);           // list에 추가
        count++;            // 나누어 떨어지는 element가 하나도 없을 경우를 대비해 count값 계산
      }
    }

    if (count != 0) {       // 나누어 떨어지는 element가 하나라도 존재한다면
      answer = new int[list.size()];          // answer배열의 크기는 list의 크기만큼
      for (int i = 0; i < list.size(); i++) {
        answer[i] = list.get(i);
      }

      Arrays.sort(answer);        // 오름차순 정렬 함수 이용
    }
    else {              // 나누어 떨어지는 element가 하나도 없다면
      answer = new int[1];        // answer배열의 크기는 1만큼
      answer[0] = -1;
    }

    return answer;
  }
}