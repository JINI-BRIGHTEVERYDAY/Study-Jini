package JavaStudyDay03;

public class Gugudan1 {
    public static void main(String[] args) {

        // 포맷
        // %d : 정수 - 자릿수 %2d, 정렬 %2d(우측정렬) : %-2d(좌측정렬), 공백채움 %02d
        // %f : 실수 - 자릿수 %5.2f
        // %c : 문자
        // %s : 문자열


        for(int i = 2; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                //System.out.println();
                //System.out.println(i + " * " + j + " = " + (i * j) + " ");
                System.out.printf("%d * %d = %2d  ", i, j, (i * j));
                //System.out.printf("%d * %d = %d\t", i, j, (i * j)); => 비교분석하기
            }
            System.out.println();
        }
        System.out.println("-------------------------------------");
        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.printf("%d * %d = %2d  ", j, i, (i * j));
            }
            System.out.println();
        }
    }
}

