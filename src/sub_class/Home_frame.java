
package sub_class;
//Comes after successfully login,from here user can access all the features of the application
import frames.main_frame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;


public class Home_frame extends main_frame{
    public JPanel main_panel,toppanel,leftpanel;
    public JButton search,teacherinfo,syllabus,offlinepdf;
    public JLabel teacherlabel,syllabuslabel,offlinepdflabel,elibrary;
    public JTextArea searcharea;
    public ImageIcon teacherImage,syllabusImage,offlinepdfImage;
    Font font=new Font("Arial",Font.BOLD,20);
    FlowLayout layout = new FlowLayout();
    JButton[] Semester=new JButton[10];
    public static String[] item=new String[20];
    public static String[] link=new String[20];
    public static int length;
    public Home_frame(String frame_title) {
        super(frame_title);
        setContainer();
        setMainPanel();
        setImage();
        setlabel();
        setbutton();
        setTextarea();
        actionlistener();
    }
    
     public void setContainer()
    {
        super.setContainer();
        container.setBackground(Color.WHITE);
    }
       
       public void setMainPanel()
    {
        //the middle part ,contains syllabus teacherinfo and offlinepdf option
        main_panel = new JPanel();
        main_panel.setBackground(Color.WHITE);
        main_panel.setLayout(null);  
        container.add(main_panel);
        //shows the application name and contains search part
         toppanel=new JPanel();
         toppanel.setBackground(Color.decode("#4da6ff"));
         toppanel.setBounds(0,0,900,100);
         toppanel.setLayout(null);
         layout.setHgap(20);
         main_panel.add(toppanel);
         //contains semester button and in the left part
         leftpanel=new JPanel();
         leftpanel.setBackground(Color.decode("#2471A3"));
         leftpanel.setBounds(0,100,300,500);
         leftpanel.setLayout(layout);
         layout.setVgap(10);
         main_panel.add(leftpanel);
    }
     public void setbutton(){
           for(int i=1;i<=8;i++){
             
             Semester[i]=new JButton("Semester-"+i);
             Semester[i].setFont(font);
             Semester[i].setForeground(Color.decode("#2471A3"));
             Semester[i].setPreferredSize(new Dimension(200,45));
             leftpanel.add( Semester[i]);
             
         }
           
        search=new JButton("Search");
        search.setBounds(740, 20, 125, 50);
        search.setBackground(Color.decode("#2471A3"));
        search.setForeground(Color.WHITE);
        search.setFont(font);
        toppanel.add(search);
        
        syllabus=new JButton(syllabusImage);
        syllabus.setBounds(350,130,205,180);
        main_panel.add( syllabus);
        teacherinfo=new JButton(teacherImage);
        teacherinfo .setBounds(660,130,205,180);
        main_panel.add(teacherinfo);
        offlinepdf=new JButton(offlinepdfImage);
        offlinepdf .setBounds(500,350,205,180);
        main_panel.add( offlinepdf);
         
     }
     
     public void setlabel(){
         elibrary=new JLabel("IIT-Library");
         elibrary.setFont(new Font("Arial",Font.BOLD,40));
         elibrary.setForeground(Color.WHITE);
         elibrary.setBounds(50, 15, 400, 70);
          toppanel.add(elibrary);
          syllabuslabel=new JLabel("Syllabus");
          syllabuslabel.setFont(font);
          syllabuslabel.setBounds(400, 320, 205, 20);
          main_panel.add(syllabuslabel);
           teacherlabel=new JLabel("Teacher's Info");
      teacherlabel.setFont(font);
      teacherlabel.setBounds(680, 320, 205, 20);
      main_panel.add(teacherlabel);
       offlinepdflabel=new JLabel("Offline Pdf");
      offlinepdflabel.setFont(font);
      offlinepdflabel.setBounds(550, 540, 205, 20);
      main_panel.add(offlinepdflabel);
     }
     
      public void setTextarea(){
         searcharea=new JTextArea();
        searcharea.setBounds(350, 20, 350, 50);
         searcharea.setBorder(new LineBorder(Color.decode("#2471A3"),3));
      searcharea.setFont(font);
      toppanel.add(searcharea);
     }
      
       public void setImage(){
          teacherImage=new ImageIcon(getClass().getResource("/icons/teacher.png"));
         syllabusImage=new ImageIcon(getClass().getResource("/icons/Syllabus.png"));
         offlinepdfImage=new ImageIcon(getClass().getResource("/icons/offlinePdf.jpg"));
     }
    
       public void actionlistener(){
         
          for(int i=1;i<=8;i++){
            int ivalue=i;
            Semester[i].addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent ae) { 
                    Semester_details.semesternumber=ivalue;
                    if(ivalue<=3){
                    dispose();    
                    Semester_details frame =new Semester_details("Semester");
                    frame.setVisible(true);
                }
                    else{
                        
                        if(ivalue==7) JOptionPane.showMessageDialog(null,"Intership");
                        else JOptionPane.showMessageDialog(null,"Content not added yet");
                    }
                }
            });
        }
          
          syllabus.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent ae) {
                  dispose();
                  SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Download_Without_saving.go("Syllabus.pdf","https://drive.google.com/uc?export=download&id=12QNwepr_oyOQUPPQ-Lvs8iRX_pNl-x4n");
            }
        });
              }
          });
          search.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent ae) {
                  String s = searcharea.getText().trim();
                  String noSpaceStr = s.replaceAll("\\s", "");
                  System.out.println(""+noSpaceStr);
                  int i = search_item.searchitem(noSpaceStr);
                  if(i>0){
                 
                 search_item frame = new search_item("Search");
                 frame.setVisible(true);
                 dispose();
                  }
                  else{
                      JOptionPane.showMessageDialog(null,"No such item");
                      searcharea.setText("");
                  } 
              }
          });
          offlinepdf.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent ae) {
                  Offlinepdf frame=new Offlinepdf();
                  //System.out.println(length);
                   if(length==0){
                        JOptionPane.showMessageDialog(null,"No Downloaded book yet");
                    }
                   else{
                   dispose();
                   frame.setBounds(100, 100, 600, 500);
                   frame.setTitle("IIT-Library");
                   frame.setLocationRelativeTo(null);
                   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                   frame.setVisible(true);
                   frame.setResizable(false);
                   
                }
                }
          });
          teacherinfo.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent ae) {
                   Teacher_info frame = new Teacher_info();
                     dispose();
                     frame.setVisible(true);
                     frame.setTitle("IIT-Library");
                     frame.setResizable(false);
                     frame.setBounds(0, 0, 825, 700);
                     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                     frame.setLocationRelativeTo(null);
              }
          });
          
     }
       
        public static void main(String[] args) {
       Home_frame frame = new Home_frame("IIT-Library");
       frame.setVisible(true);
       }
    
    
}
