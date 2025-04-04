public class P5_4 {
    public static void main(String[] args) {
        int [][] arr = {
                {5,5,5,5}, {10,10,10,10,10}, {20,20,20,20,20}, {30,30,30,30,30}
        };
        int total = 0;
        float average = 0f;

        for (int i = 0; i < 4; i++)
        {
        for (int j = 0; j < arr[i].length; j++)//2차원 배열의 1~3까지는 전부 5칸이지만, 0번째 같은 경우는 4칸임
        {
            total += arr[i][j];//모든 배열의 데이터를 total에다가 저장
        }
        }
        average = total / 19; //모든 배열의 데이터의 평균을 average에다가 정리
        System.out.println("total="+total);
        System.out.println("average="+average);
    }
}