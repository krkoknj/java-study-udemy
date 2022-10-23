package inherit;

public class Fish extends Animal {
    private int gills; // 아가미
    private int eyes;
    private int fins; // 지느러미

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    public void rest() {

    }

    public void moveMuscles() {
        System.out.println("Fish.moveMuscles");
    }

    public void moveBackFin() {
        System.out.println("Fish.moveBackFin");
    }

    public void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }

    @Override
    public void move(int speed) {
        System.out.println("fish speed is " + speed);
    }
}

