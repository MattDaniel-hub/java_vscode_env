import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import BeispielPaket.MeinEnum;


public class App {
    public static void main(String[] args) throws Exception {
        JFrame jf = new JFrame("test");
        
        jf.setVisible(true);
        Container frame = jf.getContentPane();
        jf.setMinimumSize(new Dimension(800,800));
        
        frame.add(new JLabel("hallo welt!"));
        System.out.println(MeinEnum.b.toString());

        jf.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            
            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
                    System.exit(0);
                 }
            }
        
        });
    }
}
