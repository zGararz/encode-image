
import encode_image.entity.ImageCipher;
import encode_image.entity.MathC;
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zGararz
 */
public class Test {
    public static void main(String[] args) {
     double x = MathC.oneChaosLogisticMap(0.341, 0.452);
     int c = new Color(0xFFFFFF).getRGB();
        System.out.println(ImageCipher.colorToInt(c));


    
    }
}
