public class test {
    public static void main(String[] args) {
        final int num = 15;
        final long num2 = 1000L;//리터럴(상수)에 long 타입 같은 경우 접미사 L 혹은 l을 붙인다.
        final double sum = 0.55;
        final float sum2 = 0.555555f;//리터럴(상수)에 float 타입 같은 경우 접미사 F 혹은 f를 붙인다.
        final String s = "cookie"; //긴 문자 같은 경우 쌍따옴표로 저장하고자 하는 문자를 감싸준다.
        final char ch = 's';//짧은 문자 같은 경우 따옴표로 저장하고자 하는 문자를 감싸준다.
        final boolean a = true; 
        System.out.println("정수형 리터럴 출력");
        System.out.println(num);
        System.out.println(num2);
        System.out.println("실수형 리터럴 출력");
        System.out.println(sum);
        System.out.println(sum2);
        System.out.println("문자형 리터럴 출력");
        System.out.println(s);
        System.out.println(ch);
        System.out.println("불린형 리터럴 출력");
        System.out.println(a);
        System.out.println("문자열+문자열 결과");
        System.out.println(ch + s);//추가적으로 프린트문 안에 문자열과 문자열을 합치면 합쳐진 결과가 출력된다.
    }
}
