// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Pizza pizza1 = new Pizza("thicc crust", "tomato","mozzarella", "pepperoni");

        System.out.println("Here are your pizza ingredients");
        System.out.println(pizza1.bread+"\n" + pizza1.sauce+ "\n"+pizza1.cheese+"\n"+pizza1.topping  );

        //using an overload
        Pizza pizza2 = new Pizza("thicc crust", "garlic", "pepperjack");

        Car car1 = new Car();
        //toString returns address but can overide to represent text representation of object
        System.out.println(car1.toString());
        System.out.println(car1);

        //list of objects
        Pizza[] partyOrder = new Pizza[3];
        Pizza[] newPartyOrder = {pizza1, pizza2};
        }


}