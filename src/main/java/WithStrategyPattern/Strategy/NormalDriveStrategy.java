package WithStrategyPattern.Strategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void Drive() {
        System.out.print("Normal Drive Startegy is used by this vehicle");
    }
}
