package composition.myhome;


public class Furniture extends ForHowManyPeople{
    private String type;

    public Furniture(String type, int howManyPeople) {
        super(howManyPeople);
        this.type = type;
    }

    public String getType() {
        return type;
    }


    @Override
    int getHowManyPeople() {
        return super.getHowManyPeople();
    }
}
