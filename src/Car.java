public class Car extends Vehicle {
    boolean airCondiOffOn;

    public Car(String name, double fuelCap, double fuelConsumption, boolean airCondiOffOn) {
        super(name, fuelCap, fuelConsumption);
        this.airCondiOffOn = airCondiOffOn;
    }

    public Car() {
    }

    public boolean isAirCondiOffOn() {
        return airCondiOffOn;
    }

    public void setAirCondiOffOn(boolean airCondiOffOn) {
        this.airCondiOffOn = airCondiOffOn;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + airCondiOffOn + "\t";
    }

    @Override
    public double range() {
        if (airCondiOffOn) {
            return (getFuelCap() / (getFuelConsumption() + 0.8)) * 100;
        }
        return super.range();
    }

    /*
    public void airCondiOn () {
        airCondiOffOn = true;
        setFuelConsumption(getFuelConsumption() + 0.8);
        }
*/
}

