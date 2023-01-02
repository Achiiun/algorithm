package com.alg.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
 * 2023-01-02(Mon)
 * baokjun11659: 구간 합 구하기 4
 * 문제: 수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다.
 *       둘째 줄에는 N개의 수가 주어진다.
 *       수는 1,000보다 작거나 같은 자연수이다. 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.
 * 출력: 총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.
 */

public class Day146 {

  static int[] arr;

  public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st=new StringTokenizer(br.readLine());

    int n=Integer.parseInt(st.nextToken());
    int m=Integer.parseInt(st.nextToken());

    st=new StringTokenizer(br.readLine());

    arr = new int[n+1];

    for (int i=1;i<=n;i++) { // i까지의 누적합 구하기
      arr[i]=arr[i-1]+Integer.parseInt(st.nextToken());
    }

    for(int i=0;i<m;i++) {
      st=new StringTokenizer(br.readLine());
      int a=Integer.parseInt(st.nextToken());
      int b=Integer.parseInt(st.nextToken());
      // a, b사이의 구간합은 array[b]-array[a-1]과 같다
      System.out.println(arr[b]-arr[a-1]);
    }
  }


}