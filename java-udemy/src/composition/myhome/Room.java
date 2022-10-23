package composition.myhome;

public class Room extends ForHowManyPeople{
    private int area;

    public Room(int area, int howManyPeople) {
        super(howManyPeople);
        this.area = area;
    }

    public int getArea() {
        return area;
    }


    @Override
    int getHowManyPeople() {
        return super.getHowManyPeople();
    }
}
