public class App {
    public static void main(String[] args) throws Exception {
        hello("Bro", 28);
        int z = sum(3,4);
        System.out.println(z);
        //printf()
        System.out.printf("This is a format string %d\n", z);
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;
        //Conversion characters
        System.out.printf("%b\n",myBoolean);
        System.out.printf("%c\n",myChar);
        System.out.printf("%s\n",myString);
        System.out.printf("%d\n",myInt);
        System.out.printf("%f\n",myDouble);
        //min char count
        System.out.printf("%10s\n",myString);
        //round off double at 2 decimal places
        System.out.printf("%.2f\n",myDouble);
        //flags
        System.out.printf("%+f\n",myDouble);

        //final keyword is basically a const, and naming convention is to make variable all caps
        final double PI = 3.14159;

        // pi = 4; can't be done

        System.out.println(PI);

    }
    //method = block of code that is executed whenever it is call upon aka:functions lol
   static void hello(String name, int age){
        System.out.println("Hello "+name+" you are "+age+" years old");
    }

    static int sum(int x, int y){
        return x + y;
        
    }

    //function overloads
    static int add(int a, int b){
        return a + b;
    }
    static double add(double a, double b){
        return a + b;
    }
    static int add(int a, int b, int c){
        return a + b + c;
    }
}
