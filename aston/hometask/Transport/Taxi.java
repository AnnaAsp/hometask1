package hometask.Transport;

public class Taxi implements Transport {

    @Override
    public Boolean hasWheels() {
        return true;
    }

    @Override
    public Boolean hasScrew() {
        return false;
    }

    @Override
    public Boolean hasWings() {
        return false;
    }

    @Override
    public Boolean carriesCargo() {
        return false;
    }
}
