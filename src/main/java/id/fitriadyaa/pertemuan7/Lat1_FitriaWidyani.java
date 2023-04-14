/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.fitriadyaa.pertemuan7;

/**
 *
 * @author fitriadyaa
 */
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class Lat1_FitriaWidyani  extends JFrame {
    // Konstruktor kelas DrawingRect
    public Lat1_FitriaWidyani() {
        super("Kelas DrawingRect");
        setSize(260, 165);
        setVisible(true);
    }
    
    @Override
    public void paint(Graphics g) {
    // Memanggil metoda paint dari superclass
    super.paint(g);
    // Mengatur warna
    g.setColor(Color.RED);
    g.drawRect(20, 40, 220, 50);
    g.setColor(Color.BLUE);
    g.fillRect(20, 100, 220, 50);
    }
    // Metoda main
    public static void main(String[] args) {
    Lat1_FitriaWidyani frame = new Lat1_FitriaWidyani();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
