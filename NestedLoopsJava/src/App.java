import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int rows;
        int columns;
        String symbol = "";

        Scanner scanner  = new Scanner(System.in);

        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter # of columns: ");
        columns = scanner.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = scanner.next();

        for(int i=1; i<=rows; i++){
            System.out.println();
            for(int j=1; j<=columns; j++){
                System.out.print(symbol);
            }
           
        }
         System.out.println();


    }
}
