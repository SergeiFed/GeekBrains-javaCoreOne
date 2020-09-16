package lesson7;
import java.util.Random;
public class Cat {
        private String name;
        private int hungryCat = 0;
        private int fullCat = (int) (1 * Math.random() * 10);
        public Cat(String name) {
            this.name = name;
        }
        private boolean full = false;



        public void eat(Plate plate) {

            if (plate.getFood() < fullCat) {
                System.out.println("Cat " + name + " не будет есть. Слишком мало еды");
            } else {
                System.out.println("Cat " + name + " eat...");
                plate.decreaseFood(plate.getFood());
                hungryCat += plate.getFood();
                if (fullCat == hungryCat) {
                    full = true;
                    System.out.println("Cat " + name + " сыт!");
                }
            }

        }


        public String getName() {
            return name;
        }
}
