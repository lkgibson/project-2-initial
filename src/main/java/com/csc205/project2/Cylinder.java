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

public class Cylinder extends Shape
{
    private double height;
    private double radius;

    public Cylinder()
    {
        super();
        this.height = 0.0;
        this.radius = 0.0;
    }

    public Cylinder(double h, double r)
    {
        super();
        this.height = h;
        this.radius = r;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double surfaceArea()
    {
        return 2.0 * Math.PI * radius * (height + radius); // Surface area formula
    }

    @Override
    public double volume()
    {
        return Math.PI * Math.pow(radius, 2) * height; // Volume formula
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
