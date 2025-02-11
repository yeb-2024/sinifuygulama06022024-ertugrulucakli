package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnaEkran implements ActionListener {

    JFrame frame = new JFrame();
    JButton profilButon = new JButton("Tıkla");

    AnaEkran(){
        profilButon.setBounds(100,160,200,40);
        profilButon.setFocusable(false);
        profilButon.addActionListener(this);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);

        frame.add(profilButon);
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == profilButon){
            frame.dispose();
            YeniSayfa yeniSayfa = new YeniSayfa();
        }
    }
}
