
package sub_class;
//This gives user option to select pdf/slide/classroutine/examroutine of a semester
import frames.book_pdf_frame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import static sub_class.Download_Without_saving.go;


public class Semester_details extends book_pdf_frame{
    public JPanel main_panel,toppanel,panel1;
    public JButton  update,pdf,slide,classroutine,examroutine,back;
    public JLabel title,pdflabel,slidelabel,classroutinelabel,examroutinelabel;
    ImageIcon pdfImage,slideImage,classroutineImage,examroutineImage;
    Font font=new Font("Arial",Font.BOLD,20);
    FlowLayout layout=new FlowLayout(FlowLayout.CENTER);
    public static int semesternumber=1;
    public static int usertype=0;
    
    public Semester_details(String frame_title) {
        super(frame_title);
        setContainer();
        setMainPanel();
        setImage();
        setLabel();
         setButton();
         actionlistener();
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
        main_panel.setLayout(null);  
        container.add(main_panel);
        
        if(usertype==0){
         toppanel=new JPanel();
         toppanel.setBackground(Color.decode("#2471A3"));
         toppanel.setBounds(0,0,500,80);
         toppanel.setLayout(null);
         main_panel.add(toppanel);
        }
         if(usertype==1){
         panel1=new JPanel();
         panel1.setBackground(Color.decode("#2471A3"));
         panel1.setBounds(0,0,500,80);
         panel1.setLayout(layout);
         layout.setVgap(0);
         main_panel.add(panel1);
          }
   
    }
     
     public void setImage(){
          pdfImage=new ImageIcon(getClass().getResource("/icons/pdf.png"));
          slideImage=new ImageIcon(getClass().getResource("/icons/slide.png"));
          classroutineImage=new ImageIcon(getClass().getResource("/icons/ClassRoutine .png"));
          examroutineImage=new ImageIcon(getClass().getResource("/icons/ExamRoutine .png"));
     }
     
     public void setButton(){
         /*if(usertype==0){
         update=new JButton("Update");
         update.setFont(font);
         update.setForeground(Color.decode("#2471A3"));
         update.setBounds(300, 20, 150, 50);
         toppanel.add(update);
         }*/
         
        pdf=new JButton(pdfImage);
       pdf.setBounds(20,90,190,120);
      main_panel.add(pdf);
      
      slide=new JButton(slideImage);
      slide .setBounds(250,90,190,120);
      main_panel.add(slide);
      
      classroutine=new JButton(classroutineImage);
      classroutine .setBounds(20,270,190,120);
      main_panel.add( classroutine);
      
      examroutine=new JButton(examroutineImage);
      examroutine.setBounds(250,270,190,120);
      main_panel.add(examroutine);
      
      back=new JButton("Back");
      back.setBounds(0,513,500,50);
      main_panel.add(back);
      
          
     }
     
     public void setLabel(){
          if(usertype==0){
         title=new JLabel("Semester-"+semesternumber);
         title.setSize(300, 80);
         title.setHorizontalAlignment(JLabel.CENTER);
         title.setVerticalAlignment(JLabel.CENTER);
         title.setFont(new Font("Arial",Font.BOLD,30));
         title.setForeground(Color.WHITE);
         toppanel.add(title);
          }
          if(usertype==1){
         title=new JLabel("Semester-"+semesternumber);
         title.setFont(new Font("Arial",Font.BOLD,30));
         title.setHorizontalAlignment(JLabel.CENTER);
         title.setVerticalAlignment(JLabel.CENTER);
         title.setForeground(Color.WHITE);
         title.setPreferredSize(new Dimension(300,80));
         panel1.add(title);
          }
          
          pdflabel=new JLabel("PDF");
          pdflabel.setFont(font);
          pdflabel.setBounds(80, 220, 205, 20);
          main_panel.add(pdflabel);
          
          slidelabel=new JLabel("Slide");
          slidelabel.setFont(font);
          slidelabel.setBounds(320, 220, 205, 20);
          main_panel.add(slidelabel);
          
          classroutinelabel=new JLabel("ClassRoutine");
          classroutinelabel.setFont(font);
          classroutinelabel.setBounds(60, 410, 205, 20);
          main_panel.add(classroutinelabel);
          
          examroutinelabel=new JLabel("ExamRoutine");
          examroutinelabel.setFont(font);
          examroutinelabel.setBounds(290, 410, 205, 20);
          main_panel.add(examroutinelabel);
     }
     
     public void actionlistener(){
            pdf.addActionListener(new ActionListener() {
              
                public void actionPerformed(ActionEvent ae) {
                    dispose();
                    Pdf_books frame =new Pdf_books("Semester - "+semesternumber+" Pdf Books");
                    frame.setVisible(true);
                }
            });
            
             slide.addActionListener(new ActionListener() {
              
                public void actionPerformed(ActionEvent ae) {
                    dispose();
                    Slides frame =new Slides("Semester - "+semesternumber+" Slides");
                    frame.setVisible(true);
                }
            });
             
             back.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae) {
                 dispose();
                Home_frame frame = new Home_frame("IIT-Library");
                frame.setVisible(true);
            } });
             /*if(usertype==0){ update.addActionListener(new ActionListener() {
             
             public void actionPerformed(ActionEvent ae) {
             if(semesternumber==1){
             String URL="https://sites.google.com/site/iitlibrary121/home/pdf";
             try {
             java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
             } catch (IOException ex) {
             Logger.getLogger(Semester_details.class.getName()).log(Level.SEVERE, null, ex);
             }
             }
             if(semesternumber==2){
             String URL="https://sites.google.com/site/iitsemester2/semester2";
             try {
             java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
             } catch (IOException ex) {
             Logger.getLogger(Semester_details.class.getName()).log(Level.SEVERE, null, ex);
             }
             }
             if(semesternumber==3){
             String URL="https://sites.google.com/site/iitsemester3/semester3";
             try {
             java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
             } catch (IOException ex) {
             Logger.getLogger(Semester_details.class.getName()).log(Level.SEVERE, null, ex);
             }
             }
             if(semesternumber==4){
             
             }
             if(semesternumber==5){
             
             }
             if(semesternumber==6){
             
             }
             if(semesternumber==8){
             
             }
             }
             });}*/
            
             classroutine.addActionListener(new ActionListener() {
              
                public void actionPerformed(ActionEvent ae) {
                    if(semesternumber==1){
                        JOptionPane.showMessageDialog(null,"Content not added yet");
                    }
               
       
                 
                 if(semesternumber==2){
                    JOptionPane.showMessageDialog(null,"Content not added yet");
                 
                 }
                 if(semesternumber==3){
                     JOptionPane.showMessageDialog(null,"Content not added yet");
                 
                 }
                 if(semesternumber==4){
                 
                 }
                 if(semesternumber==5){
                 
                 }
                 if(semesternumber==6){
                 
                 }
                 if(semesternumber==8){
                 
                 }
                }
            });
             examroutine.addActionListener(new ActionListener() {
              
                public void actionPerformed(ActionEvent ae) {
                    if(semesternumber==1){
                 dispose();
                  SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                go("Semester 1 Examroutine.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_33459a3c5c97479fb4ff5f80c8b7b84e.pdf");
            }
        });
                 }
                 if(semesternumber==2){
                 JOptionPane.showMessageDialog(null,"Content not added yet");
                 }
                 if(semesternumber==3){
                 dispose();
                  SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                go("Semester 3 Examroutine.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_fdc949002a44400885974b538851250c.pdf");
            }
        });
                 }
                 if(semesternumber==4){
                 JOptionPane.showMessageDialog(null,"Content not added yet");
                 }
                 if(semesternumber==5){
                     dispose();
                  SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                go("Semester 5 Examroutine.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_a06728392e61437ea5204a7974484f1b.pdf");
            }
        });
                 
                 }
                 if(semesternumber==6){
                 
                 }
                 if(semesternumber==8){
                 
                 }
                }
            });
     }
    
     /*    public static void main(String[] args) {
     Semester_details frame = new Semester_details("Books");
     frame.setVisible(true);
     }*/
    
}
