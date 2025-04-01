public class P3_7 {
    public static void main(String[] args) {
        int fahrenheit = 100;
        float celcius = (fahrenheit - 32) * 5F/9F + 0.00222F;//Math.round 없이 풀어야 하기에 0.00222F를 더해주면 됨
        System.out.println("fahrenheit 는 ?? " + fahrenheit);
        System.out.println("celcius 는 ?? " + celcius);
    }
}
