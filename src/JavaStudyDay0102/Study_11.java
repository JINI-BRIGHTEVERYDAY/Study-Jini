package JavaStudyDay0102;

// 연산자
// 1. 최우선 연산자: ., [], ()
// 2. 단항 연산자: +, -, !(논리부정), ~(비트NOT), ++(전위증가), --(전위감소), (cast)
// 3. 산술 연산자: +, -, *, /, %
// 4. 시프트 연산자: <<, >>, >>
// 5. 관계 연산자: >, <, >=,<=, ==, !=
// 6. 비트 연산자: &(AND), |(OR), ^(XOR), ~(NOT)
// 7. 논리 연산자: &&(AND), ||(OR)
// 8. 삼형 연산자: 조건 ? 1 : 2
// 9. 배정 대입 연산자 : =, +=, -=, *=, /=, <<=, >>=, &=, ^=, |=
// 10. 후위형 증감 연산자 : ++(후위증가), --(후위감소)
// 11. 순차연산자:  ,

public class Study_11 {
    public static void main(String[] args) {
        // 최우선 연산자
        System.out.println("JAVA");
        // 추가로 나오는 코드도 강의에서 살펴보기

        // []
        String[] alpabet = {"A", "B", "C", "D"};
        System.out.println("3번째 알파벳 = " + alpabet[2]);

        //()
        int a = 5 * 4 * 3;
        int b = 5 * (4 + 3);
        System.out.println(a);
        System.out.println(b);

        // 논리부정
        boolean bool = false;
        System.out.println(bool);
        System.out.println(!bool);

        // 비트부정
        int c = 10;
        System.out.println(c);
        System.out.println(~c);

        // ++/--(전위형)
        int d = 5;
        System.out.println(d);
        System.out.println(++d);
        System.out.println(--d);

        // 산술연산
        int i = 30, j = 20, result = 0;
        result = i + j;
        System.out.println(result);
        result = i - j;
        System.out.println(result);
        result = i * j;
        System.out.println(result);
        result = i / j;
        System.out.println(result);
        result = i % j;
        System.out.println(result);

    }
}


