public class Driver {
    public static void main(String[] args) {


        if (args.length < 2) {
            System.out.println("Please enter Max Speeds of Car and Truck");
            /*Exit with 1 is assumed as Failure whereas exit with 0 is assumed as Successful termination of program.*/
            System.exit(1);
        } else {
            Car car1 = new Car();
            car1.setMake("Toyota");
            car1.setYear(2021);
            car1.setSpeed(15);

            Car car2 = new Car("Ford", 2022);
            car2.setSpeed(0);
            System.out.println(car1);
            System.out.println(car2);

            for (int i = 0; i < 10; i++) {
                car2.accelerate(args[0]);
            }

            System.out.println(car2);

            Car car3 = new Car(car1);

            if (car1.equals(car3)) {
                System.out.println("car1 is same as car3");
            } else {
                System.out.println("car1 is not same as car3");
            }

            if (car1.equals(car2)) {
                System.out.println("car1 is same as car2");
            } else {
                System.out.println("car1 is not same as car2");
            }

            car3.setSpeed(88);

            Truck truck1 = new Truck("GMC", 2022, 25);

            Truck truck2 = new Truck();
            truck2.setMake("Volvo");
            truck2.setYear(2023);
            truck2.setSpeed(0);

            System.out.println(truck1);
            System.out.println(truck2);

            for (int i = 0; i < 4; i++) {
                truck1.accelerate(args[1]);
                truck2.accelerate(args[1]);
            }

            Vehicle[] vehicle = {car1, car2, car3, truck1, truck2};

            for (int i = 0; i < vehicle.length; i++) {
                vehicle[i].brake();
                vehicle[i].brake();
                vehicle[i].brake();
            }

            for (int i = 0; i < vehicle.length; i++) {
                System.out.println(vehicle[i]);
            }

        }
    }
}
