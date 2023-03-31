# QUIZ-Java-Swing
This is a simple quiz app of 10 questions about Java using the Swing library

![alt text](http://url/to/img.png)

In order to add the cover of the game (I mean the image you see in the app), I override the JComponent Class to draw the image as a Canvas element -> I named this Class
TriviaCanvas

```
import java.awt.*;
import javax.swing.JFrame;

public class TriviaCanvas extends Canvas{

    public void paint(Graphics g) {
        Toolkit t=Toolkit.getDefaultToolkit();
        String image_path = "" // like "assets/image.jpg"
        Image i=t.getImage(image_path);
        g.drawImage(i, 0,0,this);

    }
}
```
