// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
       Garage garage = new Garage();

       Car car = new Car("BMW");

       garage.park(car);

       //static = modifier. A single copy of a variable/method is created and shared.
        // The class "owns" the static member
        Friend friend1 = new Friend("SpongeBob");
        Friend friend2 = new Friend("Patrick");

        //call static things from objects instead of specific instantiated objects
        System.out.println(Friend.numberOfFriends);

        Friend.displayFriends();


        //inheritance
        Plane plane = new Plane();
        plane.go();
        System.out.println(plane.speed);
        System.out.println(plane.wings);

        Bicycle bicycle = new Bicycle();
        //object method overriding
        bicycle.go();


        //super = keyword refers to the superclass (parent) of an object
        // very similar to the "this" keyword
        Hero batman = new Hero("Bruce", 30, "Rich");
        System.out.println(batman.name);
        System.out.println(batman.toString());

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.


            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.

        }

}