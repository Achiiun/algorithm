package com.alg.algorithm;

// 출처: codefights.com
// 
// 주어진 문자열이 반복 문자열인지 검사하라!
// 예) 
//   "abcdeabcde"   --> true
//   "qqq"          --> false
//   "2w2www        --> false
//
/*
Determine whether the given string is a concatenation of another string 
to itself.

Example

for 'tandemtandem' output should be true

for 'qqq' or '2w2ww' output should be false

[input] string inputString

[output] boolean

true if inputString represents a string concatenated to itself, 
false otherwise

 */
//
// [시간 복잡도]
// - O(n/2) = O(n) : n은 문자열의 개수
//
public class Day21 {

  public static void main(String[] args) {
    System.out.println(isTandemRepeat("abcdeabcde")); // true
    System.out.println(isTandemRepeat("qqq")); // false
    System.out.println(isTandemRepeat("2w2www")); // false
  }

  static boolean isTandemRepeat(String inputString) {
    // 문자열의 개수가 홀수이면 반복한 문자열이 아니다.
    if (inputString.length() % 2 != 0) {
      return false;
    }

    int half = inputString.length() / 2; // 문자열의 절반 길이 
    for (int i = 0; i < half; i++) {
      // 문자열을 절반으로 잘라서 순서대로 비교한다.
      if (inputString.charAt(i) != inputString.charAt(i + half)) {
        return false;
      }
    }
    return true;
  }
}



// 출처: codefights.com
// 
// 주어진 양의 정수 배열에서 가장 큰 짝수를 찾아라!
// 최소 한 개의 짝수가 존재한다.
// 예) 
//   maximalEven([4, 3, 6, 8, 2, 4]) = 8
//
/*
Pick-out the largest even number from an array of integers

Example

maximalEven([4, 3, 6, 8, 2, 4]) = 8

[input] array.integer inputArray
an array of positive integers, it's guaranteed 
that inputArray contains at least one even integer

[output] integer
maximal even element of inputArray
 */
//
// [시간 복잡도]
// - O(n) : n은 배열의 개수이다.
//
public class Day21 {

  public static void main(String[] args) {
    System.out.println(maximalEven(new int[]{4, 3, 6, 8, 2, 4}) == 8);
  }

  static int maximalEven(int[] inputArray) {
    int answer = 0; // 양의 정수만 고려하기에 시작 값을 0으로 설정한다.

    // 배열에 저장된 값을 모두 확인한다.
    for (int i = 0; i < inputArray.length; i++) {

      // 양의 정수이면서 기존의 설정된 값 보다 크다면 값을 교체한다.
      if (inputArray[i] % 2 == 0 && inputArray[i] > answer) {
        answer = inputArray[i];
      }
    }
    return answer;
  }
}