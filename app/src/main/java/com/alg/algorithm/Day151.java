package com.alg.algorithm;

/*
 * 2023-01-14(Sat)
 * 문제: 연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다. 
 *       두 정수 num과 total이 주어집니다. 
 *       연속된 수 num개를 더한 값이 total이 될 때, 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.
 * 제한: 1 ≤ num ≤ 100
 *       0 ≤ total ≤ 1000
 *       num개의 연속된 수를 더하여 total이 될 수 없는 테스트 케이스는 없습니다.
 */

class Day151 {
  public int[] solution(int num, int total) {
    int[] answer = new int[num];

    int nSum = num * (1 + num) / 2;
    int start = (total - nSum) / num;

    for(int i=1; i<num+1; i++){
      answer[i - 1] = i + start;
    }

    return answer;
  }
}