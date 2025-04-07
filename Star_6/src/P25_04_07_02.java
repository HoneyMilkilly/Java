public class P25_04_07_02 {
    public static void main(String[] args) {
        Loop1 : for (int i = 1; i <= 9; i++){
           Loop2: for (int j = 1; j <= 10; j++){
                    System.out.println(i + "*" + j + "=" + i*j);
                    if (i == 4 && j == 10){//구구단을 4단까지만 출력하고 빠져나옴!
                        break Loop1;
                    }
            }
            System.out.println(i);
        }
    }
}