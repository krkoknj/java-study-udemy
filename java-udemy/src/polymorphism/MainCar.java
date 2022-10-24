package polymorphism;

public class MainCar {
    public static void main(String[] args) {
        Car redCar = new RedCar("Red Car", 8);
        redCar.startEngine();
        redCar.setSpeed(10);
        redCar.acceleration(10);
    }
}

class RedCar extends Car {

    public RedCar(String carName, int cylinder) {
        super(carName, cylinder);
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void acceleration(int speed) {
        super.acceleration(speed);
    }

    @Override
    public void engineBreak(int speed) {
        super.engineBreak(speed);
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }
}

class Car {
    private boolean engine;
    private String carName;
    private int wheels;
    private int cylinder;

    private int speed;

    public Car(String carName, int cylinder) {
        this.carName = carName;
        this.cylinder = cylinder;
    }

    public void startEngine() {
        engine = !engine;
        System.out.println("engine = " + engine);
    }

    public void acceleration(int speed) {
        this.speed += speed;
        System.out.println("speed = " + this.speed);
    }

    public void engineBreak(int speed) {
        this.speed = speed;
        System.out.println("speed = " + this.speed);
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isEngine() {
        return engine;
    }

    public String getCarName() {
        return carName;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinder() {
        return cylinder;
    }
}
