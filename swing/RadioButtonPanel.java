import javax.swing.*;
import java.awt.*;

/** A simple way to group several radio buttons in a single row, 
 *  with a label on the left.
 */

public class RadioButtonPanel extends JPanel {
  public RadioButtonPanel(String labelString, 
                          JRadioButton[] radioButtons,  
			                 ButtonGroup buttonGroup) {
    setLayout(new FlowLayout(FlowLayout.LEFT));
    add(new JLabel(labelString));
    for(int i=0; i<radioButtons.length; i++) {
      buttonGroup.add(radioButtons[i]);
      add(radioButtons[i]);
    }
  }

  @Override
  public void setEnabled(boolean state) {
    Component[] components = getComponents();
    for(int i=0; i<components.length; i++)
      components[i].setEnabled(state);
  }
}
