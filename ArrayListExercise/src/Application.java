public class Application {
    private NameList nameList;
    private IntegerList integerList;
    private Menu menu;

    public Application() {
        nameList = new NameList();
        integerList = new IntegerList();
        menu = new Menu();
    }
    public void startProgram() {
        boolean isDone = false;
        while (!isDone) {

            menu.printMainMenu();
            int choise = menu.menuOptions(1, 3);

            switch (choise) {
                case 1 -> addNamesToList();
                case 2 -> addIntegersToList();
                case 3 -> isDone = true;
            }
        }
        System.out.println("Program exits. . .");
    }
    public void addNamesToList() {
        boolean isDone = false;
        while (!isDone) {

            menu.printStringMenu();
            int choise = menu.menuOptions(1, 4);

            switch (choise) {
                case 1 -> nameList.addToList();
                case 2 -> nameList.printFromList();
                case 3 -> nameList.reverseList();
                case 4 -> isDone = true;
            }
        }
    }
    public void addIntegersToList() {
        boolean isDone = false;
        while (!isDone) {

            menu.printIntegerMenu();
            int choise = menu.menuOptions(1, 4);

            switch (choise) {
                case 1 -> integerList.addToList();
                case 2 -> integerList.printFromList();
                case 3 -> integerList.reverseList();
                case 4 -> isDone = true;
            }
        }
    }
}
