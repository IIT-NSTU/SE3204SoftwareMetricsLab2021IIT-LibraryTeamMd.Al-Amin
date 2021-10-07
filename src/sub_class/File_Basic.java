
package sub_class;
// A class to manipulate txt file
//we can save record ,search record,read record
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;



public class File_Basic {
    
    private static Scanner x;
    public static String[] Item=new String[20];
    public static String[] price=new String[20];
    public static String filepath;
    
   
   public static void saveRecord(String filename,String bookpath,String filepath){
        try {
            FileWriter fw=new FileWriter(filepath,true);
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter pw=new PrintWriter(bw);
            
            pw.println(bookpath+","+filename);
            pw.flush();
            pw.close();
            fw.close();
            
           // JOptionPane.showMessageDialog(null, "Record saved");
        } catch (IOException ex) {
           //JOptionPane.showMessageDialog(null, "Record not saved");
        }
       
   }
 
   
   public static int ReadRecord(String filepath){
       int i=0;
        try {
            x=new Scanner(new File(filepath));
            x.useDelimiter("[,\n]");
            while(x.hasNext()){
                Item[i]=x.next();
                price[i]=x.next();
                i++;
            }
            x.close();
            System.out.println(i);
        } catch (FileNotFoundException ex) {
            
        }
        return i;
       
   }
   
      public static Boolean SearchRecord(String filepath,String item){
    int i=0;
    String name;
        try {
            x=new Scanner(new File(filepath));
            x.useDelimiter("[,\n]");
            while(x.hasNext()){
                name= x.next().trim();
                if(name.equalsIgnoreCase(item)){
                    Pdf_books.pdffilepath = x.next().trim();
                    i++;
                }
            }
            x.close();
            System.out.println(i);
            
        } catch (FileNotFoundException ex) {
            
        }
        if(i==0){
                return false;
            }
            else{
                return true;
            }
}
      
}
