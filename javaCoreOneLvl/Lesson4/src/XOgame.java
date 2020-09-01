import java.util.Random;
import java.util.Scanner;

public class XOgame {
    static final int SIZE = 3;
    static final int DOT_TO_WIN = 3;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';

    static char[][] map;

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Вы победили! Поздравляем!");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Компьютер победил.");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
        }

    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 1; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.printf("%c ", map[i][j]);
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x;
        int y;

        do {
            System.out.println("input X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y, x));

        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int y, int x) {
        if (y < 0 || x < 0 || y >= SIZE || x >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
//        if (map[y][x] == DOT_EMPTY) {
//            return true;
//        } else {
//            return false;
//        }
    }

    public static void aiTurn() {
        int x;
        int y;

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(y, x));

        map[y][x] = DOT_O;
    }

    public static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkWin(char c) {
        int count = 0;
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                if (map[y][x] == DOT_EMPTY) {
                    break;
                } else {
                    for (int i = 0; i < DOT_TO_WIN; i++) {
                        if ((map[x][y] == c) && ((y + i) < SIZE) && (map[x][y + i] == c)) {
                            count++;
                        }
                        if (count == DOT_TO_WIN) {
                            return true;
                        }
                    }
                    count = 0;
                    for (int i = 0; i < DOT_TO_WIN; i++) {
                        if ((map[y][x] == c) && ((y + i) < SIZE) &&
                                ((map[y + i][x]) == c)) {
                            count++;
                        }
                        if (count == DOT_TO_WIN) {
                            return true;
                        }
                    }
                    count = 0;
                    for (int i = 0; i < DOT_TO_WIN; i++) {
                        if ((map[x][y] == c) && ((y + i) < SIZE) && ((x + i) < SIZE) &&
                                (map[x + i][y + i] == c)) {
                            count++;
                        }
                        if (count == DOT_TO_WIN) {
                            return true;
                        }
                    }
                    count = 0;
                    for (int i = 0; i < DOT_TO_WIN; i++ ) {
                        if ((map[x][y] == c) && ((x - i) >= 0) && ((y + i) < SIZE) && (map[x - i][y + i] == c)) {
                            count++;
                        }
                        if (count == DOT_TO_WIN ) {
                            return true;
                        }
                    }
                    count = 0;
                }

            }

        }

        return false;
    }

}