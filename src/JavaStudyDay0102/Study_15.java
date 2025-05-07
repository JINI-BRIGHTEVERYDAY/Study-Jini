package JavaStudyDay0102;

public class Study_15 {
    public static void main(String[] args) {
        // 전위, 후위 증감 연산자//

        int i = 0;
        System.out.println("첫번째 : " + i++ *2);
        System.out.println("두번째 : " + i);

        i = 0;
        System.out.println("첫번째 : " + ++i * 2);
        System.out.println("두번째 : " + i);

        i = 10;
        System.out.println("첫번째 : " + (++i * 10));
        System.out.println("두번째 : " + (i-- * 5));
        System.out.println("세번째 : " + (--i * 2));
        System.out.println("네번째 : " + (++i * 4));

    }
}
