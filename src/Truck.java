public class Truck extends Vehicle {
    private int speed;

    Truck(String make, int year, int speed) {
        this.setMake(make);
        this.setYear(year);
        this.setSpeed(speed);
    }

    Truck() {
        this.setSpeed(0);
    }

    public void setSpeed(int _speed) {
        if (speed < 0) {
            speed = 0;
        } else {
            speed = _speed;
        }
    }


    @Override
    public String toString() {
        return "Truck " + super.toString() + ", current speed: " + speed;
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
    void brake(){
        speed-=5;
        if(speed<0){
            speed=0;
        }
    }
}
