import java.util.Random;
import java.util.Scanner;

public class OneGame {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    static int countPlayer = 0;
    static int countComputer = 0;
    static int countGame = 3;


    public static void main(String[] args) {


        while (true) {
            int randomNumber = random.nextInt(9);
            System.out.printf("Игра 1. Вам требуется угадать число от 0 до 9. \nНа это вам дается 3 попытки. " +
                    "\nПриятной игры\n\nПобеды компьютера: %d\nВаши победы: %d\n", countComputer, countPlayer);

            for (int i = countGame; i > 0; i--) {
                System.out.println("=========================================================================");
                System.out.println("Введите число от 0 до 9:");
                int playerNumber = scanner.nextInt();
                if (playerNumber > 9 || playerNumber < 0) {
                    System.out.println("Попробуйте еще раз введите число от 0 до 9");
                    --i;
                    continue;
                }
                if (playerNumber != randomNumber && i == 1) {
                    System.out.println("Вы проиграли. Попробуйте еще");
                    countComputer++;
                } else if (playerNumber == randomNumber) {
                    System.out.printf("Поздравляю вы выйграли. Компьютер загадал число %d \n", randomNumber);
                    countPlayer++;
                    break;
                } else if (playerNumber < randomNumber) {
                    System.out.println("Загаданное число больше");
                } else System.out.println("Загаданное число меньше");
            }
            System.out.println("Повторить игру еще раз? 1 - да / 2 - нет (1 - повторить, 0 - нет)");
            int exitAndRun = scanner.nextInt();
            if (exitAndRun == 1) {
            } else {
                break;
            }
        }


    }
}