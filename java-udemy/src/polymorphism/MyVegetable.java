package polymorphism;

public class MyVegetable {
    private String lettuce;
    private String tomato;
    private String carrot;

    public MyVegetable(String lettuce, String tomato, String carrot) {
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.carrot = carrot;
    }

    public String getLettuce() {
        return lettuce;
    }

    public String getTomato() {
        return tomato;
    }

    public String getCarrot() {
        return carrot;
    }

    public void setLettuce(String lettuce) {
        this.lettuce = lettuce;
    }

    public void setTomato(String tomato) {
        this.tomato = tomato;
    }

    public void setCarrot(String carrot) {
        this.carrot = carrot;
    }

    @Override
    public String toString() {
        return "MyVegetable{" +
                "lettuce='" + lettuce + '\'' +
                ", tomato='" + tomato + '\'' +
                ", carrot='" + carrot + '\'' +
                '}';
    }
}
