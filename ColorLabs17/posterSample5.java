import java.awt.*;
import java.util.*;
import java.util.List; 
/**
 * Write a description of class posterSample5 here.
 * 1 Copyed orginal]
 * 2 Mirror
 * 
 * @author
 * @version
 */
public class posterSample5
{
  public static void main(String[] args)
  {
      
     Picture pic1 = new Picture("images\\posterimage1.png");
     Picture pic2 = new Picture("images\\posterimage1.png");
     Picture pic3 = new Picture("images\\posterimage1.png");
     Picture pic4 = new Picture("images\\posterimage1.png");
     Picture pic5 = new Picture("images\\posterimage1.png");
     Picture pic6 = new Picture("images\\posterimage1.png");
     Picture canvas = new Picture("images\\poster5.png");
      //makes an array of pixels--GIVEN YOU NEED THIS
     Pixel[] pixels;
     //gets pixels from picture and assigns to pixels array
     
     /*PICTURE 1*/
     pixels = pic1.getPixels();//GET ALL THE PIXELS
     
    for (Pixel spot : pixels)
    {
        //System.out.println( spot );
        spot.setRed((int)(spot.getRed() *.1));
     

     
    }
    recursiveShrink(pic1);
    /*PICTURE 2*/
    
    pixels = pic2.getPixels();
    mirrorYaxisBottom(pic2);
    
    /*PICTURE 3*/
    
    
    
    /*PICTURE 4*/
    
    
    
    /*PICTURE 5*/
    
    
    
    /*PICTURE 6*/
    
    
    
    /* */
    
    copyKatie(pic1,canvas,0,0);
    copyKatie(pic2,canvas,1586,0);
    copyKatie(pic3,canvas,3172,0);
    copyKatie(pic4,canvas,0,1057);
    copyKatie(pic5,canvas,1586,1057);
    copyKatie(pic6,canvas,3172,1057);
    
    canvas.explore();
   }
  
   /**
    * copy from source to target
    * position of int x, y for placement on the target
    */
   
   public static void copyKatie( Picture sourcePic, Picture targetPic,int toX, int toY)
   {
       Pixel sourcePix = null;
       Pixel targetPix = null;
       
       //width of the source must be <= to the canvas I am 
       //going to copy to
       
       for (int sourceX = 0, targetX = toX;
            sourceX<sourcePic.getWidth();
            sourceX++, targetX ++)
            {
            
            for (int sourceY = 0, targetY = toY;
            sourceY<sourcePic.getHeight();
            sourceY++, targetY ++)
            {
                //set the target pix color of the source pix
                sourcePix = sourcePic.getPixel(sourceX,sourceY);
                targetPix = targetPic.getPixel(targetX,targetY);
                targetPix.setColor(sourcePix.getColor());
            }//loop
        }//loop
       
       
       
    }//end of copyKatie
    
    public static Picture shrink(Picture pic)
    {
        Picture result = new Picture(pic.getWidth()/2,pic.getHeight()/2);
        for (int x = 0 ; x < pic.getWidth() ; x++)
        {
            for (int y = 0 ; y < pic.getHeight() ; y++)
            {
                if (x%2 == 1 && y%2 == 1)
                {
                    result.getPixel(x/2,y/2).setColor(pic.getPixel(x,y).getColor());
                }
            }
        }
        return result;
    }
    
    public static void recursiveShrink(Picture pic)
    {
        if (pic.getWidth()>10&&pic.getHeight()>10)
        {
            Picture pic1 = shrink(pic);
            recursiveShrink(pic1);
            copyKatie(pic1,pic,0,0);
        }
    }
    
    public static void mirrorYaxisTop(Picture pic)
    {
        for (int x = 0 ; x < pic.getWidth() ; x++)
        {
            for (int y = 0 ; y < pic.getHeight()/2 ; y++)
            {
                pic.getPixel(x,Math.clamp(pic.getHeight()-y,0,pic.getHeight()-1)).setColor(pic.getPixel(x,y).getColor());
            }
        }
    }
    
    public static void mirrorYaxisBottom(Picture pic)
    {
        for (int x = 0 ; x < pic.getWidth() ; x++)
        {
            for (int y = pic.getHeight() ; y >= pic.getHeight()/2 ; y++)
            {
                pic.getPixel(x,Math.clamp(pic.getHeight()-y,0,pic.getHeight()-1)).setColor(pic.getPixel(x,y).getColor());
            }
        }
    }
}
