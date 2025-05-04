package JavaStudy;

import java.util.Scanner;

public class Study_09 {
    public static void main(String[] args) {
        String name = "";
        int kor = 0;
        int eng = 0;
        int math = 0;
        int sum = 0;
        float avg = 0.0F;


        // scanner

        // 문자 = .nextLine();
        // 숫자 = .nextInt();

        Scanner scanner = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("이름 입력");
        name = scanner.nextLine();

        System.out.println("국어점수");
        kor = scanner.nextInt();
        System.out.println("영어점수");
        eng = scanner.nextInt();
        System.out.println("수학점수");
        math = scanner.nextInt();

        sum = kor + eng + math;
        avg = sum / 3;
        System.out.println("-------------------------------");
        System.out.printf("이름: %s 국어= %d 영어= %d 수학= %d 총점= %d 평균= %f", name, kor, eng, math, sum, avg);
        System.out.println();
        System.out.printf("이름: %s 국어= %d 영어= %d 수학= %d 총점= %d 평균= %3.2f", name, kor, eng, math, sum, avg);

        scanner.close();
    }
}
