public class P4_6 {
    public static void main(String[] args) {

            for (int i = 1; i <= 6; i++) {//6회 실행
                for (int j = 1; j <= 6; j++) {//6회 실행
                    if (i + j == 6) {//i+j 의 결과가 6이라면 출력을 해줌 (i+j) 이런식으로!
                        System.out.println("(" + i + ", " + j + ")");
                    }
                }
            }

        }
    }