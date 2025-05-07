package JavaStudyDay03;

public class Practice_05 {
    public static void main(String[] args) {
        //
        // 1
        // 23
        // 456
        // 78910
        // 1112131415

        int k = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                //System.out.println("%d", k++); 에러?
                System.out.printf("%d", k++); // 정상출력?
            }
            System.out.println();
        }
    }
}
