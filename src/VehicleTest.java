public class VehicleTest {
    public static void main(String[] args) {
        Vehicle[] vehicle = new Vehicle[6];
        vehicle[0] = new Car("Audi", 40, 10, false);
        vehicle[1] = new Truck("Scania", 150, 30, false, 100);
        vehicle[2] = new Car("BMW", 60, 15, false);
        vehicle[4] = new Truck("Volvo", 120, 40, false, 600);

        for (int i = 0; i < vehicle.length; i++) {
            if (vehicle[i] != null)
                vehicle[i].showInfo();
        }
        for (int i = 0; i < vehicle.length; i++) {
            if (vehicle[i] != null) {
                ((Car) vehicle[i]).setAirConditioning(true);
                vehicle[i].showInfo();
            }

        }
    }
}
