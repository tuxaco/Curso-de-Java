/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alberto
 */
class CastingVariables {
        public static void main(String[] args){
            double x=56.01;
            float y=(float)(2*x);
            
            double temp=3.4*y;
            
            int temp2=(int)(temp);
            
            System.out.println(x);
            System.out.println(y);
            System.out.println(temp);
            System.out.println(temp2);
        }
}
