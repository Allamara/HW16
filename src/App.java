public class App {
    public static void main(String[] args) {

        ServiceStation serviceStation = new ServiceStation();
        Truck chevrolet = new Truck("Chevrolet", 10);
        Car toyota = new Car("Toyota", 4);
        Bicycle mountainBike = new Bicycle("Rider", 2);

        serviceStation.service(chevrolet);
        serviceStation.service(toyota);
        serviceStation.service(mountainBike);

    }
}
