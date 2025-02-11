package org.example;

import javax.swing.*;
import java.awt.*;

public class YeniSayfa{
    YeniSayfa() {
        JFrame profilFrame = new JFrame("Profil Penceresi");
        profilFrame.setSize(420, 420);

        JLabel adLabel = new JLabel("Ad: Ertuğrul Uçaklı", JLabel.CENTER);
        JLabel fotoLabel = new JLabel(new ImageIcon("ProfilFotoğrafı.jpeg"));
        JLabel bilgiLabel = new JLabel("Yamanevler Enderun Bilişim'de Yazılım Okuyorm.", JLabel.CENTER);
        JButton kapatButton = new JButton("Kapat");

        kapatButton.addActionListener(e -> profilFrame.dispose());

        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.add(adLabel);
        panel.add(fotoLabel);
        panel.add(bilgiLabel);

        profilFrame.add(panel, BorderLayout.CENTER);
        profilFrame.add(kapatButton, BorderLayout.SOUTH);
        profilFrame.setVisible(true);
    }
}