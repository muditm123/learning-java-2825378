import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");    //print out a statement

        //Primitive type Data Types
        int age = 16;   //declaring a variable of integer data type, initialized variable
        double GPA;     // uninitialized variable
        char firstInitial, lastInitial;
        boolean perfectAttendance;

        //Reference type Data Types
        String firstName = "Mudit";
        String lastName = "Mahajan";
        //String has characters at "indexes", starts with first char valued 0 to last char
        char chatAtIndex = firstName.charAt(1);
        //String concatenation using "+" operator
        String concatenatedString = firstName + lastName;

        //Input-Output, opposite of System.out-System.in
        Scanner input = new Scanner(System.in);
        int inputValue = input.nextInt();
        System.out.println(inputValue);

        //control flow using if/else/elif

    }
}