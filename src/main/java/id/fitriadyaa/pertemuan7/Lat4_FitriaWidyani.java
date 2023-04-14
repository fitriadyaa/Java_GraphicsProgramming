package id.fitriadyaa.pertemuan7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lat4_FitriaWidyani extends JPanel implements MouseListener, MouseMotionListener {
    int width, height;
    int mx, my;
    // the mouse coordinates
    boolean isButtonPressed = false;
    JLabel statusLabel;

    public Lat4_FitriaWidyani() {
        setPreferredSize(new Dimension(400, 400));
        addMouseListener( this );
        addMouseMotionListener( this );
        setBackground( Color.black );
        mx = getWidth()/2;
        my = getHeight()/2;
        statusLabel = new JLabel("Mouse at (" + mx + "," + my + ")");
        statusLabel.setForeground(Color.white);
        add(statusLabel);
    }
    
    @Override
    public void mouseEntered( MouseEvent e ) {
        // called when the pointer enters the panel's rectangular area
    }
    
    @Override
    public void mouseExited( MouseEvent e ) {
        // called when the pointer leaves the panel's rectangular area
    }
    
    @Override
    public void mouseClicked( MouseEvent e ) {
        // called after a press and release of a mouse button
        // with no motion in between
        // (If the user presses, drags, and then releases, there will be
        // no click event generated.)
    }
    
    @Override
    public void mousePressed( MouseEvent e ) {
        // called after a button is pressed down
        isButtonPressed = true;
        setBackground( Color.gray );
        repaint();
        // "Consume" the event so it won't be processed in the
        // default manner by the source which generated it.
        e.consume();
    }
    
    @Override
    public void mouseReleased( MouseEvent e ) {
        // called after a button is released
        isButtonPressed = false;
        setBackground( Color.black );
        repaint();
        e.consume();
    }
    
    @Override
    public void mouseMoved( MouseEvent e ) {
        // called during motion when no buttons are down
        mx = e.getX();
        my = e.getY();
        statusLabel.setText("Mouse at (" + mx + "," + my + ")");
        repaint();
        e.consume();
    }
    
    @Override
    public void mouseDragged( MouseEvent e ) { // called during
        mx = e.getX();
        my = e.getY();
        statusLabel.setText("Mouse at (" + mx + "," + my + ")");
        repaint();
        e.consume();
    }
    
    @Override
    public void paintComponent( Graphics g ) {
        super.paintComponent(g);
        if ( isButtonPressed ) {
            g.setColor( Color.black );
        }
        else {
            g.setColor( Color.gray );
        }
        g.fillRect( mx-20, my-20, 40, 40 );
    }  
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Listener Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Lat4_FitriaWidyani());
        frame.pack();
        frame.setVisible(true);
    }
}
