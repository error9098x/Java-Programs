import java.time.LocalTime;                  //A time without a time-zone in the ISO-8601 calendar system, such as 10:15:30.
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

class Words {
   protected static final String[] words = { "Rupam","Dhruv","Aniket" ,"Tushar","Somya","Indu","KARTIK","PIYUSH","Vineet","Devanshu","Joysa","Nishita","Kushagra","sahil","Pushpender","VISHNULAL","Arunima","ASLAH","Rishi","Arpita","Manu","Prem","Shirisha","Akhila","Anjali","AKASH","Manasa","Mamatha","Jaynilkumar","Muzahid","Jadav","PRINCE","Shiv","Akshit","Satyam","Digvijay","Om","Sarang","Aviral"};
   Words(){                                                             //final keyword

    System.out.println("welcome!!!");                                    //calling constructor
}
}
 public class SpeedTyping extends Words{                                     //extends class
    
  
     
      static String[] TypedW = {};
      static String[] RandW = new String[10];
    
    SpeedTyping()
    {
      super();
    }                                               //super keyword calls constructor of speedtyping class
   static void  Start(int n) throws InterruptedException                       
   
  {                                                        //Thrown when a thread is waiting, and the thread is interruped

    System.out.println(n);
    TimeUnit.SECONDS.sleep(1);
   
  }
  
  static void  Start(String n) throws InterruptedException
  {

    System.out.println(n);
    TimeUnit.SECONDS.sleep(1);
   
  }
  
  public static void main(String[] args) throws InterruptedException {
   
    SpeedTyping ob = new SpeedTyping();                     //Creating an object

    Start(1);                                        //Calling the method via overloading
    Start(2);
    Start(3);
    Start("Go!");
    
    Random rand = new Random();                              //rand is an object of Random() inbuilt class
    
    for(int i=0;i<10;i++)
    {
        ob.RandW[i] =  words[rand.nextInt(39)];  //randomly select words to make sentance
        System.out.print(SpeedTyping.RandW[i] +" ");

    }
    System.out.println();
    double start = LocalTime.now().toNanoOfDay();        //convert local time into nano seconds
    Scanner scan = new Scanner(System.in);
    String typedWords = scan.nextLine();
   
    double end = LocalTime.now().toNanoOfDay();    //convert local time into nano seconds
    double elapsedTime = end - start;
    double seconds = elapsedTime / 1000000000.0;    //nano sec to sec
    System.out.println(seconds+" sec");
    int numChars = typedWords.length();
                                                               // (x char / 5 )/ 1 min = y WPM
    int wpm = (int)((((double) numChars /5) /seconds) * 60);
    System.out.println("Your WPM  "+ wpm+" !");
    
    TypedW  = typedWords.split(" ");
                                                          // System.out.println("Array: "+ Arrays.toString(TypedW));  
    double Accuracy = 0.0;
    double check = 0.0;
    try {                                                //handle all exception specially array bound
        System.out.print("Incorrect Words : ");
        for (int i = 0; i < RandW.length; i++) {
                                                            // System.out.println(","+RandW[i]+","+TypedW[i]+",");
            
            String left = ob.RandW[i];
              String right = ob.TypedW[i];
                if(left.equals(right))
                {   
                    check++;
                 
                }
                else{
                       
                        System.out.print(left+" ");
                }
                
            
            }
    }

    catch (Exception e) {                                   
        System.out.println("\n Inside Except block");
       
    } 
   
    Accuracy = (check/10)*100;                                        //provide accuracy
    System.out.println("\n Accuracy is: "+Accuracy+"%"); 
    System.out.println("==========================================="); 
}

}

