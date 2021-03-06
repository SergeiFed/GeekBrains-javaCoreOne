import java.io.Console;
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
        System.out.println("Угадай какое слово загадал компьютер");
        while (true) {
            String playerText1 = new String(scanner.nextLine());
            String string = playerText1.toLowerCase();
            StringBuilder playerText = new StringBuilder(string);


            StringBuilder slash = new StringBuilder("###############");


            boolean a = randomBuilder.toString().equals(playerText.toString());
            if (a) {
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

