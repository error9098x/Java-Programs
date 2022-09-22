import java.util.Scanner;
class Calculator {
    
        public double num1; // Member Variables 
        public double num2; // Member Variables
    Calculator(double num1 ,double num2) // parameterized constructor
    {
        this.num1 = num1; //use of this keyword
        this.num2 = num2;
    }
     void add(){
        
        System.out.println(" Ans : "+(num1+num2));
        System.out.println("=================================");
    }

      void substraction(){
        System.out.println(" Ans : "+(num1-num2));
        System.out.println("=================================");
    }

     void multiply(){
        System.out.println(" Ans : "+(num1*num2));
        System.out.println("=================================");
    }

     void divide(){
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
        Calculator obj = new Calculator(num1,num2);
       
        System.out.println("=================================");
        System.out.println("Enter 1 for Add \n      2 for Substraction \n      3 for Multiplication \n      4 for Division");
        System.out.println("=================================");
        int option = sc.nextInt();
        if (option == 1){
            obj.add();
        }
        else if (option == 2){
            obj.substraction();
        }
        else if (option == 3){
            obj.multiply();
        }
        else if (option == 4){
            obj.divide();
        }
        else if (option != 1 || option != 2 || option != 3 || option != 4)
        {
            System.out.println("Wrong Input");
            System.out.println("=================================");
            System.out.println("Program is Ending....... Bye");
            System.out.println("=================================");
        }
    }}


