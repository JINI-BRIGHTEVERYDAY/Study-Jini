package JavaStudyDay0102;

import java.util.Scanner;

public class Practice_01 {
    public static void main(String[] args) {
        // 이름, 국어, 영어, 수학, 총점, 평균, 학점(switch)

        String name = "", hak = " ";
        int kor = 0, eng = 0, math = 0, sum = 0;
        float avg = 0.0F;

    try {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=========================");

        System.out.println("이름");
        name = scanner.nextLine();
        System.out.println("국어");
        kor = scanner.nextInt();
        System.out.println("영어");
        eng = scanner.nextInt();
        System.out.println("수학");
        math = scanner.nextInt();

        sum = kor + eng + math;
        avg = sum / 3;
        //avg = (float)sum / 3; 비교분석

        // if문
        if (avg >= 90) {
            hak = "A";
        } else if (avg >= 80) {
            hak = "B";
        } else if (avg >= 70) {
            hak = "C";
        } else if (avg >= 60) {
            hak = "D";
        } else hak = "F";

        // switch문
        switch((int)avg/10) {
            case 10:
            case 9:
                hak = "A";
                break;
            case 8:
                hak = "B";
                break;
            case 7:
                hak = "C";
                break;
            case 6:
                hak = "D";
                break;
            default:
                hak = "F";
        }

        System.out.println("------------------------------");
        System.out.printf("이름: %s, 국어 : %d, 영어 : %d, 수학 : %d, 총점 : %d, 평균 : %.2f, 학점 : %s", name, kor, eng, math, sum, avg, hak);
        scanner.close();

    }catch(Exception e) {}

    }
}
