package WithoutStrategyPattern;

public class OffRoadVehicle extends Vehicle{
    @Override
    public void drive()
    {
        System.out.println("Sports Drive capability"); // Code Duplicate with sports drive startegy
    }
}
