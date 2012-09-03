/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alberto
 */
import java.awt.Point;

class ProbarReferencias {

        public static void main(String[] args){
            Point pt1,pt2;
            
            pt1=new Point(100,100);
            
            //Es una referencia a pt1, va a ser una referencia a un objeto, cualquier cambio hará que se cambie la referencia
            pt2=pt1;
            
            pt1.x=200;
            pt2.y=200;
            
            System.out.println("PT1: "+pt1.x+","+pt2.y+"; PT2: "+pt2.x+","+pt2.y);
            
        }
}
