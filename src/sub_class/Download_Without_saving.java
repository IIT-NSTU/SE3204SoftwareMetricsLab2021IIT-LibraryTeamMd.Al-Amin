
package sub_class;
//Download file without allowing user for download location. we use it for view option .it simples download the file in application location without user knowledge
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;


public class Download_Without_saving {
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
    go("java.pdf","https://sites.google.com/site/iitlibrary121/home/pdf/ProgrammingInAnsiC.pdf?attredirects=0&d=1");
    }
    });
    }*/
        //this method shows the loading frame and calls Task_stringupdate to download in background 
        public static void go(String fileName , String fileUrl) {
            Download_Without_saving.fileName= fileName;
            Download_Without_saving.fileUrl= fileUrl;
            
        frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Downloading file...");
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
                    if(fileName=="Syllabus.pdf" || fileName=="Semester 1 Examroutine.pdf" || fileName=="Semester 3 Examroutine.pdf"){
                      frame.dispose();
                      PdfViewer.setPdfDocument(fileName);
                      PdfViewer.Showframe();
              }
                    else{
                            JOptionPane.showMessageDialog(null,"Successfully downloaded, check your local drive");
                            frame.dispose();
                            Home_frame frame = new Home_frame("IIT-Library");
                            frame.setVisible(true);}
        }
}
        //download file from url
        public static void downloadFile(String fileName, String fileUrl) throws IOException  
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
        }    catch (MalformedURLException ex) {
            JOptionPane.showMessageDialog(null, "Please Check Your Internet Connection and try again");
                Home_frame frame = new Home_frame("IIT-Library");
                frame.setVisible(true);
        }
   }
}
