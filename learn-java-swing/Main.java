import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] argv) {
        EventQueue.invokeLater(() -> {
            FirstFrame frame = new FirstFrame();
            initFrameSize(frame);
            frame.setLocationByPlatform(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }

    private static void initFrameSize(Frame frame) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screen_size = toolkit.getScreenSize();
        frame.setSize(screen_size.width / 3, screen_size.height / 3);
    }
}
