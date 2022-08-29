package com.alg.algorithm;

import java.util.Scanner;

/*
 * 2022-08-29(Mon)
 * baokjun2739
 * 문제: N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
 * 입력: 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
 * 출력: 출력형식과 같게 N*1부터 N*9까지 출력한다.
 */

public class Day48 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int in = sc.nextInt();

    for (int i = 1; i <= 9; i++) {
        System.out.printf("%d * %d = %d\n", in, i, (in * i));
    }
  }    
}

/*
 * 2022-08-29(Mon)
 * baokjun10950
 * 문제: 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 *      각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 출력: 각 테스트 케이스마다 A+B를 출력한다.
 */

public class Day48 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < size; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            sb.append('\n');

        }

        System.out.println(sb);

    }    
  }
  