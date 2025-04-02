public class P4_1 {
    public static void main(String[] args)
    {
        int x = 12;
        char ch = 'a';
        boolean a;

        if (x > 10 && x < 20)//&& 연산자는 좌측과 우측모두 참일때!
        {
            System.out.println("1번은 참입니다.");
        }

        if (ch != ' ' && ch != '\t')//!= 연산자의 의미는 좌측 변수와 우측의 내용이 다를때 참!
        {
            System.out.println("2번은 참입니다.");
        }

        ch = 'x';
        if (ch == 'x' && ch != 'X')//!= 연산자의 의미는 좌측 변수와 우측의 내용이 다를때 참!
        {
            System.out.println("3번은 참입니다.");
        }

        ch = '0';
        if (ch >= '0' && ch <= '9')
        //'0'의 유니코드가 ch보다 작거나 같은가??, ch의 유니코드 값이 '9'의 유니코드보다 작거나 같은가?
        {
            System.out.println("4번은 참입니다.");
        }

        ch = 'A';
        if ((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90))
            //대문자와 소문자 유니코드는 소문자 - 대문자 = 32임, 대문자 범위
        {
            System.out.println("5번은 참입니다.");
        }

        int year = 800;
        if ((year%400 == 0)||(year % 4 == 0 && year % 100 != 0))//윤년 구하는 코드
        //!= 연산자는 좌측과 우측의 결과가 같지 않다면 True
        {
            System.out.println("6번은 참입니다.");
        }

        boolean powerOn = false;
        if (!powerOn)//pwerOn 변수안의 값을 반전시킴
        //! 연산자는 값을 반전함
        {
            System.out.println("7번은 참입니다.");
        }else {
            System.out.println("7번은 참이아닙니다.");
        }
        String str = "yes";
        if (str == "yes")//
        //! 연산자는 값을 반전함
        {
            System.out.println("8번은 참입니다.");
        }
        }
    }