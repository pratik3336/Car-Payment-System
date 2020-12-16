import java.util.Scanner;//importing scanner class
import java.io.*; //importing input output package
public class CarRental//defining class
{
  Scanner sc = new Scanner(System.in);
   public static void main()throws IOException
    {    // create input scanner
     Scanner sc = new Scanner(System.in);
     String creditCard ;
     String cost = "0";
     System.out.println("Welcome to car renting centre");
     System.out.println("Enter your name");
     String name = sc.nextLine();
     System.out.println("Enter your period for renting(days)");
     int days=sc.nextInt();
     validateCreditCard();
     cost = calculateCost();
     CarRental.cont();
     System.out.println( name+"you have been qualified for rent at " +cost);
       }
             
   public static void validateCreditCard() //validate length of credit card
        {
            System.out.println("Enter credit card number");
             Scanner sc = new Scanner(System.in);
            String creditCard = sc.nextLine();
            final int MIN_NUM = 10;
                if (creditCard.length() != MIN_NUM)
                    System.out.println("Credit Card number is not valid");
                   
        }
        
   public static String calculateCost() // calculate cost of the car
        {
        String cost = "0";
        Scanner sc = new Scanner(System.in);
        System.out.println("You want to qualify for a Deluxe Car-press 1 for DELUXE_CAR ");
        
        System.out.println("You want toqualify for an Economy Car-press 2 for ECONOMY_CAR ");
        
        System.out.println("You want to qualify for a discount on any car-press 3 for DISCOUNT");
        int rental=sc.nextInt();
        if (rental == 1)
                cost = "Rs.30 per day";
            else if (rental == 2)
                cost = "RS.20 per day";
            else if (rental ==3)
                cost = "RS.10 per day";
            return cost;
            
        }

     public static void cont()throws IOException

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\t\t\t\tIf You Want To Buy A Car Again (Press a).");
        System.out.println("\t\t\t\t\tIf You Want To Return To the Main Menu (Press M).");
        System.out.println("\t\t\t\t\tIf You Want To Quit And Bill(Press Q or any other key).");
        System.out.print("\t\t\t\t\t");
        char cont=sc.nextLine().charAt(0);
        System.out.println("");
        if (cont=='a' || cont=='A')
            CarRental.main();
        else if (cont=='M' || cont=='m')
            IkerAutomobiles.mainMenu();
        
         try
         {
            System.out.print("\t\t\t\t\tEnter Your Choice-"); 
            int m=sc.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("Enter Numbers Only");
            IkerAutomobiles.mainMenu();  
        
       }    
      
    }
}
    
   
        
