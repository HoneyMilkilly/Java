import java.util.Random;
public class P4_7 {
    public static void main(String[] args) {
        Random ran = new Random();
        int value = ran.nextInt(6)+1;//안에 6을 넣으면 0~5까지 6개의 값에서 랜덤값 출력! 따라서 +1 해주기
        System.out.println("value: " + value);
    }
}
