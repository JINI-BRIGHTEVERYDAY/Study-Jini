package JavaStudyDay0102;

public class Study_17 {
    public static void main(String[] args) {
        // switch
        // switch(조건 또는 값) {
        //  case 값 :
        //     문장실행;
        //     break;
        //  default;
        //     문장실행;
        //     (break);
        //
        //
        //
        //
        // }

        int i = 5;
        switch(i) {
            case 1:
                System.out.println(i);
                //break;
            case 2:
                System.out.println(i);
               // break;
            case 3:
                System.out.println(i);
                //break;
            case 4:
                System.out.println(i);
                //break;
            default:
                System.out.println("모름");
                //break;
                //


                // 추가 학습 코드
        char ch = 'b';
        switch(ch) {
            case 'a':
                System.out.println("A");
                break;

            case 'b':
                System.out.println("B");

            case 'c':
                System.out.println("C");
                break;

            case 'd' :
                System.out.println("D");
                break;
            default:
                System.out.println("N/A");
                break;
        }
        String s = "E";
        switch (s) {
            case "A":
                System.out.println("A");
                break;

            case "B":
                System.out.println("B");
                break;

            case "C":
                System.out.println("C");
                break;

            case "D":
                System.out.println("D");
                break;

            default:
                System.out.println("N/A");
        }

        }
    }
}
