import java.awt.*;
import javax.swing.*;

/** Part of a small example showing basic use of JToolBar.
 *  Creates a small dockable toolbar that is supposed to look
 *  vaguely like one that might come with a Web browser.
 *  Makes use of ToolBarButton, a small extension of JButton
 *  that shrinks the margins around the icon and puts text 
 *  label, if any, below the icon. 
 */
 
public class BrowserToolBar extends JToolBar {
  public BrowserToolBar() { 
    String[] imageFiles =
      { "Left.gif", "Right.gif", "RotCCUp.gif",
        "TrafficRed.gif", "Home.gif", "Print.gif", "Help.gif" };
    String[] toolbarLabels =
      { "NEWBack", "Forward", "Reload", "Stop", 
        "Home", "Print", "Help" };
    Insets margins = new Insets(0, 0, 0, 0);
    for(int i=0; i<toolbarLabels.length; i++) {
      ToolBarButton button =
        new ToolBarButton("images/" + imageFiles[i]);
      button.setToolTipText(toolbarLabels[i]);
      button.setMargin(margins);
      add(button);
    }
  }

  public void setTextLabels(boolean labelsAreEnabled) {
    Component c;
    int i = 0;
    while((c = getComponentAtIndex(i++)) != null) {
      ToolBarButton button = (ToolBarButton)c;
      if (labelsAreEnabled) {
        button.setText(button.getToolTipText());
      } else {
        button.setText(null);
      }
    }
  }
}