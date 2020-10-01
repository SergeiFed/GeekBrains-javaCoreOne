package lesson8;

import javax.swing.*;
import java.awt.*;

public class GameWinFrame extends JFrame {
    static final int WINDOW_X = GameWindow.WINDOW_X + 50;
    static final int WINDOW_Y = GameWindow.WINDOW_Y + 50;
    static final int WINDOW_WIDTH = 405;
    static final int WINDOW_HEIGHT = 400;
    private boolean setVisible = false;
    private GameWindow gameWindow;
    private String textWin;

    public void setTextWin(String textWin) {
        this.textWin = textWin;
    }

    public String getTextWin() {
        return textWin;
    }

    private BattleField battleField;


    public GameWinFrame(BattleField battleField) {
        this.battleField = battleField;
        setBounds(WINDOW_X, WINDOW_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
         // Название окна

        setLayout(new BorderLayout());
         // Добавляем надпись




        setVisible(setVisible); // При окончании кода в случае его закрытия или еще чего-то тоже закрываем
    }

}
