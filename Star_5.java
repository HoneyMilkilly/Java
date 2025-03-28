import java.util.Scanner;

public class Star_5{
    public static void main(String[] args)
    {
        for (int i = 0; i < 5; i++)//1번 줄바꿈을 5회 반복
        {
            for (int j = 0; j < i+1; j++)//j=0이고 j가 i+1보다 1작을때까지 반복
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}