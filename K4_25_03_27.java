import java.util.Scanner;

public class K4_25_03_27{
    public static void main(String[] args)
    {
        Animall s1 = new Cat();
        Animall s2 = new Dog();
        s1.sound();
        s2.sound();
    }
}
    class Animall
    {
        void sound ()
        {
            System.out.print("소리가 들린다 ");
            System.out.println("");//ln을 붙이면 줄바꿈이 된다. print만 하면 줄바꿈 기능은 X
        }
    }
    class Cat extends Animall
    {
        void sound ()
        {
            System.out.print("고양이의 ");
            super.sound();
        }
    }
    class Dog extends Animall
    {
        void sound ()
        {
            System.out.print("강아지의 ");
            super.sound();
        }
    }