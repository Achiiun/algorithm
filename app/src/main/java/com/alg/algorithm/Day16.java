package com.alg.algorithm;

// 출처: codefights.com
// 산술 진행의 처음 두 값에 따라 n 번째 항목의 값은 무엇인가?
//   arithmeticProgression(e1, e2, n)
//     e1: 첫 번째 항목
//     e2: 두 번째 항목
//     n:  값을 알아낼 항목의 순서
// 예) 
//   arithmeticProgression(2, 5, 5) ==> 14
//
/*
Given first two elements of an arithmetic progression, find its n-th element.

[input] integer element1
1st element of the arithmetic progression

[input] integer element2
2nd element of the arithmetic progression

[input] integer n
positive integer

[output] integer

n-th element of the arithmetic progression
 */
//
// [시간 복잡도]
// - O(1) : 일정하다.
//
public class Day16 {
  public static void main(String[] args) {
    System.out.println(arithmeticProgression(2, 5, 5) == 14); // 2, 5, 8, 11, 14, 17
    System.out.println(arithmeticProgression(2, 7, 5) == 22); // 2, 7, 12, 17, 22, 27
  }

  static int arithmeticProgression(int element1, int element2, int n) {
    int diff = element2 - element1; // 두 수의 차를 구한다.
    return element1 + (diff * (n -1)); // 첫 번째 항목 + (n-1)개의 차
  }
}


// 출처: codefights.com
// 
// 원을 이루는 n 개의 숫자가 있다.
// 0 번째 숫자와 n-1 번째 숫자가 서로 이웃하고 있을 때
// 첫 번째 수와 마주하는 수를 알아내시오!
//
// 예) n = 10 : n은 짝수이며, 원을 이루는 숫자의 개수이다.
//     firstNumber = 2: 첫 번째 숫자이다.
//     결과: 7
//    
/*
Consider integer numbers from 0 to n-1 written down along 
the circle in such a way that the distance 
between any two neighbouring numbers is equal 
(note that 0 and n-1 are neighbouring, too).

Given n and firstNumber, find the number which is written 
in the radially opposite position to firstNumber.

Example

for n=10, firstNumber=2 output should be 7

[input] integer n

a positive even integer n
[input] integer firstNumber

an integer from 0 to n-1
[output] integer
 */
//
// [시간 복잡도]
// - ?
//
public class Day16 {

  public static void main(String[] args) {
    System.out.println(circleOfNumbers(10, 2) == 7); 

  }

  static int circleOfNumbers(int n, int firstNumber) {
    int diff = n / 2; // 전체 수의 절반 값
    return firstNumber + diff;
  }
}


// 출처: codefights.com
// 분수 배열에서 가장 큰 분수의 인덱스를 찾아라!
// 예) 분자: 5, 2, 5
//     분모: 6, 3, 4
// 위 예에서 가장 큰 분모는 5/4를 가리키는 인덱스 2이다.
// 

/* 원문
Given a list of fractions find the largest one.

Example

for numerators=[5, 2, 5], denominators=[6, 3, 4] output 
should be 2 since 5/4 is the largest fraction

[input] array.integer numerators

array of integers representing numerators of the fractions
[input] array.integer denominators

array of integers of the same length as numerators representing denominators 
where the i-th fraction equals to numerators[i]/denominators[i]
[output] integer

index of the largest fraction assuming that none of the fractions are equal
 */
//
// [시간 복잡도]
// - ?
//
public class Day16 {
  public static void main(String[] args) {
    System.out.println(maxFraction(
        new int[]{5, 2, 5}, 
        new int[]{6, 3, 4}) == 2);

    System.out.println(maxFraction(
        new int[]{2, 4, 5, 16, 56}, 
        new int[]{3, 5, 6, 22, 99}) == 2);

  }

  static int maxFraction(int[] numerators, int[] denominators) {
    int maxFractionIndex = 0; // 가장 큰 분수가 0번째라고 가정하고 시작한다.

    // 0 번째 다음 항목인 1 번째부터 비교를 시작한다.
    for (int i = 1; i < numerators.length; i++) {
      // maxFractionIndex 가 가리키는 현재의 분수 보다 i 번째 분수가 더 큰 수라면
      if (numerators[i] * denominators[maxFractionIndex] >
          numerators[maxFractionIndex] * denominators[i]) {
            maxFractionIndex = i; // maxFractionIndex의 값을 i로 바꾼다.
          }
    } 
    return maxFractionIndex;
  }
}