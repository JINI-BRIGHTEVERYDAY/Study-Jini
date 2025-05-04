package JavaStudy;

public class Study_01 {
    public static void main(String[] args) {
       // 변수
       // 앞자리 자료형 뒷자리에 문자 (영문자, 숫자, 특수문자($,_)-숫자가 맨 앞에 와서는 안된다)

        // 자료형
        // 정수형(long, int, short, byte)
        // 실수형(double, float)
        // 문자형(Char)
        // 문자열형(String)
        // 논리형(boolean)

        // 정수형
        // long - 8 byte
        // int - 4 byte
        // short - 2 byte
        // byte - 1 byte

        long _a = 1234567890;
        int _b = 1234567890;
        short _c = 32767;
        byte _d = 127;

        System.out.println(_a);
        System.out.println(_b);
        System.out.println(_c);
        System.out.println(_d);

        _a = -999999999999999999L;
        _b = -2147483648;
        _c = -32768;
        _d = - 128;

        System.out.println("=====================");
        System.out.println(_a);
        System.out.println(_b);
        System.out.println(_c);
        System.out.println(_d);
    }
}
