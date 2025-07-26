package Tasks;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a name: ");
        String name = scanner.nextLine();

        if(name.equals("john")){
            System.out.println("Hello, John");
        }else{
            System.out.println("There is no such name");
        }
        scanner.close();

    }
}
