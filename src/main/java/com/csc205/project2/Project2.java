package com.csc205.project2;

import java.util.ArrayList;
import java.util.List;

/*
Driver for project 2.
Modify the driver as needed to demonstrate your classes.
*/

public class Project2
{

    public static void main(String[] args) {

        /*
        The following code works with the example design given. I added my cone class to the code.
         */

        ThreeDimensionalShape sphere = new Sphere(2.0);
        ThreeDimensionalShape cube = new Cube(5.0);
        ThreeDimensionalShape cylinder = new Cylinder(4.0, 1.0);
        ThreeDimensionalShape cone = new Cone(3.0, 2.0);

        // We'll cover this stuff in module 4
        List<ThreeDimensionalShape> shapes = new ArrayList<>();
        shapes.add(sphere);
        shapes.add(cube);
        shapes.add(cylinder);
        shapes.add(cone);

        shapes.forEach(System.out::println);

        /*
        The following code works with the code given. I got rid of Sphere sphere because
        sphere was implemented with ThreeDimensionalShape sphere = new Sphere(2.0); and I
        did the same for the other shapes.
         */

        System.out.println(sphere);

        System.out.println(cube);

        System.out.println(cylinder);

        System.out.println(cone);
    }

}

