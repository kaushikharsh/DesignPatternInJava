package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy _driveStrategy; // vehicle has a drivestrategy interface

    public Vehicle(DriveStrategy driveStrategy)
    {
        _driveStrategy = driveStrategy;
    }
    public void drive()
    {
        _driveStrategy.Drive();
    }
}
