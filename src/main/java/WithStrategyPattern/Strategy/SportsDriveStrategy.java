package WithStrategyPattern.Strategy;

public class SportsDriveStrategy implements DriveStrategy{
    @Override
    public void Drive() {
        System.out.print("Sports Strategy used by this vehicle");
    }
}
