package com.alg.algorithm;

// 출처: codefights.com
//
// 양의 정수 10진수를 꺼꾸로 만들어라.
// 
// 예) numberReverse(123) = 321
//     numberReverse(120) = 21
// 
/*
Reverse a given integer by rearranging its digits.

Example

numberReverse(123) = 321
numberReverse(120) = 21

[input] integer input
positive integer

[output] integer
 */
//
// [시간 복잡도]
// - ?
//
public class Day20 {
  public static void main(String[] args) {
    System.out.println(numberReverse(123) == 321);
    System.out.println(numberReverse(120) == 21);
  }

  static int numberReverse(int input) {
    int reversed = 0;
    
    while (input > 0) {
      int v = input % 10; // 입력 값에서 1의 자리 값을 알아낸다.
      reversed = (reversed * 10) + v; // 기존의 값을 한자리 올린 후, 알아낸 1의 자리 값을 결과 변수에 더한다.
      input /= 10; // 입력 값을 한자리 낮춘다.
    }
    return reversed;
  }
}



// 출처: codefights.com
// 
// 분수의 절대 값이 배열로 주어질 때, 
//   분자: 배열[0]
//   분모: 배열[1]
// 분수가 1보다 작다면 "Proper"를 출력하고 
// 분수가 1이상이면 "Improper"를 출력하라!
//
// 예) properOrImproper([7, 2]) = "Improper"
// 
//   
/*
A fraction written as a/b is said to be a proper fraction 
if the absolute value of the fraction is strictly less than one. 
Otherwise it is called an improper fraction.

Determine whether a given fraction is proper.

Example

properOrImproper([7, 2]) = "Improper"

[input] array.integer A
array of two integers representing a fraction A[0] / A[1]

[output] string
"Proper" if A contains a proper fraction, "Improper" otherwise
 */
//
// [시간 복잡도]
// - ?
//
public class Day20 {
  public static void main(String[] args) {
    System.out.println(properOrImproper(new int[]{7,2}) == "Improper");
    System.out.println(properOrImproper(new int[]{2,7}) == "Proper");
    System.out.println(properOrImproper(new int[]{-3,3}) == "Improper");
  }

  static String properOrImproper(int[] A) {
    if (Math.abs(A[0] / A[1]) < 1) {
      return "Proper";
    }
    return "Improper";
  }


}