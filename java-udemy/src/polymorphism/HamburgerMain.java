package polymorphism;

class Hamburger {
    private String bread;
    private String meat;
    private MyVegetable vegetable;

    public Hamburger(String bread, String meat) {
        this.bread = bread;
        this.meat = meat;
    }

    public Hamburger(String bread, String meat, MyVegetable vegetable) {
        this.bread = bread;
        this.meat = meat;
        this.vegetable = vegetable;
    }


    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public MyVegetable getVegetable() {
        return vegetable;
    }

    public void addVegetable(String lettuce, String tomato, String carrot) {
        this.vegetable.setLettuce(lettuce);
        this.vegetable.setTomato(tomato);
        this.vegetable.setCarrot(carrot);
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "bread='" + bread + '\'' +
                ", meat='" + meat + '\'' +
                ", vegetable=" + vegetable +
                '}';
    }
}

class HealthyHamburger extends Hamburger{

    public HealthyHamburger(String bread, String meat, MyVegetable vegetable) {
        super(bread, meat, vegetable);
    }

}

class UnhealthyHamburger extends Hamburger {

    public UnhealthyHamburger(String bread, String meat) {
        super(bread, meat);
    }

}


public class HamburgerMain {

    public static void main(String[] args) {
        MyVegetable myVegetable = new MyVegetable("Ok", "Ok", "Ok");
        HealthyHamburger healthyHamburger = new HealthyHamburger("오트", "소고기", myVegetable);
        healthyHamburger.addVegetable("상추 2개", "토마토 1개", "당근 1개");
        System.out.println("healthyHamburger = " + healthyHamburger);
        UnhealthyHamburger unhealthyHamburger = new UnhealthyHamburger("빵", "돼지고기");
        System.out.println("unhealthyHamburger = " + unhealthyHamburger);
//        unhealthyHamburger.addVegetable("Ok", "Ok", "Ok");
    }

}
