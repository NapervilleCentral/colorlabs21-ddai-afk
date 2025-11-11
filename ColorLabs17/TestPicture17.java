
/**
 * Kevin Hayes
 * Test Picture Classes
 *
 * @author (Kevin Hayes)
 * @version (10-19-2016)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
public class TestPicture17
{

    /**
     * main method, to test the picture
     *
     */
  public static void main(String[] args)
  {
      Picture pic1 = new Picture("images\\CumberlandIsland.jpg");
      Picture pic2 = new Picture("images\\CumberlandIsland.jpg");
      Picture pic3 = new Picture("images\\CumberlandIsland.jpg");
      Picture pic4 = new Picture("images\\CumberlandIsland.jpg");
      
      Pixel[] px1 = pic1.getPixels();
      Pixel[] px2 = pic2.getPixels();
      Pixel[] px3 = pic3.getPixels();
      Pixel[] px4 = pic4.getPixels();
      
      pic1.explore();
      //adjustRed
      double factorRed = 0.5;
      for (Pixel pxobj : px1)
      {
          pxobj.setRed((int)(pxobj.getRed()*factorRed));
      }
      pic1.explore();
      //negate
      for (Pixel pxobj : px1)
      {
          pxobj.setColor(new Color(255-pxobj.getRed(),255-pxobj.getGreen(),255-pxobj.getBlue()));
      }
      pic1.explore();
      
      pic2.explore();
      //grayscale
      for (Pixel pxobj : px2)
      {
          double avg = (pxobj.getRed()+pxobj.getGreen()+pxobj.getBlue())/3;
          pxobj.setColor(new Color((int)avg,(int)avg,(int)avg));
      }
      pic2.explore();
      //darken
      for (Pixel pxobj : px2)
      {
          pxobj.setColor(new Color((int)(pxobj.getRed()*0.5),(int)(pxobj.getGreen()*0.5),(int)(pxobj.getBlue()*0.5)));
      }
      pic2.explore();
      
      pic3.explore();
      //blueify
      //Color faceColor = new Color(255,195,170);//skin color?
      Color faceColor = new Color(28,54,19);//plant color
      for (Pixel pxobj : px3)
      {
          if ((Math.abs(pxobj.getRed()-faceColor.getRed())<10)&&(Math.abs(pxobj.getGreen()-faceColor.getGreen())<15)&&(Math.abs(pxobj.getBlue()-faceColor.getBlue())<20))
          {
              pxobj.setBlue(255);
          }
      }
      pic3.explore();
      //changeColor
      int redAmt = 23;
      int greenAmt = 56;
      int blueAmt = 67;
      for (Pixel pxobj : px3)
      {
          pxobj.setRed(pxobj.getRed()+redAmt);
          pxobj.setGreen(pxobj.getGreen()+greenAmt);
          pxobj.setBlue(pxobj.getBlue()+blueAmt);
      }
      //pic3.explore();
      //opens picture using a dialog box
      /*
     String fileName = FileChooser.pickAFile();
     Picture pictObj = new Picture(fileName);
     pictObj.explore();
     /**/

     //opens a pictue using a path
     //Picture apic = new Picture("C:\\Users\\khayes\\Favorites\\Documents\APCS- Java\chap03\Curriclum 2013\Picture Color labs\images\\beach.jpg");
     /*
     //relative path
     Picture apic = new Picture("images\\beach.jpg");
     Picture ferris1 = new Picture("images/2000 ferris wheel2.jpg");
     //Picture ferris1 = new Picture("images/IMG_0747.jpeg");
     Picture moto = new Picture("images/redMotorcycle.jpg");
     Picture ferris3 = new Picture("images/2000 ferris wheel2.jpg");

     //displays picture
     //apic.explore();
     ferris1.explore();
     
     //makes an array of pixels
     Pixel[] pixels;
     //gets pixels from picture and assigns to pixels array
     pixels = ferris1.getPixels();
    
     //how many pixels or how large array
    System.out.println("This is a large array"+pixels.length  );
    /**/
    /*
    for (Pixel pixelobj : pixels)
    {
        if ((pixelobj.getRed()>pixelobj.getGreen())&&(pixelobj.getRed()>pixelobj.getBlue()))
            pixelobj.setColor(new Color(255,0,0));
        else if ((pixelobj.getGreen()>pixelobj.getRed())&&(pixelobj.getGreen()>pixelobj.getBlue()))
            pixelobj.setColor(new Color(0,255,0));
        else if ((pixelobj.getBlue()>pixelobj.getGreen())&&(pixelobj.getBlue()>pixelobj.getRed()))
            pixelobj.setColor(new Color(0,0,255));
        else if ((pixelobj.getRed()==pixelobj.getGreen())&&(pixelobj.getRed()!=pixelobj.getBlue()))
            pixelobj.setColor(new Color(255,255,0));
        else if ((pixelobj.getRed()==pixelobj.getBlue())&&(pixelobj.getGreen()!=pixelobj.getBlue()))
            pixelobj.setColor(new Color(255,0,255));
        else if ((pixelobj.getGreen()==pixelobj.getBlue())&&(pixelobj.getGreen()!=pixelobj.getRed()))
            pixelobj.setColor(new Color(0,255,255));
    
        else 
            pixelobj.setColor(new Color(255,255,255));
    }
    /*
    for (Pixel pixelobj : pixels)
    {
        pixelobj.setColor(new Color(255-pixelobj.getRed(),255-pixelobj.getGreen(),255-pixelobj.getBlue()));
    }

    /*
        //access each index
    System.out.println(pixels[17]);
    //access each pixel
    Pixel spot = ferris1.getPixel(100,100);
    Pixel ferr17 = pixels[17];
    
    //ferr17.setRed(255);
    //ferr17.setGreen(255);
    //ferr17.setBlue(255);
    Color newColor = new Color(0,255,255);
    ferr17.setColor(newColor);
    ferris1.explore();
    
    System.out.println(pixels[17].getColor());
    System.out.println(spot);
/*
    pixels[17].setColor(Color.blue);
    spot.setColor(new Color(252,252,252));
    pixels[500034].setColor(Color.blue);

    ferris1.explore();
/*
   // loop to access indexes of array or collection

    //for each loop spot  is a ?
    for (Pixel spot : pixels)
    System.out.println( spot );


   
 /**/

 /**
  * Method to clear red from picture
  * @param none
  * @return none
  */
 /*
    for (Pixel pixelObj : pixels)
        {
            //set the red value of the current pixel to the new value
           

        }
    ferris1.explore();
    
/**/
 /**
  * Method to reduce red from picture by a factor of n
  * @param none
  * @return none
  */

/*
int value;
final double  FACTOR = .5;
    for (Pixel pixelObj : pixels)
    {

        //get the redvalue
        value = pixelObj.getRed();
        //System.out.println(value);

        //decrease the red value by 50%
        
        //set the red value of the current pixel to the new value
        

    }
    // use new picture when changing or it will make changes to 
    // pic you already changed
    ferris1.explore();
    ferris2.explore();

  /*
    //write/save a picture as a file
    ferris1.write("images/ferris11.jpg");

    /**/
  }//main
}//class
