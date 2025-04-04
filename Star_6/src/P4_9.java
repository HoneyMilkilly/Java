public class P4_9 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;

        for (int i = 0; i < str.length(); i++)
        {
            sum += str.charAt(i);//문자열 1의 유니코드가 49이기 때문에 -48하면 정수 1이 된다!
            sum -= 48;
        }
        System.out.println(sum);
    }
}