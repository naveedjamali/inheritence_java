public class Vehicle {
    private int year;
    private String make;


    public Vehicle() {
        this.year = 0;
        this.make = "";
    }

    public Vehicle(Vehicle vehicle) {
        this.make = vehicle.make;
        this.year = vehicle.year;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setYear(int year) {
        this.year = year;
    }

    void brake(){};

    @Override
    public String toString() {
        return "year: " + year + ", make: " + make;
    }


    public boolean equals(Vehicle vehicle) {

        return vehicle.year==this.year && vehicle.make.equals(this.make);
    }
}
