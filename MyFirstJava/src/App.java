import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\tHello, World!\n");
        System.out.println("I love Pizza!");
        System.out.println("\"\\I love Pizza!\"");
        // Single Line Comment
        /*
         * 
         * multi line comment
         */

        int x = 123;
        long y = 12312423523456567L;
        float z = 3.14f;
        double w = 3.1415926789;
        boolean q = false;
        char symbol = '@';
        String name = "Hello World";

        System.out.println(x + " hi " + y);

        //Swapping two variables
        String a = "Water";
        String b = "Kool-Aid";
        String temp;

        temp = a;
        a=b;
        b=temp;

        System.out.println("a: "+a);
        System.out.println("b: "+b);

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String newname = scanner.nextLine();
        System.out.println("Hello "+newname);
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("You are "+age+" years old");
        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();
        System.out.println("Your favorite food is "+food);
        
        
    }
    
}
