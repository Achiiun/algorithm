package com.alg.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 2022-11-14(Mon)
 * baokjun11724: 연결 요소의 개수
 * 문제: 방향 없는 그래프가 주어졌을 때, 연결 요소 (Connected Component)의 개수를 구하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 정점의 개수 N과 간선의 개수 M이 주어진다.
 *       (1 ≤ N ≤ 1,000, 0 ≤ M ≤ N×(N-1)/2) 둘째 줄부터 M개의 줄에 간선의 양 끝점 u와 v가 주어진다.
 *       (1 ≤ u, v ≤ N, u ≠ v) 같은 간선은 한 번만 주어진다.
 * 출력: 첫째 줄에 연결 요소의 개수를 출력한다.
 */

public class Day123 {

  static int[][] graph = new int[1001][1001];
  static int V;
  static int E;
  static boolean[] visited = new boolean[1001];

  public static void dfs(int index) {
    if(visited[index] == true)
      return;
    else {
      visited[index] = true;
      for(int i = 1; i <= V; i++) {
        if(graph[index][i] == 1) {
          dfs(i);
        }
      }
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    st = new StringTokenizer(br.readLine()," ");
    V = Integer.parseInt(st.nextToken());
    E = Integer.parseInt(st.nextToken());

    int a,b;
    for(int i = 0; i < E; i++) {
      st = new StringTokenizer(br.readLine()," ");
      a = Integer.parseInt(st.nextToken());
      b = Integer.parseInt(st.nextToken());

      // 간선 연결
      graph[a][b] = graph[b][a] = 1;
    }

    int result = 0 ;

    // dfs 탐색
    for(int i = 1; i <= V; i++) {
      if(visited[i] == false) { // 방문한 적 없는 노드라면 dfs.
        dfs(i);
        result++;
      }
    }

    System.out.println(result);

    return;
  }
}