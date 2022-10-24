package polymorphism.new_polymorphism;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String additionName1;
    private double additionPrice1;

    private String additionName2;
    private double additionPrice2;

    private String additionName3;
    private double additionPrice3;

    private String additionName4;
    private double additionPrice4;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.additionName1 = name;
        this.additionPrice1 = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.additionName2 = name;
        this.additionPrice2 = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.additionName3 = name;
        this.additionPrice3 = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.additionName4 = name;
        this.additionPrice4 = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " 햄버거의 Roll은 " + this.breadRollType + " 이고 " + "고기는 " + this.meat + " 가격은 " + this.price + " 입니다");

        if (this.additionName1 != null) {
            hamburgerPrice += this.additionPrice1;
            System.out.println("추가한 재료는 " + this.additionName1 + " 이고," + "추가 금액은 " + this.additionPrice1 + " 입니다.");
        }

        if (this.additionName2 != null) {
            hamburgerPrice += this.additionPrice2;
            System.out.println("추가한 재료는 " + this.additionName2 + " 이고," + "추가 금액은 " + this.additionPrice2 + " 입니다.");
        }

        if (this.additionName3 != null) {
            hamburgerPrice += this.additionPrice3;
            System.out.println("추가한 재료는 " + this.additionName3 + " 이고," + "추가 금액은 " + this.additionPrice3 + " 입니다.");
        }

        if (this.additionName4 != null) {
            hamburgerPrice += this.additionPrice4;
            System.out.println("추가한 재료는 " + this.additionName4 + " 이고," + "추가 금액은 " + this.additionPrice4 + " 입니다.");
        }

        return hamburgerPrice;
    }
}
