package com.alg.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 2022-09-28(Wed)
 * baokjun1929: 소수 구하기
 * 문제: M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다.
 *       (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.
 * 출력: 한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
 */

public class Day78x {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    br.readLine();  // N 은 쓰지 않음.   
    int count = 0;

    StringTokenizer st = new StringTokenizer(br.readLine()," ");

    while(st.hasMoreTokens()) {

      // 소수인경우 true, 아닌경우 false   
      boolean isPrime = true;

      int num = Integer.parseInt(st.nextToken());

      if(num == 1) {
        continue;
      }
      for(int i = 2; i <= Math.sqrt(num); i++) {
        if(num % i == 0) {
          isPrime = false;
          break;
        }
      }
      if(isPrime) {
        count++;
      }
    }
    System.out.println(count);
  }

}