package com.alg.algorithm;

import java.io.IOException;
import java.util.Scanner;

public class Day140 {

  public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for(int i=0; i<n; i++) { 

      for(int j=i+1; j<=n; j++) {

        System.out.print("*");
      }        
      System.out.println();            
    }
  }
}
