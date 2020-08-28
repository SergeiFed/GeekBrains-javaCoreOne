import java.util.Random;
import java.util.Scanner;

public class TwoGame {
    static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
            "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
            "pepper", "pineapple", "pumpkin", "potato"};
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        StringBuilder randomBuilder = new StringBuilder(words[random.nextInt(words.length)]);
        System.out.println(randomBuilder);
        while (true) {
            StringBuilder playerText = new StringBuilder(scanner.nextLine());
            StringBuilder slash = new StringBuilder("###############");

            if (playerText.equals(randomBuilder)) {
                System.out.println("Поздравляю вы угадали");
                break;
            } else {
                for (int i = 0; i < playerText.length(); i++) {
                    if (playerText.charAt(i) == randomBuilder.charAt(i)) {
                        slash.setCharAt(i, playerText.charAt(i));
                    }
                }
                System.out.println("Попробуйте еще раз вы угадали вот эти символы");
                System.out.println(slash);
            }
        }
    }
}

