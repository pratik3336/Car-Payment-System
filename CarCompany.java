import java.io.*;//importing input output package
import java.util.*;//importing util package
public class CarCompany//defining class
{
   static double amountc;
   Scanner Sc=new Scanner(System.in);
   CarCompany()
    {
        amountc=0;
   }
 
   public static void main()throws IOException
    {
        System.out.print("\t\t\t\t\tPlease Wait"); 
        Delay.main();
        System.out.println("");
        //car menu
        System.out.println("\t\t\t\t\tWe Have A Wide Range Of Cars With The Best Built In Features.");
        
        System.out.println("\t\t\t\t\t      |------------------ ----------------[CARS]-----------------------------------------|");
        System.out.println("\t\t\t\t\t      |----------------------------------------------------------------------------------|");
        System.out.println("\t\t\t\t\t      | 1.Audi                                                                           |");
        System.out.println("\t\t\t\t\t      | 2.BMW                                                                            |");
        System.out.println("\t\t\t\t\t      | 3.Honda                                                                          |");
        System.out.println("\t\t\t\t\t      | 4.Ferrari                                                                        |");
        System.out.println("\t\t\t\t\t      | 5.Maruti                                                                         |");
        System.out.println("\t\t\t\t\t      | 6.Aston martin                                                                   |");
        System.out.println("\t\t\t\t\t      |--------------------------------------------------------------------------------- |");
        System.out.println("\t\t\t\t\t      |------------------------------------**********------------------------------------|");
        System.out.println("\t\t\t\t\t      |----------------------------------------------------------------------------------|");
        System.out.println("\t\t\t\t\t      |-------------------Audi-------------------|------------------BMW------------------|");
        System.out.println("\t\t\t\t\t      | 1.A4                          Rs.55 lac  | 1.X6                        Rs.53 lac |");
        System.out.println("\t\t\t\t\t      | 2.A3                          Rs.55 lac  | 2.X5                        Rs.30 lac |");
        System.out.println("\t\t\t\t\t      | 3.A8                          Rs.34 lac  | 3.X3                        Rs.30 lac |");
        System.out.println("\t\t\t\t\t      | 4.R8                          Rs.50 lac  | 4.750I                      Rs.29 lac |");
        System.out.println("\t\t\t\t\t      |----------------------------------------------------------------------------------|");
        System.out.println("\t\t\t\t\t      |-------------------Honda------------------|---------------Aston Martin------------|");
        System.out.println("\t\t\t\t\t      | 1.City                          Rs.15 lac| 1.Dbs                   Rs.99 lac     |");
        System.out.println("\t\t\t\t\t      | 2.Crv                           Rs.25 lac| 2.Rapide                Rs.77 lac     |");
        System.out.println("\t\t\t\t\t      | 3.Assent                        Rs.35 lac| 3.Db11                  Rs.55 lac     |");
        System.out.println("\t\t\t\t\t      | 4.Brio                          Rs.45 lac| 4.Db9                   Rs.33 lac     |");
        System.out.println("\t\t\t\t\t      |----------------------------------------------------------------------------------|");
        System.out.println("\t\t\t\t\t      |----------------Maruti--------------------|---------------Ferrari-----------------|");
        System.out.println("\t\t\t\t\t      | 1.Dzire                         Rs.1 lac | 1.Bburago                   Rs.90 lac |");
        System.out.println("\t\t\t\t\t      | 2.Zen                          Rs.0.5lac | 2.Dino                     Rs.73 lac  |");
        System.out.println("\t\t\t\t\t      | 3.Alto                         Rs.0.1 lac| 3.GT lusso                 Rs.91 lac  |");
        System.out.println("\t\t\t\t\t      | 4.Swift                        Rs.0.2 lac| 4.488 Spider               Rs.77 lac  |");
        System.out.println("\t\t\t\t\t      |------------------------------------------|---------------------------------------|");
        System.out.println("\t\t\t\t\t      |------------------------------------------|---------------------------------------|");
        System.out.println("\t\t\t\t\t      |---------------------------------***********************--------------------------|");
        CarCompany.buy();  
    }
    
    //buy Cars
   public static void buy()throws IOException
    {
         Scanner sc=new Scanner(System.in);
        double amt1=0,q=0;
        int a= 0,b=0; 
        System.out.print("\t\t\t\t\tPlease Wait"); 
        Delay.main();
        System.out.println("");
        try
        {
             
            System.out.print("\t\t\t\t\tEnter Company Code-"); 
             a=sc.nextInt();
            System.out.println("");

            System.out.print("\t\t\t\t\tEnter Car Code-"); 
            b=sc.nextInt();;
            System.out.println("");

            System.out.print("Enter Quantity-"); 
            q=sc.nextInt();
            
        }
        catch(Exception e)
        {
            System.out.println("Enter Numbers Only");
            CarCompany.buy();  
        }
        String CarCompany[]={"Audi","BMW","Honda","Ferrari"+"Maruti"+"AstonMartin"};     
        double amt2=0;
        switch(a)
        {
            case 1:       
            {
                String models[]={"A4","A3","A8","R8"};
                double amt[]={55,55,34,50};
                amt2=amt[b];
                System.out.println("Would You Like to Buy "+CarCompany[a]+" "+models[b]+"? (Y/N)");

            }
            break;
            
            case 2:
            {
                String models[]={"x6","x5","x3","750i"};
                double amt[]={53,30,30,29};

                System.out.println("Would You Like to Buy "+CarCompany[a-1]+" "+models[b-1]+"? (Y/N)");

            }
            break;
            
            case 3:
            {
                String models[]={"City","CRV","Assent","Brio"};
                double amt[]={15,25,35,45};
                amt2=amt[b];
                System.out.println("Would You Like to Buy "+CarCompany[a-1]+" "+models[b-1]+"? (Y/N)");

            }
            break;
           
            case 4:
            {
                String models[]={"Bburago","Dino","GT lusso","488 Spider"};
                double amt[]={10,43,21,67};
                amt2=amt[b];
                System.out.println("Would You Like to Buy "+CarCompany[a-1]+" "+models[b-1]+"? (Y/N)");

            }
            break;
            case 5:
            {
                String models[]={"Dzire","Zen","Alto","Swift"};
                double amt[]={1,0.5,0.1,0.2};
                amt2=amt[b];
                System.out.println("Would You Like to Buy "+CarCompany[a-1]+" "+models[b-1]+"? (Y/N)");

            }
            break;
            
             case 6:
            {
                String models[]={"DBS","Rapide","DB11","DB9"};
                double amt[]={99,77,55,33};
                amt2=amt[b];
                System.out.println("Would You Like to Buy "+CarCompany[a-1]+" "+models[b-1]+"? (Y/N)");

            }
            break;
        
        default:
        {
        System.out.println("Invalid Choice");
        }
     }
        //buy confirmation
        if(a<=4)
        {
            char ans=sc.next().charAt(0); 
            if(ans=='Y' || ans=='y')
            {

                amt1=amt2*q;
                amountc=amountc+amt1;
                cont();
            }
            else 
                amountc=amountc+0;

        }
    }
    
//continue menu
     public static void cont()throws IOException

    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("\t\t\t\t\tIf You Want To Buy A Car Again (Press B).");
        System.out.println("\t\t\t\t\tIf You Want To Return To the Main Menu (Press M).");
        System.out.println("\t\t\t\t\tIf You Want To Quit And Bill(Press Q or any other key).");
        System.out.print("\t\t\t\t\t");
        char cont=Sc.nextLine().charAt(0);
        System.out.println("");
        if (cont=='b' || cont=='B')
            CarCompany.buy();
        else
        if (cont=='M' || cont=='m')
            IkerAutomobiles.mainMenu();
        else
            Bill.billMenu();
    }
}