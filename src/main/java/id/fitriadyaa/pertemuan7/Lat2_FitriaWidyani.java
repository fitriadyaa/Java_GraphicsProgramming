/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.fitriadyaa.pertemuan7;

/**
 *
 * @author fitriadyaa
 */
import java.awt.GraphicsEnvironment;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class Lat2_FitriaWidyani extends JFrame {
    
    public Lat2_FitriaWidyani(){
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        GraphicsEnvironment graphic;
        graphic = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] namaFont = graphic.getAvailableFontFamilyNames();
        String string = "";
        for (int x = 0; x < namaFont.length; x++) {
        string += namaFont[x];
        string += (x < namaFont.length - 1) ? "\n" : "";
        }
        
        Font font = new Font("Tahoma", Font.BOLD + Font.ITALIC, 11);
        JTextArea area = new JTextArea();
        area.append(string);
        area.setFont(font);
        JScrollPane pane = new JScrollPane(area);
        container.add(pane, BorderLayout.CENTER);
    }
    
    public static void main(String[] args) {
    Lat2_FitriaWidyani frame = new Lat2_FitriaWidyani();
    frame.setTitle("Nama Font Tersedia di Sistem");
    frame.setSize(270, 170);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
