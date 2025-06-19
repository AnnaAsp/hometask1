package hometask.Transport;

public class Airplane implements Transport{
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
        return true;
    }

    @Override
    public Boolean carriesCargo() {
        return true;
    }
}
