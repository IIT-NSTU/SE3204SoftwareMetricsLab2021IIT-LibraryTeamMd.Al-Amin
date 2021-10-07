
package sub_class;
//shows available slides of each subject
import frames.book_pdf_frame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import static sub_class.Pdf_books.dirName;
import static sub_class.Pdf_books.pdffilepath;
import static sub_class.Semester_details.semesternumber;
import static sub_class.Download_Without_saving.go;


public class Slides_details extends book_pdf_frame{
    
    public JPanel main_panel;
    public String bookname;
    Font font=new Font("Arial",Font.BOLD,15);
    FlowLayout layout=new FlowLayout(FlowLayout.CENTER);
    public JButton c_array,c_introduction,c_looping,c_expressions,Dis_chapter1,Dis_chapter2,Dis_chapter3,Dis_chapter8,Dis_chapter9;
    public JButton co_intro,co_top_level_view,co_cache_memory,co_internal_memory,co_input_output,co_instruction_sets,co_instruction_sets_addressing;
    public JButton oop1_intro,oop1_data_types,oop1_control_statement,oop1_array,oop1_Class,oop1_modifire,oop1_overloading_inheriting,oop1_polymorphism_abstraction,oop1_uml,oop1_exception_handle,oop1_association;
    public JButton back,oop2_intro,oop2_swing,oop2_swing_event,oop2_thread,oop2_generics;
    public JButton cn_chapter1,cn_chapter2,cn_network_layer,cn_ip_address,cn_application_layer,cn_transport_layer,cn_network_layer2,cn_routing;
    public  static String slide_subject;
    public Slides_details(String frame_title) {
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
        layout.setVgap(15);
        container.add(main_panel);
    }
     
     public void setButton(){
         
           
         
         if(semesternumber==1){
                if(slide_subject.equals("CProgramming")){
            c_introduction=new JButton("Introduction");
            c_introduction.setFont(font);
            c_introduction.setPreferredSize(new Dimension(300,50));
            main_panel.add(c_introduction); 
            c_array=new JButton("Arrays");
            c_array.setFont(font);
            c_array.setPreferredSize(new Dimension(300,50));
            main_panel.add(c_array);
            c_expressions=new JButton("Expressions");
            c_expressions.setFont(font);
            c_expressions.setPreferredSize(new Dimension(300,50));
            main_panel.add(c_expressions); 
            c_looping=new JButton("Decisions making and looping");
            c_looping.setFont(font);
            c_looping.setPreferredSize(new Dimension(300,50));
            main_panel.add(c_looping);
                }
                if(slide_subject.equals("Discrete")){
            Dis_chapter1=new JButton("Chapter 1");
            Dis_chapter1.setFont(font);
            Dis_chapter1.setPreferredSize(new Dimension(300,50));
            main_panel.add(Dis_chapter1); 
            Dis_chapter2=new JButton("Chapter 2");
            Dis_chapter2.setFont(font);
            Dis_chapter2.setPreferredSize(new Dimension(300,50));
            main_panel.add(Dis_chapter2); 
            Dis_chapter3=new JButton("Chapter 3");
            Dis_chapter3.setFont(font);
            Dis_chapter3.setPreferredSize(new Dimension(300,50));
            main_panel.add(Dis_chapter3); 
            Dis_chapter8=new JButton("Chapter 8");
            Dis_chapter8.setFont(font);
            Dis_chapter8.setPreferredSize(new Dimension(300,50));
            main_panel.add(Dis_chapter8); 
            Dis_chapter9=new JButton("Chapter 9");
            Dis_chapter9.setFont(font);
            Dis_chapter9.setPreferredSize(new Dimension(300,50));
            main_panel.add(Dis_chapter9); 
                }
         }
          if(semesternumber==2){
             if(slide_subject.equals("ComputerOrganizations")){
            co_intro=new JButton("Introduction");
            co_intro.setFont(font);
            co_intro.setPreferredSize(new Dimension(300,40));
            main_panel.add(co_intro); 
            co_top_level_view=new JButton("Top Level View");
            co_top_level_view.setFont(font);
            co_top_level_view.setPreferredSize(new Dimension(300,40));
            main_panel.add(co_top_level_view);
            co_cache_memory=new JButton("Cache Memory");
            co_cache_memory.setFont(font);
            co_cache_memory.setPreferredSize(new Dimension(300,40));
            main_panel.add(co_cache_memory); 
            co_internal_memory=new JButton("Internal Memory");
            co_internal_memory.setFont(font);
            co_internal_memory.setPreferredSize(new Dimension(300,40));
            main_panel.add(co_internal_memory);
            co_input_output=new JButton("Input Output");
            co_input_output.setFont(font);
            co_input_output.setPreferredSize(new Dimension(300,40));
            main_panel.add(co_input_output);
            co_instruction_sets=new JButton("Instructions sets");
            co_instruction_sets.setFont(font);
            co_instruction_sets.setPreferredSize(new Dimension(300,40));
            main_panel.add(co_instruction_sets); 
            co_instruction_sets_addressing=new JButton("Instruction Sets Addressing");
            co_instruction_sets_addressing.setFont(font);
            co_instruction_sets_addressing.setPreferredSize(new Dimension(300,40));
            main_panel.add(co_instruction_sets_addressing);
                }
                if(slide_subject.equals("OOP1")){
            oop1_intro=new JButton("Introduction");
            oop1_intro.setFont(font);
            oop1_intro.setPreferredSize(new Dimension(300,30));
            main_panel.add(oop1_intro); 
            oop1_data_types=new JButton("Data type & Expressions");
            oop1_data_types.setFont(font);
            oop1_data_types.setPreferredSize(new Dimension(300,30));
            main_panel.add(oop1_data_types); 
            oop1_control_statement=new JButton("Control Statement");
            oop1_control_statement.setFont(font);
            oop1_control_statement.setPreferredSize(new Dimension(300,30));
            main_panel.add(oop1_control_statement); 
            oop1_array=new JButton("Java Array");
            oop1_array.setFont(font);
            oop1_array.setPreferredSize(new Dimension(300,30));
            main_panel.add(oop1_array); 
            oop1_Class=new JButton("Java Class");
            oop1_Class.setFont(font);
            oop1_Class.setPreferredSize(new Dimension(300,30));
            main_panel.add(oop1_Class); 
            oop1_modifire=new JButton("Modifire & Encapsulation");
            oop1_modifire.setFont(font);
            oop1_modifire.setPreferredSize(new Dimension(300,30));
            main_panel.add(oop1_modifire); 
            oop1_overloading_inheriting=new JButton("Overloading and inheritance");
            oop1_overloading_inheriting.setFont(font);
            oop1_overloading_inheriting.setPreferredSize(new Dimension(300,30));
            main_panel.add(oop1_overloading_inheriting); 
            oop1_polymorphism_abstraction=new JButton("Polymorphism & Abstraction");
            oop1_polymorphism_abstraction.setFont(font);
            oop1_polymorphism_abstraction.setPreferredSize(new Dimension(300,30));
            main_panel.add(oop1_polymorphism_abstraction); 
            oop1_uml=new JButton("UML details");
            oop1_uml.setFont(font);
            oop1_uml.setPreferredSize(new Dimension(300,30));
            main_panel.add(oop1_uml); 
            oop1_exception_handle=new JButton("Exception Handling");
            oop1_exception_handle.setFont(font);
            oop1_exception_handle.setPreferredSize(new Dimension(300,30));
            main_panel.add(oop1_exception_handle); 
            oop1_association=new JButton("Association");
            oop1_association.setFont(font);
            oop1_association.setPreferredSize(new Dimension(300,30));
            main_panel.add(oop1_association); 
                }
          }
          if(semesternumber==3){
                if(slide_subject.equals("OOP2")){
            oop2_intro=new JButton("Introduction");
            oop2_intro.setFont(font);
            oop2_intro.setPreferredSize(new Dimension(300,50));
            main_panel.add(oop2_intro); 
            oop2_swing=new JButton("Swing");
            oop2_swing.setFont(font);
            oop2_swing.setPreferredSize(new Dimension(300,50));
            main_panel.add(oop2_swing);
            oop2_swing_event=new JButton("Swing Event");
            oop2_swing_event.setFont(font);
            oop2_swing_event.setPreferredSize(new Dimension(300,50));
            main_panel.add(oop2_swing_event); 
            oop2_thread=new JButton("Thread");
            oop2_thread.setFont(font);
            oop2_thread.setPreferredSize(new Dimension(300,50));
            main_panel.add(oop2_thread);
            oop2_generics=new JButton("Generics");
            oop2_generics.setFont(font);
            oop2_generics.setPreferredSize(new Dimension(300,50));
            main_panel.add(oop2_generics);
                }
                if(slide_subject.equals("ComputerNetworking")){
            cn_chapter1=new JButton("Chapter 1");
            cn_chapter1.setFont(font);
            cn_chapter1.setPreferredSize(new Dimension(300,50));
            main_panel.add(cn_chapter1); 
            cn_chapter2=new JButton("Chapter 2");
            cn_chapter2.setFont(font);
            cn_chapter2.setPreferredSize(new Dimension(300,50));
            main_panel.add(cn_chapter2); 
            cn_network_layer=new JButton("Network Layer");
            cn_network_layer.setFont(font);
            cn_network_layer.setPreferredSize(new Dimension(300,50));
            main_panel.add(cn_network_layer); 
            cn_ip_address=new JButton("Ip Address");
            cn_ip_address.setFont(font);
            cn_ip_address.setPreferredSize(new Dimension(300,50));
            main_panel.add(cn_ip_address); 
            cn_transport_layer=new JButton("Transport Layer");
            cn_transport_layer.setFont(font);
            cn_transport_layer.setPreferredSize(new Dimension(300,50));
            main_panel.add(cn_transport_layer); 
            cn_network_layer2=new JButton("Network Layer-2");
            cn_network_layer2.setFont(font);
            cn_network_layer2.setPreferredSize(new Dimension(300,50));
            main_panel.add(cn_network_layer2); 
                }
          }
        back=new JButton("back");
        back.setPreferredSize(new Dimension(300,30));
        main_panel.add(back);
     } 
     
     private void buttonaction() {
       String[] options = {"View","Download"};
       back.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae) {
                 dispose();
                Slides frame = new Slides("IIT-Library");
                frame.setVisible(true);
            } });
        if(semesternumber==1){
            if(slide_subject.equals("CProgramming")){
               //buttons are = c_array,c_introduction,c_looping,c_expressions
                c_introduction.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                   dispose();
                 int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_1398a77215bc429c981565cbf31df8f3.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("C_introduction.pptx","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_f5ab75b553ff4229acccb3129cabf18a.pptx?dn=C_Introduction.pptx");
                }
                }  });
                c_array.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                     dispose();
                     int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_88baa8675e604a268be555ee19e0a7ef.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("C_Array.pptx","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_45d2caaebbba449797f0876837c3bc9d.pptx?dn=Arrays.pptx");
                }
                }  });
                c_expressions.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                 dispose();
                        int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_cc166f3f60434954b629b9ebbbbca281.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("C_Expressions.pptx","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_8687d146477346399dfd4692a54840ac.pptx?dn=Expressions.pptx");
                }
                }  });
                c_looping.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();
                     int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_7e99a5739d0244548ed26c0cce674194.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("C_Decision making and looping.pptx","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_58a39a509bcd4fc7ae8621003a668a34.pptx?dn=Decision_making_and_looping.pptx");
                }
                }  });
            }
            if(slide_subject.equals("Discrete")){
               //Dis_chapter1,Dis_chapter2,Dis_chapter3,Dis_chapter8,Dis_chapter9
                Dis_chapter1.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();
                     int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_e707ba6e54af483ab66659e4e48dbeb5.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("Discrete Chapter 1.pptx","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_303eb49c2b824a2c94b6a153fd185754.pptx?dn=Dis_Chapter1.pptx");
                }
                }  });
                Dis_chapter2.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();
                     int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_a784f440aa4b4498aca834e2f1e98851.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("Discrete chapter 2.pptx","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_3c9d8b1ece79498caab4be87a2172016.pptx?dn=Dis_chapter2.pptx");
                }
                }  });
                Dis_chapter3.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();
                     int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_b0e815ca418d4ae7a26f7fa33b201cbe.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("Discrete chapter 3.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_b0e815ca418d4ae7a26f7fa33b201cbe.pdf");
                }
                }  });
                Dis_chapter8.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();
                     int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_6f0fc9d9e1054adaba57cdedb30cab63.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("Discrete chapter 8.ppt","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_0533cfd459da494e8e3a55f554082d6f.ppt?dn=Dis_chapter8_Graphs.ppt");
                }
                }  });
                Dis_chapter9.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();
                     int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_0652a9095d0c4ae0bccdfe3755806eac.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("Discrete chapter 9.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_0652a9095d0c4ae0bccdfe3755806eac.pdf");
                }
                }  });
            }
         }
        
         if(semesternumber==2){      
             if(slide_subject.equals("OOP1")){
               //oop1_intro,oop1_data_types,oop1_control_statement,oop1_array,oop1_Class,oop1_modifire,oop1_overloading_inheriting,oop1_polymorphism_abstraction,oop1_uml,oop1_exception_handle,oop1_association
                oop1_intro.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();
                     int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_2c3aeff0e681411088dcb7f609799459.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("OOP1 Introduction.pptx","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_0cc28a4b3f6c403987d3e9e7eb73a50c.pptx?dn=1.%20OOP_Introduction.pptx");
                }
                }  });
                oop1_data_types.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();
                     int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_b1e217c326794b27bf97af9be32e4653.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("oop1 data types and expressions.ppt","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_8f6d65d2e3bd4dda906f4cbdf2743f57.ppt?dn=2.Data%20types.ppt");
                }
                }  });
                oop1_control_statement.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();
                     int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_54a60366f6574ad680e3b2e95fbb305c.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("OOP1 control statement.ppt","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_26d9dd6972704108acdc77ed809fe7dc.ppt?dn=3.%20Java_Control_Statements.ppt");
                }
                }  });
                oop1_array.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();
                     int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_7462eddff2b04601b1ec59e563032d29.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("OOP1 Array.pptx","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_181b6e4994864381acc0d05f9888dfbc.pptx?dn=4.%20Jave%20array.pptx");
                }
                }  });
                oop1_Class.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();
                     int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_7a49416c5a494e27b1d0e55ed05a958c.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("OOP1 class.pptx","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_ef83e26200624b33be53498b04a62176.pptx?dn=5.%20Jave%20Class.pptx");
                }
                }  });
                oop1_modifire.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();
                     int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_fd3b5c59c7224760a7984fac3fe2c01f.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("OOP1 class modifire.pptx","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_ceb883750bf042a3aafec76521b30b65.pptx?dn=7.%20Access%20Modifire%20%26%20Encapsulation.pptx");
                }
                }  });
                oop1_overloading_inheriting.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();
                     int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_5ce62cca0b6740c2b927e7e466cca344.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("oop1 Overloading and inheritance.pptx","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_3c6800b366984d26b1d621a4bbb47fe3.pptx?dn=8.%20Constuctor%20Overloading%20%26%20Class%20Inheritance.pptx");
                }
                }  });
                oop1_polymorphism_abstraction.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();
                     int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_7397da38fcdd4b72b1c325152b35efbd.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("OOP1 polymorphism and abstraction.pptx","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_6117b654fa664f53a96c0b978ae4e50f.pptx?dn=9.%20Polymorphism%20%26%20Abstraction.pptx");
                }
                }  });
                oop1_uml.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();
                     int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_8b5911fff0c44c77a2d0badf1e4a431f.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("OOP1 UML details.pptx","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_3d8c7536a5394bacadd26d2c4b5a4377.pptx?dn=10.UML%20details.pptx");
                }
                }  });
                oop1_exception_handle.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();
                     int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_182f466c5d6749cca473ff8849952f9d.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("OOP1 Exception Handle.pptx","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_a88cc805d330492d8857bbb10a01a0f0.pptx?dn=11.%20Exception%20Handling%20(1)%5B308%5D.pptx");
                }
                }  });
                oop1_association.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();
                     int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_05f47dde3777469e9f8a03135e9357f1.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("OOP1 Association.pptx","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_add2b2fbfda44b7faaa5bc6b608624d0.pptx?dn=12.%20Association.pptx");
                }
                }  });
            }
             if(slide_subject.equals("ComputerOrganizations")){
                 //co_intro,co_top_level_view,co_cache_memory,co_internal_memory,co_input_output,co_instruction_sets,co_instruction_sets_addressing
                 co_intro.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();
                     int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_c61660de8ae94ee7a50343e9c7d53800.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("CO introduction.pptx","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_69f94539dff64151a97c28ca3464d70d.pptx?dn=CO_01_Introduction%20.pptx");
                }
                }  });
               co_top_level_view.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();
                     int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_bccb9d2ce12e47569aa1ede99d2306e7.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("CO introduction.pptx","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_db4428b1a3e64c3bbf50bc9b43956004.pptx?dn=CO_03_Top%20Level%20View%20of%20Computer%20Function%20and%20Interconnection.pptx");
                }
                }  });
               
               co_cache_memory.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();
                     int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_73f13f2816fc4a529958473dbf5efd85.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("CO Cache Memory.pptx","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_e88108f9d5bd4a4ca58db408394b925d.pptx?dn=CO_4_Cache%20memory.pptx");
                }
                }  });
               co_internal_memory.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();
                     int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_4dc788068e344a65b99da39ea890c110.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("CO internal memory.pptx","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_88f64ceddf1947c58c45b3e3c1bc519c.pptx?dn=CO_05_internal%20memory.pptx");
                }
                }  });
               co_input_output.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();
                     int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_948d3ef4ad844f47bb1a0c966991087d.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("CO input output.pptx","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_611e9886184e4e79bf4ac5a499791135.pptx?dn=CO_7_input%2Coutput.pptx");
                }
                }  });
               co_instruction_sets.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                dispose(); int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_d7997e6a86b7438d91558f0bc99c5756.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("CO instruction sets.pptx","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_0e8949ba98364018a70e1d6aba5d4813.pptx?dn=CO_10_Instructions%20sets.pptx");
                }
                }  });
               co_instruction_sets_addressing.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_77c10c1455eb478e9f69583ee9213054.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("CO instruction set addressing.pptx","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_e76b8fc59efd4024bf6b70adbc6b8c72.ppt?dn=CO_11_Instructions%20sets%20addressing.ppt");
                }
                }  });
             }
        }
         if(semesternumber==3){
             if(slide_subject.equals("OOP2")){
                 //oop2_intro,oop2_swing,oop2_swing_event,oop2_thread,oop2_generics;
                 oop2_intro.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_b31b6b8bfee64c5db680e44a014973df.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("OOP2 introduction.pptx","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_4524375721a9490da173e50f89f3401d.pptx?dn=01.%20oop2_Intro.pptx");
                }
                }  });
                 oop2_swing.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_b823ece6b42f448295aa52a25abbc932.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("OOP2 Swing.pptx","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_bc659c3c152c4c51aeaefa8330a81195.pptx?dn=02.%20Swing.pptx");
                }
                }  });
                oop2_swing_event.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_68164f93ac6a4f50aca5eb18d4680083.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("OOP2 Swing Event.pptx","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_f3650524ce93445a8ff27c2e7c96f1d1.pptx?dn=03.%20Swing%20Event.pptx");
                }
                }  });
                 oop2_thread.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_f3590292cf7f4a8f85844bd5ced7bfa4.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("OOP2 Thread.ppt","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_59083bf2eed84dc2a48087a056e36531.ppt?dn=04.%20Thread.ppt");
                }
                }  });
                oop2_generics.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_a05e7d87cd524aa48e17fe0f1f701d23.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("OOP2 Generics.pptx","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_445c9b0465374d06962d2d09e58543c3.pptx?dn=05.%20Generics.pptx");
                }
                }  });
             }
             if(slide_subject.equals("ComputerNetworking")){
                 //cn_chapter1,cn_chapter2,cn_network_layer,cn_ip_address,cn_application_layer,cn_transport_layer,cn_network_layer2,cn_routing;
                 cn_chapter1.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_a556cd2e9ab048f39e14e27f69351567.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("CN Chapter 1.ppt","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_9123ea588373444e8ceba1895784d693.ppt?dn=ch01.ppt");
                }
                }  });
                 cn_chapter2.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_8dbdd5ae961b4cff82ec0032827fccf9.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("CN Chapter 2.ppt","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_02b3cd6be0664682ad66ac82f5c78b18.ppt?dn=ch02.ppt");
                }
                }  });
                 cn_network_layer.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_8cc5c31aea8f462d8f87a7d42af3a3dc.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("CN Network Layer.ppt","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_6a041bf9d6294c33be14aec0c5afa51e.ppt?dn=03.Network%20Layer.ppt");
                }
                }  });
                 cn_ip_address.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                dispose(); int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_0548932c536e40809d49b2e1f4bed9ce.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("CN IP Addressing.ppt","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_5923c0f6a4b7408c9dcaecda256ca18c.ppt?dn=04.IP%20Address.ppt");
                }
                }  });
                 cn_application_layer.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_0ace755028c74ca486cc7b4da3b8fc56.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("CN Application Layer.ppt","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_4c2b62b73467420c86210476a80dc8a5.ppt?dn=05.Application%20Layer.ppt");
                }
                }  });
                 cn_transport_layer.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_fe39f364608f42ef96e3e00ec76e47fa.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("CN Transport Layer.ppt","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_84d3e39414224916a518db59934ed387.ppt?dn=06.Transport%20Layer.ppt");
                }
                }  });
                cn_network_layer2.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_1e373c10b51d4f708c94b36d4408bece.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("CN Network Layer-2.ppt","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_27cc5ddf931349a9a0b12b7cc0588aa0.ppt?dn=07.Network-layer2.ppt");
                }
                }  });
                 cn_routing.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent ae) {
                 dispose();int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                  if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_ccee2888569543e28532e233cbbc05af.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download("CN Routing Protocol.pptx","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_2a3a73303df14eb4bcd709255528e2be.pptx?dn=08.routingprotocol.pptx");
                }
                }  });
             }
         }
    }
     //used to get user location and download slides
     public void download(String Bookname, String booklink){
            File_Basic file=new File_Basic();
                 boolean result =file.SearchRecord("Data.txt",Bookname);
                 System.out.println(result);
                 if (result == true){
                 System.out.println(""+pdffilepath);
                 PdfViewer.setPdfDocument(pdffilepath);
                 PdfViewer.Showframe();
                 dispose();
                 }
                 else{
                     dispose();
                     dirName=null;
                     JFileChooser fileChooser = new JFileChooser();
                     fileChooser.setCurrentDirectory(new java.io.File("."));
                     fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                     File fileToSave = null;
                      int choice = fileChooser.showOpenDialog(Slides_details.this);
                     if( choice == JFileChooser.CANCEL_OPTION){
                        JOptionPane.showMessageDialog(null, "Download was cancelled");
                        Home_frame frame = new Home_frame("IIT-Library");
                        frame.setVisible(true);
                     }
                     else{
                     if( choice == JFileChooser.APPROVE_OPTION){
                         fileToSave = fileChooser.getSelectedFile();
                     }
                     dirName =fileToSave.toString();
                     SwingUtilities.invokeLater(new Runnable() {
                         @Override
                         public void run() {
                             go(dirName+Bookname,booklink);
                             dispose();
                         }
                     }); }
                 }      
             }
     
     
    
     /*    public static void main(String[] args) {
     Slides_details frame = new Slides_details("IIT-Library");
     frame.setVisible(true);
     }*/
    
    
}
