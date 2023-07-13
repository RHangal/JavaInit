import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        double x = 3.14;
        double y = -10;

        double z = Math.max(x, y);
        double q = Math.abs(y);
        double t = Math.floor(x);
        double r = Math.ceil(x);


        System.out.println(z);
        System.out.println(q);
        System.out.println(t);
        System.out.println(r);

        // Hypotenuse time
        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side a");
        a = scanner.nextDouble();
        System.out.println("Enter side b");
        b = scanner.nextDouble();

        c = Math.sqrt((a*a)+(b*b));

        System.out.println("The hypotenuse is "+c);

        scanner.close();


    }
}
