import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IntegerList implements ListMethods{
    private ArrayList<Integer> numberList;

    public IntegerList() {
        this.numberList = new ArrayList<>();
    }

    /**
     * Adding name to numberList
     */
    @Override
    public void addToList() {
        Scanner input = new Scanner(System.in);
        System.out.print("Add an integer to the list: ");
        numberList.add(input.nextInt());
    }

    /**
     * Printing integers from numberList
     */
    @Override
    public void printFromList() {
        System.out.print("Integers in list: ");
        for (Integer integer : numberList) {
            System.out.print(integer + ", ");
        }
        System.out.println("\n");

    }

    /**
     * Reversing the order of integers in numberList
     */
    @Override
    public void reverseList() {
        System.out.print("Reversed integers in list: ");
        Collections.reverse(numberList);
        printFromList();

    }
}
