public class P25_04_01_abstract_2 {
    public static void main(String[] args) {
        Animall a = new Monkey();
        a.sound();
    }
}
abstract class Animall
{
    abstract void sound();
}
class Monkey extends Animall
{
    @Override
    void sound ()
    {
        System.out.println("멍멍");
    }
}

