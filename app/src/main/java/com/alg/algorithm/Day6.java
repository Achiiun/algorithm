/*
 * 2022-07-17(Sun)
 * baokjun10998
 * 문제: 두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 출력: 첫째 줄에 A×B를 출력한다.

public class Day6 {
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);

    int A = input.nextInt();
    int B = input.nextInt();

    System.out.println(A * B);
    
    input.close();
  }
}
*/
package com.alg.algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;


public class Day6 {
  public static void main(String[] args) throws IOException {
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(input);

    String str = br.readLine();
    StringTokenizer st = new StringTokenizer(str," ");

    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());

    System.out.println(A * B);
  }
}

/*
 * 2022-07-17(Sun)
 * baokjun10998
 * 문제: 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 출력: 첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.

public class Day6 {
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);

    double A = input.nextDouble();
    double B = input.nextDouble();

    System.out.println(A / B);
    
    input.close();
  }
}
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;


public class Day6 {
  public static void main(String[] args) throws IOException {
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(input);

    String str = br.readLine();
    StringTokenizer st = new StringTokenizer(str," ");

    double A = Double.parseDouble(st.nextToken());
    double B = Double.parseDouble(st.nextToken());

    System.out.println(A / B);
  }
}