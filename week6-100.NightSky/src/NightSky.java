
import java.util.ArrayList;
import java.util.Random;

/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */

public class NightSky {
    
    private double density;    
    private int width;
    private int height;
    private int starsInLastPrint;
    
    public NightSky(double dens, int wide, int high){
        this.width = wide;
        this.height = high;
        this.density = dens;
        
    }
    
    public NightSky(double strDns){
        
        this.density = strDns;
        this.width = 20;
        this.height = 10;
        
    }
    
    public NightSky(int wdth, int hght){
        
        this.density = 0.1;
        this.width = wdth;
        this.height = hght;
        
    }
    public void printLine(){
        Random rndm = new Random();
        
        for(int i = 0; i < this.width;i++){
             if(rndm.nextDouble() <= this.density){
            System.out.print("*");
            this.starsInLastPrint++;
            }
            System.out.print(" ");
        }
        
        System.out.println();
    }
    
    public void print(){
        this.starsInLastPrint = 0;
        for(int p = 1; p < this.height+1;p++){  
        printLine();
       
        }
        System.out.println("Stars Printed: "+ this.starsInLastPrint);
        
    }
    
    public int starsInLastPrint(){
        return this.starsInLastPrint;
    }
}
