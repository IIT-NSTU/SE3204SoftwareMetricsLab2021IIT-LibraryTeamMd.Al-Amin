
package sub_class;
//Shows available slides of each semester
import frames.book_pdf_frame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import static sub_class.Semester_details.semesternumber;
import static sub_class.Slides_details.slide_subject;


public class Slides extends book_pdf_frame{
    
    public JPanel main_panel;
    public String bookname;
    Font font=new Font("Arial",Font.BOLD,20);
    FlowLayout layout=new FlowLayout(FlowLayout.CENTER);
    public JButton back,cprogramming,discrete,it_and_society,DataStructure,OOP1,ComputerOrganization,AlgorithmAnalysis,NumericalAnalysis,OOP2,ComputerNetworks,TheoryofComputation;
    
    public Slides(String frame_title) {
        super(frame_title);
        setContainer();
        setMainPanel();
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
        main_panel.setBackground(Color.decode("#4da6ff"));
        main_panel.setLayout(layout); 
        layout.setVgap(20);
        container.add(main_panel);
    }
     
     public void setButton(){
         
         if(semesternumber==1){
           cprogramming=new JButton("C programming");
         cprogramming.setFont(font);
         cprogramming.setPreferredSize(new Dimension(300,50));
         main_panel.add(cprogramming);
         discrete=new JButton("Discrete Mathematics");
         discrete.setFont(font);
         discrete.setPreferredSize(new Dimension(300,50));
         main_panel.add(discrete);
         }
          if(semesternumber==2){
             OOP1=new JButton("Object Oriented Concepts I");
            OOP1.setFont(font);
            OOP1.setPreferredSize(new Dimension(300,50));
            main_panel.add(OOP1);
           ComputerOrganization=new JButton("Computer Organization");
           ComputerOrganization.setFont(font);
           ComputerOrganization.setPreferredSize(new Dimension(300,50));
           main_panel.add(ComputerOrganization);
          }
          if(semesternumber==3){
              /*AlgorithmAnalysis=new JButton("Algorithm Analysis");
              AlgorithmAnalysis.setFont(font);
              AlgorithmAnalysis.setPreferredSize(new Dimension(400,50));*/
            main_panel.add(AlgorithmAnalysis);
            OOP2=new JButton("Object Oriented Concepts II");
           OOP2.setFont(font);
            OOP2.setPreferredSize(new Dimension(400,50));
            main_panel.add(OOP2);
           ComputerNetworks=new JButton("Computer Networks");
           ComputerNetworks.setFont(font);
           ComputerNetworks.setPreferredSize(new Dimension(400,50));
            main_panel.add(ComputerNetworks);
            /*TheoryofComputation=new JButton("Theory of Computation");
            TheoryofComputation.setFont(font);
            TheoryofComputation.setPreferredSize(new Dimension(400,50));
            main_panel.add(TheoryofComputation);*/
          }
        back=new JButton("back");
        back.setPreferredSize(new Dimension(300,50));
        main_panel.add(back);
     } 
     
     private void buttonaction() {
         back.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae) {
                 dispose();
                Semester_details frame = new Semester_details("IIT-Library");
                frame.setVisible(true);
            } });
        if(semesternumber==1){
         cprogramming.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae) {
                 slide_subject = "CProgramming";
                 Slides_details frame = new Slides_details("C programming slides");
                 dispose();
                 frame.setVisible(true);
             }  });
         
         
         discrete.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae) {
                 slide_subject = "Discrete";
                 Slides_details frame = new Slides_details("Discrete slides");
                 dispose();
                 frame.setVisible(true);
             } });}
        
         if(semesternumber==2){      
        OOP1.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae) {
                 slide_subject = "OOP1";
                 Slides_details frame = new Slides_details("OOP1 slides");
                 dispose();
                 frame.setVisible(true); } });
        
         ComputerOrganization.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae) {
                 slide_subject = "ComputerOrganizations";
                 Slides_details frame = new Slides_details("ComputerOrganizations slides");
                 dispose();
                 frame.setVisible(true); } });}
         if(semesternumber==3){
         
         OOP2.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae) {
                slide_subject = "OOP2";
                 Slides_details frame = new Slides_details("OOP2 slides");
                 dispose();
                 frame.setVisible(true); } });
         
         ComputerNetworks.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae) {
            slide_subject = "ComputerNetworking";
                 Slides_details frame = new Slides_details("ComputerNetworking slides");
                 dispose();
                 frame.setVisible(true);
             }    
         });
         
         }
    }
       
    
     /*    public static void main(String[] args) {
     Slides frame = new Slides("IIT-Library");
     frame.setVisible(true);
     }*/

    
    
}
