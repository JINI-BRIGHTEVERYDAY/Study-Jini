package JavaStudyDay0102;

import java.io.IOException;

public class Study_08 {
    public static void main(String[] args) {


        try {
            int a = System.in.read(); // 아스키 코드 1개 값을 입력
            System.out.println(a);
            System.out.printf("ASCII %d", a);

            // %d -> 정수
            // %f -> 실수
            // %c -> 문자
            // %s -> 문자열

        }catch(IOException e){

        }
    }
}
