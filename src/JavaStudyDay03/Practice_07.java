package JavaStudyDay03;

import java.util.Scanner;

public class Practice_07 {

    // 입력받을 정수의 개수만큼 다시 정수를 입력받아서 총점과 평균을 구하고
    // 총점, 평균을 printf 형태로 출력하기

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int i, j, n, sum = 0;
        System.out.print("받을 수를 입력: ");
        n = scanner.nextInt();
        for(i = 1; i <= n; i++) {
            j = scanner.nextInt();
            sum += j;
        }

        System.out.printf("총점 : %d, 평균 : %.2f", sum, (double)sum/n);
    }
}
