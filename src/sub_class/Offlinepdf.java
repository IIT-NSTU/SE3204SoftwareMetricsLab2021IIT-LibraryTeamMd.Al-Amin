
package sub_class;

//Shows all the pdf that user already downloaded and open if clicked
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class Offlinepdf extends JFrame{
    private Container c;
    private static Scanner x;
    public static String[] pdfpath=new String[100];
    public static String[] pdfname=new String[100];
    Font font=new Font("Arial",Font.BOLD,20);
    FlowLayout fl=new FlowLayout(FlowLayout.CENTER);
    JButton[] book;
    public JButton back;
        Offlinepdf(){
            initcomponent();
        }
        public void initcomponent(){
             c=this.getContentPane();
             c.setLayout(fl);
            fl.setVgap(20);
            c.setBackground(Color.decode("#2471A3"));
        
            
           JPanel panel1=new JPanel();
           panel1.setLayout(fl);
         //  panel1.setPreferredSize(new Dimension(600, 800));
           panel1.setBackground(Color.decode("#2471A3"));
           c.add(panel1);
            
            int len=ReadRecord("Data.txt");
            //System.out.println(len);
            Home_frame.length=len;
            book=new JButton[len];
            for(int i=0;i<len;i++){
            book[i]=new JButton();
            book[i].setText(pdfname[i]);
            book[i].setFont(font);
            book[i].setPreferredSize(new Dimension(450,50));
            panel1.add(book[i]);
            }
            back = new JButton("Back");
            back.setFont(font);
            back.setPreferredSize(new Dimension(450,30));
            panel1.add(back);
            panel1.setPreferredSize(new Dimension(600, len*100));
            JScrollPane scrollPane = new JScrollPane(panel1);
                scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);//if necessary scrollbar will be visible
                scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                scrollPane.setPreferredSize(new Dimension(575,440));
                c.add(scrollPane);
            for(int i=0;i<len;i++){
                 int ivalue=i;
            book[i].addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent ae) { 
                    PdfViewer.setPdfDocument(pdfpath[ivalue]);
                     PdfViewer.Showframe();
                }
            });
        }
            back.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae) {
                dispose();
                Home_frame frame = new Home_frame("IIT-Library");
                frame.setVisible(true);
                
            } });
           }
        //Reads the length of data.txt file and returns integer value
        public static int ReadRecord(String filepath){
       int i=0;
        try {
            x=new Scanner(new File(filepath));
            x.useDelimiter("[,\n]");
            while(x.hasNext()){
                pdfname[i]=x.next().trim();
                pdfpath[i]=x.next().trim();
                i++;
            }
            x.close();
        } catch (FileNotFoundException ex) {
            
        }
       return i;
}
        /*public static void main(String[] args) {
        Offlinepdf frame=new Offlinepdf();
        frame.setBounds(100, 100, 600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        }*/
}
