package composition.myhome;

public class Home {
    private Door door;
    private Furniture furniture;
    private Room room;

    public Home(Door door, Furniture furniture, Room room) {
        this.door = door;
        this.furniture = furniture;
        this.room = room;
    }

    public String doorType() {
        return door.getType();
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public Room getRoom() {
        return room;
    }
}
