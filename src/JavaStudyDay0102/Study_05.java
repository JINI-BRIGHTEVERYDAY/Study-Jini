package JavaStudyDay0102;

public class Study_05 {
    public static void main(String[] args) {
        // 형 변환
        // byte < short < int < long < float < double
        //

        // int * long = long
        // int * float = float
        // short * int = int
        // long * float = float
        // double * float = double

        int a = 1;
        long b = 2L;
        //int result = a * b; (int a = 1; long b = 2L로 반영하면 에러)
        long result = a * b;
        System.out.println("result = " + result);

        int _a = 100;
        long _b = _a;

        float _c = 54.32F;
        double _d = _c;

        long $a = 2000;
        //int $b = $a; 에러
        // int $b = _a; 정상출력됨


        //숫자끼리의 형변환
        int $b = (int)$a;

        long $c = 99999999999999L;
        // long $c = 999999999999999999L; (자릿수 너무 많이 차지하면 에러)

        int $d = (int) $c;
        System.out.println("변환 전 = " + $c + "변환 후 = " + $d );

        double $f = 12.34;
        int $g = (int) $f;
        System.out.println("변환 전 = " + $f + "변환 후 = " + $g);

        //문자열형 -> 숫자형
        int i = 20221022;
        String s = "20221022";

        int j = Integer.parseInt(s);
        long k = Long.parseLong(s);
        float x = Float.parseFloat(s);
        double y = Double.parseDouble(s);

        //숫자 -> 문자열형
        String z = String.valueOf(i);
        //String zz = (String) i;
        //String zz = s.toString();





    }
}
