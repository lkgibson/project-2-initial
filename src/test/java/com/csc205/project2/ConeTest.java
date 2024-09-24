package com.csc205.project2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConeTest
{

    private Cone cone;

    @BeforeEach
    public void setUp()
    {
        cone = new Cone(4.0, 1.0);
    }

    @Test
    public void testGetHeight()
    {
        assertEquals(4.0, cone.getHeight());
    }

    @Test
    public void testSetHeight()
    {
        cone.setHeight(5.0);
        assertEquals(5.0, cone.getHeight());
    }

    @Test
    public void testGetRadius()
    {
        assertEquals(1.0, cone.getRadius());
    }

    @Test
    public void testSetRadius()
    {
        cone.setRadius(2.0);
        assertEquals(2.0, cone.getRadius());
    }

    @Test
    public void testSurfaceArea()
    {
        assertEquals(16.094710997004984, cone.surfaceArea(), 0.0001);
    }

    @Test
    public void testVolume()
    {
        assertEquals(4.1887902047863905, cone.volume(), 0.0001);
    }

    @Test
    public void testToString()
    {
        String expected = "Cone {height=4.0, radius=1.0, surface area=16.094710997004984, volume=4.1887902047863905}";
        assertEquals(expected, cone.toString());
    }
}
