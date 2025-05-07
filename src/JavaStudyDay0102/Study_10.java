package JavaStudyDay0102;

public class Study_10 {
    public static void main(String[] args) {
        // 연산 (산술연산)
        // +, -, *, /, %

        int v1 = 10;
        int v2 = 20;
        int result = 0;

        result = v1 + v2;
        System.out.printf("v1 : %d + v2 : %d = %d ", v1, v2, result);

        result = v1 - v2;
        System.out.printf("v1 : %d - v2 : %d = %d\n ", v1, v2, result);

        result = v1 * v2;
        System.out.printf("v1 : %d * v2 : %d = %d\n ", v1, v2, result);

        result = v1 / v2;
        System.out.printf("v1 : %d / v2 : %d = %d\n ", v1, v2, result);

        result = v1 % v2;
       // System.out.printf("v1 : %d % v2 : %d = %d ", v1, v2, result); 에러


    }
}
