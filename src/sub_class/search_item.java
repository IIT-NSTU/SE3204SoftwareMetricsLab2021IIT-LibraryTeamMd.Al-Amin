
package sub_class;
//frame to know what exactly user looking for and allow them to view it
import frames.book_pdf_frame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class search_item extends book_pdf_frame{
    public JPanel main_panel;
    Font font=new Font("Arial",Font.BOLD,20);
    FlowLayout layout=new FlowLayout(FlowLayout.CENTER);
    public JButton view,back;
    public JLabel label;
    public JComboBox box1;
    public static String pdffilepath,dirName=null,bookname;
     public static String[] item=new String[20];
    public static String[] link=new String[20];
    public search_item(String frame_title) {
        super(frame_title);
        setContainer();
        setMainPanel();
        setLabel();
        setButton();
        buttonaction();
    }
    
     public void setContainer()
    {
        super.setContainer();
        container.setBackground(Color.WHITE);
    }
     
     public void setMainPanel()
    {
        main_panel = new JPanel();
        main_panel.setBackground(Color.WHITE);
        main_panel.setLayout(layout); 
        layout.setVgap(20);
        container.add(main_panel);
    }
     public void setLabel()
     {
         label=new JLabel("             You are looking for?");
         label.setFont(font);
         label.setPreferredSize(new Dimension(300,50));
         main_panel.add(label);
     }
     public void setButton()
     {
         box1=new JComboBox(item);
         box1.setBounds(20, 20, 500, 50);
         box1.setFont(font);
         main_panel.add(box1);
         view=new JButton("View");
         view.setFont(font);
        view.setPreferredSize(new Dimension(300,50));
         main_panel.add(view);
         back=new JButton("Back");
         back.setFont(font);
        back.setPreferredSize(new Dimension(300,50));
         main_panel.add(back);
         
     }
     public void buttonaction()
     {
         view.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae) {
                 dispose();
                int i= box1.getSelectedIndex();
               View.go("view.pdf",link[i]);
            } });
         back.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae) {
                dispose();
                Home_frame frame = new Home_frame("IIT-Library");
                frame.setVisible(true);
            } });
     }
     
     public static void main(String[] args) {
        int i = searchitem("c");
        System.out.println(i);
        if(i>0){
            search_item frame = new search_item("Search");
            frame.setVisible(true);
        }
    }
     //using regex to get user searched file name 
     public static int searchitem(String pattern){
        int i=0;
        try {
            
            Pattern p =Pattern.compile(pattern,Pattern.CASE_INSENSITIVE);
            Scanner x=new Scanner(new File("link.txt"));
            x.useDelimiter("[,\n]");
            while(x.hasNext()){
                String item_name=x.next();
                Matcher m = p.matcher(item_name);
                if(m.find()){
                item[i]=item_name;
                link[i]=x.next();
                i++;}
               else {String s= x.next();}
            }
            x.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(search_item.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
     }
}
