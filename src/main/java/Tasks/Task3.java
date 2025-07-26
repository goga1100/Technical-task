package Tasks;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 5, 6, 8, 9, 12, 15};

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 3 == 0){
                System.out.println(numbers[i]);
            }
        }
    }
}
