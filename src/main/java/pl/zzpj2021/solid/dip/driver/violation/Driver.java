package pl.zzpj2021.solid.dip.driver.violation;

public class Driver {

    private RacingCar vehicle;

    public Driver(){
        this.vehicle = new RacingCar(100);
    }

    public void increaseSpeed(){
        vehicle.accelerate();
    }
}
