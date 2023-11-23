package WithStrategyPattern;

public class Main {

    public static  void main(String[] args)
    {
        Vehicle Bmw = new SportyVehicle();
        Bmw.drive();
        System.out.println();
        Vehicle truck = new GoodsVehicle();
        truck.drive();
        System.out.println();
        Vehicle Defender = new OffRoadVehicle();
        Defender.drive();
    }
}
