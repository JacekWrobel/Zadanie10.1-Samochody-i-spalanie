public class Test {
    public static void main(String[] args) {


        Car[] vehicles = new Car[6];
        vehicles[0] = new Car("Nissan", 50, 10, false);
        vehicles[1] = new Car("Opel", 50, 10, false);
        vehicles[2] = new Truck("Scania", 500, 20, false, 0);
        vehicles[3] = new Truck("Tatra", 500, 20, false, 0);
        vehicles[4] = new Truck("Volvo", 500, 20, false, 0);
        vehicles[5] = new Truck("Jelcz", 500, 20, false, 0);


        for (Vehicle vehicle : vehicles) {
            System.out.print(vehicle.printInfo());
            System.out.println(vehicle.range());
        }

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].airCondiOn();
        }

        for (Vehicle vehicle : vehicles) {
            System.out.print(vehicle.printInfo());
            System.out.println(vehicle.range());
        }

        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] instanceof Truck){
                ((Truck)vehicles[i]).loadTruck(1000.0);
            }
        }

        for (Vehicle vehicle : vehicles) {
            System.out.print(vehicle.printInfo());
            System.out.println(vehicle.range());
        }

/*
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] instanceof Truck){
                ((Truck)vehicles[i]).setLoadWeight(1000);
            }
        }

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].setAirCondiOffOn(true);
        }
*/
    }
}
