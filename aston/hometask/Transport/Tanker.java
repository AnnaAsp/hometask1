package hometask.Transport;

public class Tanker implements Transport {
    @Override
    public Boolean hasWheels() {
        return false;
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
