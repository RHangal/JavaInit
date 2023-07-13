import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        //curly braces who would've thought
        String[] cars = {"Camaro", "Corvette", "Tesla"};

        String[] planes = new String[3];

        planes[0] = "small";
        planes[1] = "medium";
        planes[2] = "big";

        for(int i=0; i<planes.length; i++){
            System.out.println(planes[i]);
        }

        //2d arrays

        String [][] newCars = {
            {"car 1", "car 2", "car 3"},
            {"car 4", "car 5", "car 6"},
            {"car 7", "car 8", "car 9"},
        };

        newCars[0][2] = "car 10";

         for(int i=0; i<newCars.length; i++){
            System.out.println();
            for(int j=0; j<newCars[i].length; j++){
                System.out.print(newCars[i][j]+" ");
            }
        }
        System.out.println();
        //Array lists, can also be 2d
        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        food.set(0, "sushi");
        food.remove(2);
        food.clear();

        for (int i=0; i<food.size(); i++) {
            System.out.println(food.get(i));
        }


    }
}
