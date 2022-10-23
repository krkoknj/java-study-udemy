package inherit;

public class MainVehicle {
    public static void main(String[] args) {
        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(21);
        outlander.accelerate(-43);
    }
}
