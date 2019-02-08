package com.kodiila.testing.shape;

import com.kodilla.testing.shape.*;
import org.junit.*;

import javax.swing.table.TableRowSorter;

public class ShapeCollectroTestSuite {
    @Before
    public void before(){
        System.out.println("Test ShapeCollector: begin");
    }

    @After
    public void after(){
        System.out.println("Test ShapeCollector: end");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test ShapeCollector: before");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Test ShapeCollector: after");
    }



    @Test
    public void testAddShape(){

        //given:
        ShapeCollector shapeCollector=new ShapeCollector();
        int result;
        Circle circle = new Circle(5.0);

        //when:
        shapeCollector.addShape(circle);
        result = shapeCollector.getQuantity();

        System.out.println("Testing "+shapeCollector.toString());
        //then:
        Assert.assertEquals(1,result);

    }

    @Test
    public void testRemoveShape(){
        //given:
        ShapeCollector shapeCollector=new ShapeCollector();
        int result;
        Circle circle = new Circle(5.0);
        Triangle triangle = new Triangle(5.0,4.0);
        Square square = new Square(4);
        //when:
        shapeCollector.addShape(circle);
        shapeCollector.addShape(square);
        shapeCollector.removeShape(square);
        shapeCollector.addShape(triangle);

        result = shapeCollector.getQuantity();

        System.out.println("Testing "+shapeCollector.toString());
        //then:
        Assert.assertEquals(2,result);

    }


    @Test
    public void testgetFigure(){

        //given:
        ShapeCollector shapeCollector = new ShapeCollector();

        Circle circle = new Circle(5.0);
        Triangle triangle = new Triangle(5.0,4.0);
        Square square = new Square(4);
        //when:
        shapeCollector.addShape(circle);
        shapeCollector.addShape(square);
        shapeCollector.addShape(triangle);

        Shape result = shapeCollector.getFigure(2);

        System.out.println("Testing "+shapeCollector);
        //then:
        Assert.assertEquals(triangle,result);

    }

}
