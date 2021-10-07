
package sub_class;
//use to download a file from internet and saves the file into user specifie location
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import static sub_class.Pdf_books.bookname;


public class Download {
    public static JProgressBar progressbar;
    public JLabel label1;
    public static JButton downloaded;
    public static Font font=new Font("Arial",Font.BOLD,20);
    FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
    public static String fileName, fileUrl;
    public static  JFrame frame;
    /*public static void main(String args[]) {
    SwingUtilities.invokeLater(new Runnable() {
    @Override
    public void run() {
    go("java.pdf","https://1ba04568-93c7-428d-bafc-b6a5efb6c80c.filesusr.com/ugd/18e846_e9a0f814efa149b58c30db425fc1b822.pdf");
    }
    });
    }*/
        
       //this method shows the dowloading frame and calls Task_stringupdate to download in background 
    public static void go(String fileName , String fileUrl) {
            Download.fileName= fileName;
            Download.fileUrl= fileUrl;
            
        frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("DownLoading  file...");
        label.setPreferredSize(new Dimension(300,50));
        label.setFont(font);
        progressbar = new JProgressBar();
        progressbar.setStringPainted(true);
        progressbar.setPreferredSize(new Dimension(300,50));
       // progressbar.setIndeterminate(true);
       progressbar.setValue(0);
        panel.add(label);
        panel.add(progressbar);
        frame.add(panel);
        frame.pack();
        frame.setSize(500,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        new Task_StringUpdate(label).execute();
    }
        
        //this method does the task of downloading and overrides doinbackground and done method
        static class Task_StringUpdate extends SwingWorker<Void, String> {

        JLabel jlabel;
        public Task_StringUpdate(JLabel jlabel) {
            this.jlabel = jlabel;
        }

        @Override
        protected Void doInBackground() throws Exception {
            downloadFile(fileName,fileUrl);
            return null;
        }
        @Override
        protected void done() {
            File_Basic file=new File_Basic();
            file.saveRecord(fileName,bookname,"Data.txt");
                     JOptionPane.showMessageDialog(null,"Successfully Downloaded");
                     // PdfViewer pdfframe= new PdfViewer();
                     frame.dispose();
                     PdfViewer.setPdfDocument(fileName);
                     PdfViewer.Showframe();
        }
}
        
        //download file from url and saves
        public static void downloadFile(String fileName, String fileUrl)   
            {

        try {
            
            BufferedInputStream in = null;
            FileOutputStream fout = null;
            float totalDataRead=0;
            URL url = new URL(fileUrl);
            URLConnection conn = url.openConnection();
            int filesize = conn.getContentLength();
            
            try {
                in = new BufferedInputStream(new URL(fileUrl).openStream());
                fout = new FileOutputStream(fileName);
                byte data[] = new byte[1024];
                int count;
                int i=0;
                while ((count = in .read(data, 0, 1024)) != -1) {
                    fout.write(data, 0, count);
                    totalDataRead=totalDataRead+count;
                    float Percent=(totalDataRead*100)/filesize;
                    progressbar.setValue((int)Percent);
                    // progressbar.setValue(i++);
                }
            } finally {
                if ( in != null)
                    in .close();
                if (fout != null)
                    fout.close();
            }
            
        }    catch (IOException ex) {
               JOptionPane.showMessageDialog(null, "Please Check Your Internet Connection and try again");
                Home_frame frame = new Home_frame("IIT-Library");
                frame.setVisible(true);
        }
   }
}
