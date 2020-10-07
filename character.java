/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab_10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class character {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
        FileReader fr=null;
        FileWriter fw=null;
        
        fr=new FileReader("input.jpg");
        fw=new FileWriter("output.jpg");
        int j;
        while((j=fr.read())!=-1)
            fw.write(j);
        
        fw.close();
        fr.close();
    }
}

        
    

