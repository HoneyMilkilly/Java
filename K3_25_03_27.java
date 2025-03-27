import java.util.Scanner;

public class K3_25_03_27{ //오버 로딩의 개념은 하나의 클래스안에 동일한 이름의 여러 메서드를 매개 변수를 여러 개 정의하는 것
    public static void main(String[] args)
    {
        Print p = new Print();//클래스 프린트의 객체 p를 만듬 (인스턴스화)
        p.print (15); //객체 p의 프린트 메서드를 실행하는데 오버로딩에 따라서 자동으로 데이터 타입과 맞는곳으로 들어가서 출력 됨
        p.print ("Ethan");
        p.print (1.5);

    }
}

    class Print { //클래스 Print를 선언함
        void print (String s) //메서드 프린트
        {
            System.out.println("이름은?" + s);//Ethan이라는 문자열과 매칭 됨
        }

        void print (int num)
        {
            System.out.println("나이는?" + num);//15라는 정수와 매칭됨
        }
        void print (double num2)
        {
            System.out.println("시력은? " + num2);//1.5라는 실수와 매칭됨
        }

    
    }