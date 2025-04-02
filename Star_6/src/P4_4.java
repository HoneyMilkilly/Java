public class P4_4 {
    public static void main(String[] args) {
        int num = 0; //더할 숫자 (0부터 시작해서 1씩 증가함)
        int num2 = 1; //누적을 함

        while (num2 < 100)//총 99번 반복함
        {
                if (num % 2 == 0) //num을 2로 나눴을때 나머지값이 0이면 안의 코드 실행 (짝수일때)
                {
                    num2 -= num; //num2 = num2 - num;
                } else {
                    num2 += num; //num2 = num2 + num;
                }
                num ++; //후위증감연산 num에 +1
        }
        System.out.println(num);
    }
}
