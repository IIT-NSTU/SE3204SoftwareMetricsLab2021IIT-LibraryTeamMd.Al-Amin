
package sub_class;
//shows available pdf books according to semester
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
import static sub_class.Download.go;
import static sub_class.Semester_details.semesternumber;


public class Pdf_books extends book_pdf_frame{
    
    public JPanel main_panel;
    Font font=new Font("Arial",Font.BOLD,20);
    FlowLayout layout=new FlowLayout(FlowLayout.CENTER);
    public JButton back,cprogramming,discrete,it_and_society,OOP1,ComputerOrganization,AlgorithmAnalysis,NumericalAnalysis,OOP2,ComputerNetworks,TheoryofComputation;
    public static String pdffilepath,dirName=null,bookname;
    public Pdf_books(String frame_title) {
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
         it_and_society=new JButton("IT and Society");
         it_and_society.setFont(font);
         it_and_society.setPreferredSize(new Dimension(300,50));
         main_panel.add(it_and_society);
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
               AlgorithmAnalysis=new JButton("Algorithm Analysis");
            AlgorithmAnalysis.setFont(font);
            AlgorithmAnalysis.setPreferredSize(new Dimension(400,50));
            main_panel.add(AlgorithmAnalysis);
            OOP2=new JButton("Object Oriented Concepts II");
           OOP2.setFont(font);
            OOP2.setPreferredSize(new Dimension(400,50));
            main_panel.add(OOP2);
           ComputerNetworks=new JButton("Computer Networks");
           ComputerNetworks.setFont(font);
           ComputerNetworks.setPreferredSize(new Dimension(400,50));
            main_panel.add(ComputerNetworks);
           TheoryofComputation=new JButton("Theory of Computation");
           TheoryofComputation.setFont(font);
           TheoryofComputation.setPreferredSize(new Dimension(400,50));
            main_panel.add(TheoryofComputation);
          }
          back=new JButton("Back");
         back.setFont(font);
         back.setPreferredSize(new Dimension(400,50));
         main_panel.add(back);
         
     } 
     
     
     public void buttonaction(){
         String[] options = {"View","Download"};
         back.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae) {
                 dispose();
                Home_frame frame = new Home_frame("IIT-Library");
                frame.setVisible(true);
            } });
         if(semesternumber==1){
         cprogramming.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae) {
                 bookname="CProgramming.pdf";
                 dispose();
                 File_Basic file=new File_Basic();
                 boolean result =file.SearchRecord("Data.txt",bookname);
                 System.out.println(result);
                 if (result == true){
                 System.out.println(""+pdffilepath);
                 PdfViewer.setPdfDocument(pdffilepath);
                 PdfViewer.Showframe();
                 dispose();
                 }
                 else{
                 int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_e9a0f814efa149b58c30db425fc1b822.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download(bookname,"https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_e9a0f814efa149b58c30db425fc1b822.pdf");
                }}
                }  });
         
         
         discrete.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae) {
                 bookname="Discrete.pdf";
                 dispose();
                 File_Basic file=new File_Basic();
                 boolean result =file.SearchRecord("Data.txt",bookname);
                 System.out.println(result);
                 if (result == true){
                 System.out.println(""+pdffilepath);
                 PdfViewer.setPdfDocument(pdffilepath);
                 PdfViewer.Showframe();
                 dispose();
                 }
                 else{
                 int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_93798fc7343d44909a8e5c4f2ecf2357.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download(bookname,"https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_93798fc7343d44909a8e5c4f2ecf2357.pdf");
                }} } });
         
         it_and_society.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae) {
                 bookname="ITandsoceity.pdf";
                 dispose();
                 File_Basic file=new File_Basic();
                 boolean result =file.SearchRecord("Data.txt",bookname);
                 System.out.println(result);
                 if (result == true){
                 System.out.println(""+pdffilepath);
                 PdfViewer.setPdfDocument(pdffilepath);
                 PdfViewer.Showframe();
                 dispose();
                 }
                 else{
                 int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_7101712b85fa4486a56d80d9241961a4.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download(bookname,"https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_7101712b85fa4486a56d80d9241961a4.pdf");
                }} } });}
         if(semesternumber==2){      
        OOP1.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae) {
             bookname="ObjectOrientedProgrammingI.pdf";
                 dispose();
                 File_Basic file=new File_Basic();
                 boolean result =file.SearchRecord("Data.txt",bookname);
                 System.out.println(result);
                 if (result == true){
                 System.out.println(""+pdffilepath);
                 PdfViewer.setPdfDocument(pdffilepath);
                 PdfViewer.Showframe();
                 dispose();
                 }
                 else{
                 int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_ca34df6d699146c9af64c5e591dd1043.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download(bookname,"https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_ca34df6d699146c9af64c5e591dd1043.pdf");
                }} } });
        
         ComputerOrganization.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae) {
             bookname="ComputerOrganization.pdf";
                 dispose();
                 File_Basic file=new File_Basic();
                 boolean result =file.SearchRecord("Data.txt",bookname);
                 System.out.println(result);
                 if (result == true){
                 System.out.println(""+pdffilepath);
                 PdfViewer.setPdfDocument(pdffilepath);
                 PdfViewer.Showframe();
                 dispose();
                 }
                 else{
                 int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_35ff52e3a4ae43858b8a439c4877dfa7.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download(bookname,"https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_35ff52e3a4ae43858b8a439c4877dfa7.pdf");
                }} } });}
         if(semesternumber==3){
         AlgorithmAnalysis.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae) {
                 bookname="AlgorithmAnalysis.pdf";
                 dispose();
                 File_Basic file=new File_Basic();
                 boolean result =file.SearchRecord("Data.txt",bookname);
                 System.out.println(result);
                 if (result == true){
                 System.out.println(""+pdffilepath);
                 PdfViewer.setPdfDocument(pdffilepath);
                 PdfViewer.Showframe();
                 dispose();
                 }
                 else{
                 int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_aea6bd98f06e42bea54563b4b9b83c97.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download(bookname,"https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_aea6bd98f06e42bea54563b4b9b83c97.pdf");
                }} } });
         
         OOP2.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae) {
                 bookname="ObjectOrientedConceptsII.pdf";
                 dispose();
                 File_Basic file=new File_Basic();
                 boolean result =file.SearchRecord("Data.txt",bookname);
                 System.out.println(result);
                 if (result == true){
                 System.out.println(""+pdffilepath);
                 PdfViewer.setPdfDocument(pdffilepath);
                 PdfViewer.Showframe();
                 dispose();
                 }
                 else{
                 int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_ca34df6d699146c9af64c5e591dd1043.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download(bookname,"https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_ca34df6d699146c9af64c5e591dd1043.pdf");
                }} } });
         
         ComputerNetworks.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae) {
                 bookname="ComputerNetwork.pdf";
                 dispose();
                 File_Basic file=new File_Basic();
                 boolean result =file.SearchRecord("Data.txt",bookname);
                 System.out.println(result);
                 if (result == true){
                 System.out.println(""+pdffilepath);
                 PdfViewer.setPdfDocument(pdffilepath);
                 PdfViewer.Showframe();
                 dispose();
                 }
                 else{
                 int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_ed6c3b1719be42a697b16d2141fe4752.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download(bookname,"https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_ed6c3b1719be42a697b16d2141fe4752.pdf");
                }}
             }    
         });
         
         TheoryofComputation.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae) {
               bookname="TheoryofComputation.pdf";
                 dispose();
                 File_Basic file=new File_Basic();
                 boolean result =file.SearchRecord("Data.txt",bookname);
                 System.out.println(result);
                 if (result == true){
                 System.out.println(""+pdffilepath);
                 PdfViewer.setPdfDocument(pdffilepath);
                 PdfViewer.Showframe();
                 dispose();
                 }
                 else{
                 int option_result=JOptionPane.showOptionDialog(null,"what would like to do?","", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
                if(option_result==JOptionPane.YES_OPTION){
                    View.go("view.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_f40f0bc6dedd41e58c213e031abfa56c.pdf");
                }
                if(option_result==JOptionPane.NO_OPTION){
                    download(bookname,"https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_f40f0bc6dedd41e58c213e031abfa56c.pdf");
                }}
             }    
         });}
     }
     
     //this method allows user to choose a location to download and then calls go method in download class
     public void download(String Bookname, String booklink){
                     dispose();
                     dirName=null;
                     JFileChooser fileChooser = new JFileChooser();
                     fileChooser.setCurrentDirectory(new java.io.File("."));
                     fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                     File fileToSave = null;
                     int choice = fileChooser.showOpenDialog(Pdf_books.this);
                     if( choice == JFileChooser.CANCEL_OPTION){
                        JOptionPane.showMessageDialog(null, "Download was cancelled");
                        Home_frame frame = new Home_frame("IIT-Library");
                         frame.setVisible(true);
                     }
                     else{
                     if( choice == JFileChooser.APPROVE_OPTION){
                        // fileChooser.getCurrentDirectory();
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
     
     
     /*   public static void main(String[] args) {
     Pdf_books frame = new Pdf_books("IIT-Library");
     frame.setVisible(true);
     }*/
    
}
