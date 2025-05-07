package JavaStudyDay03;

import java.util.Scanner;

public class Practice_08 {
    // 값을 입력받고 1부터 누적합을 구하다가 입력받은 수를 넘으면 중단하고 합을 출력하기
    public static void main(String[] args) {
        int i,n, sum = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (i = 1;;i++) {
            if (sum > n) break;
            sum += i;

        }
        //System.out.println("합계 : %d", sum); -> 에러 출력될 것
        System.out.printf("합계 : %d", sum);
    }

}