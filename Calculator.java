import java.util.Scanner;
class Calculator {
    public static void add(double num1 , double num2){
        System.out.println(" Ans : "+(num1+num2));
        System.out.println("=================================");
    }

    public static void substraction(double num1 , double num2){
        System.out.println(" Ans : "+(num1-num2));
        System.out.println("=================================");
    }

    public static void multiply(double num1 , double num2){
        System.out.println(" Ans : "+(num1*num2));
        System.out.println("=================================");
    }

    public static void divide(double num1 , double num2){
        System.out.println(" Ans : "+(num1/num2));
        System.out.println("=================================");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("    Welcome To My Calculator");
        System.out.println("=================================");
        System.out.println("    Enter the two numbers :-");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.println("=================================");
        System.out.println("Enter 1 for Add \n      2 for Substraction \n      3 for Multiplication \n      4 for Division");
        System.out.println("=================================");
        int option = sc.nextInt();
        if (option == 1){
            add(num1 , num2);
        }
        else if (option == 2){
            substraction(num1 , num2);
        }
        else if (option == 3){
            multiply(num1 , num2);
        }
        else if (option == 4){
            divide(num1 , num2);
        }
        else if (option != 1 || option != 2 || option != 3 || option != 4)
        {
            System.out.println("Wrong Input");
            System.out.println("=================================");
            System.out.println("Program is Ending....... Bye");
            System.out.println("=================================");
        }
    }
}