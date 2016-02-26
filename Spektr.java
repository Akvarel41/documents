/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akvarel;

import javax.swing.*;
import java.awt.*;

import java.util.Random;

public class Spektr extends JFrame {
    private JPanel panel = new JPanel(new GridLayout(5, 5, 2, 2));
    private int[][] numbers = new int[5][5];
    
    public  Spektr() {
        super("Спектр");

        int screenwidth;
        screenwidth = (int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 3);
        int screenheight;
        screenheight = (int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 3);
        setSize(screenwidth, screenheight);
        setResizable(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container container = getContentPane();
        panel.setDoubleBuffered(true);
        container.add(panel);
        panel.setBackground(new Color(255, 255, 255));

     
        DrawField();
    }

    public void DrawField() {
        int k = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                numbers[i][j] = k;
                k++;
            }
        }
        panel.removeAll();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                JButton button;
                button = new JButton( Integer.toString(numbers[i][j]));
                if (numbers[i][j] == 1)
                {
                    button.setBackground(new Color(255, 0, 0));                    
                }
                if (numbers[i][j] == 2)
                {
                    button.setBackground(new Color(252, 41, 0));                    
                }
                if (numbers[i][j] == 3)
                {
                    button.setBackground(new Color(255, 89, 0));                    
                }
 
                
                button.setFocusable(false);
                panel.add(button);
                if (numbers[i][j] == 0) {
                    button.setVisible(false);
                }
            }
        }

        panel.validate();
        panel.repaint();
    }



    
    public static void main(String[] args) {
        JFrame app = new Spektr();
        app.setVisible(true);
    }
}

    

