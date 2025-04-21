package src2;

import java.util.Arrays;

public class Study_02_06 {
    public static void main(String[] args) {
        int[] numArr = {0, 1, 0, 5, 5, 7, 6, 4, 8, 6, 1, 3, 4, 7, 1};

        int[] countArr = new int[10]; // 인덱스가 곧 숫자 의미함 (0~9)

        // 향상된 for문 이용해서 10회 반복
        for (int num : numArr) {
            countArr[num]++;// countArr 배열의 인덱스 num칸에 +1
        }

        System.out.print("숫자: [");

        for (int i = 0; i < 10; i++) {//10회 반복 0~9
            System.out.print(i);//i값 출력
            if (i < 9) System.out.print(", ");//9회 점 찍음 0~8
        }
        System.out.println("]");

        System.out.println("개수: " + Arrays.toString(countArr));//Arrays.toString은 문자열로 바꿔주는 코드,
    }
}
