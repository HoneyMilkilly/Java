import java.util.Arrays;

public class P25_04_09_01 {
    public static void main(String[] args) {
        int[] data = {4, 2, 7, 1};

        Arrays.sort(data); // data라는 배열에 저장된 4,2,7,1 값을 오름차순으로 정렬함!
        System.out.println("정렬: " + Arrays.toString(data));

        int[] copied = Arrays.copyOf(data, 6); // 복사 (길이 늘림)
        Arrays.fill(copied, 4, 6, 9); //9라는 값을 인덱스 4번째 값 이후로 6번째 인덱스 값까지 채워 넣는다!

        System.out.println("복사 + 채움: " + Arrays.toString(copied)); //Arrays.fill, Arrays.copyOf 두개의 메서드 사용

        System.out.println("같은가? " + Arrays.equals(data, copied)); // Arrays.equals 메서드를 사용해서 data라는 배열과 copied라는 배열 비교
        System.out.println("30의 위치: " + Arrays.binarySearch(copied, 30)); // 30이라는 값이 어디에 있는지 찾는 메서드! 없다면 실수를 출력함
        // copied의 배열 값이 현재는 1 2 4 7 9 9 이고, 체크를 하니 6번째 인덱스 값도 30이 아니기 때문에, 7번째 인덱스 값이 지정되고,7 * (-1)한 결과 출력
    }
}