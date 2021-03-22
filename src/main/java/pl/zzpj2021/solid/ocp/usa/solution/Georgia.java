package pl.zzpj2021.solid.ocp.usa.solution;

public class Georgia implements USAState {

    private static final int maxSpeed = 95;

    @Override
    public double calculateSpeedLimitFine(int speed) {
        if (speed > maxSpeed) {
            // make calculations
            return 120; //example
        }
        return 0;
    }
}
