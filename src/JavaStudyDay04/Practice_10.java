package JavaStudyDay04;

public class Practice_10 {
    public static void main(String[] args) {
        int[][] array = {{90,87},{83,92,77},{78,83,93,87,88}};
        int sum = 0;
        double avg = 0.0;

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++){
                sum += array[i][j];
                count++; //왜 에러가 뜨는 건가

            }
        }
        avg = (double)sum / count;

        System.out.println("총 : " + sum);
        System.out.println("평균  : " + avg);
    }
}
