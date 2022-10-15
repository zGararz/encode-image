/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encode_image.entity;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


/**
 *
 * @author zGararz
 */
public class ImageCipher {
    
    private static final double LAMDA_A = 3.7;
    private static final double LAMDA_B = 3.8;
               

    public static BufferedImage encode(String imgPath, double a, double b) throws IOException {
        
        File img = new File(imgPath);
        BufferedImage image = ImageIO.read(img);
        int size = image.getWidth() * image.getHeight();
        double[] x = Utils.chaosLogisticMapList(a, LAMDA_A, size);
        int[]  randomSequenceX = Utils.randomSequenceX(x);
        double[] y = Utils.chaosLogisticMapList(b, LAMDA_B, size);
        int[]  randomSequenceY = Utils.randomSequenceY(y);
        
        return encodeOne(image, randomSequenceX, randomSequenceY);
        
    }
    
    public static BufferedImage decode(String imgPath, double a, double b) throws IOException {
        
        File img = new File(imgPath);
        BufferedImage image = ImageIO.read(img);
        int size = image.getWidth() * image.getHeight();
        double[] x = Utils.chaosLogisticMapList(a, LAMDA_A, size);
        int[]  randomSequenceX = Utils.randomSequenceX(x);
        double[] y = Utils.chaosLogisticMapList(b, LAMDA_B, size);
        int[]  randomSequenceY = Utils.randomSequenceY(y);
        
        return decodeOne(image, randomSequenceX, randomSequenceY);
    }
     
    
    private static BufferedImage encodeOne(BufferedImage image, int[] randomSequenceX, int[] randomSequenceY) throws IOException {
        
        BufferedImage encodeImage = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_RGB);
                 
        for (int j = 0; j < image.getHeight(); j++) {
            for (int i = 0; i < image.getWidth(); i++) {
                
                Color c = new Color(image.getRGB(i, j));
                int r = c.getRed();
                int g = c.getGreen();
                int b = c.getBlue();                 
                int x = randomSequenceX[i + image.getWidth()* j];
                        
                if(i != 0 && j!= 0) {
                    Color c0 = null;
                    if (i != 0) {
                        c0 = new Color(encodeImage.getRGB(i - 1, j));
                    } else {
                        c0 = new Color(encodeImage.getRGB(encodeImage.getWidth() - 1, j - 1));
                    }

                    int r0 = c0.getRed();
                    int g0 = c0.getGreen();
                    int b0 = c0.getBlue();
                    
                    r = x ^ Utils.mod((x + r), 256) ^ r0;
                    g = x ^ Utils.mod((x + g), 256) ^ g0;
                    b = x ^ Utils.mod((x + b), 256) ^ b0;
                } else {
                    r ^= randomSequenceX[0];
                    g ^= randomSequenceX[0];
                    b ^= randomSequenceX[0];  
                }             
                encodeImage.setRGB(i, j, new Color(r, g, b).getRGB());   
            } 
        }
        
        return shuffle(encodeImage, randomSequenceY);
    }
    
    private static BufferedImage decodeOne(BufferedImage image, int[] randomSequenceX, int[] randomSequenceY) throws IOException {   
        
        BufferedImage decodeImage = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_RGB);
        image = revertShuffle(image, randomSequenceY);
        
        
        for (int j = 0; j < image.getHeight(); j++) {
            for (int i = 0; i < image.getWidth(); i++) {
                
                Color c = new Color(image.getRGB(i, j));
                int r = c.getRed();
                int g = c.getGreen();
                int b = c.getBlue();                 
                int x = randomSequenceX[i + image.getWidth()* j];
                        
                
                if(i != 0 && j!= 0) {
                    Color c0 = null;
                    if (i != 0) {
                        c0 = new Color(image.getRGB(i - 1, j));
                    } else {
                        c0 = new Color(image.getRGB(decodeImage.getWidth() - 1, j - 1));
                    }

                    int r0 = c0.getRed();
                    int g0 = c0.getGreen();
                    int b0 = c0.getBlue();
                    
                    r = Utils.mod(((x ^ r ^ r0) - x),256);
                    g = Utils.mod(((x ^ g ^ g0) - x),256);
                    b = Utils.mod(((x ^ b ^ b0) - x),256);
                } else {
                    r ^= randomSequenceX[0];
                    g ^= randomSequenceX[0];
                    b ^= randomSequenceX[0];  
                }             

                decodeImage.setRGB(i, j, new Color(r, g, b).getRGB());   
            } 
        }
        return decodeImage;
    }
    
    public static BufferedImage shuffle(BufferedImage image, int[] randomSequence) {
        for (int j = 0; j < image.getHeight(); j++) {
            for (int i = 0; i < image.getWidth(); i++) {
                
                int y = randomSequence[i + j * image.getWidth()];
                
                int j2 = y / image.getWidth();
                int i2 = y % image.getWidth();
                
                int rgb = image.getRGB(i, j);
                int rgb2 = image.getRGB(i2, j2);
      
                image.setRGB(i, j, rgb2);
                image.setRGB(i2, j2, rgb);
            }
        }
        return image;
    }
    
        public static BufferedImage revertShuffle(BufferedImage image, int[] randomSequence) {
        for (int j = image.getHeight() - 1; j >= 0 ; j--) {
            for (int i = image.getWidth() - 1; i >= 0 ; i--) {
                
                int y = randomSequence[i + j * image.getWidth()];
                
                int j2 = y / image.getWidth();
                int i2 = y % image.getWidth();
                
                int rgb = image.getRGB(i, j);
                int rgb2 = image.getRGB(i2, j2);
      
                image.setRGB(i, j, rgb2);
                image.setRGB(i2, j2, rgb);
            }
        }
        return image;
    }
      
}