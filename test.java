public class test {
    public static void main(String[] args)  {
                
                byte count1 = 127; //정수형 변수, 1byte의 크기 저장
                short count2 = 32767; //정수형 변수, 2byte의 크기 저장
                int count3 = 2147483647; //정수형 변수, 4byte의 크기 저장
                long count4 = 23372036854775807L; // 정수형 변수, 8byte의 크기 저장, long타입을 쓸때엔 뒤에 L혹은 l이란 접미사 붙여야 됨
                
                float num1 = 3.7777777f; // 실수형 변수, 4byte의 크기 저장, 소수점이하 6~7자리까지, F 혹은 f 접미사를 붙여야 됨
                double num2 = 5.2777777777777777; // 실수형 변수, 8byte의 크기 저장 소수점 이하 15~16자리까지
                boolean ja = true; //boolean형 변수, true or false만 가질 수 있다
                boolean va = false; //0이나 1 숫자는 저장 불가함 (비교연산자 및 논리연산자랑 자주 사용)
                //여기까지 기본형 변수

                //아래는 참조형 변수
                char s = 'a';//문자형 변수 한글자만 저장 O,''을 써야 됨
                String word = "apple";//문자형 변수 다수의 글자 저장 가능, ""을 써야 됨, *참조형임*
                int num[] = {1,2,3};// 1차원 배열 (참조형 변수)
                Dog mydog = new Dog(); //mydog는 Dog 클래스의 인스턴스 (객체) (참조형 변수임)

                System.out.println("byte (기본형): " + count1);
                System.out.println("short (기본형): " + count2);
                System.out.println("int (기본형): " + count3);
                System.out.println("long (기본형): " + count4); 
                System.out.println("float (기본형): " + num1);
                System.out.println("double (기본형): " + num2);
                System.out.println("boolean (기본형): " + ja);
                System.out.println("boolean (기본형): " + va);

                System.out.println("=======================");

                System.out.println("String (참조형): " + word);
                System.out.println("char (참조형): " + s);
                System.out.println("Array (참조형): " + num[0] + num[1] + num[2]);

                System.out.println("=======================");
                
                mydog.Bark(); //Dog 클래스안의 Bark 메서드 출력
            
    }
        static class Dog{
            /*Dog라는 클래스와 그 안에 Bark라는 메서드가 들어있음 하나의 소스코드에서는 두개의 public 클래스가 존재 X
            따라서 public 빼고 static 키워드 넣음*/
            void Bark() {
                System.out.println("멍멍");
            }
        }
        }