public class Cat {

    public static final int MAX_LIVES = 9;
    private static int catCount = 0;
    String name;
    int age;
    int livesRemaining;
    int catSound;


    public void meow(){
        System.out.println("Meow");
    }


    public Cat () {
        this.name = "Not Named";
    }

    public static int getCatCount(){
        return catCount;
    }
}
