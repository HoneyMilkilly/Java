import java.util.Scanner;
public class study {
    public static void main(String[] args)  {
        Animal a1 = new Cat();
        Animal a2 = new Dog();

        a1.sound();
        a2.sound();
        }   
    }

    class Animal {
        String s = "호랑이는 어흥";
        void sound() {
            System.out.println("동물 소리 : ");
        }
    }
    class Cat extends Animal {
        void sound() {
            super.sound();
            System.out.println("냐옹");
            System.out.println(super.s);
        }
    }
    class Dog extends Animal {
        void sound() {
            super.sound();
            System.out.println("멍멍");
            System.out.println(super.s);
        }
    }