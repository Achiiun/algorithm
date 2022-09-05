package com.alg.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 2022-09-05(Mon)
 * baokjun10818
 * 문제: N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
 *      모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 * 출력: 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 */


public class Day55 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int index = 0;
    int[] arr = new int[n];

    while(st.hasMoreTokens()) {
        arr[index] = Integer.parseInt(st.nextToken());
        index++;
    }

    Arrays.sort(arr);
    System.out.println(arr[0] + " " + arr[n - 1]);
  }
}

public class Day55x {
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int max = -1000001;
    int min = 1000001;

    while(st.hasMoreTokens()) {
        int val = Integer.parseInt(st.nextToken());
        if (val > max) {
            max = val;
        }
        if (val < min) {
            min = val;
        }
    }
    System.out.println(min + " " + max);
  }
}