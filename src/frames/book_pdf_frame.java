
package frames;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;



public class book_pdf_frame extends JFrame{
    
    public Container  container;
    
    public book_pdf_frame(String frame_title){
        setFrame(frame_title);
        setContainer();
    }
    
    public void setFrame(String page_title)
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,600);
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
    book_pdf_frame frame= new book_pdf_frame("Books");
    frame.setVisible(true);
    }*/
    
}
