package src2;
import java.util.Scanner;

public class Study_02_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("0~100점 사이 시험 점수를 입력해주세요.");
        int num = scan.nextInt();

        if (num >= 98) { //입력받은 정수가 98하고 같거나, 그보다 크다면 실행, 아니라면 아래로 쭉 내려감!
            System.out.println("점수는 A+입니다.");
        } else if (num >= 90) {
            System.out.println("점수는 A-입니다.");
        } else if (num >= 88) {
            System.out.println("점수는 B+입니다.");
        } else if (num >= 80) {
            System.out.println("점수는 B-입니다.");
        } else if (num >= 78) {
            System.out.println("점수는 C+입니다.");
        } else if (num >= 70) {
            System.out.println("점수는 C-입니다.");
        } else if (num >= 65) {
            System.out.println("점수는 D+입니다.");
        } else if (num >= 60) {
            System.out.println("점수는 D-입니다.");
        } else {
            System.out.println("점수는 F입니다.");
        }

    }
}
