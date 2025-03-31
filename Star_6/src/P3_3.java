public class P3_3 {
    public static void main(String[] args) {
        int num = 0;
        String s = (num > 0) ? "양수" : (num < 0) ? "음수" : "0";//첫번째 조건식은 : 뒤에 한개만 넣고, 그 이후는 2개를 넣음
        System.out.println(s);
        num = 10;
        String a = (num > 0) ? "양수" : (num < 0) ? "음수" : "0";//첫번째 조건식은 : 뒤에 한개만 넣고, 그 이후는 2개를 넣음
        System.out.println(a);
        num = -10;
        String b = (num > 0) ? "양수" : (num < 0) ? "음수" : "0";//첫번째 조건식은 : 뒤에 한개만 넣고, 그 이후는 2개를 넣음
        System.out.println(b);
    }
}