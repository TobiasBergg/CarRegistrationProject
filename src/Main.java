public class Main {
    public static void main(String[] args) {

        GasolinCar gasCar = new GasolinCar("123", "Toyota","Aygo",5,24);
        DieselCar dieCar = new DieselCar("321", "Ford", "Fiesta", 5, 21, false);
        ElectricCar eleCar = new ElectricCar("213", "Tesla", "Model S", 5, 85, 575);

        FleetOfCars fleet = new FleetOfCars();

        fleet.addCar(gasCar);
        fleet.addCar(dieCar);
        fleet.addCar(eleCar);

        System.out.println(fleet);
    }
}