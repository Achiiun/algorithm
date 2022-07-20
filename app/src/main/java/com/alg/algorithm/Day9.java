package com.alg.algorithm;
// [문제] 
// 두 위치의 비트 값을 맞교환 하라! 
// 예) 값:   0b00101100_01110001
//     2번째(2^2 자리) 비트와 13번째(2^13 자리) 비트
//     결과: 0b00001100_01110101
//  
// [훈련 목표]
// - 관계 연산자 및 비트 연산자, 비트 이동 연산자 활용
// - 반복문 활용
// - 메서드 파라미터 및 리턴 값 다루기
//
public class Day9 {

  public static void main(String[] args) {
    int r = swapBits(0b00101100_01110001, 2, 13);
    System.out.println(r == 0b00001100_01110101); // true

    r = swapBits(0b01010111_01100011, 6, 10);
    System.out.println(r == 0b01010111_01100011); // true
  }

  static int swapBits(int value, int i, int j) { 
    if (((value >>> i) & 1) != ((value >>> j) & 1)) {
      int bitMask = (1 << i) | (1 << j);
      value ^= bitMask;  
    }
    return value;
  }
}

// 출처: codefights.com
//
// 주어진 숫자에 짝수가 몇 개인지 세어라.
// 예) 
// 1010 => 2
// 123 => 1
//
public class Day9 {

  public static void main(String[] args) {
    System.out.println(countEvenNumber(1238694636) == 6);
    System.out.println(countEvenNumber(2567884) == 5);
  }

  static int countEvenNumber(int value) {
    int result = 0;
    int n = value;
    while(n != 0) {
      if ((n % 2) == 0) {
        result++;
      }
      n /= 10;
    }
    return result;
  }
}

// 출처: codefights.com
//
// 숫자 배열에서 각 이웃하는 숫자간의 차가 가장 큰 것을 알아내기
// 예)
// [2, 4, 1, 0] => 3
// 

public class Day9 {

  public static void main(String[] args) {
    System.out.println(maxDiff(new int[]{2, 4, 1, 0}) == 3);
    System.out.println(maxDiff(new int[]{3, 1, 4, 3, 8, 7}) == 5);
  }

  static int maxDiff(int[] values) {
    int answer = 1;
    for (int i = 1; i < values.length; i++) {
      if (Math.abs(values[i] - values[i - 1]) > answer) {
        answer = Math.abs(values[i] - values[i-1]);
      }
    }
    return answer;
  }
}
