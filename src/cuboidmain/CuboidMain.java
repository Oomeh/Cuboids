/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuboidmain;

/**
 *
 * @author bvance
 */
public class CuboidMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Calls the methods of the cuboid
        Cuboid<Number> c1 = new Cuboid<>();
        Cuboid<Number> c2 = new Cuboid<>();
        c1.setBreadth(5);
        c1.setHeight(5);
        c1.setLength(5);
        c2.setBreadth(.10);
        c2.setHeight(.10);
        c2.setLength(.10);
        System.out.println(c1.toString());


        System.out.println(c2.toString());        
        
    }
    
}
