package JavaStudyDay0102;

public class Study_12 {
    public static void main(String[] args) {
        // 시프트 연산
        int a = 5;
        System.out.println(a);
        System.out.println(a << 1);
        System.out.println(a >> 2);

        // 관계연산
        int x = 10, y = 20;
        boolean bool = false;
        bool = x > y;
        System.out.println("> = " + bool);

        bool = x >= y;
        System.out.println(">= =" + bool);

        bool = x < y;
        System.out.println("< = " + bool);

        bool = x <= y;
        System.out.println("<= =" + bool);

        bool = x == y;
        System.out.println("== =" + bool);

        bool = x != y;
        System.out.println("!= =" + bool);

        bool = !bool;
        System.out.println("bool = " + bool);

    }

}
