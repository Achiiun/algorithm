package com.alg.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 2022-10-30(Sun)
 * baokjun10250: ACM 호텔
 * 문제: 위 사진
 * 입력: 프로그램은 표준 입력에서 입력 데이터를 받는다.
 *       프로그램의 입력은 T 개의 테스트 데이터로 이루어져 있는데 T 는 입력의 맨 첫 줄에 주어진다.
 *       각 테스트 데이터는 한 행으로서 H, W, N, 세 정수를 포함하고 있으며
 *       각각 호텔의 층 수, 각 층의 방 수, 몇 번째 손님인지를 나타낸다(1 ≤ H, W ≤ 99, 1 ≤ N ≤ H × W). 
 * 출력: 프로그램은 표준 출력에 출력한다. 각 테스트 데이터마다 정확히 한 행을 출력하는데, 내용은 N 번째 손님에게 배정되어야 하는 방 번호를 출력한다.
 */

public class Day109 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringBuilder sb = new StringBuilder();

    int T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");

      int H = Integer.parseInt(st.nextToken());
      st.nextToken(); // W값 버리기
      int N = Integer.parseInt(st.nextToken());

      if (N % H == 0) {
        sb.append((H * 100) + (N / H)).append('\n');
      }

      else {
        sb.append(((N % H) * 100) + ((N / H) + 1)).append('\n');
      }
    }

    System.out.println(sb);
  }
}