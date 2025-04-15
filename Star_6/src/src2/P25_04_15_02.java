package src2;

public class P25_04_15_02 {
    public static void main(String[] args) {
    Person p1 = new Person();//인스턴스화 과정
    Person p2 = new Person("승현", 25);//인스턴스화 과정 및 this.name과 this.age와 주소값을 참조하고 있다.
    p1.introduce();//참조변수 p1의 메서드를 호출
    p2.introduce();//참조변수 p2의 메서드를 호출
    }
}
class Person {
    String name;
    int age;
    Person(){//생성자 Person
        this("이름 없음", 0);//this.name과 this.age와 주소값을 참조하고 있다.
    }
    Person(String name, int age) {//생성자 Person
        this.name = name;//this.name의 주소값은 name
        this.age = age;//this.age의 주소값은 age
    }

    void introduce() {
        System.out.println("이름 " + name + ", 나이: " + age);
    }

}