/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwrite;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayList;
/**
 *
 * @author jpiasecki
 */
public class ReadWrite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ReadFile();
    }
    
    private static String ReadFile()
    {
        
        ArrayList<String> sorted = new  ArrayList<>();
        try(BufferedReader br = new BufferedReader (new FileReader("BoyNames.txt")))
            {
                
                String line = br.readLine();
                sorted.add(line+'\n');
            }
            
        
        catch(IOException e)
        {
             System.out.println("Error: " + e.getMessage());       
        }
        
    }
    
}
