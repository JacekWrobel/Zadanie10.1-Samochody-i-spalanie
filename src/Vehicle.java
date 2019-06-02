public class Vehicle {
    private String name;
    private double fuelCap;
    private double fuelConsumption;

    public Vehicle(String name, double fuelCap, double fuelConsumption) {
        this.name = name;
        this.fuelCap = fuelCap;
        this.fuelConsumption = fuelConsumption;
    }

    public Vehicle() {
    }

    public String getName() {
        return name;
    }

    public double getFuelCap() {
        return fuelCap;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFuelCap(double fuelCap) {
        this.fuelCap = fuelCap;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String printInfo(){
        return name + "\t" +fuelCap + "\t" + fuelConsumption + "\t";
    }

    public double range (){
    return fuelCap/fuelConsumption *100;
    }
}