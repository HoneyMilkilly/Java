public class test {
    public static void main(String[] args)  {

        Animal A1 = new Cat();//Ani는 Animal 클래스의 인스턴스 뒤의 코드는 뒤의 Cat 클래스가 앞의 Animal 클래스를 상속 받는 다는 내용임
        Animal A2 = new Dog();
        A1.sound();//캣 클래스의 메서드 실행, A1을 통해 부모 클래스의 메서드를 실행 할 방법은 없음(다형성), 단 캣 클래스 안에서 실행 가능!
        A2.sound();//도그 클래스의 메서드 실행, super 함수를 이용하여 자식 클래스 안에서 부모클래스 메서드 사용 가능!
        }


        static class Animal {
            void sound() {
                System.out.println("동물이 소리를 낸다");
            }
        }
        
        static class Dog extends Animal { //Dog 클래스가 Animal 클래스를 상속 
            void sound() {
                super.sound();
                System.out.println("멍멍!");
            }
        }
        
        static class Cat extends Animal { //Cat 클래스가 Animal 클래스를 상속
            void sound() {
                super.sound();//이 코드 같은 경우 부모 클래스의 메서드 실행해라 라는 의미 (super 함수 기억)
                System.out.println("야옹!");
            }
        }   
    }