
package sub_class;
//this class shows all the teacher information and we used card layout to show each teacher info
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Teacher_info extends JFrame implements ActionListener{
    
    private Container c;
    private JPanel panel;
    private JButton pbtn,nbtn,back;
    private CardLayout card;
    Font f=new Font("Arial",Font.BOLD,20);
    FlowLayout fl=new FlowLayout(FlowLayout.CENTER);
    
Teacher_info(){
        
       initcomponents();
       teacher_info();
      
    }
    
        
    
  public void initcomponents(){
    
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBounds(0, 0, 825, 700);
        c.setBackground(Color.decode("#2471A3"));
        
        card = new CardLayout();
        panel = new JPanel(card);
        panel.setBounds(0,0,820,580);
    
      
        c.add(panel);
        pbtn = new JButton("Previous");
        pbtn.setBounds(10,590,160,50);
        pbtn.setFont(f);
        c.add(pbtn);
        
        nbtn = new JButton("Next");
        nbtn.setBounds(630,590,160,50);
        nbtn.setFont(f);
        c.add(nbtn);
        back = new JButton("Back");
        back.setBounds(330,610,160,50);
        back.setFont(f);
        c.add(back);
        pbtn.addActionListener(this);
        nbtn.addActionListener(this);
        back.addActionListener(this);
    }
    @Override
  public void actionPerformed(ActionEvent e) {
        
    if(e.getSource()==pbtn){
        card.previous(panel);
    }
    else if(e.getSource()==back){
               dispose();
                Home_frame frame = new Home_frame("IIT-Library");
                frame.setVisible(true);
    }
    else
        card.next(panel);
}
   //the method sets all the teachers information in card
     private void teacher_info() {
        
      ImageIcon pic1=new ImageIcon(getClass().getResource("/icons/sumon_sir_pic.jpg"));
      ImageIcon pic2=new ImageIcon(getClass().getResource("/icons/bhuiyan_sir_pic.jpg"));
      ImageIcon pic3=new ImageIcon(getClass().getResource("/icons/dipanita_mem_pic.jpg"));
      ImageIcon pic4=new ImageIcon(getClass().getResource("/icons/falguni_mem_pic.jpg"));
      ImageIcon pic5 = new ImageIcon(getClass().getResource("/icons/dipok_sir_pic.jpg"));
      ImageIcon pic6=new ImageIcon(getClass().getResource("/icons/tasniya_mem_pic.jpg"));
      ImageIcon pic7= new ImageIcon(getClass().getResource("/icons/ifte_sir_pic.jpg"));
      
      
            JPanel sumon_sir_panel=new JPanel();
           sumon_sir_panel.setBounds(0,0,900,580);
            sumon_sir_panel.setLayout(null);
           sumon_sir_panel.setBackground(Color.decode("#D6EAF8" ));
            panel.add(sumon_sir_panel);
           
     
             
            JLabel sumonsirpic=new JLabel();
           sumonsirpic.setBounds(10,20, 400,540);
            Image image=pic1.getImage();
            Image newImage = image.getScaledInstance(sumonsirpic.getWidth(),sumonsirpic.getHeight(),Image.SCALE_SMOOTH);
            ImageIcon img3=new ImageIcon(newImage);
            sumonsirpic.setIcon(img3);
            sumon_sir_panel.add(sumonsirpic);
            
 
            JLabel sumon_sir_name = new JLabel("Md.Auhidur Rahman");
            sumon_sir_name.setBounds(430,50,200,100);
            sumon_sir_name.setFont(f);
            sumon_sir_name.setForeground(Color.decode("#2471A3"));
            sumon_sir_panel.add(sumon_sir_name);
            JLabel sumon_sir_designation= new JLabel("Assistant Professor & Director");
           sumon_sir_designation.setBounds(430,90,400,100);
            sumon_sir_designation.setForeground(Color.decode("#2471A3"));
            sumon_sir_designation.setFont(f);
            sumon_sir_panel.add(sumon_sir_designation);
           JLabel sumon_sir_Mblnum = new JLabel("Mobile:+8801815662160");
           sumon_sir_Mblnum.setBounds(430,130,270,100);
           sumon_sir_Mblnum.setFont(f);
          sumon_sir_Mblnum.setForeground(Color.decode("#2471A3"));
           sumon_sir_panel.add(sumon_sir_Mblnum);
        
           JLabel sumon_sir_Mailid = new JLabel("Email:auhidsumon@nstu.edu.bd");
          sumon_sir_Mailid.setBounds(430,170,380,100);
           sumon_sir_Mailid.setFont(f);
          sumon_sir_Mailid.setForeground(Color.decode("#2471A3"));
           sumon_sir_panel.add(sumon_sir_Mailid);
           JLabel dept= new JLabel("IIT,NSTU");
           dept.setBounds(430,210,290,100);
           dept.setFont(f);
          dept.setForeground(Color.decode("#2471A3"));
           sumon_sir_panel.add(dept);
            
        
        
           JPanel bhuiyan_sir_panel=new JPanel();
           bhuiyan_sir_panel.setBounds(0,0,900,580);
           bhuiyan_sir_panel.setLayout(null);
           bhuiyan_sir_panel.setBackground(Color.decode("#D6EAF8"));
           panel.add(bhuiyan_sir_panel);
             
    
             
           JLabel bhuiyansirpic=new JLabel();
           bhuiyansirpic.setBounds(10,20, 400,540);
           Image image2=pic2.getImage();
           Image newImage2 = image2.getScaledInstance(bhuiyansirpic.getWidth(),bhuiyansirpic.getHeight(),Image.SCALE_SMOOTH);
           ImageIcon img4=new ImageIcon(newImage2);
           bhuiyansirpic.setIcon(img4);
           bhuiyan_sir_panel.add(bhuiyansirpic);
            
           
               
           JLabel bhuiyan_sir_name = new JLabel("Md.Nuruzzaman Bhuiyan");
           bhuiyan_sir_name.setBounds(430,50,280,100);
           bhuiyan_sir_name.setFont(f);
           bhuiyan_sir_name.setForeground(Color.decode("#2471A3"));
           bhuiyan_sir_panel.add(bhuiyan_sir_name);
           JLabel bhuiyan_sir_designation= new JLabel("Assistant Professor");
           bhuiyan_sir_designation.setBounds(430,90,270,100);
           bhuiyan_sir_designation.setFont(f);
           bhuiyan_sir_designation.setForeground(Color.decode("#2471A3"));
           bhuiyan_sir_panel.add(bhuiyan_sir_designation);
           JLabel bhuiyan_sir_Mblnum = new JLabel("Mobile:+8801612032781");
           bhuiyan_sir_Mblnum.setBounds(430,130,270,100);
           bhuiyan_sir_Mblnum.setFont(f);
           bhuiyan_sir_Mblnum.setForeground(Color.decode("#2471A3"));
           bhuiyan_sir_panel.add(bhuiyan_sir_Mblnum);
        
           JLabel bhuiyan_sir_Mailid = new JLabel("Email:nuruzzaman.iit@nstu.edu.bd");
           bhuiyan_sir_Mailid.setBounds(430,170,390,100);
           bhuiyan_sir_Mailid.setFont(f);
           bhuiyan_sir_Mailid.setForeground(Color.decode("#2471A3"));
           bhuiyan_sir_panel.add(bhuiyan_sir_Mailid);
           JLabel dept1= new JLabel("IIT,NSTU");
           dept1.setBounds(430,210,290,100);
           dept1.setFont(f);
           dept1.setForeground(Color.decode("#2471A3"));
           bhuiyan_sir_panel.add(dept1);
        
           JPanel dipa_mem_panel=new JPanel();
           dipa_mem_panel.setBounds(0,0,900,580);
           dipa_mem_panel.setLayout(null);
           dipa_mem_panel.setBackground(Color.decode("#D6EAF8"));
           panel.add(dipa_mem_panel);
           
      
             
          JLabel dipamempic=new JLabel();
          dipamempic.setBounds(10,20, 400,540);
          Image image3=pic3.getImage();
          Image newImage3 = image3.getScaledInstance(dipamempic.getWidth(),dipamempic.getHeight(),Image.SCALE_SMOOTH);
          ImageIcon img5=new ImageIcon(newImage3);
          dipamempic.setIcon(img5);
          dipa_mem_panel.add(dipamempic);
            
           
          JLabel dipa_mem_name = new JLabel("Dipanita Saha");
          dipa_mem_name.setBounds(430,50,200,100);
          dipa_mem_name.setFont(f);
          dipa_mem_name.setForeground(Color.decode("#2471A3"));
          dipa_mem_panel.add(dipa_mem_name);
          JLabel dipa_mem_designation= new JLabel("Assistant Professor");
          dipa_mem_designation.setBounds(430,90,270,100);
          dipa_mem_designation.setFont(f);
          dipa_mem_designation.setForeground(Color.decode("#2471A3"));
          dipa_mem_panel.add(dipa_mem_designation);
          JLabel dipa_mem_Mblnum = new JLabel("Mobile:+8801534373338");
          dipa_mem_Mblnum.setBounds(430,130,270,100);
          dipa_mem_Mblnum.setFont(f);
          dipa_mem_Mblnum.setForeground(Color.decode("#2471A3"));
          dipa_mem_panel.add(dipa_mem_Mblnum);
        
          JLabel dipa_mem_Mailid = new JLabel("Email:dipanita.iit@nstu.edu.bd");
          dipa_mem_Mailid.setBounds(430,170,290,100);
          dipa_mem_Mailid.setFont(f);
          dipa_mem_Mailid.setForeground(Color.decode("#2471A3"));
          dipa_mem_panel.add(dipa_mem_Mailid);
          JLabel dept3= new JLabel("IIT,NSTU");
          dept3.setBounds(430,210,290,100);
          dept3.setFont(f);
          dept3.setForeground(Color.decode("#2471A3"));
          dipa_mem_panel.add(dept3);
             
        
           JPanel falguni_mem_panel=new JPanel();
           falguni_mem_panel.setBounds(0,0,900,580);
           falguni_mem_panel.setLayout(null);
           falguni_mem_panel.setBackground(Color.decode("#D6EAF8"));
           panel.add(falguni_mem_panel);
           
      
             
             
             
             
           JLabel falgunimempic=new JLabel();
           falgunimempic.setBounds(10,20, 400,540);
           Image image4=pic4.getImage();
           Image newImage4 = image4.getScaledInstance(falgunimempic.getWidth(),falgunimempic.getHeight(),Image.SCALE_SMOOTH);
           ImageIcon img6=new ImageIcon(newImage4);
           falgunimempic.setIcon(img6);
           falguni_mem_panel.add(falgunimempic);
            
 
           JLabel falguni_mem_name = new JLabel("Falguni Roy");
           falguni_mem_name.setBounds(430,50,200,100);
           falguni_mem_name.setFont(f);
           falguni_mem_name.setForeground(Color.decode("#2471A3"));
           falguni_mem_panel.add(falguni_mem_name);
           JLabel falguni_mem_designation= new JLabel("Assistant Professor");
           falguni_mem_designation.setBounds(430,90,270,100);
           falguni_mem_designation.setFont(f);
           falguni_mem_designation.setForeground(Color.decode("#2471A3"));
           falguni_mem_panel.add(falguni_mem_designation);
           JLabel falguni_mem_Mblnum = new JLabel("Mobile:+8801680446978");
           falguni_mem_Mblnum.setBounds(430,130,270,100);
           falguni_mem_Mblnum.setFont(f);
           falguni_mem_Mblnum.setForeground(Color.decode("#2471A3"));
           falguni_mem_panel.add(falguni_mem_Mblnum);
        
           JLabel falguni_mem_Mailid = new JLabel("Email:falguniroy.iit@nstu.edu.bd");
           falguni_mem_Mailid.setBounds(430,170,320,100);
           falguni_mem_Mailid.setFont(f);
           falguni_mem_Mailid.setForeground(Color.decode("#2471A3"));
           falguni_mem_panel.add(falguni_mem_Mailid);
           JLabel dept5= new JLabel("IIT,NSTU");
           dept5.setBounds(430,210,290,100);
           dept5.setFont(f);
           dept5.setForeground(Color.decode("#2471A3"));
           falguni_mem_panel.add(dept5); 
        
        
            JPanel dipok_sir_panel=new JPanel();
            dipok_sir_panel.setBounds(0,0,900,580);
            dipok_sir_panel.setLayout(null);
            dipok_sir_panel.setBackground(Color.decode("#D6EAF8"));
            panel.add(dipok_sir_panel);
           
          
            JLabel dipoksirpic=new JLabel();
            dipoksirpic.setBounds(10,20, 400,540);
            Image image5=pic5.getImage();
            Image newImage5 = image5.getScaledInstance(dipoksirpic.getWidth(),dipoksirpic.getHeight(),Image.SCALE_SMOOTH);
            ImageIcon img7=new ImageIcon(newImage5);
            dipoksirpic.setIcon(img7);
            dipok_sir_panel.add(dipoksirpic);
            
 
            JLabel dipok_sir_name = new JLabel("Dipok Chandra Das");
            dipok_sir_name.setBounds(430,50,200,100);
            dipok_sir_name.setFont(f);
            dipok_sir_name.setForeground(Color.decode("#2471A3"));
            dipok_sir_panel.add(dipok_sir_name);
            JLabel dipok_sir_designation= new JLabel("Assistant Professor");
            dipok_sir_designation.setBounds(430,90,270,100);
            dipok_sir_designation.setFont(f);
            dipok_sir_designation.setForeground(Color.decode("#2471A3"));
            dipok_sir_panel.add(dipok_sir_designation);
            JLabel dipok_sir_Mblnum = new JLabel("Mobile:+8801743972128");
            dipok_sir_Mblnum.setBounds(430,130,270,100);
            dipok_sir_Mblnum.setFont(f);
            dipok_sir_Mblnum.setForeground(Color.decode("#2471A3"));
            dipok_sir_panel.add(dipok_sir_Mblnum);
        
            
            JLabel dipok_sir_Mailid = new JLabel("Email:dipok.iit@nstu.edu.bd");
            dipok_sir_Mailid.setBounds(430,170,380,100);
            dipok_sir_Mailid.setFont(f);
            dipok_sir_Mailid.setForeground(Color.decode("#2471A3"));
            dipok_sir_panel.add(dipok_sir_Mailid);
            JLabel dept6= new JLabel("IIT,NSTU");
            dept6.setBounds(430,210,290,100);
            dept6.setFont(f);
            dept6.setForeground(Color.decode("#2471A3"));
            dipok_sir_panel.add(dept6);
            
       
            
            JPanel tasniya_mem_panel=new JPanel();
            tasniya_mem_panel.setBounds(0,0,900,580);
            tasniya_mem_panel.setLayout(null);
            tasniya_mem_panel.setBackground(Color.decode("#D6EAF8"));
            panel.add(tasniya_mem_panel);
           
      
             
             
            JLabel tasniyamempic=new JLabel();
            tasniyamempic.setBounds(10,20, 400,540);
            Image image6=pic6.getImage();
            Image newImage6 = image6.getScaledInstance(tasniyamempic.getWidth(),tasniyamempic.getHeight(),Image.SCALE_SMOOTH);
            ImageIcon img8=new ImageIcon(newImage6);
            tasniyamempic.setIcon(img8);
            tasniya_mem_panel.add(tasniyamempic);
            
 
           JLabel tasniya_mem_name = new JLabel("Tasniya Ahmed");
           tasniya_mem_name.setBounds(430,50,200,100);
           tasniya_mem_name.setFont(f);
           tasniya_mem_name.setForeground(Color.decode("#2471A3"));
           tasniya_mem_panel.add(tasniya_mem_name);
           JLabel tasniya_mem_designation= new JLabel("Lecturer");
           tasniya_mem_designation.setBounds(430,90,270,100);
           tasniya_mem_designation.setFont(f);
            tasniya_mem_designation.setForeground(Color.decode("#2471A3"));
           tasniya_mem_panel.add(tasniya_mem_designation);
           JLabel tasniya_mem_Mblnum = new JLabel("Mobile:+8801936543596");
           tasniya_mem_Mblnum.setBounds(430,130,270,100);
           tasniya_mem_Mblnum.setFont(f);
            tasniya_mem_Mblnum.setForeground(Color.decode("#2471A3"));
           tasniya_mem_panel.add(tasniya_mem_Mblnum);
        
           JLabel tasniya_mem_Mailid = new JLabel("Email:tasniya.iit@nstu.edu.bd");
           tasniya_mem_Mailid.setBounds(430,170,350,100);
           tasniya_mem_Mailid.setFont(f);
            tasniya_mem_Mailid.setForeground(Color.decode("#2471A3"));
           tasniya_mem_panel.add(tasniya_mem_Mailid);
           JLabel dept7= new JLabel("IIT,NSTU");
           dept7.setBounds(430,210,290,100);
           dept7.setFont(f);
           dept7.setForeground(Color.decode("#2471A3"));
           tasniya_mem_panel.add(dept7);
       
           JPanel ifte_sir_panel=new JPanel();
           ifte_sir_panel.setBounds(0,0,900,580);
           ifte_sir_panel.setLayout(null);
           ifte_sir_panel.setBackground(Color.decode("#D6EAF8"));
           panel.add(ifte_sir_panel);
           
             
 
           JLabel iftesirpic=new JLabel();
           iftesirpic.setBounds(10,20, 400,540);
           Image image7=pic7.getImage();
           Image newImage7 = image7.getScaledInstance(iftesirpic.getWidth(),iftesirpic.getHeight(),Image.SCALE_SMOOTH);
           ImageIcon img9=new ImageIcon(newImage7);
           iftesirpic.setIcon(img9);
           ifte_sir_panel.add(iftesirpic);
            
 
           JLabel ifte_sir_name = new JLabel("Md.Iftekharul Alam Efat");
           ifte_sir_name.setBounds(430,50,240,100);
           ifte_sir_name.setFont(f);
          ifte_sir_name.setForeground(Color.decode("#2471A3"));
          ifte_sir_panel.add(ifte_sir_name);
          JLabel ifte_sir_designation= new JLabel("Assistant Professor");
          ifte_sir_designation.setBounds(430,90,270,100);
          ifte_sir_designation.setFont(f);
          ifte_sir_designation.setForeground(Color.decode("#2471A3"));
          ifte_sir_panel.add(ifte_sir_designation);
          JLabel ifte_sir_Mblnum = new JLabel("Mobile:+8801727208714");
          ifte_sir_Mblnum.setBounds(430,130,270,100);
          ifte_sir_Mblnum.setFont(f);
          ifte_sir_Mblnum.setForeground(Color.decode("#2471A3"));
          ifte_sir_panel.add(ifte_sir_Mblnum);
        
          JLabel ifte_sir_Mailid = new JLabel("Email:iftekhar.iit@nstu.edu.bd");
          ifte_sir_Mailid.setBounds(430,170,350,100);
          ifte_sir_Mailid.setFont(f);
          ifte_sir_Mailid.setForeground(Color.decode("#2471A3"));
          ifte_sir_panel.add(ifte_sir_Mailid);
          JLabel dept9= new JLabel("IIT,NSTU");
          dept9.setBounds(430,210,290,100);
          dept9.setFont(f);
          dept9.setForeground(Color.decode("#2471A3"));
          ifte_sir_panel.add(dept9);

        
    }
    
     /*    public static void main(String[] args) {
     Teacher_info frame = new Teacher_info();
     frame.setVisible(true);
     frame.setTitle("IIT-Library");
     frame.setBounds(0, 0, 825, 700);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setLocationRelativeTo(null);
     }*/
    
}
