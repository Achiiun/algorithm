package com.alg.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 2022-09-25(Sun)
 * baokjun1436: 영화감독 숌
 * 문제: 666은 종말을 나타내는 숫자라고 한다. 따라서, 많은 블록버스터 영화에서는 666이 들어간 제목을 많이 사용한다.
 *      영화감독 숌은 세상의 종말 이라는 시리즈 영화의 감독이다. 
 *      조지 루카스는 스타워즈를 만들 때, 스타워즈 1, 스타워즈 2, 스타워즈 3, 스타워즈 4, 스타워즈 5, 스타워즈 6과 같이 이름을 지었고,
 *      피터 잭슨은 반지의 제왕을 만들 때, 반지의 제왕 1, 반지의 제왕 2, 반지의 제왕 3과 같이 영화 제목을 지었다.
 *      하지만 숌은 자신이 조지 루카스와 피터 잭슨을 뛰어넘는다는 것을 보여주기 위해서 영화 제목을 좀 다르게 만들기로 했다.
 *      종말의 숫자란 어떤 수에 6이 적어도 3개이상 연속으로 들어가는 수를 말한다.
 *      제일 작은 종말의 숫자는 666이고, 그 다음으로 큰 수는 1666, 2666, 3666, .... 과 같다.
 *      따라서, 숌은 첫 번째 영화의 제목은 세상의 종말 666, 두 번째 영화의 제목은 세상의 종말 1666 이렇게 이름을 지을 것이다.
 *      일반화해서 생각하면, N번째 영화의 제목은 세상의 종말 (N번째로 작은 종말의 숫자) 와 같다.
 *      숌이 만든 N번째 영화의 제목에 들어간 숫자를 출력하는 프로그램을 작성하시오.
 *      숌은 이 시리즈를 항상 차례대로 만들고, 다른 영화는 만들지 않는다.
 * 입력: 첫째 줄에 숫자 N이 주어진다. N은 10,000보다 작거나 같은 자연수이다.
 * 출력: 첫째 줄에 N번째 영화의 제목에 들어간 수를 출력한다.
 */

public class Day75 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    if (N > 1) {
      func(N);
    } 
    else {
      System.out.println(666);
    }
  }

  public static void func(int n) {
    int count = 1;
    int prev_digit = 0; // 선수 자릿수
    int num = 0;    // 선수 자릿수를 제외한 나머지 뒷 자릿수

    while (true) {

      //  선수 자릿수가 X...666X 이면서 X...6666 이 아닐 경우 
      if (((prev_digit % 10000) / 10) == 666 && prev_digit % 10 != 6) {
        for (int i = 0; i < 1000; i++) {
          if (count == n) {
            System.out.print(prev_digit * 1000 + num);
            return;
          }
          num++;
          count++;
        }
        prev_digit++;
      }

      // 선수 자릿수가 X...666 일 경우 (ex. 666_000, 1666_004, ...)
      else if (prev_digit % 1000 == 666) {
        num = 0;
        for (int i = 0; i < 1000; i++) {

          if (count == n) {
            System.out.print(prev_digit * 1000 + num);
            return;
          }
          count++;
          num++;
        }
        prev_digit++;
      }

      // 선수 자릿수가 X...66 일 경우 (ex. 66_600, 166_600, ...)
      else if (prev_digit % 100 == 66) {
        num = 600;
        for (int i = 0; i < 100; i++) {
          if (count == n) {
            System.out.print(prev_digit * 1000 + num);
            return;
          }
          count++;
          num++;
        }
        prev_digit++;

      }


      // 선수 자릿수가 X...6 일 경우 (ex. 6_660, 16_663, ...) 
      else if (prev_digit % 10 == 6) {
        num = 660;
        for (int i = 0; i < 10; i++) {
          if (count == n) {
            System.out.print(prev_digit * 1000 + num);
            return;
          }
          num++;
          count++;
        }
        prev_digit++;
      } 

      // 그 외의 경우 (ex. 241_666, 23_666 ...)
      else {
        num = 666;
        if (count == n) {
          System.out.print(prev_digit * 1000 + num);
          return;
        }
        count++;
        prev_digit++;

      }
    }
  }
}
