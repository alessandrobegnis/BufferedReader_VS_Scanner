
package bufferedreader_vs_scanner;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;




public class Es1 {
    File newFile;
    FileWriter newFileWriter;

    public Es1() {

    }
    
    public void creaFile() throws IOException{
        newFile = new File ("File.txt");
        if(this.newFile.exists()){ 
        this.newFile.delete();
    }
        this.newFile.createNewFile(); 
        this.newFileWriter = new FileWriter (newFile);
    }
    
    public void scriviFile() throws IOException{
        for (int i = 0; i < 100000; i++) {
            for (int j = 0; j < 5; j++) {
                
            
             int a=(int)(Math.random()*254);
             this.newFileWriter.write(a+" ");
            }
           this.newFileWriter.write(System.getProperty("line.separator"));
        }
    }
    } 
        
