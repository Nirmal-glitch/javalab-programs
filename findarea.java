import java.util.Scanner;
import pack.arp;

public class findarea {
    public static void main(String[] args) {

        float area, perimeter;
        Scanner in = new Scanner(System.in);

        arp h = new arp();

        // Rectangle
        System.out.println("Enter the length of the rectangle:");
        float a = in.nextFloat();

        System.out.println("Enter the breadth of the rectangle:");
        float b = in.nextFloat();

        arp.rectangle r = h.new rectangle();
        area = r.area(a, b);
        perimeter = r.perimeter(a, b);

        System.out.println("Rectangle: area = " + area + " perimeter = " + perimeter);

        // Circle
        System.out.println("Enter the radius of the circle:");
        float c = in.nextFloat();

        float pi = 3.14f;

        arp.circle cir = h.new circle();
        area = cir.area(c, pi);
        perimeter = cir.perimeter(c, pi);

        System.out.println("Circle: area = " + area + " perimeter = " + perimeter);
    }
}