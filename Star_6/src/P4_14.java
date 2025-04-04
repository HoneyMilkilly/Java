public class P4_14 {
    public static void main(String[] args) {
        int answer = (int)(Math.random() * 100) +1;//1부터 100사이의 난수를 answer 변수에 저장
        int input = 0;
        int count = 0;

        java.util.Scanner s = new java.util.Scanner(System.in);

        do {
            count++;//1회 돌때마다 카운트 변수가 1증가 됨
            System.out.print("1과 100사이의 값을 입력하세요 :");
            input = s.nextInt();//스캐너 함수를 이용해서 입력 받은 값을 input 변수에 저장
            if (input == answer)//input 값과 answer 값이 같다면 안의 내용실행
            {
                System.out.println("맞췄습니다.");
                System.out.println("시도횟수는 " + count + "번 입니다.");
                break;//프로그램 종료
            }else if (input < answer)
            {
                System.out.println("더 큰 수를 입력하세요");
            }else
            {
                System.out.println("더 작은 값을 입력하세요");
            }
        }
        while (true);//트루일때까지
        }
    }