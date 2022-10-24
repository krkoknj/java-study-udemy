package polymorphism.new_polymorphism;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("디럭스 버거에는 추가할수 없습니다.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("디럭스 버거에는 추가할수 없습니다.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("디럭스 버거에는 추가할수 없습니다.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("디럭스 버거에는 추가할수 없습니다.");
    }
}
