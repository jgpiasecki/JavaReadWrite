/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwrite;
import java.util.ArrayList;
import java.util.Collections; 
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author jpiasecki
 */
public class ReadWrite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ReadFile();
    }
    
    public static void ReadFile() throws IOException
    {
        Path newFile= Paths.get("SortedNames.txt");
        ArrayList<String> sorted = new  ArrayList<>();
        try(BufferedReader br = new BufferedReader (new FileReader("BoyNames.txt")))
            {
                for(int i=0; i<200; i++)
                {
                
                String line = br.readLine();
                sorted.add(line);
                }
                
                
                
            }
            
        
        catch(IOException e)
        {
             System.out.println("Error: " + e.getMessage());       
        }
        Collections.sort(sorted);
       
        
        try(PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("SortedNames.txt", true))))
        {
             
            writer.println(sorted);
            writer.close();
        }
        
        
    }
    
}
