/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spektr;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


public class Spektr extends JFrame {
    private JPanel panel = new JPanel(new GridLayout(5, 5, 2, 2));
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

    }
    
    public static void main(String[] args) {
        JFrame app = new Spektr();
        app.setVisible(true);
    }
    
}
