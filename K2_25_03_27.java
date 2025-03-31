import java.util.Scanner;
public class K2_25_03_27{ 
    //오버라이딩 코드이고, 부모 클래스의 메서드를 자식클래스에서 재정의 한다는 뜻, 아래 코드를 보면 부모와 자식 둘 다
    // sound라는 메서드를 가지고 있지만 자식 클래스는 "멍멍"이라며 재정의를 했음 이 과정을 오버라이딩이라고 함
    public static void main(String[] args)
    {
        Animal a = new Dog();//Animal이라는 부모클래스의 인스턴스 a를 만들고 자식 클래스 DOG의 객체를 담아서 참조
        a.sound();//a인스턴스의 메서드 sound를 실행
    }
    }

    class Animal {//부모 클래스
        void sound() {//메서드 sound
            System.out.println("멍");//멍을 출력
        }
    }    
    
    class Dog extends Animal {//부모클래스 animal의 자식 클래스
        void sound() {//메서드 sound
            System.out.println("멍멍!");//멍멍을 출력
        }
    }