package JavaStudyDay04;

public class Car {
    public static void main(String[] args) {
        // 객체 클래스 호출
        // 클래스명 객체명 = new 클래스명();

        Vehicle vehicle = new Vehicle();
        vehicle.maker = "현대차";
        vehicle.makeDate = "2022-11-05";
        vehicle.color = "RED";
        vehicle.amount = 700000000;
        vehicle.maxSpeed = 260;
        vehicle.sale = true;

        System.out.println("제조사 : " + vehicle.maker);
    }
}
