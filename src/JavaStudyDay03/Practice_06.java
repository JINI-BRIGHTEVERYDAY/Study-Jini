package JavaStudyDay03;

import java.util.Scanner;

public class Practice_06 {
    // 10개의 정수를 받아서 (Scanner)
    // 3의 배수의 개수, 5의 배수의 개수를 printf를 이용하여 출력한다
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, c1 = 0, c2 = 0;
        for (int i = 1; i <= 10; i++) {
            n = scanner.nextInt();
            if(n % 3 == 0) c1++; // c1= c1+1
            if(n % 5 == 0) c2++; // c2= c2+1

        }
        System.out.printf("3의 배수: %d, 5의 배수 : %d" ,c1,c2);
    }
}
