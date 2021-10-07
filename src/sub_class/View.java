
package sub_class;
//shows the dowloaded file without saving its information into data.txt file
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;



public class View {
    public static JProgressBar progressbar;
    public JLabel label1;
    public static JButton downloaded;
    public static Font font=new Font("Arial",Font.BOLD,20);
    FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
    public static String fileName, fileUrl;
    public static JFrame frame;
    /* public static void main(String args[]) {
    SwingUtilities.invokeLater(new Runnable() {
    @Override
    public void run() {
    go("java.pdf","https://drive.google.com/uc?export=download&id=1PTJVzywVw1piIARQy7wZ6lnqpAdEWETp");
    }
    });
    }*/
        
        public static void go(String fileName , String fileUrl) {
            View.fileName= fileName;
            View.fileUrl= fileUrl;
            
         frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Loading file...");
        label.setPreferredSize(new Dimension(300,50));
        label.setFont(font);
        progressbar = new JProgressBar();
        progressbar.setStringPainted(true);
        progressbar.setPreferredSize(new Dimension(300,50));
     //  progressbar.setIndeterminate(true);
       progressbar.setValue(0);
        panel.add(label);
        panel.add(progressbar);
        frame.add(panel);
        frame.pack();
        frame.setSize(500,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        new Task_StringUpdate(label).execute();
    }
        
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
                     frame.dispose();
                     PdfViewer.setPdfDocument(fileName);
                     PdfViewer.Showframe();
        }
}
        
        public static void downloadFile(String fileName, String fileUrl)  
            throws MalformedURLException, IOException {

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
            }
        } finally {
            if ( in != null)
                in .close();
            if (fout != null)
                fout.close();
        }
   }
}
