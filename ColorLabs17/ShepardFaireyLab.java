
/**
 * Write a description of class ShepardFaireyLab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

public class ShepardFaireyLab 
{
    /**
     * main method, to test the picture
     *  
     */
    public static void main(String[] args)
    {
        
         //opens selfie picture 
          /*
         String fileName = FileChooser.pickAFile();
         Picture pictObj = new Picture(fileName);
         pictObj.explore();
         /**/
         //relative path
         Picture apic = new Picture("images\\IMG_0747.jpeg");
         //change with selfie picture
         Picture me1 = new Picture("images/IMG_0747.jpeg");
         Picture me2 = new Picture("images/IMG_0747.jpeg");
         Picture me3 = new Picture("images/IMG_0747.jpeg");
         
         /**
          * method 1 change
          * 
          */
         Pixel[] px1 = me1.getPixels();
         //convert to grayscale first
         for (Pixel pxobj : px1)
         {
             int avg = (pxobj.getRed()+pxobj.getGreen()+pxobj.getBlue())/3;
             pxobj.setColor(new Color(avg,avg,avg));
         }
         me1.explore();
         
         /**
          * method 2 change
          * 
          */
         
         /**
          * custom color palette
          */

         
    }//main       
}//class
