public class P4_2 {
    public static void main(String[] args) {//1부터 20까지의 정수 중 2또는 3의 배수가 아닌 수의 총합 구하기
        int result = 0;
        for (int i = 1; i <= 20; i++)
        {
            if ((i % 2 != 0) && (i % 3 !=0))
            {
                result += i;//i 나누기 2 혹은 3을 한 나머지값이 0이 아닌 경우 result에 i의 값을 저장
            }
            System.out.println("result의 값은? " + result + " 입니다!");
        }
    }
}
