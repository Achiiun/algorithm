package com.alg.algorithm;

// copyright by codefights.com
// 
// 주어진 배열을 꺼꾸로 나열하라!
// 예) 
//    myReverse([1, 3, 2]) = [2, 3, 1]
/*
Reverse an array

Example

myReverse([1, 3, 2]) = [2, 3, 1]

[input] array.integer input

[output] array.integer
 */
//
// [시간 복잡도]
// - ? 
//
public class Day28 {

  public static void main(String[] args) {
    int[] reverseList = myReverse(new int[]{9,8,7,6,5,4,3,2,1});
    for (int i : reverseList) {
      System.out.print(i + ",");
    }
  }

  static int[] myReverse(int[] input) {
    for (int i = 0; i < input.length / 2; i++) {
      int temp = input[i];
      input[i] = input[input.length - 1 - i];
      input[input.length -1 -i] = temp;
    }
    return input;
  }
}


// copyright by codefights.com
// 
// 양의 정수가 주어질 때
// 오직 4와 7로만 이루어진 수인지 검사하라!
// 예)
//   isLuckyNumber(4744) ==> true
//   isLuckyNumber(4754) ==> false
//
/*
Lucky numbers are the positive integers 
whose decimal representations contain only the lucky digits 4 and 7

[input] integer n
a positive integer

[output] boolean
true if n is a lucky number, false otherwise
 */
//
// [시간 복잡도]
// - ? 
//
public class Day28 {

  public static void main(String[] args) {
    System.out.println(isLuckyNumber(4744) == true);
    System.out.println(isLuckyNumber(4754) == false);
  }

  static boolean isLuckyNumber(int n) {
    while (n > 0) {
      int temp = n % 10;
      if (temp != 4 && temp != 7) {
        return false;
      }
      n /= 10;
    }
    return true;
  }
}