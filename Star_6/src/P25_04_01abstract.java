public class P25_04_01abstract {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.breathe();// Animal 클래스의 breathe 메서드 실행
        a1.sound();//a1이라는 참조 변수가 new Dog를 가리킴, Dog 자식클래스의 sound 메서드 실행

        a2.breathe();// Animal 클래스의 breathe 메서드 실행
        a2.sound();//a2이라는 참조 변수가 new Cat를 가리킴, Cat 자식클래스의 sound 메서드 실행
    }
}
    abstract class Animal { //부모클래스이면서, 추상클래스, 자식 클래스는 추상클래스의 내용을 이용가능
        void breathe() {
            System.out.println("숨을 쉰다.");
        }
        abstract void sound(); //Animal 클래스의 추상 메서드임, 자식 클래스를 참조하는 2개의 참조변수는 이 메서드 사용 O
    }
    class Dog extends Animal {
    @Override
        void sound(){
        System.out.println("멍멍");
    }
    }
    class Cat extends Animal {
    @Override
        void sound(){
        System.out.println("야옹");
    }
    }