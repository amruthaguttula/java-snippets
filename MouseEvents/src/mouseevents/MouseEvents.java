package mouseevents;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//
//public static void main(String args[])
//{
public class MouseEvents extends Applet implements MouseListener, MouseMotionListener {

  String msg = "";
  int mouseX = 0, mouseY = 0; // coordinates of mouse

  @Override
  public void init() {
    addMouseListener(this);
    addMouseMotionListener(this);
  }
// Handle mouse clicked.

  @Override
  public void mouseClicked(MouseEvent me) {
// save coordinates
    mouseX = 50;
    mouseY = 70;
    msg = "Mouse clicked.";
    repaint();
  }
// Handle mouse entered.

  @Override
  public void mouseEntered(MouseEvent me) {
// save coordinates
    mouseX = 50;
    mouseY = 70;
    msg = "Mouse entered.";
    repaint();
  }
// Handle mouse exited.

  @Override
  public void mouseExited(MouseEvent me) {
// save coordinates
    mouseX = 50;
    mouseY = 70;
    msg = "Mouse exited.";
    repaint();
  }
// Handle button pressed.

  @Override
  public void mousePressed(MouseEvent me) {
// save coordinates
    mouseX = me.getX();
    mouseY = me.getY();
    msg = "Down";
    repaint();
  }
// Handle button released.

  @Override
  public void mouseReleased(MouseEvent me) {
// save coordinates
    mouseX = me.getX();
    mouseY = me.getY();
    msg = "Up";
    repaint();
  }
// Handle mouse dragged.

  @Override
  public void mouseDragged(MouseEvent me) {
// save coordinates
    mouseX = me.getX();
    mouseY = me.getY();
    msg = "*";
    showStatus("Dragging mouse at " + mouseX + ", " + mouseY);
    repaint();
  }
// Handle mouse moved.

  @Override
  public void mouseMoved(MouseEvent me) {
// show status
    showStatus("Moving mouse at " + me.getX() + ", " + me.getY());
  }
// Display msg in applet window at current X,Y location.

  @Override
  public void paint(Graphics g) {
    g.drawString("Handling Mouse Events", 50, 20);
    g.drawString(msg, mouseX, mouseY);
  }
}
