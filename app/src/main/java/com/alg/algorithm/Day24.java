package com.alg.algorithm;

// copyright by codefights.com
// 
// 세 개의 수 중에서 가장 큰 수를 찾으시오!
//
/*
Find the largest number from the given three integers

[input] integer a

[input] integer b

[input] integer c

[output] integer

max of a,b and c
 */
//
// [시간 복잡도]
// - ? 
//
public class Day24 {

  public static void main(String[] args) {
    System.out.println( myMaxOfThree(8, 7, 5) == 8); 
    System.out.println( myMaxOfThree(8, 5, 7) == 8); 
    System.out.println( myMaxOfThree(7, 8, 5) == 8); 
    System.out.println( myMaxOfThree(7, 5, 8) == 8); 
    System.out.println( myMaxOfThree(5, 7, 8) == 8);
  }

  static int myMaxOfThree(int a, int b, int c) {
    if (a > b) {
      if (a > c) {
        return a;
      } 
    } else {
      if (b > c) {
        return b;
      } 
    }
    return c;
  }
}



// copyright by codefights.com
// 
// 양의 정수가 주어질 때 가장 큰 숫자를 찾아라!
// 예)
//    maxDigit(2542) ==> 5
//  
//
/*
Find the largest digit of the given number.

[input] integer n
non-negative integer

[output] integer
largest digit of n
 */
//
// [시간 복잡도]
// - ?
//
public class Day24 {

  public static void main(String[] args) {
    System.out.println(maxDigit(736) == 7);
    System.out.println(maxDigit(2542) == 5);
  }

  static int maxDigit(int n) {
    int result = 0;
    while (n > 0 ) {
      if ((n % 10) > result) {
        result = n % 10;
      }
      n /= 10;
    }
    return result;
  }
}
