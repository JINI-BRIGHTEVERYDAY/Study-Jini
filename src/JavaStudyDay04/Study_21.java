package JavaStudyDay04;

// 다차원 배열
// 자료형 [][] 배열명;
// 자료형[] 배열명[][];

public class Study_21 {
    public static void main(String[] args) {
        // 다차원배열 초기화
        // 자료형[][] 배열명 = {[{값1,값2},{값3,값4},{값5,값6}};
        // 자료형[][] 배열명 = new 자료형[개수][개수];
        // 자료형[][] 배열명 = new 자료형[개수][];
        // 자료형[][] 배열명 = new 자료형[][]{{값1,값2},{값3,값4},{값5,값6}};


        int[][] age = {{1,20},{2,30},{3,40}};
        //length : 배열수 수
        for(int i = 0; i < age.length; i++) {
            System.out.print(age[i][0] + " : ");
            System.out.println(age[i][1]);
        }

        age = new int[][] {{4,50},{5,60},{6,70}};
        for(int i = 0; i < age.length; i++) {
            System.out.print(age[i][0] + " : ");
            System.out.println(age[i][1]);
        }

        age = new int[3][2];
        age[0][0] = 7; age[0][1] = 71;
        age[1][0] = 8; age[1][1] = 81;
        age[2][0] = 9; age[2][1] = 91;
        for(int i = 0; i < age.length; i++) {
            for(int j = 0; j <age[i].length; j++) {
                //age[i].length 에서 [i]는 행번호, length는 열
                System.out.println(age[i][j]);
            }
        }
        age = new int[3][];
        age[0] = new int[2];
        age[1] = new int[3];
        age[2] = new int[4];

        age[0][0] = 100; age[0][1] = 101;
        age[1][0] = 200; age[1][1] = 201; age[1][2] = 202;
        age[2][0] = 300; age[2][1] = 301; age[2][2] = 302; age [3][3] = 303;

        for(int i = 0; i < age.length; i++) {
            for(int j = 0; j < age[i].length; j++) {
                System.out.println(age[i][j]);
            }
        }
    }
}
