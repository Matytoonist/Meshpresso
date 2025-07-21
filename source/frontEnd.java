import java.awt.*;
import java.awt.event.*;

public class frontEnd {
    public static void main(String[] args) {
        Frame frame = new Frame("Mockup UI");
        Label label = new Label("this is a toast");

        label.setAlignment(Label.CENTER);

        frame.add(label);
        frame.setSize(320,480);

        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e){
                    System.exit(0);
                }
            });
    }
}