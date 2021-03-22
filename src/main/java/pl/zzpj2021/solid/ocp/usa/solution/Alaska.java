package pl.zzpj2021.solid.ocp.usa.solution;

public class Alaska implements USAState {

    private static final int maxSpeed = 80;

    @Override
    public double calculateSpeedLimitFine(int speed) {
        if (speed > maxSpeed) {
            // make calculations
            return 100; //example
        }
        return 0;
    }
}
