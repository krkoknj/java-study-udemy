package polymorphism;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    // 요약
    public String plot() {
        return "no plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {

    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("IndependenceDay");
    }

    @Override
    public String plot() {
        return "에일리언이 지구를 점령하는 영화";
    }

}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "아이들이 미로를 탈출하는 영화";
    }

}

class StarWars extends Movie {


    public StarWars() {
        super("StarWars");
    }

    @Override
    public String plot() {
        return "우주를 장악하려는 영화";
    }

}

class Forgetable extends Movie {

    public Forgetable() {
        super("Forgetable");
    }

}
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + ":" + movie.getName() + "\n"
                    + "Plot :" + movie.plot() + "\n");

        }
    }

    public static Movie randomMovie() {
        int random = (int) (Math.random() * 5) + 1;
        System.out.println("random = " + random);
        switch (random) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return null;
    }
}
