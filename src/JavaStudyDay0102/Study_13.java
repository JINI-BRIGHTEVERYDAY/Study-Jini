package JavaStudyDay0102;

public class Study_13 {

    public static void main(String[] args) {

        //비트연산
        int x = 0xAA;
        int y = 0x0F;

        System.out.println(x & y);
        System.out.println(x | y);
        System.out.println(x ^ y);
        System.out.println(~x);

        // 논리연산
        int a = 10, b = 20;
        boolean bool = false;
        bool = a++ > b && a < ++b;
        System.out.println(bool);

        bool = a++ > b || a < ++b;
        System.out.println(bool);

        // 삼항연산
        int c = a > b ? a : b;
        System.out.println(c);

        String dayNight = "";
        int d = 0;
        dayNight = d != 0 ? "DAY" : "NIGHT";
        System.out.println(dayNight);


    }

}
