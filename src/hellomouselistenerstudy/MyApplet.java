/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellomouselistenerstudy;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MyApplet extends Applet implements MouseListener, MouseMotionListener {

    Button btn;
    Label lbl;

    public void init() {
        btn = new Button("Clcik Me");
        lbl = new Label("This        is    a   long   textual    Information ");
        add(btn);
        add(lbl);

        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        // lbl.setText("Mouse Clicked at " + me.getX() + "," + me.getY());
    }

    @Override
    public void mousePressed(MouseEvent me) {
        lbl.setText("Mouse PRESSED at " + me.getX() + "," + me.getY());
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        lbl.setText("Mouse RELEASED at " + me.getX() + "," + me.getY());
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        lbl.setText("Mouse ENTERED at " + me.getX() + "," + me.getY());
    }

    @Override
    public void mouseExited(MouseEvent me) {
        lbl.setText("Mouse EXITED at " + me.getX() + "," + me.getY());
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        lbl.setText("DRAGGING at " + me.getX() + "," + me.getY());
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        lbl.setText("MOVING at " + me.getX() + "," + me.getY());
    }

}
