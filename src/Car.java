public class Car extends Vehicle {
    private int speed;

    public Car() {

    }

    public Car(Car car) {
        this.setMake(car.getMake());
        this.setYear(car.getYear());
        this.setSpeed(car.getSpeed());
    }

    public Car(String make, int year) {
        if (make == null) {
            this.setMake("");
        } else {
            this.setMake(make);
        }

        if (year < 0) {
            this.setYear(0);
        } else {
            this.setYear(year);
        }
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
            return;
        }
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate(String _maxSpeed) {
        int maxSpeed = Integer.parseInt(_maxSpeed);
        if (speed < maxSpeed) {
            speed = speed + 10; // Same as
        }

        /* check that after adding 10 in speed, speed has not crossed max speed.
         * if speed is greater than maxspeed, that make the speed equal to maxspeed*/
        if (speed > maxSpeed) {
            speed = maxSpeed;
        }
    }

    @Override
    public String toString() {
        return "Car " + super.toString() + ", current speed: " + speed;
    }

    @Override
    void brake(){
        speed-=10;
        if(speed<0){
            speed=0;
        }
    }

    public boolean equals(Car car) {
        return super.equals(car) && car.speed == this.speed;
    }
}
