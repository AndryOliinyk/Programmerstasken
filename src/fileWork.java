import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;


public class fileWork {

    // method for select local file
    public static String datafromfile(){
        try {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter(
                    ".txt or .csv files", "txt", "csv");
            chooser.setFileFilter(filter);
            int returnVal = chooser.showOpenDialog(null);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                return chooser.getSelectedFile().getAbsolutePath();
            }
        }
        catch(NullPointerException ex) {ex.printStackTrace();}

   return "error data type";
    }
    // Method for save data only in txt file
    public static void saveFile(StringBuilder arr) {

        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("C://"));
        int retrival = chooser.showSaveDialog(null);
        if (retrival == JFileChooser.APPROVE_OPTION) {
            try {
                FileWriter fw = new FileWriter(chooser.getSelectedFile() + ".txt");

                fw.write(arr.toString());
                fw.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
    }




}
