public class P4_12 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++)//구구단에서 앞의 1~9를 의미함
        {
            for (int j = 1; j <= 3; j++)//구구단에서 뒤의 1~3까지를 의미함
            {
                System.out.println(i + "*" + j + "=" + i*j);
            }
        }
    }
}
