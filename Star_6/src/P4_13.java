public class P4_13 {
    public static void main(String[] args) {
        String value = "12o34";
        char ch = ' ';
        boolean isNumber = true;

        for (int i = 0; i < value.length(); i++)//5회 반복함
        {
            ch = value.charAt(i);//ch라는 문자열 변수에 value 문자열 변수의 i번째 칸의 값을 저장
            if (ch >= 48 == ch <= 57);//숫자 0~9까지의 유니코드 값은 48 ~ 57임
            {
                isNumber = false;//ch의 유니코드 값이 48~57 범위라면 isNumber에 false 저장함
            }
        }
        if (isNumber) {//isNumber가 트루일때
            System.out.println(value + "는 숫자입니다.");
        }else {
            System.out.println(value +"는 숫자가 아닙니다.");
        }
    }
}