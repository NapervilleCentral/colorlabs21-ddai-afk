
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
         /*
         Pixel[] px1 = me1.getPixels();
         //convert to grayscale first
         int max1 = 0;
         int min1 = 255;
         for (Pixel pxobj : px1)
         {
             int avg = (int) pxobj.getAverage();
             pxobj.setColor(new Color(avg,avg,avg));
             if (avg>max1)
                 max1 = avg;
             if (avg<min1)
                 min1 = avg;
         }
         for (int countColor = min1, pxCount = 0 ; countColor < max1 ; countColor++)
         {
             for (int i = 0, j = 0 ; j != -1 && i < px1.length-1 ; i++, j++)
             {
                 if (px1[i].getRed()==countColor)
                 {
                     if (pxCount<px1.length/4)
                         px1[i].setColor(new Color(0,0,100));
                     else if (pxCount<px1.length/2)
                         px1[i].setColor(new Color(255,0,0));
                     else if (pxCount<3*(px1.length/4))
                         px1[i].setColor(new Color(100,200,255));
                     else if (pxCount<px1.length)
                         px1[i].setColor(new Color(255,255,200));
                         
                     pxCount++;
                 }
                 if (((pxCount<px1.length/4)&&(pxCount==(px1.length/4)-1))||((pxCount<px1.length/2)&&(pxCount==(3*(px1.length/4))-1))||((pxCount<px1.length/4)&&(pxCount==(3*(px1.length/4))-1))||((pxCount<px1.length)&&(pxCount==(px1.length)-1)))
                     {
                         j = -3;
                     }
             }
         }
         me1.explore();
         
         /**
          * method 2 change
          * 
          */
         /*
         Pixel[] px2 = me2.getPixels();
         //convert to grayscale first
         int max2 = 0;
         int min2 = 255;
         for (Pixel pxobj : px2)
         {
             int avg = (int) pxobj.getAverage();
             pxobj.setColor(new Color(avg,avg,avg));
             if (avg>max2)
                 max2 = avg;
             if (avg<min2)
                 min2 = avg;
         }
         for (int i = 0 ; i<px2.length-1 ; i++)
         {
             if (px2[i].getRed()<min2+((max2-min2)/4))
                 px2[i].setColor(new Color(0,0,100));
             else if (px2[i].getRed()<min2+2*((max2-min2)/4))
                 px2[i].setColor(new Color(255,0,0));
             else if (px2[i].getRed()<min2+3*((max2-min2)/4))
                 px2[i].setColor(new Color(100,200,255));
             else if (px2[i].getRed()<max2)
                 px2[i].setColor(new Color(255,255,200));
         }
         me2.explore();
         /**
          * custom color palette
          */

         
    }//main       
}//class
