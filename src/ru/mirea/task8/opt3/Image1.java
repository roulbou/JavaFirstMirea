package ru.mirea.task8.opt3;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Image1 extends JComponent {
    BufferedImage image;
    public Image1(){
        JFrame frame = new JFrame();
        frame.add(this);
        frame.setSize(700, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        try {
            image = ImageIO.read(new File("C:/Users/hidjab/Documents/image/image1.png"));
        } catch (IOException e) {

        }
    }
    public void paint(Graphics g){
        Graphics2D gr = (Graphics2D)g;
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        gr.drawImage(image, 0, 0,null);
    }

}
