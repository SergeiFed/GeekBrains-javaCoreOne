package Animal;

public class Cat extends Animal {
    private static int countCat;
    private int runCat = 0;



    public static int getCountCat() {
        return countCat;
    }

    public Cat(String name) {
        super(name);
        countCat++;
    }

    @Override
    public void swim(int length) {
        System.out.println(Cat.this.getName() + "не умеет плавать");
    }

    @Override
    public void run(int length) {
        if (length > 0 && length <= 200) {
            runCat += length;
            System.out.println(Cat.this.getName() + " пробежал " + length + "м\n" + "Всего он пробежал " + runCat + "м");
        } else {
            System.out.println(Cat.this.getName() + " пробежать может только 200м");
        }
    }

}
