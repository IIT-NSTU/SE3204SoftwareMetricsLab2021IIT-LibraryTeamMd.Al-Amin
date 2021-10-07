
package sub_class;
//The very first frame and used for login of users
import frames.main_frame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Welcome_frame extends main_frame {
    public JButton loginbutton,teacherlogin;
    public JLabel label;
    public JPanel main_panel;
    Font font=new Font("Arial",Font.BOLD,20);
    public String username,password;
     public static Scanner scanner;
     public int usertype; //0 means students and 1 means teachers
    
     public Welcome_frame(String frame_title) {
        super(frame_title);
        setContainer();
        setMainPanel();
        setlabel();
        setbutton();
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
    }
     public void setbutton(){
           loginbutton=new JButton("Student Login");
           loginbutton.setBounds(440, 450, 180, 50);
           loginbutton.setFont(font);
           main_panel.add(loginbutton);
           
           teacherlogin=new JButton("Teacher Login");
           teacherlogin.setBounds(240, 450, 180, 50);
           teacherlogin.setFont(font);
           main_panel.add(teacherlogin);
         
     }
     
     public void setlabel(){
           label=new JLabel("Welcome to IIT-Library");
           label.setBounds(0,0,900, 100);
           label.setHorizontalAlignment(JLabel.CENTER);
           label.setVerticalAlignment(JLabel.CENTER);
           label.setFont(new Font("Arial",Font.BOLD,40));
           label.setOpaque(true);
           label.setForeground(Color.WHITE);
           label.setBackground(Color.decode("#2471A3"));
           main_panel.add(label);
           
           ImageIcon LogoImage=new ImageIcon(getClass().getResource("/icons/iit-logo.jpg"));
           JLabel image=new JLabel();
           image.setIcon(LogoImage);
           image.setBounds(280,20, 400, 500);
           main_panel.add(image);
     }
     
     public void actionlistener(){
         loginbutton.addActionListener(new ActionListener() {
            
             public void actionPerformed(ActionEvent ae) {
                 username=JOptionPane.showInputDialog(null,"Enter Your Name","Login", JOptionPane.INFORMATION_MESSAGE);
                 password=JOptionPane.showInputDialog(null,"Enter Your ID","Login", JOptionPane.INFORMATION_MESSAGE);
                  if(username== null || password ==null){
                     JOptionPane.showMessageDialog(null, "You can not cancel input");
                 }
                  else{
                 username=username.trim();
                  username=username.replaceAll("\\s","");
                  password=password.trim();
                  if(username.isEmpty()) JOptionPane.showMessageDialog(null, "Please Enter User Name");
                  else if(password.isEmpty()) JOptionPane.showMessageDialog(null, "Please Enter Your ID");
                  else{
                   int i=SearchStudent(username,password);
                     if(i==0){
                     JOptionPane.showMessageDialog(null, "Wrong name or password");
                     }
                     else{
                      Semester_details.usertype=1;
                      JOptionPane.showMessageDialog(null, "sucessfully log in");
                      Home_frame frame = new Home_frame("IIT-Library");
                      frame.setVisible(true);
                      dispose();
                     }}}
             }
         });
         
         teacherlogin.addActionListener(new ActionListener() {
            
             public void actionPerformed(ActionEvent ae) {
                 username=JOptionPane.showInputDialog(null,"Enter Your Name","Login", JOptionPane.INFORMATION_MESSAGE);
                 password=JOptionPane.showInputDialog(null,"Enter Your ID","Login", JOptionPane.INFORMATION_MESSAGE);
                 if(username== null || password ==null){
                     JOptionPane.showMessageDialog(null, "You can not cancel input");
                 }
                 else{
                  username=username.trim();
                  username=username.replaceAll(" ","");
                  password=password.trim();
                  
                  if(username.equals("IIT") && password.equals("1234")){
                      Semester_details.usertype=0;
                      JOptionPane.showMessageDialog(null, "sucessfully log in");
                      Home_frame frame = new Home_frame("IIT-Library");
                      frame.setVisible(true);
                      dispose();
                  }
                  else{
                      if(username.isEmpty()){
                      JOptionPane.showMessageDialog(null, "Please Enter user name");
                  }
                      else if(password.isEmpty()){
                      JOptionPane.showMessageDialog(null, "Please Enter password");
                  }
                      else JOptionPane.showMessageDialog(null, "Wrong User name or password");
                  }}
             }
         });
     }
     
     //this section checks a student name and id and if valid return i>0 
     public  int SearchStudent(String username,String roll){
                 String studentname,studentroll;
                 File f=new File("StudentInfo.txt");       
                   int i=0;
                   try {
                 scanner=new Scanner(new File(f.getAbsolutePath()));
                  scanner.useDelimiter("[,\n]");
                  while(scanner.hasNext()){
                      studentname=scanner.next();
                      studentroll=scanner.next().trim();
                  if(studentname.equalsIgnoreCase(username)&&studentroll.equalsIgnoreCase(roll)){
                         i++;
                }
            }
           scanner.close();
        } catch (FileNotFoundException ex) {
            
        }
                   return i;
    }
     
     
     
     
     /*    public static void main(String[] args) {
     Welcome_frame frame= new Welcome_frame("IIT-Library");
     frame.setVisible(true);
     
     }*/
}
