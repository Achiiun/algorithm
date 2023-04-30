package com.alg.algorithm;

/*
 * 2023-04-30(Sun)
 * 문제: 정수 n과 문자열 control이 주어집니다. control은 "w", "a", "s", "d"의 4개의 문자로 이루어져 있으며, control의 앞에서부터 순서대로 문자에 따라 n의 값을 바꿉니다.
 *       "w" : n이 1 커집니다.
 *       "s" : n이 1 작아집니다.
 *       "d" : n이 10 커집니다.
 *       "a" : n이 10 작아집니다.
 *       위 규칙에 따라 n을 바꿨을 때 가장 마지막에 나오는 n의 값을 return 하는 solution 함수를 완성해 주세요.
 * 제한: -100,000 ≤ n ≤ 100,000
 *       1 ≤ control의 길이 ≤ 100,000
 *         - control은 알파벳 소문자 "w", "a", "s", "d"로 이루어진 문자열입니다.
 */

class Day154 {
  public int solution(int n, String control) {
    int answer = n;
    String[] controlList = control.split("");
    for(int i = 0; i<controlList.length; i++){
      if(controlList[i].equals("w")){
        answer+=1;
      }
      else if(controlList[i].equals("s")){
        answer-=1;
      }
      else if(controlList[i].equals("d")){
        answer+=10;
      }
      else if(controlList[i].equals("a")){
        answer-=10;
      }
    }
    return answer;
  }
}