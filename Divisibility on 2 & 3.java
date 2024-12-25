
package divisibility;

import java.util.Scanner;

public class Divisibility {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        if(number % 2 ==0 && number % 3 == 0)
            System.out.println("is divisible by 2 and 3 ");
        else if(number % 2 == 0 && number % 3 != 0)
            System.out.println("is divisible by 2 ");
        else if (number % 2 != 0 && number % 3 == 0)
            System.out.println("is divisible by 3");
        else 
            System.out.println("is not divisible by 2 or 3");
    }
    
}
