package pl.zzpj2021.solid.ocp.usa.solution;

public class USASpeedLimitFiner {

    private final USAState usaState;

    public USASpeedLimitFiner(USAState usaState) {
        this.usaState = usaState;
    }

    public USAState getUsaState() {
        return usaState;
    }

    public double calculateSpeedLimitFine(int speed) {
        return this.usaState.calculateSpeedLimitFine(speed);
    }
}
