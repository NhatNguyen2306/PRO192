
   import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JPanel implements KeyListener {

  private Image background;
  private Image character;
  private int x = 0;
  private int y = 0;

  public Game() {
    background = new ImageIcon("background.png").getImage(); 
    character = new ImageIcon("character.png").getImage();
    setFocusable(true);
    addKeyListener(this);
  }

  public void paint(Graphics g) {
    super.paint(g);

    g.drawImage(background, 0, 0, null);
    g.drawImage(character, x, y, null);
  }

  public void keyPressed(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_LEFT) x-= 10;
    if (e.getKeyCode() == KeyEvent.VK_RIGHT) x+= 10;
    if (e.getKeyCode() == KeyEvent.VK_UP) y-= 10;
    if (e.getKeyCode() == KeyEvent.VK_DOWN) y+= 10;

    repaint();
  }

  public void keyReleased(KeyEvent e) {}
  public void keyTyped(KeyEvent e) {}

  public static void main(String[] args) {
    JFrame frame = new JFrame("Game");
    Game game = new Game();
    frame.add(game);
    frame.setSize(500, 500);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

}
    
}
