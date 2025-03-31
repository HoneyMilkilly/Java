//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.math.BigInteger;
import java.util.Scanner;//백준 1271번
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();
        System.out.println("이 줄만 삭제하면 정답");
        System.out.println(a.divide(b));
        System.out.println(a.remainder(b));
    }
    }