
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomas
 */
public class Reader {
    
     private ArrayList a = new ArrayList(); 
    private File file;
    
    
    public Reader(){
        file = new File("wordlisted.txt");
        int i = 0;
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            while (br.readLine() !=null){
                i++;
            }
            br.close();
            br=new BufferedReader (new FileReader(file));
            for (int j=0; j<i; j++){
                a.add(br.readLine());
            }   
            br.close();
               
       }catch (Exception e){
           System.out.println("Error"+e);
       }
     }
   public String getRandomWord()
     throws Exception{
     int random =(int)(Math.random()*a.size());
     return(String)a.get(random);
 }
    
    
    
    
    
    
    
    
    
    
}
