import java.util.*;


    
public class Binary {
public static void main(String []args) {

    String askForDecimal =Binary.("Enter the decimal number you would like to convert?");
    int decimalNumber = Integer.parseInt(askForDecimal);

    int remainder = 0;
    for (int i = 1; decimalNumber > 0; i++) {

            decimalNumber /= 2;
            remainder = decimalNumber % 2;
            System.out.print(remainder);
        }

    }
}
    

