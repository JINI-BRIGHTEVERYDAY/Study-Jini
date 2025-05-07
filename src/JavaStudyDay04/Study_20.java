package JavaStudyDay04;
// 배열 : 1차원, 2차원
//
public class Study_20 {
    public static void main(String[] args) {
        String name1 = "홍길동";
        int age1 = 300;
        String name2 = "홍길순";
        int age2 = 298;

        // 1차원 배열
        // 자료형[] 배열명;
        // 자료형 배열명[];
        // 자료형[] 배열명 = {값1, 값2, 값3...값n}
        // 자료형[] 배열명 = new 자료형 [개수];
        // 자료형[] 배열명 = new 자료형[] {값1, 값2, 값3...값n};

        char[] c = {'A', 'B', 'C'};
        for(int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        c[2] = 'D';
        for(int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

        int a[] = new int[3];
        a[0]

    }
}
