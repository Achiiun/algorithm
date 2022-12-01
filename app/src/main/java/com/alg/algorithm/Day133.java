package com.alg.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 2022-12-01(Thu)
 * baokjun1145: 적어도 대부분의 배수
 * 문제: 다섯 개의 자연수가 있다. 이 수의 적어도 대부분의 배수는 위의 수 중 적어도 세 개로 나누어 지는 가장 작은 자연수이다.
 *       서로 다른 다섯 개의 자연수가 주어질 때, 적어도 대부분의 배수를 출력하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 다섯 개의 자연수가 주어진다. 100보다 작거나 같은 자연수이고, 서로 다른 수이다.
 * 출력: 첫째 줄에 적어도 대부분의 배수를 출력한다.
 */

public class Day133 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int value[] = new int[5];

    for(int i=0; i<value.length; i++) {
      value[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(value);
    int min = value[0];
    int count = 0;

    for(;;) {
      for(int i=0; i<5; i++) {
        if(min % value[i] == 0) {
          count++;    
        } 
      }

      if(count >= 3) {
        System.out.println(min);
        return;
      }
      count = 0;
      min++;

    } // for(;;) End
  }          
}