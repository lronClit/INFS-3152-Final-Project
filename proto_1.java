//Brayden, Chloe, Lipika
//INFS 3152 Final Project
//Calculator
//Stackoverflow and various other sources were intergrated into this project

import java.util.Scanner;

class MenuOut {

    //had to create a new object as the vars couldnt be seen without it
    proto_1 enteredNum = new proto_1();

    //different methods to call on output for the user that 'dynamically' changes based off of where the user is in input
    //menu options contain objects from the proto_1 class to use to populate the top of the calculator with what was entered as it would show on a normal calculator
    void defaultMenu() {
         System.out.println("****************************************");
         System.out.println("*                                      *");
         System.out.println("****************************************");
         System.out.println("*           Menu Options               *");
         System.out.println("*                                      *");
         System.out.println("*  1. Enter First Number               *");
         System.out.println("*  2. Enter Second Number              *");
         System.out.println("*  3. Pick Operator                    *");
         System.out.println("*  4. Enter Custom Equation            *");         
         System.out.println("*  5. Exit Program                     *");
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
        System.out.println("*  4. Enter Custom Equation            *");         
        System.out.println("*  5. Exit Program                     *");
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
        System.out.println("*  4. Enter Custom Equation            *");         
        System.out.println("*  5. Exit Program                     *");
        System.out.println("****************************************");
    }

    void operMenu(){
        System.out.println("****************************************");
        System.out.println("*                " + enteredNum.firstInput + " " + enteredNum.operInput + " " + enteredNum.secondInput + "                *");
        System.out.println("****************************************");
        System.out.println("*           Menu Options               *");
        System.out.println("*                                      *");
        System.out.println("*  1. Enter First Number               *");
        System.out.println("*  2. Enter Second Number              *");
        System.out.println("*  3. Pick Operator                    *");
        System.out.println("*  4. Enter Custom Equation            *");         
        System.out.println("*  5. Exit Program                     *");
        System.out.println("****************************************");
    }

    void equMenu(){
        System.out.println("****************************************");
        System.out.println("*                " + enteredNum.equInput + "                *");
        System.out.println("****************************************");
        System.out.println("*           Menu Options               *");
        System.out.println("*                                      *");
        System.out.println("*  1. Enter First Number               *");
        System.out.println("*  2. Enter Second Number              *");
        System.out.println("*  3. Pick Operator                    *");
        System.out.println("*  4. Enter Custom Equation            *");         
        System.out.println("*  5. Exit Program                     *");
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
        System.out.println("*  4. Enter Custom Equation            *");         
        System.out.println("*  5. Exit Program                     *");
        System.out.println("****************************************");
    }
}    

class proto_1{

    //base variable declaration for use in the rest of the methods | set to static as a compiler requirement
    static int menuChoice;
    static double firstInput, secondInput, calcTotal;
    static String operInput, equInput;
    static Scanner scnInput = new Scanner(System.in);

    public static void main(String[] args){
        MenuOut menu = new MenuOut(); //creating object to use to call on MenuOut methods

        menu.defaultMenu(); //getting the initial inputs
        getMenuChoice();

        if (menuChoice == 1){ //menu option 1
            getFirstNum();
            menu.firstMenu();

            System.out.println("\n");
            getMenuChoice();
        }

        if (menuChoice == 2){ //menu option 2
            getSecondNum();
            menu.secondMenu();

            System.out.println("\n");
            getMenuChoice();
        }

        if (menuChoice == 3){ //menu option 3
            getOperator();

            System.out.println("\n");

            //if statements to determine the operator that was entered
            if (operInput.equals("+")){
                calcTotal = firstInput + secondInput;

                menu.calcMenu();
                System.out.println("\n" + "Total: " + calcTotal);

                System.out.println("\n");

                getMenuChoice();
            }

            else if (operInput.equals("-")){
                calcTotal = firstInput - secondInput;
                
                menu.calcMenu();
                System.out.println("\n" + "Total: " + calcTotal);

                System.out.println("\n");

                getMenuChoice();
            }

            else if (operInput.equals("*")){
                calcTotal = firstInput * secondInput;

                menu.calcMenu();
                System.out.println("\n" + "Total: " + calcTotal);

                System.out.println("\n");
                
                getMenuChoice();
            }

            else if (operInput.equals("/")){
                calcTotal = firstInput / secondInput;

                menu.calcMenu();
                System.out.println("\n" + "Total: " + calcTotal);

                System.out.println("\n");

                getMenuChoice();
            }

            else{
                System.out.println(operInput + " is not a valid input. Please try again." + "\n");
                getOperator();
            }
        }

        if (menuChoice == 4){ //menu option 4
            getEquation();
            menu.equMenu();
            
            System.out.println(eval(equInput)); //passing the equInput string from the user to the eval method then printing the results of the method

            getMenuChoice();
        }
        
        if (menuChoice == 5){ //menu choice 5
            System.out.println("\n" + "Shutting Down...");
            System.exit(0); //built in function to force end a looped program
        }

        else {
            System.out.println("\n" + menuChoice + " is not a valid choice. Please pick an option from the menu." + "\n");
            
            getMenuChoice();
        }
    }

    //method to take a inputted string equation ex. '10+3*(8-2)' and convert it so it can be used for calculation while following PEMDAS rules
    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;
            
            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }
            
            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }
            
            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }
            
            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }
            
            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }
            
            double parseFactor() {
                if (eat('+')) return +parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus
                
                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    if (!eat(')')) throw new RuntimeException("Missing ')'");
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    if (eat('(')) {
                        x = parseExpression();
                        if (!eat(')')) throw new RuntimeException("Missing ')' after argument to " + func);
                    } else {
                        x = parseFactor();
                    }
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }
                
                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation
                
                return x;
            }
        }.parse();
    }

    //method to get the menu choice from the user
    static void getMenuChoice(){
        System.out.println("Pick a option from the menu: ");
        System.out.print(":> ");
        menuChoice = scnInput.nextInt();
    }

    //method to get the first number for calculation from the user
    static void getFirstNum(){
        System.out.println("\n" + "Enter Your Number: ");
        System.out.print(":> ");
        firstInput = scnInput.nextDouble();
    }

    //method to get the second number for calculation from the user   
    static void getSecondNum(){
        System.out.println("\n" + "Enter Your Number: ");
        System.out.print(":> ");
        secondInput = scnInput.nextDouble();
    }
    //method to get the operator for calculation from the user
    static void getOperator(){
        System.out.println("\n" + "Enter your desired operator: ");
        System.out.print(":> ");
        operInput = scnInput.next();
    }

    //method to get the desired equation for calculation from the user
    static void getEquation(){
        System.out.println("\n" + "Enter Your Equation: ");
        System.out.print(":> ");
        equInput = scnInput.next();
    }
}