public class P3_10 {
    public static void main(String[] args) {
        char ch = 'A';
        //대문자 65~90, 소문자 97~122
        char lowerCase = (ch >= 65 && ch <= 90) ? (char) (ch + 32) : ch;
        //+32를 하면 대문자에서 소문자로 변환, 삼항연산자

                System.out.println("ch:" + ch);
                System.out.println("ch to lowerCase:" +lowerCase);
    }
}
