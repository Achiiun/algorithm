package com.alg.algorithm;

// copyright by codefights.com
// 
// 정수의 자릿수가 주어질 때,
// 앞자리가 0이 아닌 가장 작은 정수의 값을 구하라.
//
// 예) 
//   smallestNumber(1) ==> 0
//   smallestNumber(2) ==> 10
//   smallestNumber(3) ==> 100
// 
//
/*
The algorithm should return the smallest non-negative integer of N digits length.

Example

smallestNumber(2) = 10

[input] integer n
integer's length, positive integer

[output] integer
 */
//
// [시간 복잡도]
// - O(n): n은 자릿수
//
public class Day30 {

  public static void main(String[] args) {
    System.out.println(smallestNumber(1) == 0);
    System.out.println(smallestNumber(2) == 10);
    System.out.println(smallestNumber(3) == 100);
    System.out.println(smallestNumber(4) == 1000);
  }

  static int smallestNumber(int n) {
    if (n == 1) {
      return 0;
    }
    int result = 1;
    for (int i = 1; i < n; i++) {
      result *= 10;
    }
    return result;
  }
}



// copyright by codefights.com
// 
// 정수 l과 r 사이의 있는 두 수를 더했을 때 n이 될 수 있는 
// 경우가 모두 몇 가지인지 찾아라!
// 단, n, l, r 은 모두 양의 정수이다.
//
// 형식)
//   countSumOfTwoRepresentations(n, l, r)
// 예) 
//   countSumOfTwoRepresentations(6, 2, 4) == 2
// 
//
/*
Given integers n, l and r, find the number of ways 
to represent n as a sum of two integers A and B 
such that l <= A <= B <= r.

Example

for n=6, l=2, r=4 output should be 2

[input] integer n
a positive integer

[input] integer l
a positive integer

[input] integer r
a positive integer

[output] integer
 */
//
// [시간 복잡도]
// - ?
//
public class Day30 {

  public static void main(String[] args) {
    System.out.println(countSumOfTwoRepresentations(6, 2, 4) == 2);
    System.out.println(countSumOfTwoRepresentations(6, 1, 5) == 3);
  }

  static int countSumOfTwoRepresentations(int n, int l, int r) {
    int result = 0;
     for (int a = l; a <= r; a++) {
      for (int b = a; b <= r; b++) {
        if (a + b == n) {
          result++;
        }
      }
     }
    return result;
  }
}