import java.util.Scanner;

class MenuOut {

    //had to create a new object as the vars couldnt be seen without it
    proto_1 enteredNum = new proto_1();

    void defaultMenu() {
         System.out.println("****************************************");
         System.out.println("*                                      *");
         System.out.println("****************************************");
         System.out.println("*           Menu Options               *");
         System.out.println("*                                      *");
         System.out.println("*  1. Enter First Number               *");
         System.out.println("*  2. Enter Second Number              *");
         System.out.println("*  3. Pick Operator                    *");
         System.out.println("*  4. Exit Program                     *");
         System.out.println("****************************************");
     }

    void firstMenu(){
        System.out.println("****************************************");
        System.out.println("*                " + enteredNum.firstInput + "                *");
        System.out.println("****************************************");
        System.out.println("*           Menu Options               *");
        System.out.println("*                                      *");
        System.out.println("*  1. Enter First Number               *");
        System.out.println("*  2. Enter Second Number              *");
        System.out.println("*  3. Pick Operator                    *");
        System.out.println("*  4. Exit Program                     *");
        System.out.println("****************************************");
    }

    void secondMenu(){
        System.out.println("****************************************");
        System.out.println("*                " + enteredNum.secondInput + "                *");
        System.out.println("****************************************");
        System.out.println("*           Menu Options               *");
        System.out.println("*                                      *");
        System.out.println("*  1. Enter First Number               *");
        System.out.println("*  2. Enter Second Number              *");
        System.out.println("*  3. Pick Operator                    *");
        System.out.println("*  4. Exit Program                     *");
        System.out.println("****************************************");
    }

    void operMenu(){
        System.out.println("****************************************");
        System.out.println("*                                      *");
        System.out.println("****************************************");
        System.out.println("*           Menu Options               *");
        System.out.println("*                                      *");
        System.out.println("*  1. Enter First Number               *");
        System.out.println("*  2. Enter Second Number              *");
        System.out.println("*  3. Pick Operator                    *");
        System.out.println("*  4. Exit Program                     *");
        System.out.println("****************************************");
    }

    void calcMenu(){
        System.out.println("****************************************");
        System.out.println("*                " + enteredNum.calcTotal + "                *");
        System.out.println("****************************************");
        System.out.println("*           Menu Options               *");
        System.out.println("*                                      *");
        System.out.println("*  1. Enter First Number               *");
        System.out.println("*  2. Enter Second Number              *");
        System.out.println("*  3. Pick Operator                    *");
        System.out.println("*  4. Exit Program                     *");
        System.out.println("****************************************");
    }
}    

class proto_1{

    //forced to set these damn vars to static idk why
    static int menuChoice;
    static double firstInput, secondInput, calcTotal;
    static String operInput = "";
    static Scanner scnInput = new Scanner(System.in);

    public static void main(String[] args){
        MenuOut menu = new MenuOut(); //spits out weird garbage at end of output

        menu.defaultMenu();
        getMenuChoice();

        if (menuChoice == 1){
            getFirstNum();
            menu.firstMenu();

            System.out.println("\n");
            getMenuChoice();
        }

        if (menuChoice == 2){
            getSecondNum();
            menu.secondMenu();

            System.out.println("\n");
            getMenuChoice();
        }

        if (menuChoice == 3){
            getOperator();

            System.out.println(operInput);

            if (operInput == "+"){
                calcTotal = firstInput + secondInput;
            }

            else if (operInput == "-"){
                calcTotal = firstInput - secondInput;
            }

            else if (operInput == "*"){
                calcTotal = firstInput * secondInput;
            }

            else if (operInput == "/"){
                calcTotal = firstInput / secondInput;
            }

            // else{
            //     System.out.println("Invalid Input" + "\n");
            //     getOperator();
            // }
        }
        
        if (menuChoice == 4){
            System.out.println("\n" + "Shutting Down...");
            System.exit(0);
        }
    }

    static void getMenuChoice(){
        System.out.println("Pick a option from the menu: ");
        System.out.print(":> ");
        menuChoice = scnInput.nextInt();
    }

    static void getFirstNum(){
        System.out.println("\n" + "Enter Your Number: ");
        System.out.print(":> ");
        firstInput = scnInput.nextDouble();
    }

    static void getSecondNum(){
        System.out.println("\n" + "Enter Your Number: ");
        System.out.print(":> ");
        secondInput = scnInput.nextDouble();
    }

    static void getOperator(){
        System.out.println("\n" + "Enter your desired operator: ");
        System.out.print(":> ");
        operInput = scnInput.next();
    }
}