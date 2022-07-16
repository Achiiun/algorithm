/*
 * 2022-07-16(Fri)
 * baokjun1000
 * 문제: 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 출력: 첫째 줄에 A+B를 출력한다.

 public class Day5 {
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);

    int A, B;
    A = input.nextInt();
    B = input.nextInt();

    System.out.println(A - B);
  }
}
 */
package com.alg.algorithm;

public class Day5 {
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);

    int A, B;

    System.out.println("A값을 입력하시오.(범위: A > 0)");
    A = input.nextInt();
    if (A > 0) {
      System.out.printf("A = %d\n", A);
    } else {
      while (true) {
        System.out.println("다시 입력하십시오. (범위: A > 0)");
        A = input.nextInt();
        if  (A > 0) {
          System.out.printf("A = %d\n", A);
          break;
        } 
      }
    }

    System.out.println("B값을 입력하시오.(범위: B < 10)");
    B = input.nextInt();
    if (B < 10) {
      System.out.printf("B = %d\n", B);
    } else {
      while (true) {
        System.out.println("다시 입력하십시오. (범위: B < 10)");
        B = input.nextInt();
        if  (B < 10) {
          System.out.printf("B = %d\n", B);
          break;
        } 
      }
    }
    System.out.printf("A + B = %d\n", A + B);
  }
}





/*
 * 2022-07-16(Fri)
 * baokjun10171
 * 문제: 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 출력: 첫째 줄에 첫째 줄에 A-B를 출력한다.

 public class Day5 {
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);

    int A, B;
    A = input.nextInt();
    B = input.nextInt();

    System.out.println(A + B);
  }
}
 */
public class Day5 {
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);

    int A, B;

    System.out.println("A값을 입력하시오.(범위: A > 0)");
    A = input.nextInt();
    if (A > 0) {
      System.out.printf("A = %d\n", A);
    } else {
      while (true) {
        System.out.println("다시 입력하십시오. (범위: A > 0)");
        A = input.nextInt();
        if  (A > 0) {
          System.out.printf("A = %d\n", A);
          break;
        } 
      }
    }

    System.out.println("B값을 입력하시오.(범위: B < 10)");
    B = input.nextInt();
    if (B < 10) {
      System.out.printf("B = %d\n", B);
    } else {
      while (true) {
        System.out.println("다시 입력하십시오. (범위: B < 10)");
        B = input.nextInt();
        if  (B < 10) {
          System.out.printf("B = %d\n", B);
          break;
        } 
      }
    }
    System.out.printf("A - B = %d\n", A - B);
  }
}
