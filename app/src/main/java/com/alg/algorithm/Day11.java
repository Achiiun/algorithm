package com.alg.algorithm;

// 출처: codefights.com
//
// 한번에 한 자리의 숫자만 바꿀 때 이전 값과 다르게 만들 수 있는 경우는 몇가지인가?
// 단 맨 앞의 숫자는 0이 될 수 없다. 바꾸는 숫자는 현재의 숫자보다 커야한다
// 예)
// 10 => 17 번 
//
// [시간 복잡도]
// - O(k) : k는 10진수의 자릿수이다.
//
public class Day11 {

  public static void main(String[] args) {
    System.out.println(countWaysToChangeDigit(10) == 17);
  }

  static int countWaysToChangeDigit(int value) {
    int answer = 0;  
    while (value > 0) {    
      answer += 9 - value % 10;
      value /= 10;
    }
    return answer;
  }
}

// [문제] 
// 양의 정수 x를 2진수로 표현했을 때 1 값을 갖는 비트 개수를 정수의 무게라고 정의할 때,
// 같은 무게를 가지는 양의 정수 중에서 x와 가장 가까운 양의 정수를 구하시오!
// 예) x = 0b0000_1010 (10)
//   x와 같은 무게를 가지는 정수들
//     0b0000_1001 (9)
//     0b0000_1100 (12)
//     0b0001_0010 (18)
//     ...
//   답: 0b0000_1001 (9)
//
// [훈련 목표]
// - 2진수를 다루는 방법
// - 연산자, 흐름제어문을 다루는 방법
//
// [시간 복잡도]
// - O(n) : n은 비트의 길이
//
public class Day11 {

  public static void main(String[] args) {
    System.out.println(closestIntSameBit(0b00001010) == 0b00001001); // 10 ==> 9
    System.out.println(closestIntSameBit(0b11001000) == 0b11000100); // 200 ==> 196
  }

  static int closestIntSameBit(int x) {
    for (int i = 0; i < 31; i++) { // 맨앞에 부호비트는 제외
      // 반복할 때 마다 한 비트씩 증가하면서 최하위 비트 2개를 추출한다.
      int bit1 = (x >> i) & 1;
      int bit2 = (x >> (i + 1)) & 1;

      if (bit1 != bit2) {  // 두 비트가 서로 다르다면 맞교환한다.
        int mask = (1 << i) | (i << (i+1)); // 맞교환할 비트를 1로 지정한다.
        x ^= mask; // 원래 값을 마스크와 XOR하여  1로 설정된 비트의 값을 뒤집는다.
        return x;
      }
    }

    // x의 모든 비트가 0이거나 1이면 오류를 반환한다.
    throw new IllegalArgumentException("모든 비트가 0 또는 1이다.");
  }
}
