package src2;

import java.util.Arrays;
import java.util.Random;

public class Study_02_05 {
    public static void main(String[] args) {
        int[] box = new int[10];//정수형 배열 box 선언 뒤 10칸으로 지정함
        int index = 0;//정수형 변수 index 선언 뒤 0으로 초기화
        Random ran = new Random();

        // 중복 없이 1~10까지 랜덤값 채우기
        while (index < 10) {//while문 통해서 10회 반복함
            int r = ran.nextInt(10)+1; // 1~10범위의 값을 r에 저장함
            boolean dup = false;// 불린형 dup 변수에 false를 저장

            for (int i = 0; i < index; i++) {//10회 반복
                if (box[i] == r) {//i번째 인덱스 배열 box가 r과 같다면 dup은 트루가 되고, for문 빠져나오고 다시 위로 감!
                    // while문의 index는 후위 증감 연산을 넣지 않았기에 아직 +1이 안됨
                    dup = true;
                    break;
                }
            }

            if (!dup) {//dup 값이 false라면, +1한 인덱스 칸의 box 배열의 값은 r이 됨 (대입연산자)
                box[index++] = r;
            }
        }

        System.out.print("random: ");// 저장된 랜덤 배열 출력

        for (int i = 0; i < box.length; i++) {//10회 반복함, box 배열 인덱스가 10칸임
            System.out.print(box[i] + " ");//box 배열의 모든값을 출력
        }
        System.out.println();//줄 바꿈 코드

        // 오름차순 정렬
        Arrays.sort(box);
        System.out.print("box 배열 값: ");
        for (int i = 0; i < 10; i++){
        System.out.print(box[i]);
        }
        System.out.println();//줄 바꿈
        System.out.println("numArr: " + Arrays.toString(box));//편의상 배열의 값을 한 줄로 출력하는데 도움을 주는 메서드

        // 배열 복사 (예: index 2 ~ 5 까지 → 총 4개 복사)
        int[] arrCopy = Arrays.copyOfRange(box, 0, 10);//from은 포함, to는 미포함 관계로 인덱스가 9번까지 있어도, 10까지라고 해야 함
        System.out.println("Arrcopy: " + Arrays.toString(arrCopy));
    }
}
