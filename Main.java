public class Main {
    public static void main(String[] args) {
        System.out.println(Cat.getCatCount());

        // Create a Cat Object
        Cat myCat = new Cat();

        // Assign values to the cat object fields.
        myCat.age = 3;
        // myCat.name = "Felix";
        myCat.catSound = "GGGGG";
        myCat.meow();
        myCat.name = "Stella";
        myCat.age = 8;
        System.out.println(Cat.MAX_LIVES);
        System.out.println(Cat.getCatCount());
    }
}
