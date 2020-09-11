import Animal.*;

public class Main {


    public static void main(String[] args) {
        Animal cat = new Cat("Symon");
        Animal cat1 = new Cat("Symon");
        Animal cat2 = new Cat("Symon");
        Animal cat3 = new Cat("Symon");
        Animal dog2 = new Dog("Jane");
        Animal dog3 = new Dog("Jane");
        Animal dog4 = new Dog("Jane");
        Animal dog5 = new Dog("Jane");
        Animal dog6 = new Dog("Jane");

        cat.swim(200);
        cat.run(100);
        cat.run(100);

        System.out.println("Всего кошек " + Cat.getCountCat());
        System.out.println("Всего собак " + Dog.getCountDog());
        System.out.println("Всего животных " + Animal.getCountAll());

    }


}
