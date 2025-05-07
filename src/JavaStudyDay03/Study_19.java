package JavaStudyDay03;
// 루프제어문
// 1. break문
// 2. 라벨 break문
// 3. continue문

public class Study_19 {
    public static void main(String[] args) {
        int i = 0;
        while(true) {
            i++;
            if (i == 100) break;
            System.out.println("숫자 = " + i);
        }

        ep:
        while(true) {
            for(int j = 0, j < 100; j++) {
                if(i == 70) break ep;
                System.out.println("숫자 = " + j);
                // 에러?

                 // -> 다시 공부하기
            }
        }

        for (int k = 1; k < 100; k++) {
            if (k % 2 == 0) continue;
            System.out.println(k);
        }
    }
}
