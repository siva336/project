package areaoftriangle;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AreaofTriangleTest {
    @Test
    public void testPrintTriagle() {

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        AreaofTriangle pt = new AreaofTriangle();
        pt.areatriangle();
        String expectedOutput  = "Area of Triangle is: 15.0\n";
        Assert.assertEquals(expectedOutput, outContent.toString());
    }

}
