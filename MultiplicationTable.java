/**
 * @author Waleed Mortaja, contact Email : <a href="mailto:waleed.mortaja@gmail.com">waleed.mortaja@gmail.com</a>
 */
import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numer you want to get its multiplication table: ");
        int firstNumber = in.nextInt();
        System.out.print("What is the  final number you want to reach?  ");
        int secondNumber = in.nextInt();

        for (int i = 1 ; i <= secondNumber; i++){
            System.out.println(firstNumber +" * "+ i +" = "+ (firstNumber*i));
        }
        
        
    }

}
