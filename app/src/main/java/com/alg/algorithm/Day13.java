package com.alg.algorithm;

// 출처: codefights.com
//
// 배열의 전체 길이를 L이라고 하자.
// 배열을 절반(L/2)으로 나눌 때, 앞쪽 부분과 뒤쪽 부분의 위치를 바꿔라.
// 예)
// [2, 4, 5, 6, 4, 3, 7, 8] => [4, 3, 7, 8, 2, 4, 5, 6]
//
// [시간 복잡도]
// - O(n): n은 배열 개수
//
public class Day13 {

  public static void main(String[] args) {
    int[] values = {2, 4, 5, 6, 4, 3, 7, 8};
    changeValuePosition(values);

    int[] results = {4, 3, 7, 8, 2, 4, 5, 6};

    for (int i = 0; i < results.length; i++) {
      if (values[i] != results[i]) {
        System.out.println(false);
        return;
      }
    }
    System.out.println(true);
  }

  static void changeValuePosition(int[] values) {
    // 배열의의 절반을 맞바꿀 것이기 때문에 
    // 배열의 절반만 반복한다.
    int halfIndex = values.length / 2;
    for (int i = 0; i < halfIndex; i++) {

      // 맞바꿀 항목의 인덱스를 구한다.
      int target = i + halfIndex;

      // 두 항목의 값을 바꾸기 전에 i 번째 항목의 값을 임시 변수에 저장해 둔다.
      int temp = values[i];

      // target 인덱스의 값을 i 번째 항목에 넣는다.
      values[i] = values[target];

      // target 번째 항목에 temp 에 임시 보관된 값을 저장한다.
      values[target] = temp;
    }
  }
}


// 출처: codefights.com
//
// 숫자 배열이 있다.
// 나누어 0이 떨어지는 수가 몇 쌍이 있는지 구하라!
//
// [시간 복잡도]
// - O(n^2) : n은 배열의 개수이다.
//
public class Day13 {

  public static void main(String[] args) {
    int[] values = {2, 4, 5, 8, 10};
    System.out.println(divisorsPairs(values) == 5);

  }

  public static int divisorsPairs(int[] sequence) {
    int result = 0;

    // 배열은 0 번 항목부터 반복한다.
    for (int i = 0; i < sequence.length; i++) {

      // 나눌 값은 i 번 다음 항목과 나누기 계산한다.
      for (int j = i + 1; j <sequence.length; j++) {
        //System.out.println(sequence[i] + "<--->" + sequence[j]);
        int iValue = sequence[i]; // i 번째 항목의 값을 꺼내고
        int jValue = sequence[j]; // i 번 다음 항목의 값을 꺼낸다.

        // 두 항목을 바꿔가면서 나눗셈을 하여 0으로 떨어지는지 조사한다.
        if ((iValue % jValue == 0) || ((jValue % iValue) == 0)) {
          result++;
        }
      }
    }

    return result;
  }
}
