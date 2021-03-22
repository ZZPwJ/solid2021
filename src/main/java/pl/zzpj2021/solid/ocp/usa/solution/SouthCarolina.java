package pl.zzpj2021.solid.ocp.usa.solution;

public class SouthCarolina implements USAState {

    private static final int maxSpeed = 110;

    @Override
    public double calculateSpeedLimitFine(int speed) {
        if (speed > maxSpeed) {
            // make calculations
            return 85; //example
        }
        return 0;
    }
}
