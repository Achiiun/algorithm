package com.alg.algorithm;

// copyright by codefights.com
// 
// 마을에 n개의 집이 있다.
// 각 집은 1번부터 n번까지 순서대로 번호가 붙어 있으며
// 원으로 된 도로를 따라 시계 방향으로 세워져 있다.      
// 한 집에서 옆집으로 가는데 1분이 소요된다. 
// 1번 집에서 출발하여 주어진 순서로 집을 방문하는데 
// 걸리는 최소 시간을 구하라!
// 
//
// 형식:
//   visitsOnCircularRoad(집 개수, 방문할 집 번호을 나열한 배열)
// 예) 
//   visitsOnCircularRoad(4, [1, 3, 2, 3, 1]) = 6
// 
//
/*
There are N houses in a village on a circular road numbered from 1 to N 
starting from some house in clockwise order. It takes one minute to get 
from one house to any of two adjacent houses and there are no other roads 
in this village besides the circular one. Find the minimal time required 
to make all visits in the desired order starting from house 1

Example

visitsOnCircularRoad(4, [1, 3, 2, 3, 1]) = 6

[input] integer N
number of houses, positive integer

[input] array.integer visitsOrder
 */
//
// [시간 복잡도]
// - ?
//
public class Day38 {

    public static void main(String[] args) {
      System.out.println(visitsOnCircularRoad(4, new int[] {1, 3, 2, 3, 1}) == 6);
      System.out.println(visitsOnCircularRoad(6, new int[] {1, 3, 2, 6, 5}) == 6);
    }
  
    static int visitsOnCircularRoad(int N, int[] visitsOrder) {
      
      int currentPosition = 1;
      int minutes = 0;
      
      for (int i = 0; i < visitsOrder.length; i++) {
        int m1 = Math.abs(visitsOrder[i] - currentPosition); // 목적지까지 가는데 걸리는 시간 
        int m2 = N - m1; // 반대 방향으로 갈 때 걸리는 시간?
        minutes += Math.min(m1, m2); // 두 시간 중에서 짧은 시간?
        currentPosition = visitsOrder[i]; // 이동 후 현재 위치 설정
      }
      return minutes;
    }
  }
  