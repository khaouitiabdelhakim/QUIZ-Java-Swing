# QUIZ-Java-Swing
This is a simple quiz app of 10 questions about Java using the Swing library

![alt text](https://github.com/khaouitiabdelhakim/QUIZ-Java-Swing/blob/master/screenshots/capture.PNG)

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

To use your own fontFamily for the displayed text use this

```
try {
            assert stream != null;
            Font font = Font.createFont(Font.TRUETYPE_FONT, stream).deriveFont(16f);
            l.setFont(font);
        } catch (FontFormatException | IOException e) {
            throw new RuntimeException(e);
        }
```
