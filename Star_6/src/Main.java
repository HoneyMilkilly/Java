//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Animal t = new Cat();//업 캐스팅, 인스턴스화
        t.sound();//a객체가 참조하는 클래스의 메서드 sound 실행

        if (t instanceof Cat)//다운캐스팅
        {
            System.out.println("t는 Cat의 인스턴스입니다.");
            Cat realCat = (Cat) t;
            realCat.sound();
        }else{
            System.out.println("t는 Cat이 아닙니다");
        }

        // 오버로딩 (한 클래스안에 동일한 이름의 메서드가 여러개 있지만, 개수, 타입,순서가 다름
        int ta = 10;
        double ts = 1.2;
        String tl = "콩이";
        Dog b = new Dog();//인스턴스화 b라는 참조변수가 new Dog라는 인스턴스의 주소값을 저장함 (참조)
        b.info(ta);//오버로딩과정을 통해 데이터가 알아서 매칭 됨 ta변수는 Dog 클래스의 첫번째 info 메서드의 i변수랑 매칭 됨
        b.info(ts);//오버로딩과정을 통해 데이터가 알아서 매칭 됨 ts변수는 Dog 클래스의 세번째 info 메서드의 a변수랑 매칭 됨
        b.info(tl);//오버로딩과정을 통해 데이터가 알아서 매칭 됨 tl변수는 Dog 클래스의 첫번째 info 메서드의 s변수랑 매칭 됨

        }
    }
class Animal {//클래스 선언에는 소괄호 X, 메서드에 소괄호 O, 클래스에서 C는 소문자로 써야 됨
    void sound (){
        System.out.println("켁켁");
    }

}
class Cat extends Animal {
    @Override //오버라이드 과정을 거친다면 써주는게 좋다. (에너테이션이라 함)
    void sound() {
        System.out.println("냐옹 냐옹");
    }
}

class Dog {
    void info (int i) {
        System.out.println("강아지의 나이는 ? " + i + "살 입니다.");
    }
    void info (String s) {
        System.out.println("강아지의 이름은 ? " + s + " 입니다.");
    }
    void info (double a) {
        System.out.println("강아지의 시력은 ? " + a + " 입니다.");
    }
}