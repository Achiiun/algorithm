package com.alg.algorithm;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;


/*
 * 2022-09-02(Fri)
 * baokjun
 * 문제: 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 *      하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
 * 입력: 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 출력: 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 */



public class Day52 {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  
      int n = Integer.parseInt(br.readLine());
  
      br.close();
  
      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n - i; j++) {
          bw.write(' ');
        }
        for (int k = 0; k < i; k++) {
          bw.write('*');
        }
        bw.newLine();
      }
      bw.flush();
      bw.close();
    }
  }
  