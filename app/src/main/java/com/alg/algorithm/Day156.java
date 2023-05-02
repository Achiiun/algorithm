package com.alg.algorithm;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 2023-05-02(Tue)
 * 문제: 정수 배열 numbers가 주어집니다.
 *       numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
 * 제한: numbers의 길이는 2 이상 100 이하입니다.
 *       (numbers의 모든 수는 0 이상 100 이하입니다.)
 */

class Day156 {
  public int[] solution(int[] numbers) {
    int[] answer = {};
    int sum = 0;
    ArrayList<Integer> aList = new ArrayList<Integer>();
    for(int i=0; i<numbers.length; i++) {
      for(int j=i+1; j<numbers.length; j++) {
        sum = numbers[i]+numbers[j];
        if(aList.indexOf(sum)<0) { //중복이 아니라면
          aList.add(sum);
        }
      }
    }
    answer = new int[aList.size()];
    for(int i=0; i<aList.size(); i++) {
      answer[i]+=aList.get(i);
    }
    Arrays.sort(answer);
    return answer;
  }
}