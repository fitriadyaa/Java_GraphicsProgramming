package id.fitriadyaa.pertemuan7;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.JFrame;

public class Lat3_FitriaWidyani extends JPanel {
    TextField t1 = new TextField();
    TextField t2 = new TextField();
    TextField t3 = new TextField();
    
    public Lat3_FitriaWidyani(){
        Label l1=new Label("Nomor Satu : ");
        Label l2=new Label("Nomor Dua : ");
        Label l3=new Label("Hasilnya Adalah : ");
        setLayout(new GridLayout(3,2));
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("My App");
        Lat3_FitriaWidyani panel = new Lat3_FitriaWidyani();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
