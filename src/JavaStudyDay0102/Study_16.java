package JavaStudyDay0102;

public class Study_16 {
    // 제어문
    // 1. 조건문
    // 2. 반복문
    public static void main(String[] args) {
        // 조건문
        // 1. if문
        // 2. switch문
        //

        // if (조건) 문장실행;
        // if (조건) {문장실행; 문장실행; ... n}
        // if (조건) {문장실행;}else if(조건){문장실행}
        // if (조건) {문장실행;}else if(조건){문장실행}else{문장실행}
        // if (조건) {
        //   if(조건){}
        // }

        int total = 90;
        if (total >= 90) System.out.println("합격");
        if (total >= 90) {
            System.out.println("A학점");
            System.out.println("장학생");
        }
        if (total >= 70) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }

        if (total >= 90) {
            System.out.println("A");

        } else if (total >= 80) {
            System.out.println("B");
        } else if (total >= 70) {
            System.out.println("C");
        } else if (total >= 60) {
            System.out.println("D");
        } else System.out.println("F");
    }
}
