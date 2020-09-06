package Animal;

public abstract class Animal {
    protected final String name;


    private static int countAll;



    public Animal(String name) {
        this.name = name;
        countAll++;
    }


    public static int getCountAll() {
        return countAll;
    }

    public String getName() {
        return name;
    }

    public abstract void swim(int length);

    public abstract void run(int length);
}
