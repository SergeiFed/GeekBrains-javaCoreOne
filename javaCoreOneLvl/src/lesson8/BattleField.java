package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BattleField extends JPanel {

  private GameWindow gameWindow;

  private int mode;
  private int fieldSize;
  private int winningLength;

  private boolean isInit;

  int cellWidth;
  int cellHeight;
  GameWinFrame gameWinFrame;


  public BattleField(GameWindow gameWindow) {

    gameWinFrame = new GameWinFrame(this);
    this.gameWindow = gameWindow;

    setBackground(Color.ORANGE);

    addMouseListener(new MouseAdapter() {
      @Override
      public void mouseReleased(MouseEvent e) {
        int cellX = e.getX() / cellWidth;
        int cellY = e.getY() / cellHeight;

//                System.out.println(cellY + " " + cellX);

        if (!Logic.isFinishedGame) {
          Logic.humanTurn(cellX, cellY);

          if (Logic.isFinishedGame) {
            gameWinFrame.add(new JLabel(Logic.textWin), BorderLayout.CENTER, JTextField.CENTER);
            gameWinFrame.setTitle(Logic.textWin);

            gameWinFrame.setVisible(true);
            //result
          }
        }

        repaint();
      }
    });
  }

  public void startNewGame(int mode, int fieldSize,
      int winningLength) {
    this.mode = mode;
    this.fieldSize = fieldSize;
    this.winningLength = winningLength;

    isInit = true;

    repaint();
  }


  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g); //

    if (!isInit) {
      return;
    }

    cellWidth = getWidth()
        / fieldSize;
    cellHeight = getHeight() / fieldSize;

    for (int i = 0; i < fieldSize; i++) {
      int y = i * cellHeight;
      g.drawLine(0, y, getWidth(),
          y);
    }

    for (int i = 0; i < fieldSize; i++) {
      int x = i * cellWidth;
      g.drawLine(x, 0, x,
          getHeight());
    }

    for (int i = 0; i < Logic.SIZE; i++) {
      for (int j = 0; j < Logic.SIZE; j++) {
        if (Logic.map[i][j] == Logic.DOT_X) {
          drawX(g, j, i);
        }
        if (Logic.map[i][j] == Logic.DOT_O) {
          drawO(g, j, i);
        }
      }
    }

  }

  private void drawO(Graphics g, int cellX, int cellY) {
    ((Graphics2D) g).setStroke(new BasicStroke(25));
    g.setColor(Color.RED);
    g.drawOval(cellX * cellWidth + (cellWidth / 8), cellY * cellHeight + (cellHeight / 8),
        cellWidth - (cellWidth / 4), cellHeight - (cellHeight / 4));
//        g.setFont(new Font("Arial", Font.BOLD, 30));
//        g.drawString("O", cellX * cellWidth + (cellWidth / 2), cellY * cellHeight + (cellHeight / 2));
  }

  private void drawX(Graphics g, int cellX, int cellY) {
    ((Graphics2D) g).setStroke(new BasicStroke(25));
    g.setColor(Color.BLUE);
    g.drawLine(cellX * cellWidth + (cellWidth / 4),
        cellY * cellHeight + (cellWidth / 4),
        (cellX + 1) * cellWidth - (cellWidth / 4),
        (cellY + 1) * cellHeight - (cellWidth / 4));

    g.drawLine((cellX + 1) * cellWidth - (cellWidth / 4),
        cellY * cellHeight + (cellWidth / 4),
        cellX * cellWidth + (cellWidth / 4),
        (cellY + 1) * cellHeight - (cellWidth / 4));
  }
}
