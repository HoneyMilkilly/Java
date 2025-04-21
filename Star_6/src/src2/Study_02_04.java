package src2;

public class Study_02_04 {
    public static void main(String[] args) {
        int[] KIM = {100, 100, 100};
        int[] LEE = {20, 20, 20};
        int[] PARK = {50, 30, 30};
        int[] SONG = {40, 40, 40};
        int[] CHOI = {30, 50, 50};
        String[] subjects = {"국어", "영어", "수학"};
        String[] names = {"김", "이", "박", "송", "최"};

        int[][] scores = {KIM, LEE, PARK, SONG, CHOI}; // 2차원 배열로 저장 (여기까진 유지)

        // 점수 출력
        for (int i = 0; i < 3; i++) {
            System.out.println("김 1번 " + subjects[i] + " 점수는 " + KIM[i]);
            System.out.println("이 2번 " + subjects[i] + " 점수는 " + LEE[i]);
            System.out.println("박 3번 " + subjects[i] + " 점수는 " + PARK[i]);
            System.out.println("송 4번 " + subjects[i] + " 점수는 " + SONG[i]);
            System.out.println("최 5번 " + subjects[i] + " 점수는 " + CHOI[i]);
            System.out.println("====================");
        }

        // 평균 출력
        int result = 0;
        for (int j = 0; j < 3; j++) {
            result = (KIM[j] + LEE[j] + PARK[j] + SONG[j] + CHOI[j]) / 5;
            System.out.println(subjects[j] + "의 평균 점수는?? " + result);
        }

        //과목별 점수 정리!
        int[] kor = {KIM[0], LEE[0], PARK[0], SONG[0], CHOI[0]};
        int[] eng = {KIM[1], LEE[1], PARK[1], SONG[1], CHOI[1]};
        int[] math = {KIM[2], LEE[2], PARK[2], SONG[2], CHOI[2]};

        // 각 과목 등수 배열
        int[] korRank = new int[5];
        int[] engRank = new int[5];
        int[] mathRank = new int[5];

        // 국어 등수 계산
        for (int i = 0; i < 5; i++) {//5
            korRank[i] = 1;
            for (int j = 0; j < 5; j++) {//5
                if (kor[j] > kor[i]) {
                    korRank[i]++;
                }
            }
        }

        // 영어 등수 계산
        for (int i = 0; i < 5; i++) {
            engRank[i] = 1;
            for (int j = 0; j < 5; j++) {
                if (eng[j] > eng[i]) engRank[i]++;
            }
        }

        // 수학 등수 계산
        for (int i = 0; i < 5; i++) {
            mathRank[i] = 1;
            for (int j = 0; j < 5; j++) {
                if (math[j] > math[i]) mathRank[i]++;
            }
        }

        // 등수 출력
        System.out.println("\n=== 과목별 등수 출력 ===");

        System.out.println("[국어 등수]");
        for (int i = 0; i < 5; i++) {
            System.out.println(names[i] + " 학생: " + kor[i] + "점 → " + korRank[i] + "등");
        }

        System.out.println("\n[영어 등수]");
        for (int i = 0; i < 5; i++) {
            System.out.println(names[i] + " 학생: " + eng[i] + "점 → " + engRank[i] + "등");
        }

        System.out.println("\n[수학 등수]");
        for (int i = 0; i < 5; i++) {
            System.out.println(names[i] + " 학생: " + math[i] + "점 → " + mathRank[i] + "등");
        }
    }
}
