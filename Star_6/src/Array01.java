public class Array01 {
    public static void main(String[] args) {//남궁성 선생님 다차원 배열 문제 1
        int arr [] = {1,2,3};
        int arr2 [] = {1,3,2};
        int s = 0;
        int b = 0;
        for (int i = 0; i < 3; i++)
        {
            if (arr[i] == arr2[i])
            {
                s++;
            }else
            {
                b++;
            }
        }
        System.out.println("숫자와 위치 둘 다 동일한 개수: " + s);
        System.out.println("숫자와 위치 둘 다 동일하지 않은 개수 " + b);
    }
}
