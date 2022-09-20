package com.alg.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

/*
 * 2022-09-20(Tue)
 * baokjun18870: 좌표 압축
 * 문제: 수직선 위에 N개의 좌표 X1, X2, ..., XN이 있다.
 *       이 좌표에 좌표 압축을 적용하려고 한다.
 *       Xi를 좌표 압축한 결과 X'i의 값은 Xi > Xj를 만족하는 서로 다른 좌표의 개수와 
 *       같아야 한다. 
 *       X1, X2, ..., XN에 좌표 압축을 적용한 결과 X'1, X'2, ..., X'N를 출력해보자.
 * 입력: 첫째 줄에 N이 주어진다.
         둘째 줄에는 공백 한 칸으로 구분된 X1, X2, ..., XN이 주어진다.
 * 출력: 첫째 줄에 X'1, X'2, ..., X'N을 공백 한 칸으로 구분해서 출력한다.
 */


public class Day70 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    int[] origin = new int[n];
    int[] sorted = new int[n];
    HashMap<Integer,Integer> rankingMap = new HashMap<>();

    StringTokenizer st = new StringTokenizer(br.readLine());

    for(int i = 0; i < n; i++) {
      sorted[i] = Integer.parseInt(st.nextToken());
      origin[i] = sorted[i];
    }

    Arrays.sort(sorted);

    int rank = 0;
    for (int v : sorted) {
      // 이미 앞선 원소의 순위가 매겨졌다면 중복되지 않을 때만
      // map에 원소와 그에 대응되는 순위를 넣어준다.
      if (!rankingMap.containsKey(v)) {
        rankingMap.put(v, rank);
        rank++; // 다음 순위를 가리킨다.
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int key : origin) {
      int ranking = rankingMap.get(key);
      sb.append(ranking).append(' ');
    }

    System.out.println(sb);
  }

}
