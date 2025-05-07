package JavaStudyDay03;

public class Practice_02 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while(i <= 10) {
            i++;
            //sum = sum + i;
            sum += i;

            //i++; 정답이 달라지게 된다, 그러므로 주의해야 함 -> 결과치 잘보고 판단할 것
        }
        System.out.println(sum);
    }
}
