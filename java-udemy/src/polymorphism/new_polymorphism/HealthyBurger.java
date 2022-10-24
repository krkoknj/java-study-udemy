package polymorphism.new_polymorphism;

public class HealthyBurger extends Hamburger {
    private String healthyExtraName1;
    private double healthyExtra1;

    private String healthyExtraName2;
    private double healthyExtra2;

    public HealthyBurger(String meat, double price) {
        super("healthy burger", meat, price, "brown rye");
    }

    public void addHealthAddition1(String name, double price) {
        this.healthyExtraName1 = name;
        this.healthyExtra1 = price;
    }

    public void addHealthAddition2(String name, double price) {
        this.healthyExtraName2 = name;
        this.healthyExtra2 = price;
    }

    @Override
    public double itemizeHamburger() {
        double itemizeHamburger = super.itemizeHamburger();

        if (this.healthyExtraName1 != null) {
            itemizeHamburger += this.healthyExtra1;
            System.out.println("추가한 재료는 " + this.healthyExtraName1 + "이고, 추가 금액은 " + this.healthyExtra1 + " 입니다.");
        }

        if (this.healthyExtraName2 != null) {
            itemizeHamburger += this.healthyExtra2;
            System.out.println("추가한 재료는 " + this.healthyExtraName2 + "이고, 추가 금액은 " + this.healthyExtra2 + " 입니다.");
        }

        return itemizeHamburger;
    }
}
