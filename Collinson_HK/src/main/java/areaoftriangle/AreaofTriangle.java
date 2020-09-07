package areaoftriangle;

import java.util.Scanner;

public class AreaofTriangle {
    Scanner scanner=new Scanner(System.in);

    public  void  areatriangle(){
//        System.out.println("Enter the width of the Triangle:");
        double base = 6;
//                scanner.nextDouble();

//        System.out.println("Enter the height of the Triangle:");
        double height = 5;
//                scanner.nextDouble();

            double area = (base * height) / 2;

        System.out.println("Area of Triangle is: " + area);
    }

}
