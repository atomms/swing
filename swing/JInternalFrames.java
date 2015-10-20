import java.awt.*;
import javax.swing.*;
                
/** Simple example illustrating the use of internal frames. */

public class JInternalFrames extends JFrame {
  public static void main(String[] args) {
    JFrame frame = new JInternalFrames();
    frame.setVisible(true);
  }

  public JInternalFrames() {
    super("Multiple Document Interface");
    WindowUtilities.setNativeLookAndFeel();
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    Container content = getContentPane();
    JDesktopPane desktop = new JDesktopPane();
    desktop.setBackground(Color.LIGHT_GRAY);
    content.add(desktop, BorderLayout.CENTER);
    setSize(450, 400);
    for(int i=0; i<5; i++) {
      JInternalFrame frame
        = new JInternalFrame(("Internal Frame " + i),
                             true, true, true, true);
      frame.setLocation(i*50+10, i*50+10);
      frame.setSize(200, 150);
      frame.setBackground(Color.WHITE);
      desktop.add(frame);
      frame.moveToFront();
      frame.setVisible(true);
    }
  }
}
