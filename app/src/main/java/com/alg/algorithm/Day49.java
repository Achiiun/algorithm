package com.alg.algorithm;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
 * 2022-08-30(Tue)
 * baokjun8393
 * 문제: n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
 * 출력: 1부터 n까지 합을 출력한다.
 */


public class Day49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int sum = 0;
        
        for (int i = 1; i <= input; i++) {
            sum += i;
        }
        System.out.println(sum);
        sc.close();
    }
}


/*
 * 2022-08-30(Tue)
 * baokjun25304
 * 문제: 준원이는 저번 주에 살면서 처음으로 코스트코를 가 봤다. 정말 멋졌다. 
 *      그런데, 몇 개 담지도 않았는데 수상하게 높은 금액이 나오는 것이다! 준원이는 영수증을 보면서 정확하게 계산된 것이 맞는지 확인해보려 한다.
 *      영수증에 적힌,
 *       - 구매한 각 물건의 가격과 개수
 *       - 구매한 물건들의 총 금액
 *      을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.
 * 입력: 첫째 줄에는 영수증에 적힌 총 금액 $X$가 주어진다.
 *      둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다.
 *      이후 N개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.
 * 출력: 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다. 일치하지 않는다면 No를 출력한다.
 */

 public class Day49 {
    public static void main(String[] args) throws IOEXception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int all = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int sum = 0;

        for (int i = 0; i < n; i++) {
            String b[] = br.readLine().split(" ");

            int price = Integer.parseInt(b[0]);
            int count = Integer.parseInt(b[1]);

            sum += (price * count);

        }
        if (sum == all) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
 }