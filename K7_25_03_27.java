import java.util.Scanner;

public class K7_25_03_27{
    public static void main(String[] args)
    {
        Animal a = new Dog();//인스턴스화 a는 Animall의 참조형 변수이고, new Dog라는 객체를 가리키고 있음
        a.makesound();

        if (a instanceof Dog)//instanceof는 자바의 비교연산자, 앞에 있는 a가 Dog의 주소값을 참조하는지 확인 맞다면 아래 실행
        {
            Dog d = (Dog) a;//다운캐스팅 과정, Dog 클래스의 참조변수 d는 a객체의 Dog 주소값을 참조한다.
            d.bark();
        }
        System.out.println (a instanceof Dog);//instanceof 함수는 a객체가 Dog클래스를 참조하고 있는지 그걸 체크해줌
        System.out.println (a instanceof Animal);
        //true 왜냐면 a 인스턴스는 Dog 자식 클래스를 참조하고 있고, 위의 인스턴스화 과정을 통해서 클래스 Animal은 이미 Dog클래스를 참조,
        System.out.println(a.toString());//a 객체의 해쉬코드 16진수 변환 결과 (주소값 비슷한거)
    }
}
class Animal { //부모 클래스
    void makesound() {
        System.out.println("Animal sound");
    }
}
class Dog extends Animal {// 자식 클래스
    void bark() {
        System.out.println("멍멍!");
    }
}