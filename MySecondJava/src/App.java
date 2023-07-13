public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        double friends= 10;

        friends += 1;

        //casting double to an int but you can't cast an int to a double
        friends = (int)friends / 3;

        System.out.println(friends);
    }
}
