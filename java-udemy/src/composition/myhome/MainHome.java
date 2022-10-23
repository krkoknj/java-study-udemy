package composition.myhome;

public class MainHome {
    public static void main(String[] args) {
        Room room = new Room(40, 4);
        Furniture furniture = new Furniture("의자", 4);
        Door door = new Door("wood");

        Home home = new Home(door, furniture, room);
        System.out.println("home.getFurniture().getHowManyPeople() = " + home.getFurniture().getHowManyPeople());
    }
}
