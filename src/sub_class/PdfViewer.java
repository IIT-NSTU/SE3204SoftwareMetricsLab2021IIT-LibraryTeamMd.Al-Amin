package sub_class;

//Our own simple pdfviewer,used to show pdf in the application
//we have used pdfbox-app-2.0.2.2 jar to manupulate pdf files
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;


public class PdfViewer extends JFrame{
     public static  Container c;
     public static Dimension screenSize;
     public static int frame_height,frame_width,totalpage,pagenumber=0,pagenumber2=1,viewtypecounter=1,zoomcounter=0;
     public static JPanel title_panel, pdf_panel;
     public static JButton  back,one_view,two_view,next_page,previous_page,zoom_in,zoom_out;
      public static JLabel label1,label2,pdflabel,pdflabel2;
     public static  JTextArea textarea;
     public static BufferedImage bim;
     public static String pdfDocument;
    
    PdfViewer (){
        initcomponents();
    }
    
    public void initcomponents(){
         c=this.getContentPane();
         c.setLayout(null);
         pagenumber=0;
    }
    
    public static void showpdf(){
         one_page_view();
         title_panel = new JPanel();
         title_panel.setLayout(null);
         title_panel.setBackground(Color.yellow);
         title_panel.setSize(frame_width,50);
         c.add(title_panel);
         
         one_view= new JButton("One page View");
         one_view.setBounds(0, 0, 150, 25);
         title_panel.add(one_view);
         two_view= new JButton("Two page View");
         two_view.setBounds(0, 25, 150, 25);
         title_panel.add(two_view);
         previous_page= new JButton("Previous Page");
         previous_page.setBounds(150, 0, 150, 50);
         title_panel.add( previous_page);
         next_page= new JButton("Next Page");
         next_page.setBounds(300, 0, 150, 50);
         title_panel.add(next_page);
         zoom_in= new JButton("Zoom in");
         zoom_in.setBounds(450, 0, 150, 50);
         title_panel.add( zoom_in);
         zoom_out= new JButton("Zoom out");
         zoom_out.setBounds(600, 0, 150, 50);
         title_panel.add(zoom_out);
         
         label1= new JLabel("Go to page ");
         label1.setBounds(760,0,100,50);
         title_panel.add(label1);
         
         textarea= new JTextArea();
         textarea.setBounds(860,10,80,30);
         title_panel.add(textarea);
         
         label2= new JLabel("of "+(totalpage-1));
         label2.setBounds(960,0,100,50);
         title_panel.add(label2);
         back= new JButton("back ");
         back.setBounds(1060,0,100,50);
         title_panel.add(back);
         
         keyControl();
         
         one_view.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent ae) {
                 if(pagenumber>0 && pagenumber<totalpage){
                   viewtypecounter=1;
                     pdf_panel.removeAll();
                     one_page_view();
                     pdf_panel.revalidate();
                     pdf_panel.repaint();
                     button();}
                 else{
                     JOptionPane.showMessageDialog(null,"Not possible");
                 }
             }
         });
         
          two_view.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent ae) {
                 if(pagenumber>0 && pagenumber<totalpage-1){
                    viewtypecounter=2;
                     pdf_panel.removeAll();
                     two_page_view();
                     pdf_panel.revalidate();
                     pdf_panel.repaint();
                     button();}
                 else{
                     JOptionPane.showMessageDialog(null,"Not possible");
                 }
             }
         });
          
          next_page.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent ae) {
                  if(pagenumber >=0 && pagenumber <totalpage && viewtypecounter==1){
                       pdf_panel.removeAll();
                        pagenumber++;
                        openpdf(pdfDocument,pagenumber,frame_width,frame_height-50);
                        pdf_panel.revalidate();
                        pdf_panel.repaint();
                        textarea.setText(""+pagenumber);
                  }
 
             if(pagenumber >=0 && pagenumber <totalpage-2 && viewtypecounter==2){
                        pdf_panel.removeAll();
                        pagenumber++;
                        pagenumber2= pagenumber+1;
                        openpdf2(pdfDocument,pagenumber,frame_width/2,(frame_height-50),pagenumber2,frame_width/2,(frame_height-50));
                        pdf_panel.revalidate();
                        pdf_panel.repaint();}
          }
         });
          
          previous_page.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent ae) {
                  if(pagenumber >0 && pagenumber <totalpage && viewtypecounter==1){
                       pdf_panel.removeAll();
                        pagenumber=pagenumber-1;
                        openpdf(pdfDocument,pagenumber,frame_width,frame_height-50);
                        pdf_panel.revalidate();
                        pdf_panel.repaint();
                        textarea.setText(""+pagenumber);
                  }
 
             if(pagenumber >2 && pagenumber2 <totalpage-1 && viewtypecounter==2){
                        pdf_panel.removeAll();
                        pagenumber2=pagenumber;
                        pagenumber=pagenumber-1;
                        openpdf2(pdfDocument,pagenumber,frame_width/2,(frame_height-50),pagenumber2,frame_width/2,(frame_height-50));
                        pdf_panel.revalidate();
                        pdf_panel.repaint();}
          }
         });
          
          zoom_in.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent ae) {
                 if(zoomcounter>= 0 && zoomcounter< 10 ){
                  zoomcounter++;
                 frame_width=frame_width+50;
                 frame_height=frame_height+50;
                 pdf_panel.removeAll();
                 pdf_panel.setPreferredSize(new Dimension(frame_width, frame_height));
                 openpdf(pdfDocument,pagenumber,frame_width-20, frame_height-100);
                 pdf_panel.revalidate();
                pdf_panel.repaint();
                
                 }
                
             }
         });
          
          zoom_out.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent ae) {
                 if(zoomcounter>0 && zoomcounter<= 10 ){
                 zoomcounter--;
                  frame_width=frame_width-50;
                 frame_height=frame_height-50;
                 pdf_panel.removeAll();
                 pdf_panel.setPreferredSize(new Dimension(frame_width,frame_height));
                 openpdf(pdfDocument,pagenumber,frame_width-20,frame_height-100);
                 pdf_panel.revalidate();
                pdf_panel.repaint();
                 }
                
             }
         });    

    }
    
    public static void button(){
        if(viewtypecounter==1){
            zoom_in.setEnabled(true);
            zoom_out.setEnabled(true);
            textarea.setEnabled(true);
        }
        if(viewtypecounter==2){
            zoom_in.setEnabled(false);
            zoom_out.setEnabled(false);
            textarea.setEnabled(false);
        }
    }
      //Format the pdf_panel to show a single page at a time
    public static  void one_page_view(){
        pdf_panel = new JPanel();
        pdf_panel.setLayout(null);
        pdf_panel.setBackground(Color.DARK_GRAY);
        //pdf_panel.setBounds(0,50,frame_width,frame_height-50);
        // c.add(pdf_panel);
         
         JScrollPane scrollPane = new JScrollPane(pdf_panel);
         scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
         scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
         scrollPane.setBounds(0,50,frame_width-20,frame_height-100);
         c.add(scrollPane);
         
        openpdf(pdfDocument,pagenumber,frame_width-20,frame_height-100);
        
    }
    //Format the pdf_panel to show two page at a time
    public static  void two_page_view(){
        pdf_panel = new JPanel();
        pdf_panel.setLayout(null);
        pdf_panel.setBackground(Color.DARK_GRAY);
        pdf_panel.setBounds(0,50,frame_width,frame_height-50);
         c.add(pdf_panel);
         
        openpdf2(pdfDocument,pagenumber,frame_width/2,(frame_height-50),pagenumber+1,frame_width/2,(frame_height-50));
        
    }
    //method to display pdfviewer frame
   public static void Showframe(){
       PdfViewer  frame=new  PdfViewer ();
        makeFrameFullSize(frame);
        showpdf();
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        back.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                Home_frame frame = new Home_frame("IIT-Library");
                frame.setVisible(true);
            } });
   }
    
     public static void main(String[] args) {
   PdfViewer  frame=new  PdfViewer ();
   PdfViewer.setPdfDocument("F:\\Cprogramming.pdf");
   PdfViewer.Showframe();
   
   }
    //method to get the device screen size to make the frame more flexible
     private static  void makeFrameFullSize(JFrame aFrame) {
    screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    frame_width=(screenSize.width)-300;
    frame_height=(screenSize.height)-100;
    aFrame.setSize( frame_width,frame_height);
}
    //takes pdf document and pagenumber , then render the page into a image and shows as a label on the frame
     public static void openpdf(String pdfdocument,int pagenumber,int labelwidth,int labelheight) {
        try {
            PDDocument document = null;
            document = PDDocument.load(new File(pdfDocument));
            totalpage= document.getNumberOfPages();
            PDFRenderer pdfRenderer = new PDFRenderer(document);
            bim = pdfRenderer.renderImageWithDPI(pagenumber,300,ImageType.RGB);
            ImageIcon pageimg =new ImageIcon(bim);
            Image pageimg2= pageimg.getImage();
            Image pageimg3 = pageimg2.getScaledInstance(labelwidth,labelheight,Image.SCALE_SMOOTH);
            ImageIcon finalimage=new ImageIcon(pageimg3);
            pdflabel =new JLabel( finalimage);
            pdflabel.setBounds(0,0, finalimage.getIconWidth(), finalimage.getIconHeight());
            pdf_panel.add(pdflabel);
            document.close();
        } catch (IOException ex) { 
             Logger.getLogger(PdfViewer.class.getName()).log(Level.SEVERE, null, ex);
         } 
     }
     //takes pdf document and pagenumber , then renders two page into  image and shows as  label on the frame
      public static void openpdf2(String pdfdocument,int pagenumber,int labelwidth,int labelheight,int pagenumber2,int labelwidth2,int labelheight2) {
        try {
            PDDocument document = null;
            document = PDDocument.load(new File(pdfdocument));
            totalpage= document.getNumberOfPages();
            PDFRenderer pdfRenderer = new PDFRenderer(document);
            bim = pdfRenderer.renderImageWithDPI(pagenumber,300,ImageType.RGB);
            ImageIcon pageimg =new ImageIcon(bim);
            Image pageimg2= pageimg.getImage();
            Image pageimg3 = pageimg2.getScaledInstance(labelwidth,labelheight,Image.SCALE_SMOOTH);
            ImageIcon finalimage=new ImageIcon(pageimg3);
            pdflabel =new JLabel( finalimage);
            pdflabel.setBounds(0,0, finalimage.getIconWidth(), finalimage.getIconHeight());
            pdf_panel.add(pdflabel);
            bim = pdfRenderer.renderImageWithDPI(pagenumber2,300,ImageType.RGB);
            ImageIcon newpageimg =new ImageIcon(bim);
            Image newpageimg2= newpageimg.getImage();
            Image newpageimg3 = newpageimg2.getScaledInstance(labelwidth,labelheight,Image.SCALE_SMOOTH);
            ImageIcon newfinalimage=new ImageIcon(newpageimg3);
            pdflabel2 =new JLabel( newfinalimage);
            pdflabel2.setBounds(frame_width/2,0, newfinalimage.getIconWidth(), newfinalimage.getIconHeight());
            pdf_panel.add(pdflabel2);
            document.close();
        } catch (IOException ex) { 
             Logger.getLogger(PdfViewer.class.getName()).log(Level.SEVERE, null, ex);
         } 
     }
      //method to make the textarea only integer number and press enter for action
    public static void keyControl(){
        textarea.addKeyListener(new KeyAdapter() {
           public void keyPressed(KeyEvent ke) {
               if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
               textarea.setEditable(true);
            } else {
               textarea.setEditable(false);
            }
            if (ke.getKeyChar() ==KeyEvent.VK_ENTER ){
              String s = textarea.getText().trim();
              int i=Integer.parseInt(s);
              if(i< totalpage){
              System.out.println(i);
              pagenumber=i;
              one_page_view();}
            }
             if (ke.getKeyChar() ==KeyEvent.VK_BACK_SPACE ){
                if(textarea.getText().isEmpty()){
                    
                }
                else{
                textarea.setText("");
                }
           }
           }
        });
        
        
    }
    //method to set the functionality of back button
    public void back_action(){
        back.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae) {
                 dispose();
                Home_frame frame = new Home_frame("IIT-Library");
                frame.setVisible(true);
            } });
    }
     
      //sets given document name as a pdf document variable
      public static void setPdfDocument(String document){
          pdfDocument =document;
      }
     
}
