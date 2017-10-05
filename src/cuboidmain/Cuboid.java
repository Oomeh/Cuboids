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
public class Cuboid<T> {
    
    private T length;
    private T breadth;
    private T height;

    public Cuboid() {
    }

    
    
    public Cuboid(T length, T breadth, T height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    
    
    public T getLength() {
        return length;
    }
//Getters and setters
    public void setLength(T length) {
        this.length = length;
    }

    public T getBreadth() {
        return breadth;
    }

    public void setBreadth(T breadth) {
        this.breadth = breadth;
        
    }

    public T getHeight() {
        return height;
    }

    public void setHeight(T height) {
        this.height = height;
    }
    public double getVolume()
    {
        //Converts the values to strings so that they can be converted back into doubles
        Double Length = new Double(getLength().toString());
        double length;
        length = Length.doubleValue();
        Double Breadth = new Double(getBreadth().toString());
        double breadth;
        breadth = Breadth.doubleValue();
        Double Height = new Double(getHeight().toString());
        double height;
        height = Height.doubleValue();
        //Multiplies the values
        double total = length * breadth * height;
        return total;
    }    
    
    //Overrides the toString method to make it display the length, breadth, and height after calling the get methods
    @Override
    public String toString()
    {
        return "The length is " + getLength() + ", the breadth is " + getBreadth()
                + " and the height is " + getHeight() + ". The volume is " + getVolume();
    }

}
