package com.alg.algorithm;

// copyright by codefights.com
// 
// 문자열에 포함된 숫자의 합을 구하라.
// 예) 
//   sumUpNumbers("2 apples, 12 oranges") ==> 5
//
/*
Find the sum of all digits that occur in a string.

Example

sumUpNumbers("2 apples, 12 oranges") = 5

[input] string inputString

[output] integer
 */
//
// [시간 복잡도]
// - ? 
//
public class Day29 {

  public static void main(String[] args) {
    System.out.println(sumUpDigits("2 apples, 12 oranges") == 5);
  }

  static int sumUpDigits(String inputString) {
    int answer = 0;
    for (int i = 0; i < inputString.length(); i++) {
      char ch = inputString.charAt(i); // String 객체에서 문자를 한개 꺼낸다.
      if (ch >= '1' && ch <= 9) {
        answer += ch - '0';
      }
    }
    return answer;
  }
}




// copyright by codefights.com
// 
// 두 개의 정수 L과 R이 주어질 때 다음 조건을 만족하는 (A,B)의 개수를 구하라!
//   L <= A <= R, 
//   L <= B <= R, 
//   A = B = 1 가능
//   A^3 == B^2 이다.
//
// 예) 
//   equationSolutions(1, 4) ==> 1
//   equationSolutions(1, 8) ==> 2
// 
//
/*
Given integers L and R, 
find the number of different pairs of integers A and B 
such that L <= A <= R and L <= B <= R and A^3 = B^2.

Note that A and B may even coincide (A = B = 1 is one of the possibilities).

Example

for L=1, R=4 output should be 1 - (1,1)
for L=1, R=8 output should be 2 - (1,1) and (4,8)

[input] integer L

[input] integer R

[output] integer
 */
//
// [시간 복잡도]
// - ?
//
public class Day29 {

  public static void main(String[] args) {
    System.out.println(equationSolutions(1, 4) == 1);
    System.out.println(equationSolutions(1, 8) == 2);
  }

  static int equationSolutions(int L, int R) {
    int result = 0;
    for (int a = L; a <= R; a++) {
      for (int b = a; b <= R; b++) {
        if (a * a * a == b * b * b) {
          result++;
        }
      }
    }
    return result;
  }
}
