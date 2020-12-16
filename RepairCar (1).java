import java.io.*;//importing input output package
import java.util.*;//importing util package
public class RepairCar//defining class
{
    static double amountr;
    RepairCar()
    {
        amountr=0;
    }

    //Repairs menu
    public static void main()throws IOException
    {
       Scanner Sc=new Scanner(System.in);
        
        System.out.print("\t\t\t\t\t"); 
        Delay.main();
        int a1=0,a=0;
        System.out.println("");
        System.out.println("\t\t\t\t\t|-------------------------REPAIRS-----------------------|");
        System.out.println("\t\t\t\t\t|-------------------------------------------------------|");
        System.out.println("\t\t\t\t\t|   PART                                     Price      |");
        System.out.println("\t\t\t\t\t| 1.Broken Glass                            Rs.1000/-   |");
        System.out.println("\t\t\t\t\t| 2.Engine Parts                            Rs.5000/-   |");
        System.out.println("\t\t\t\t\t| 3.Gear                                    Rs.2000/-   |");
        System.out.println("\t\t\t\t\t| 4.Navigation installation                 Rs.2000/-   |");
        System.out.println("\t\t\t\t\t| 5.Tyres                                   Rs.2000/-   |");
        System.out.println("\t\t\t\t\t| 6.Paint                                   Rs.2000/-   |");
        System.out.println("\t\t\t\t\t|-------------------------------------------------------|");
        System.out.println("\t\t\t\t\t|-------------------------~~*'*~~-----------------------|");
        try
        {
            System.out.print("\t\t\t\t\tEnter Your Choice-"); 
            a=Sc.nextInt();
            System.out.println("");
        }
        catch(Exception e)
        {
            System.out.println("Enter Numbers Only");
        }
        System.out.print("\t\t\t\t\t"); 
        Delay.main();
        System.out.println("");
        //repair confirm
        switch(a)
        {
            case 1:
            {
                a1=1000;
                System.out.println("\t\t\t\t\tDo You Want To Repair Broken Glass?  (Y/N)");
            }
            break;
            case 2:
            {
                a1=5000;
                System.out.println("\t\t\t\t\tDo You Want To Repair Engine Parts?  (Y/N)");
            }
            break;
            case 3:
            {
                a1=2000;
                System.out.println("\t\t\t\t\tDo You Want To Repair Your gear ?  (Y/N)");
            }
            break;
            case 4:
            {
                a1=2000;
                System.out.println("\t\t\t\t\tDo You Want To Install navigation ?  (Y/N)");
            }
            break;
            
            case 5:
            {
                a1=2000;
                System.out.println("\t\t\t\t\tDo You Want To New Your Tyres ?  (Y/N)");
            }
            break;
            
            case 6:
            {
                a1=2000;
                System.out.println("\t\t\t\t\tDo You Want To Paint your car ?  (Y/N)");
            }
            break;
            
            default:
            System.out.println("INVALID CHOICE");
        }
          if(a<=6)
         {
            char ans=Sc.next().charAt(0);
            if(ans=='Y' || ans=='y')
            {
                amountr=amountr+a1;
                System.out.println("\t\t\t\t\tThank You FOr Buying The Product.");
            }
            else if(ans=='N' || ans=='n')
            {
                amountr=amountr+0;
            }
            else
                System.out.println("\t\t\t\t\tPLEASE CHECK YOUR ENTRY");
            RepairCar.cont();
         }
    }

    //contine menu
      public static void cont()throws IOException
      {
          Scanner Sc=new Scanner(System.in);
        System.out.print("\t\t\t\t\t"); 
        Delay.main();
        System.out.println("");
        System.out.println("\t\t\t\t\tIf You Want To Repair Anything Else(Press R).");
        System.out.println("\t\t\t\t\tIf You Want To Return To The Main Menu (Press M).");
        System.out.println("\t\t\t\t\tIf You Want To Quit And Bill (Press Any Other Key).");
        char cont=Sc.nextLine().charAt(0);
        if(cont=='R' || cont=='r')
            RepairCar.main();
        else
        if(cont=='M' || cont=='m')
            IkerAutomobiles.mainMenu();
        else
            Bill.billMenu();
      }
}
