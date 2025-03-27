import java.util.Scanner;

public class K5_25_03_27{ //업 캐스팅 관련 코드 부모클래스와 자식클래스의 이름이 같은 메서드 중 
    public static void main(String[] args)
    {
        Animall a = new Dog();//new Dog는 Animall a의 객체이고, a는 클래스 Animall의 참조형 변수가 됨, 참조형 변수 a는 new Dog를 참조
        a.sound();//참조형 변수 a의 주소값의 메서드 sound를 실행한다.
        // a.wagTail(); -> 이 코드는 실행되지 앟는다 
    }
}
    class Animall //부모 클래스
    {
        void sound () //메서드 sound, 부모클래스와 자식클래스가 겹친다.
        {
            System.out.println("동물이 소리를 낸다");
        }
    }
    class Dog extends Animall //자식 클래스
    {
        void sound() {
            System.out.println("멍멍!");
        }

        void wagTail() { //자식클래스에만 있는 메서드
            System.out.println("꼬리를 흔든다");
        }
    }