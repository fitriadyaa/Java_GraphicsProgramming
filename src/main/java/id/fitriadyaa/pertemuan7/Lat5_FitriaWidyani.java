/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.fitriadyaa.pertemuan7;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author fitriadyaa
 */
public class Lat5_FitriaWidyani extends JFrame {
    JButton m= new JButton ("TEKAN KEY 1, 2,3 4");
    JLabel tulisan= new JLabel ("UKURAN FRAME AKAN BERUBAH");
    
    Lat5_FitriaWidyani() {
        setTitle("INI EVENT PADA BUTTON");
        setSize(400,200);
        setLocation(200,100);
    }
    
    void komponen() {
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(m);
        getContentPane().add(tulisan);
        setVisible(true);
    }
    
    void reaksi(){
        m.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
            if (e.getKeyCode()==KeyEvent.VK_1) {
                setSize(300,500);
                }
            if (e.getKeyCode()==KeyEvent.VK_2){
                setSize(200,100);
                }
            if (e.getKeyCode()==KeyEvent.VK_3){
                setSize(100,10);
                }
            if (e.getKeyCode()==KeyEvent.VK_4){
                setSize(900,200);
                }
            }
        });
    }
    
    public static void main(String arg[]){
        Lat5_FitriaWidyani eb=new Lat5_FitriaWidyani();
        eb.komponen();
        eb.reaksi();
    }
}
