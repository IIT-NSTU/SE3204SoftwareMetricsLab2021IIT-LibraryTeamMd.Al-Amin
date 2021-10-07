/*this is the middle size frame layout portion*/
package frames;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;


public class main_frame extends JFrame {
    
    public Container  container;
    
    public main_frame(String frame_title){
        setFrame(frame_title);
        setContainer();
    
    }
    
    public void setFrame(String page_title)
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900, 600);
        this.setLocationRelativeTo(null); //Set the frame in middle position
        this.setTitle(page_title);
        this.setResizable(false);
    }
    
    public void setContainer()
    {
        container = this.getContentPane();
        container.setBackground(Color.white);
    }
    
    /*    public static void main(String[] args) {
    main_frame frame= new main_frame("Library");
    frame.setVisible(true);
    
    }*/
    
}
