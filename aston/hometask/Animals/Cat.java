package hometask.Animals;

public class Cat extends Mammal {
    @Override
    public Boolean livesInWater() {
        return false;
    }

    @Override
    public Boolean hasWool() {
        return true;
    }
}
