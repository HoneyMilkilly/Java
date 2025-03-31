import java.util.Scanner;

public class Star_1{
    public static void main(String[] args)
    {
        for (int i = 0; i < 5; i++)//1번 줄바꿈을 5회 반복
        {
            for (int j = 0; j < 5; j++)//별 찍기를 5회 반복
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}