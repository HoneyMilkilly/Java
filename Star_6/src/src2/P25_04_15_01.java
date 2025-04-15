package src2;

public class P25_04_15_01 {
    public static void main(String[] args) {
        Dog d = new Dog("뽀삐");
        d.printName();
        System.out.println(d.name);
    }
}
class Dog { //클래스 Dog
    String name; //문자열 변수 name을 선언

    Dog(String name) { //생성자이고 문자열 변수 name의 데이터를 수정, String name은 매개변수임 외부에서 값을 전달받기 위해 임시로 선언된 변수
        this.name = name; //자기 자신을 가리키고 있기 때문에 의미가 없음
    }

    void printName() {
        System.out.println("이름은 " + name);
    }
}