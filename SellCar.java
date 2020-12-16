import java.io.*;//importing input output package
import java.util.*;//importing util package
public class SellCar//defing class
{
    static double amounts;
    SellCar()
    {
        amounts=0;
    }
    //sell menu
    public static void main()throws IOException
    {
        Scanner sc=new Scanner(System.in);
        double sp1=0,sp2=0;
        System.out.print("\t\t\t\t\t");
        Delay.main();
        System.out.println("");
        System.out.println("\t\t\t\t\tSell Your Car.");
        System.out.println("");
        System.out.print("\t\t\t\t\t");
        Delay.main();
        System.out.println("");
        System.out.println("\t\t\t\t\tHow Many Years Was Your Car Used For?");
        System.out.print("\t\t\t\t\t");
        int y2=sc.nextInt();
        System.out.println("");
        System.out.println("\t\t\t\t\tEnter The Price Of Your Car");
        System.out.print("\t\t\t\t\t");
        double a2=sc.nextDouble();
        System.out.println("");
        if(y2==1 || y2<=5)
            sp2=(a2*45)/100;
        else
            sp2=(a2*35)/100;
        System.out.println("\t\t\t\t\tThe Current Market Price Of Your Car Is Rs."+sp2);
        System.out.println("\t\t\t\t\tWould You Like To Sell Your Car For Rs."+sp2+" (Y/N?)");
        System.out.print("\t\t\t\t\t");
        char d=sc.next().charAt(0);
        System.out.println("");
        if(d=='Y' || d=='y')
        {
            amounts=amounts+sp2;
            System.out.println("\t\t\t\t\tThank You For Making The Deal.");
        }
        else 
        if(d=='N' || d=='n')
        {
            amounts=amounts+0;
            System.out.println("\t\t\t\t\tSorry. We Cannot Offer You More Than The Current Market Price. ");
        }
        else
            System.out.println("\t\t\t\t\tPlease Check Your Reply.");
        SellCar.cont();
    }
    //continue menu
    public static void cont()throws IOException
    {
         Scanner Sc=new Scanner(System.in);
        
        System.out.println("\t\t\t\t\tIf You Want To Try A Deal Again (Press D).");
        System.out.println("\t\t\t\t\tIf You Want To Return To the Main Menu (Press M).");
        System.out.println("\t\t\t\t\tIf You Want To Quit And Bill(Press Any Other Key).");
        System.out.print("\t\t\t\t\t");
        char cont=Sc.nextLine().charAt(0);
        System.out.println("");
        if (cont=='D' || cont=='d')
            SellCar.main();
        else
        if (cont=='M' || cont=='m')
         IkerAutomobiles.mainMenu();
        else
            amounts=amounts;
        Bill.billMenu();
    }
}

