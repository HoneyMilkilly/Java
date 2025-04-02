public class P4_5 {
    public static void main(String[] args) {

        int j = 0;
        int i = 0;
        while (i <= 10)//11회 반복 (0~10까지 총 11회)
        {
            while (j <= i)
            {
                System.out.print("*");//별찍기
                j++;
            }
            System.out.println();
            i++;
            j = 0;//속의 while문 나오고 겉의 while문으로 나오면 j를 0으로 초기화 해줘야 됨!
        }
        }
    }