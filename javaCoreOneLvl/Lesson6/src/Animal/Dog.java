package Animal;

public class Dog extends Animal {
    private int runDog = 0;
    private int swimDog = 0;
    private static int countDog;

    public static int getCountDog() {
        return countDog;
    }

    public Dog(String name) {
        super(name);
        countDog++;
    }

    @Override
    public void run(int length) {
        if (length > 0 && length <= 500) {
            runDog += length;
            System.out.println(Dog.this.getName() + " пробежал " + length + "м\n"
                    + "Всего он пробежал " + runDog + "м");
        } else {
            System.out.println(Dog.this.getName() + " пробежать может только 500м");
        }
    }

    @Override
    public void swim(int length) {
        if (length > 0 && length <= 10) {
            runDog += length;
            System.out.println(Dog.this.getName() + " проплыл " + length + "м\n"
                    + "Всего он проплыл " + swimDog + "м");
        } else {
            System.out.println(Dog.this.getName() + " проплыть может только 10м");
        }
    }
}
