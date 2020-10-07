/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab_10;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;




/**
 *
 * @author hp
 */
public class Lab_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        
        DataInputStream ds=new DataInputStream(System.in);
        ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("students.txt"));
        System.out.println("No of students");
        int n= Integer.parseInt(ds.readLine());
        students s[]=new students[n];
        String name;
        //int m;
        int read;
        String rollno;
        String dept;
        for(int i=0;i<n;i++)
        {
            System.out.println("Student name");
            name = ds.readLine();
            System.out.println("Rollno");
            rollno = ds.readLine();
            System.out.println("Department");
            dept = ds.readLine();
            s[i]=new students(name,rollno,dept);
            obj.writeObject(s[i]); // write into the file           
        }
        obj.close();
        ObjectInputStream obj1=new ObjectInputStream(new FileInputStream("students.txt"));
        while(n>0)
        {
            System.out.println(obj1.readObject());
            n--;
        }
        obj1.close();
        ObjectOutputStream fos=new ObjectOutputStream(new FileOutputStream("students.txt"));
        while((read=obj1.read())!=-1)
        {
            fos.write(read);
        }
        
        fos.close();
        File file1=new File("students.txt");
        File file2=new File("final.txt");
        char Charcounter = 0;
        BufferedReader in=(new BufferedReader(new FileReader(file1)));
        PrintWriter out = (new PrintWriter(new FileWriter(file2)));
        int ch;
        while((ch = in.read()) != -1)
        {
            if(Character.isUpperCase(ch))
            {
                char Ch = 0;
                ch=Character.toLowerCase(Ch);
                System.out.println(ch);
            }
            out.write(ch);
        }
        in.close();
        out.close();
    }
    
}

class students implements Serializable
{
    String name;
    String rollno;
    String dept;
    
    students(String n,String r,String d)
    {
       name=n;
       rollno=r;
       dept=d;
    }
    
    public String toString()
    {
       return "\nSTUDENTS DETAILS\nNAME:"+name+"\nROLL NUMBER:"+rollno+"\nDEPARTMENT:"+dept;         


    }

}


        // declare and initialize the variables
        
    
    

