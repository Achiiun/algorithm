package com.alg.algorithm;

// 출처: codefights.com

/* n!(n 팩토리얼) 값을 조사하여 몇 개의 0으로 끝나는 지(trailing zeros) 개수를 리턴하라.
예1) 10!의 값은 두 개의 0으로 끝난다.
예2) 23!은 4개의 값으로 끝난다. (23!의 값은 4바이트를 초과하기 때문에 테스트하지 말아라!)
 */
/* 원문
Given an integer n, find the number of trailing zeros 
in the decimal representation of n! 
(the exclamation mark means factorial).

Example

for n = 10 output should be 2

[input] integer n

a positive integer
[output] integer

// 참고:
// => "Legendre's formula(= de Polignac's formula)" 수학식을 적용해 보라! 
// 

 */
//
// [시간 복잡도]
// - O(n)
//
public class Day14 {
  public static void main(String[] args) {
    System.out.println(factorialTrailingZeros(1) == 0);
    System.out.println(factorialTrailingZeros(2) == 0);
    System.out.println(factorialTrailingZeros(3) == 0);
    System.out.println(factorialTrailingZeros(4) == 0);
    System.out.println(factorialTrailingZeros(5) == 1);
    System.out.println(factorialTrailingZeros(10) == 2);
    System.out.println(factorialTrailingZeros(15) == 3);
    System.out.println(factorialTrailingZeros(20) == 4);
    System.out.println(factorialTrailingZeros(25) == 6);
    System.out.println(factorialTrailingZeros(30) == 7);
  }

  static int factorialTrailingZeros(int n) {  
    int result = 0;
    int primeFactor = 5;

    // 5의 제곱승이 팩토리얼의 n값보다 작을 때만 반복한다.
    while (primeFactor <= n) {
      result += (n / primeFactor);
      primeFactor *=5; // 계산을 수행한 후에 5의 제곱승을 증가시킨다.
    }
    return result;
  }
}



// 출처: codefights.com
/*
등비수열(geometric progression 또는 geometric sequence)인지 검사하라.
등비수열이면 true, 아니면 flase를 출력하라.

등비수열이란?
=> 각 항이 그 앞 항과 일정한 비를 가지는 수열.
=> 이 일정한 비를 공비(common ratio)라고 한다.

Example
isGeometricProgression([1, 4, 16]) = true   <--- 공비는 4
isGeometricProgression([2, 4, 8, 17, 34]) = false
 */

/* 원문
A geometric progression is a sequence of numbers 
where each term after the first is found 
by multiplying the previous one by a fixed, non-zero number.

Example

isGeometricProgression([1, 4, 16]) = true
isGeometricProgression([2, 4, 8, 17, 34]) = false
[input] array.integer sequence

array of integers
[output] boolean

true if sequence represents a geometric progression,
 */
// 
// [시간 복잡도]
// - ?
//
public class Day14 {

  public static void main(String[] args) {
    System.out.println(isGeometricProgression(new int[]{1,4,16}) == true);
    System.out.println(isGeometricProgression(new int[]{2,4,8,17,34}) == false);

  }

  static boolean isGeometricProgression(int[] sequence) {
    for (int i = 2; i < sequence.length; i++) {
      if (sequence[0] * sequence[i] != sequence[1] * sequence[i - 1]) {
        return false;
      }
    }
    return true;
  }
}