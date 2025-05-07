package JavaStudyDay03;

public class Practice_04 {
    public static void main(String[] args) {
        //    다이아몬드
        //        *
        //       ***
        //      *****
        //     *******
        //    *********
        //     *******
        //      *****
        //       ***
        //        *

        for (int i = 1; i <= 5; i++ ) {
            for (int k = 1; k < 5 - i; k++) {
                System.out.println(" ");
            }
            for (int j = 1; j < i * 2 - 1; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int k = 0; k < 5 - i; k++) {
                System.out.println(" ");
            }
            for (int j = 1; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
