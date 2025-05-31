import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
    private final int boxSize = 25;
    private final int width = 600;
    private final int height = 600;

    public GamePanel() {
        this.setPreferredSize(new Dimension(width, height));
        this.setFocusable(true);
        this.addKeyListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, width, height);
    }

    public void actionPerformed(ActionEvent e) {}
    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}
}
