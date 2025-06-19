package hometask.Transport;

public class Helicopter implements Transport {

    @Override
    public Boolean hasWheels() {
        return true;
    }

    @Override
    public Boolean hasScrew() {
        return true;
    }

    @Override
    public Boolean hasWings() {
        return false;
    }

    @Override
    public Boolean carriesCargo() {
        return true;
    }
}
