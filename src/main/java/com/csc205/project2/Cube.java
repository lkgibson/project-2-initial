package com.csc205.project2;

/* Extra credit: Here is what I asked ChatGPT:
Using java programming language, generate both volume and surface area formulas for each of: a cone,
cylinder, and cube class. The cone and cylinder class will use the variables of radius and height, while
the cube class uses the variable width. Also, cone will use the variable slantHeight within the surfaceArea
method. Be careful of integer division, use double values in all equations. Use the following example of a
Sphere class to model the Cone, Cylinder, and Cube classes' methods of volume and surface area.
public double surfaceArea()
    {
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double volume()
    {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }
 */

public class Cube extends Shape
{
    private double width;

    public Cube()
    {
        super();
        this.width = 0.0;
    }

    public Cube(double w)
    {
        super();
        this.width = w;
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    @Override
    public double surfaceArea()
    {
        return 6.0 * Math.pow(width, 2); // Surface area formula
    }

    @Override
    public double volume()
    {
        return Math.pow(width, 3);  // Volume formula
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Cube {");
        sb.append("width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
