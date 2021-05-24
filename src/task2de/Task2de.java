/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2de;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author shahy
 */
public class Task2de {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file=new File("fixed.txt");
        String data="",data2="",code="";
        int counter=0,count=0;
        Map <String,Character> map=new HashMap <String,Character>();
        Scanner reader=new Scanner(file);
        while (reader.hasNextLine()) {
         data = reader.nextLine();
         if(counter!=0)
         {
             
             map.put(data.substring(1),data.charAt(0));
             count=data.length()-1;
                     
         }
         else
         {
             data2=data;
         }
         counter++;
    }
        
         reader.close();
         
        
         for(int i=0;i<data2.length();i+=count)
         {
              String letter="";
             
             for(int j=i ;j<count+i;j++)
             {
                 letter+=data2.charAt(j);
             }
             
             code+=map.get(letter);
             
         }
         
         FileWriter writer = new FileWriter("fixed.txt");
         writer.write(code); 
         writer.close();
    }
    
}
