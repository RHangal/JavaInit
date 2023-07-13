public class App {
    public static void main(String[] args) throws Exception {
        
        Car myCar1 = new Car();
        Car myCar2 = new Car();

        myCar1.brake();
        System.out.println(myCar1.model);

        myCar2.model = "Tesla";

        System.out.println(myCar2.model);

        Human human1 = new Human("Ro", 20, 70);

        System.out.println(human1.name);

        Human human2 = new Human("Mort", 45, 100);

        System.out.println(human2.age);
        human2.eat();
    }
}


