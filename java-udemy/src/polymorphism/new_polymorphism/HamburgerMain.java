package polymorphism.new_polymorphism;

public class HamburgerMain {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("토마토", 0.89);
        hamburger.addHamburgerAddition2("상추", 0.79);
        double v = hamburger.itemizeHamburger();
        System.out.println("v = " + v);

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 4.53);
        healthyBurger.addHealthAddition1("콩", 4.51);
        double v1 = healthyBurger.itemizeHamburger();
        System.out.println("v1 = " + v1);

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition3("Should not do this", 50.53);
        deluxeBurger.itemizeHamburger();

    }
}
