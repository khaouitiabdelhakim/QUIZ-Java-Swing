package src;

import java.awt.*;
import javax.swing.JFrame;

public class TriviaCanvas extends Canvas{

    public void paint(Graphics g) {
        Toolkit t=Toolkit.getDefaultToolkit();
        Image i=t.getImage("assets/image.jpg");
        g.drawImage(i, 0,0,this);

    }
}