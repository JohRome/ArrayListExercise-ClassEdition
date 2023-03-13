import java.util.Scanner;

public class Menu {

    public void printMainMenu() {
        System.out.println("1. Names menu options");
        System.out.println("2. Integers menu options");
        System.out.println("3. Exit program");
    }
    public void printStringMenu() {
        System.out.println("1. Add a name to list");
        System.out.println("2. Print names from list");
        System.out.println("3. Reverse name order and print from list");
        System.out.println("4. Go back to main menu");
    }
    public void printIntegerMenu() {
        System.out.println("1. Add an integer to list");
        System.out.println("2. Print integers from list");
        System.out.println("3. Reverse integer order and print from list");
        System.out.println("4. Go back to main menu");
    }

    public int menuOptions(int startIndex, int endIndex) {
        Scanner input = new Scanner(System.in);
        int userInput = 0;

        while ( (userInput < startIndex) || (userInput > endIndex) ) {
            System.out.print("\nEnter a number from " + startIndex + " to " + endIndex + ": \n");
            userInput = input.nextInt();
        }
        return userInput;

    }




}