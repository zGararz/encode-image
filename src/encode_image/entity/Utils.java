/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encode_image.entity;


/**
 *
 * @author zGararz
 */
public class Utils {
   
    public static double chaosLogisticMap(double x, double lamda){        
        return lamda * x * (1 - x);
    }
    
    public static double[] chaosLogisticMapList(double x0, double lamda, int size) {
        
        double[] list = new double[size];
        list[0] = x0;
        
        for (int i = 1; i < list.length; i++) {
            list[i] = chaosLogisticMap(list[i - 1], lamda);
                  
        }
        
        return list;
    }
    
    public static int[] randomSequenceX(double[] x) {
        
        int[] list = new int[x.length];
        
        for (int i = 0; i < list.length; i++) {
            list[i] = ((int)(x[i] * 256)) % 256;
        }
        
        return list;
    }
    
        public static int[] randomSequenceY(double[] y) {
        
            int[] list = new int[y.length];
        
        for (int i = 0; i < list.length; i++) {
            list[i] = ((int)(y[i] * y.length)) % (y.length);
        }
        
        return list;
    }
        
        static int mod(int x, int m) {      
        
        int nbm = Integer.toBinaryString(m).length();   
        
        while(true) {
            int nbx = Integer.toBinaryString(x).length();
            if(nbx < nbm) {
                return x;
            }
            int mshift = m << (nbx - nbm);
            x ^= mshift;
        }
    }
}
