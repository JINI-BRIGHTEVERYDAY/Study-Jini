package JavaStudyDay03;

public class Triangle {
    public static void main(String[] args) {
        // *
        // **
        // ***
        // ****
        // *****
        // ******

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------------------");
        //       *
        //      **
        //     ***
        //    ****
        //   *****

        for (int i = 1; i <= 5; i++) { //행
            for (int k = 1; k <= (5 - i); k++) { //공백
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) { // *출력
                System.out.print("*");
            }
            System.out.println(); //줄바꿈
        }
        System.out.println("------------------------");

        // *****
        // ****
        // ***
        // **
        // *
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------------------");
        // *****
        //  ****
        //   ***
        //    **
        //     *

        for (int i = 5; i >= 1; i--) {
            for (int k = 0; k < 5 - i; k++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------------------");
        //      *
        //     ***
        //    *****
        //   *******
        //  *********

        for(int i = 1; i <= 5; i++) {
            for(int k = 1; k <= (5 - i); k++) {
                System.out.println(" ");
                for (int j = 1; j <= (i * 2 - 1); j++) {
                    System.out.print("*");


                System.out.println();

                // *********
                //  *******
                //   *****
                //    ***
                //     *
                for (int i = 5; i >= 1; i--) {
                    for (int k = 0; k < 5 - i; k++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= (i * 2 - 1); j++ ) {
                        System.out.println("*");
                    }
                }
                }

            }

    }

}

// 코드 다시 수정해볼 것