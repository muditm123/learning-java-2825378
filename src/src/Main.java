import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");    //print out a statement

        //Primitive type Data Types
        int age = 16;   //declaring a variable of integer data type, initialized variable
        double GPA = 4.55;     // uninitialized variable
        char firstInitial = 'M';
        boolean perfectAttendance = true;
        System.out.println();

        //Reference type Data Types
        String firstName = "Mudit";
        String lastName = "Mahajan";
        //String has characters at "indexes", starts with first char valued 0 to last char
        System.out.println("Character at Index 1: " + firstName.charAt(1));
        //String concatenation using "+" operator
        System.out.println("Concatenated string: " + firstName + lastName);

        //Input-Output, opposite of System.out-System.in
        Scanner input = new Scanner(System.in);
        int inputValue = input.nextInt();
        System.out.println(inputValue);

        //control flow using if/else/else if
        if (inputValue > 5){
            System.out.println("Greater than 5");
        }
        else if (inputValue == 5){
            System.out.println("Equal to 5");
        }
        else {
            System.out.println("Less than 5");
        }

        //Relational Operators: >, <, >=, <=, ==, !=
        /*
        Types of operators in precedence:
        Unary>Arithmetic, Shift, Relational, Bitwise, Logical, Ternary, Assignment
        */

        //loops in java- while loop
        boolean loopCondition = true;
        while (loopCondition) {
            System.out.println("Continue Loop?");
            String userInput = input.next();
            if (userInput.toLowerCase().matches("no|n")){
                loopCondition = false;
            }
        }

        //Debugging using print statements and debugging console in the top right corner
        //breakpoints: Left-click on the line number in IJ to insert a breakpoint(pause)

    }
}