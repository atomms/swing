import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/** Small example showing basic use of JToolBar. */

public class JToolBarExample extends JFrame
                             implements ItemListener {
  private BrowserToolBar toolbar;
  private JCheckBox labelBox;

  public static void main(String[] args) {
    new JToolBarExample();
  }

  public JToolBarExample() {
    super("JToolBar Example");
    WindowUtilities.setNativeLookAndFeel();
    addWindowListener(new ExitListener());
    Container content = getContentPane();
    content.setBackground(Color.white);
    
    JPanel panel = new JPanel(new BorderLayout());
    labelBox = new JCheckBox("Show Text Labels?");
    labelBox.setHorizontalAlignment(SwingConstants.CENTER);
    labelBox.addItemListener(this);
    panel.add(new JTextArea(10,30), BorderLayout.CENTER);
    panel.add(labelBox, BorderLayout.SOUTH);

    toolbar = new BrowserToolBar();
    content.add(toolbar, BorderLayout.NORTH);
    content.add(panel, BorderLayout.CENTER);

    pack();
    setVisible(true);
  }

  public void itemStateChanged(ItemEvent event) {
    toolbar.setTextLabels(labelBox.isSelected());
    pack();
  }
}