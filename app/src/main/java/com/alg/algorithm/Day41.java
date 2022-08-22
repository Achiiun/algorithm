package com.alg.algorithm;

// copyright by codefights.com
// 
// 다각형의 내각의 합을 구하라!
//
// 형식:
//   sumOfTheAngles(각의 수)
//   단, 각의 수는 3이상이다.
// 예) 
//   sumOfTheAngles(3) ==> 180
// 
//
/*
Find the sum of the angles of a convex n-gon for a given n.

Example

sumOfTheAngles(3) = 180

[input] integer n
a positive integer greater than or equal to 3

[output] integer
 */
//
// [시간 복잡도]
// - ?
//
public class Day41 {

    public static void main(String[] args) {
      System.out.println(sumOfTheAngles(3) == 180);
      System.out.println(sumOfTheAngles(4) == 360);
      System.out.println(sumOfTheAngles(5) == 540);
    }
  
    static int sumOfTheAngles(int n) {
      return 180 * (n - 2);
    }
  }




// copyright by codefights.com
//
// 배열의 절반을 교환하시오!
//
// 형식:
//   swapArrayHalves(정수 배열)
// 예) 
//   swapArrayHalves(new int[] {1, 3, 2, 1}) ==> [2, 1, 1, 3]
//
//
/*
Swap two halves of a given array.

Example

for [1, 3, 2, 1] output should be [2, 1, 1, 3]

[input] array.integer inputArray

array of integers of even length L
[output] array.integer

array consisting of last L/2 elements of the given inputArray followed by its first L/2 elements
 */
//
// [시간 복잡도]
// - O(n/2) = O(n): n의 배열의 개수이다.
//
public class Day41 {

    public static void main(String[] args) {
      System.out.println(Arrays.compare(
          swapArrayHalves(new int[] {1, 3, 2, 1}), 
          new int[] {2, 1, 1, 3}) == 0);
    }
  
    static int[] swapArrayHalves(int[] inputArray) {
      int half = inputArray.length / 2;
      for (int i = 0; i < half; i++) {
        int temp = inputArray[i];
        inputArray[i] = inputArray[i + half];
        inputArray[i + half] = temp;
      }
      return inputArray;
    }
  }
  