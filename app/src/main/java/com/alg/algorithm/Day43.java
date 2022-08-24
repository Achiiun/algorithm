package com.alg.algorithm;

// copyright by codefights.com
// 
// 문자열이 주어질 때, 지정된 인덱스로부터 지정된 개수의 문자열을 추출하라!
//
// 형식:
//   mySubstringByLength(문자열, 문자열을 추출할 시작 인덱스, 추출할 문자열 개수)
//   - 문자열을 추출할 시작 인덱스는 문자열의 길이 보다 작아야 한다.
//   - 추출할 문자열의 길이는 유효해야 한다.
// 예) 
//   mySubstringByLength("abcde", 2, 3) ==> "cde"
//
/*
Implement an algorithm that can output a substring of the given string 
given a starting point and a length.

Example

mySubstring('abcde', 2, 3) = 'cde'
[input] string inputString

[input] integer start
start is less than the length of string

[input] integer length
the length of the substring. It's guaranteed that for a given start, 
length is such that the substring exist 

[output] string
substring of string starting from the start character of inputString 
with length equal to length
 */
//
// [시간 복잡도]
// - ?
//
public class Day43 {

    public static void main(String[] args) {
      System.out.println(mySubstringByLength("abcde", 2, 3).equals("cde"));
    }
  
    static String mySubstringByLength(String inputString, int start, int length) {
      char[] chars = new char[length];
      for (int i = start; i < start + length; i++) {
        chars[i - start] = inputString.charAt(i);
      }
      return new String(chars);
    }
  }



// copyright by codefights.com
// 
// 1에서 n까지의 세제곱의 합을 구하라!
//
// 형식:
//   sumOfCubes(n)
// 예) 
//   sumOfCubes(3) ==> 36
//
/*
Find the sum of cubes of all integer from 1 to and including the given integer n.

Example

sumOfCubes(3) = 36

[input] integer n
positive integer

[output] integer
 */
//
// [시간 복잡도]
// - ?
//
public class Day43 {

    public static void main(String[] args) {
      System.out.println(sumOfCubes(3) == 36);
    }
  
    static int sumOfCubes(int n) {
      int result = 0;
      for (int i = 1; i <= n; i++) {
        result += i * i * i;
      }
      return result;
    }
  }

  
  

// copyright by codefights.com
// 
// 배열이 주어질 때 다음 조건을 만족하는 경우의 수를 찾으시오.
// => index1 < index2, array[index1] > array[index2]
//
// 형식:
//   countInversionsNaive(정수 배열)
// 예) 
//   countInversionsNaive(new int[] {1, 3, 2, 0}) ==> 4
//
/*
Two elements of the array of integers form an inversion if array[index1] > array[index2] and index1 < index2.

  Given an array of integers, find the number of inversions it contains.

  Example

  for [1, 3, 2, 0] output should be 4

  [input] array.integer inputArray

  [output] integer
 */
//
// [시간 복잡도]
// - ?
//
public class Day43 {

    public static void main(String[] args) {
      System.out.println(countInversionsNaive(new int[] {1, 3, 2, 0}) == 4);
    }
  
    static int countInversionsNaive(int[] inputArray) {
      int result = 0;
      for (int i = 0; i < inputArray.length; i++) {
        for (int j = i + 1; j < inputArray.length; j++) {
          if (inputArray[i] > inputArray[j]) {
            result++;
          }
        }
      }
      return result;
    }
  }
  