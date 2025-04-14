package src2;

public class P25_04_14_01 {
    public static void main(String[] args) {
        King myCar = new King("Strong");// 기존의 인스턴스화 과정과 다르게 소괄호 안에 클래스 Car안의 매개변수 안에 넣을 데이터를 집어넣으면, color안에 데이터를 저장함
        System.out.println(myCar.color);//myCar라는 참조변수가 가리키는 주소값의 color 변수값을 출력함
    }

}
class King {
    String color;
    King(String a) {//생성자이고 메서드가 아님, 반환 타입도 안 적혀있고, 클래스 이름과 같고, new로 객체 생성시 자동 호출 됨
        color = a;//color에 데이터 c를 저장하는게 아닌 메인 메서드의 5번 코드의 소괄호와 매칭돼서 Red라는 데이터가 c에 들어오게 됨
        System.out.println("생성자 호출됨!");
    }
}