public class P3_9 {
    public static void main(String[] args) {//3-9번 문제
        char ch = 'z'; //소문자 입력
        boolean b = ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)
                || (ch >= 48 && ch <= 57)); //유니코드 대문자 65~90, 소문자 97~122, 숫자 48~57, &&(and연산자),
        // ||(or연산자) 사용
                System.out.println(b);
    }
}
