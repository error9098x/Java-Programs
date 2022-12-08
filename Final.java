


class Hello {
   // Declare a fixed constant variable
   final int MAX_SIZE = 100;
   final void display() {  // Prevent a method from being overridden in a subclass
      System.out.println("Hello, NFSU");
   }
}

// Prevent a class from being subclassed
public final class Main extends Hello{
   void display(){
       System.out.println("Hello, overridden");
   }
    public static void main(String[] args){
       Hello ob = new Main(); 
       ob.display(); // Will show an error: display() in Main cannot override display() in Hello because we are using Final Keyword
   }
}


//Final Class Cannot be Inherited 
//Final Variable is fixed
//Final Methods can't be overridden
