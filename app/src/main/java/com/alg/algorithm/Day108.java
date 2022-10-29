package com.alg.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * 2022-10-29(Sat)
 * baokjun2587: 대표값2
 * 문제: 어떤 수들이 있을 때, 그 수들을 대표하는 값으로 가장 흔하게 쓰이는 것은 평균이다.
         평균은 주어진 모든 수의 합을 수의 개수로 나눈 것이다. 예를 들어 10, 40, 30, 60, 30의 평균은 (10 + 40 + 30 + 60 + 30) / 5 = 170 / 5 = 34가 된다.
         평균 이외의 또 다른 대표값으로 중앙값이라는 것이 있다. 중앙값은 주어진 수를 크기 순서대로 늘어 놓았을 때 가장 중앙에 놓인 값이다.
         예를 들어 10, 40, 30, 60, 30의 경우, 크기 순서대로 늘어 놓으면
         10 30 30 40 60
         이 되고 따라서 중앙값은 30이 된다.
         다섯 개의 자연수가 주어질 때 이들의 평균과 중앙값을 구하는 프로그램을 작성하시오.
 * 입력: 첫째 줄부터 다섯 번째 줄까지 한 줄에 하나씩 자연수가 주어진다. 주어지는 자연수는 100 보다 작은 10의 배수이다.
 * 출력: 첫째 줄에는 평균을 출력하고, 둘째 줄에는 중앙값을 출력한다. 평균과 중앙값은 모두 자연수이다.
 */

public class Day108 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] arr = new int[5];     // 입력한 값을 담을 배열 생성 
    int sum = 0;                // 총 합을 구할 변수 생성 

    for(int i=0; i<5; i++) {    // 반복문 
      int num = Integer.parseInt(br.readLine()); // 숫자 입력받기 
      arr[i] += num;          // 배열에 숫자 넣기 
      sum += num;             // 평균을 구하기 위해 입력받은 수의 총합 구하기
    }

    System.out.println(sum/5);  // 총합을 5로 나누기 

    Arrays.sort(arr);           // 배열 정렬하기 

    System.out.println(arr[2]); // 3번째 값이 중앙값 
  }
}