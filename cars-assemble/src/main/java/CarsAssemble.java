public class CarsAssemble {

    private final static int CARS_PRODUCED_BY_HOUR = 221;

    public double productionRatePerHour(int speed) {

        /*
         * 1 to 4: 100% success rate
         * 5 to 8: 90% success rate
         * 9: 80% success rate
         * 10: 77% success rate
         */

        // No need to check the ratio with success rate, always 100%
        if (speed <= 4) return speed * CARS_PRODUCED_BY_HOUR * 1.0;
        else if (speed >= 5 && speed <= 8) return CARS_PRODUCED_BY_HOUR * speed * 0.9;
        else if (speed == 9) return CARS_PRODUCED_BY_HOUR * speed * 0.8;
        else return CARS_PRODUCED_BY_HOUR * speed * 0.77;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)productionRatePerHour(speed) / 60;
    }
}
