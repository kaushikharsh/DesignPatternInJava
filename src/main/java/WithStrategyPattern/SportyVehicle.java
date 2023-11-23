package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;
import WithStrategyPattern.Strategy.SportsDriveStrategy;

public class SportyVehicle extends Vehicle{

    public SportyVehicle() {
        super(new SportsDriveStrategy());
    }
}
