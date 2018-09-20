import java.util.Scanner;

public class MultiplyTheDigitsInAnInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //In this exercise we want to prompt the user for a number of the type integer. Then we want to tage each digit in the integer and multiply it with the next in the succesion line.
        //We will do this in 6 steps
        //Step 1: we prompt the user to read(type) in a number between 0 and 1000
        //Step 2: We extract digit number one and remove it from the main number
        //Step 3: We extract digit number two and remove it from the first reduced number
        //Step 4: We extract digit number three and remove it from the second reduces number
        //Step 5: We multiply all extracted digits and multiply them
        //Step 6: Print out result

        //Step 1: Prompt user for number
        System.out.print("read in number between 0 and 1000: ");
        double number = input.nextDouble();

        //Step 2: Extract first digit and remove it from the main number
        double digit1 = number % 10; //Extraction
        double removeDigit1 = (int)number / 10; //Removal

        //Step3: Extract second digit and remove it
        double digit2 = removeDigit1 % 10; //Extraction
        double removeDigit2 = (int)number / 100; //Removal

        //Step4: Extract third digit and remove it
        double digit3 = removeDigit2 % 10; //Extraction
        //double removeDigit3 = (int)number / 1000; //Removal

        //Step5: Multiply digits
        double multiplyDigits = digit1 * digit2 * digit3;

        //Step6: Print out the result to screen
        System.out.println("The result of multiplying the extracted digits is: " + multiplyDigits);

    }
}