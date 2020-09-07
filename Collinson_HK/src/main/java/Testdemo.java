import areaoftriangle.AreaofTriangle;
import numbers.PrintNumbers;

public class Testdemo {
    public static void main(String[] args)
    {
        //print the result
        System.out.println("Output is : ");

        PrintNumbers pn= new PrintNumbers();
        pn.printOneToTenNumbers();

        AreaofTriangle pt = new AreaofTriangle();
        pt.areatriangle();
    }
}
