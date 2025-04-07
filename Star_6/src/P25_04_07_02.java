public class P25_04_07_02 {
    public static void main(String[] args) {
        String str = "ABCDE";
        char ch = str.charAt(4);//String 배열의 4번째 칸 E를 문자열 변수 ch에 저장!
        String str2 = str.substring(1,4);//
        String str3 = str.substring(1);
        String str4 = str.substring(1, str.length());
        String str5 = "Apple";
        String str6 = "APPle";
        char[] arr = str5.toCharArray();

        System.out.println(str);//str 문자열 변수(객체)를 출력함
        System.out.println(ch); //ch 문자형 변수를 출력함
        System.out.println(str2); //인덱스 1번 ~ 3번까지 출력함
        System.out.println(str3); //인덱스 1번부터 끝까지 쫙 출력함
        System.out.println(str4); //인덱스 1번부터 str.length()함수를 사용해 str 인덱스 크기까지 출력함
        System.out.println(str5.equals(str6));
        System.out.println(arr);
        System.out.println(arr[1]);

        }
    }