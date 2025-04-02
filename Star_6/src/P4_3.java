public class P4_3 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i <= 10; i++)//i가 1로 초기화(지역변수), i는 1부터 10까지 10회 반복, i++ 후위증감연산을 통해 +1
        {
            for (int j = 1; j <= i; j++)
                //j가 1로 초기화(지역변수), 1회차 반복에서 1을 result += 1함, j++로 후위증감연산, 총 10회 수행
            {
                result += j;
                System.out.println(result);
            }
        }

    }
}
