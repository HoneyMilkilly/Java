import java.util.Scanner;
public class test {
    public static void main(String[] args)  {
        var result = 0;
        var result2 = 0;
        Scanner scan = new Scanner(System.in);
        for (var i = 0; i < 500; i++) //for문을 이용해서 1~500까지 전부 더하기
        {
            result += i;
        }
        result += 1;
        System.out.println(result);
        var inp = scan.nextInt();
        for (var i = 1; i <= inp; i++) //for문을 이용해서 1부터 사용자가 말한 부분까지 더하기
        {
            result2 += i;
        }
        System.out.println(result2);

        }   
    }