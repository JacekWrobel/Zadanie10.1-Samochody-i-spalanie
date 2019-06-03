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

    @Override
    public double range() {
        double addConsumption = 0;
        if (airCondiOffOn) {
            addConsumption += 1.6;
        }
        if (loadWeight > 0) {
            addConsumption += loadWeight / 100 * 0.5;
        }
        return getFuelCap() / (getFuelConsumption() + addConsumption) * 100;
    }

    /*
    @Override
    public double range() {
        if (airCondiOffOn) {
            return (getFuelCap() / (getFuelConsumption()+1.6)) * 100;
        }else return super.range();
        if (loadWeight>0){
            return (getFuelCap()loadWeight/100*0.5));
        }
        return super.range();
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
*/
}

