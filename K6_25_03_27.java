import java.util.Scanner;

public class K6_25_03_27{ //백준 11720 (숫자의 합) -> 2번 사용자한테 정수형 값을 입력 받고 저장 후, 둘 다 출력하는데 두번째 변수는 5번째자리까지 더한 값을 출력
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);//스캐너의 참조변수 scan을 생성 후, new Scanner 객체를 참조함
        int i = scan.nextInt();//첫번째 정수 값 입력 받기
        int num2 = 0;
        String s = scan.next();//두번째 문자열 숫자 입력 받기 (띄워쓰기X)
        char a = s.charAt(0);//char a 문자열 변수에 s 문자열의 인덱스 0번의 값을 저장, charAt 함수는 문자열 몇번째 위치에 있는 것을 꺼내줌 

        for (int num = 0; num < i; num++)//후위 증감 연산을 통해 사용자가 입력한 값까지 반복을 함
        {   
            num2 += s.charAt(num) - '0'; //s의 0인덱스 값이 5이면, 유니코드 값이 53이고, 문자열 '0'은 48이기에 둘을 빼면 5가 됨
        }
        System.out.println(num2);
    }
}