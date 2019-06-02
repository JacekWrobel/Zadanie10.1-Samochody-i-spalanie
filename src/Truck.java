public class Truck extends Car {
    private double loadWeight;


    public Truck(String name, double fuelCap, double fuelConsumption, boolean airCondiOffOn, double loadWeight) {
        super(name, fuelCap, fuelConsumption, airCondiOffOn);
        this.loadWeight = loadWeight;
    }

    public Truck() {
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + loadWeight + "\t";
    }

    public void loadTruck(double kg) {
        loadWeight += kg;
        setFuelConsumption(getFuelConsumption() + ((kg / 100) * 0.5));
    }

    @Override
    public void airCondiOn() {
        airCondiOffOn = true;
        setFuelConsumption(getFuelConsumption() + 1.6);
    }
/*
    @Override
    public double range() {
        if (airCondiOffOn == true) {
            setFuelConsumption(getFuelConsumption()+0.8);
        }
        if (loadWeight>0){
            setFuelConsumption(getFuelConsumption()+(loadWeight/100*0.5));
        }
        return super.range();
    }
*/
}

