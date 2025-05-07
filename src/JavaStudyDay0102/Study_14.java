package JavaStudyDay0102;

public class Study_14 {
    public static void main(String[] args) {
        // 배정 대입
        int a = 10, b = 0;

        // =
        b = a;
        System.out.println(b);

        // +=
        b += 1;
        System.out.println(b);

        // -=
        b -= 1;
        System.out.println(b);

        int x = 10, y = 0;
        y = x += ++y;
        System.out.println(x);
        System.out.println(y);

    }
}
