import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NameList implements ListMethods {

    private ArrayList<String> nameList;

    public NameList() {
        this.nameList = new ArrayList<>();
    }

    /**
     * Adding name to nameList
     */
    @Override
    public void addToList() {
        Scanner input = new Scanner(System.in);
        System.out.print("Add a name to the list: ");
        nameList.add(input.nextLine());
    }

    /**
     * Printing names from nameList
     */
    @Override
    public void printFromList() {
        System.out.print("Names in list: ");
        for (String name : nameList) {
            System.out.print(name + ", ");
        }
        System.out.println("\n");

    }

    /**
     * Reversing the order of names in nameList
     */
    @Override
    public void reverseList() {
        System.out.print("Reversed names in list: ");
        Collections.reverse(nameList);
        printFromList();

    }
}
