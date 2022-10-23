package composition.myhome;

public abstract class ForHowManyPeople {
    private int howManyPeople;

    int getHowManyPeople() {
     return this.howManyPeople;
    }

    public ForHowManyPeople(int howManyPeople) {
        this.howManyPeople = howManyPeople;
    }
}
