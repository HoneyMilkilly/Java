package src2;
import java.util.Random;
import java.util.Scanner;

public class Study_02_03 {
    public static void main(String[] args) {
        Random a = new Random();
        int num = a.nextInt(100) + 1;
        System.out.println("생성된 랜덤값은? " + num);
        Scanner scan = new Scanner(System.in);
        boolean t = true;

        while (t) { // 불린형 t가 false라면 종료
            System.out.println("1부터 100사이의 정수를 입력해주세요");
            int input = scan.nextInt();

            if (input == num) {
                System.out.println("정답입니다!");
                t = false;

            } else if (input < num) {
                System.out.println("더 큰 수를 입력해주세요.");
            } else if (input > num) {
                System.out.println("더 작은 수를 입력해주세요.");
            }
        }
    }
}