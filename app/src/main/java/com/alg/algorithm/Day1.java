/*
 * 2022-07-12(Tue)
 * baokjun9498
 * 문제: 시험 점수를 입력받아 90~100점은 A, 80~89점은 B, 70~79점은C, 60~69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 * 출력: 시험 성적을 출력한다.
 */
package com.alg.algorithm;

public class Day1 {

  public static void main(String[] args) {

    System.out.println("시험 점수를 입력하세요.");

    java.util.Scanner gradeInput = new java.util.Scanner(System.in);
    int grade = gradeInput.nextInt();
    
    if (0 <= grade && grade <= 100) {
      if (grade >= 90) {
        System.out.println("A");
      } else if (grade >= 80) {
        System.out.println("B");
      } else if (grade >= 70) {
        System.out.println("C");
      } else if (grade >= 60) {
        System.out.println("D");
      } else {
        System.out.println("F");
      }
    } else {
      System.out.println("0~100사이의 값을 입력해주세요.");
    }
  }
}
