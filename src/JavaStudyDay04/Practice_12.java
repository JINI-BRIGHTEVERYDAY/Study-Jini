package JavaStudyDay04;

import java.util.Scanner;

public class Practice_12 {
    public static void main(String[] args) {
        // 1. 학생수 | 2. 점수입력 | 3. 점수목록 | 4. 분석 | 5. 종료

        boolean run = true; //while문 반복을 위한 true/false
        int num = 0;  //학생수
        int[] score = null;

        Scanner scanner = new Scanner(System.in);

        while(run) {
            System.out.println("-------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수목록 | 4. 분석 | 5. 종료");
            System.out.println("-------------------------------------------");
            System.out.println("선택 > ");
            int select = scanner.nextInt();
            if(select == 1) { // 학생수 입력
                System.out.print("학생수 > ");
                num = scanner.nextInt();
                score = new int[num];
            }else if(select == 2) {
                if (score == null) {
                    System.out.println("학생수를 입력하세요!!! ");
                } else {
                    for (int i = 0; i < score.length; i++) {
                        System.out.print("점수 입력 > ");
                        score[i] = scanner.nextInt();
                    }
                }
            }else if(select == 3) {
                if (score == null) {
                    System.out.println("점수를 입력하세요!!");
                } else {
                    for (int i = 0; i < score.length; i++) {
                        System.out.printf("점수 %d : %d\n", (i + 1), score[i]);
                    }
                }

            }else if(select ==4) {
                if(score == null) {
                    System.out.println("점수를 입력하세요!!");
                }else{
                    int sum = 0; max = 0; min = 99999999;
                    double avg = 0.0;
                    for(int i = 0; i < score.length; i++) {
                        sum += score[i];
                        if(max < score[i]) max = score[i];
                        if(min > score[i]) min = score[i];
                    }

                    avg = (double) sum / num;

                    System.out.println("총점 : ");
                    System.out.println("평균 : ");
                    System.out.println("최댓값 : " + max);
                    System.out.println("최솟값 : " + min);
                }
            }else if(select == 5) {
                run = false;
            }
        }

        System.out.println("프로그램 종료!");
    }
}

// 에러 분석