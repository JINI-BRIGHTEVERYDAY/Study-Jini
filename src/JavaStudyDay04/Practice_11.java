package JavaStudyDay04;

public class Practice_11 {
    public static void main(String[] args) {
        String[] name = {"홍길동", "홍길순", "이몽룡", "변학도", "성춘향"};
        int[][] score = {{70,80,90},{88,77,90},{100,90,80},{60,60,60},{100,90,70}}; //점수
        int[] total = new int[5]; //각각의 총점
        double[] avg = new double[5]; //각각의 평균
        int max = 0; //최고점수
        int min = 999; // 최저점수


        for(int i = 0; i < name.length; i++) {
            int sum = 0;
            for(int j = 0; j < score.length[i].length; j++) {
                sum += score[i][j]; //총점을 구하기

            }
            total[i] = sum; //구한 총점을 각 배열에 담기
            avg[i] = (double)total[i] / score[i].length; // 평균

            if(max < total[i]) max = total[i];
            if(min < total[i]) min = total[i];

        }


        System.out.println("#########################################");
        System.out.println("이름     국어       영어     수학      평균");
        System.out.println("-------------------------------------------");
        for (int = 0; i < name.length; i++) {
            System.out.println("%s %d %d %d %d %5.2f", name[i], score[i][0], score[i][1], score[i][2]), total[i], avg[i]);
            // System.out.println();

        }

        System.out.printf("최고점수 %d, 최저점수 %d", max, min);

    }
}
