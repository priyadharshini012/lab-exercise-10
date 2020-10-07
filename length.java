/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab_10;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class length {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ENTER FILE NAME");
        Scanner obj=new Scanner(System.in);
        String userfile=obj.next();
        File f=new File(userfile);
        if (f.exists())
                System.out.println("YOUR FILE EXISTS");
        else
            System.out.println("YOUR FILE DOESNT EXISTS");
        if(f.canRead())
            System.out.println("YOUR FILE IS READABLE");
        else if(f.canWrite())
            System.out.println("YOUR FILE IS WRITABLE");
        String name=f.getName();
        System.out.println("TYPE OF FILE :"+name.substring(name.lastIndexOf('.')));
        System.out.println("YOUR FILE LENGTH IN BYTES:"+f.length());
    }
   
    }
    
    
    

