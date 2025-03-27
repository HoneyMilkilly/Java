import java.util.Scanner;

public class K3_25_03_27{
    public static void main(String[] args)
    {
        Myoverloading S = new Myoverloading();
        S.print (15);
        S.print ("꾸릉");
    }
}
    class Myoverloading 
    {
        void print(int num)
        {  
            System.out.println("냐옹이 나이 : " + num);
        }
        void print(String s) 
        {
            System.out.println("냐옹이 숨소리 : " + s);
        }
    }