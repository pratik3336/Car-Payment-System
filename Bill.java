import java.io.*;//importing input output package
import java.util.*;//importing util package
public class Bill//defining class
{
    public static void billMenu()throws IOException 
    {
        //bill 
        Scanner sc=new Scanner(System.in);
        String name;
        String address;
        int k=0;
        double Amount=(SellCar.amounts)+(RepairCar.amountr);
        double TotalAmount=(CarCompany.amountc)+(RepairCar.amountr)-(SellCar.amounts);
        System.out.println("Enter your Name");
        name=sc.nextLine();
        System.out.println("Enter your Address ");
        address=sc.nextLine();
        System.out.println("\t\t\t\t|---***&%%$%#$%$#^^%#%#%#^%$$&^- ---BILL----$^%$&#&%^*^*#%#%^%$&--|");
        System.out.println("\t\t\t\t|_________________________________________________________________|");
        System.out.println("\t\t\t\t|_________________________________________________________________|");
        System.out.println("\t\t\t\t|_________________________________________________________________|");
        System.out.println("\t\t\t\t|   Name -- "+name+"                                                   |");                                   
        System.out.println("\t\t\t\t|   Address-- "+address+"                                                  |");
        System.out.println("\t\t\t\t|_________________________________________________________________|");
        System.out.println("\t\t\t\t|_________________________________________________________________|");
        System.out.println("\t\t\t\t|_________________________________________________________________|");
        System.out.println("\t\t\t\t|*****************************************************************|");
        System.out.println("\t\t\t\t|--------------------------------Buys-----------------------------|");
        System.out.println("\t\t\t\t|_________________________________________________________________|");
        System.out.println("\t\t\t\t|||||||SECTION~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~AMOUNT|||||||||||") ;
        System.out.println("\t\t\t\t|  ");
        System.out.println("\t\t\t\t|    1. CARS                        Rs."+CarCompany.amountc+"lacs"+"                   |");
        System.out.println("\t\t\t\t|");
        System.out.println("\t\t\t\t|    2. Repairs                     Rs."+RepairCar.amountr+"                        |");
        System.out.println("\t\t\t\t|");
        System.out.println("\t\t\t\t|$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Total-Amount = "+Amount+"      ");
        System.out.println("\t\t\t\t|_________________________________________________________________|");
        System.out.println("\t\t\t\t|_________________________________________________________________|");
        System.out.println("\t\t\t\t|_________________________________________________________________|");
        System.out.println("\t\t\t\t|-------------------------------Sells-----------------------------|");
        System.out.println("\t\t\t\t|    1.CARS                          Rs."+SellCar.amounts+"    ");
        System.out.println("\t\t\t\t|_________________________________________________________________|");
        System.out.println("\t\t\t\t|_________________________________________________________________|");
        System.out.println("\t\t\t\t|_________________________________________________________________|");
        System.out.println("\t\t\t\t|_________________________________________________________________|");
        System.out.println("\t\t\t\t|*****************************************************************|");
        System.out.println("\t\t\t\t|_________________________________________________________________|");
        System.out.println("\t\t\t\t|_________________________________________________________________|");
        System.out.println("\t\t\t\t|                     Grand Total= Rs."+TotalAmount+"lacs");
        System.out.println("\t\t\t\t|_________________________________________________________________|");
        System.out.println("\t\t\t\t|_________________________________________________________________|");
        System.out.println("\t\t\t\t|*****************************************************************|");
        System.out.println("\t\t\t\t|_________________________________________________________________|");
        System.out.println("\t\t\t\t|*****************************************************************|");
        System.out.println("\t\t\t\t\t\tThank you For Your Purchase               "); 
        System.out.println("\t\t\t\t\t\tDo you want a car insurance[y/n]");
        char a=sc.nextLine().charAt(0);
           if(a=='y')
        {
        CarInsurance.main();
        }
        CarCompany.amountc=0;
        SellCar.amounts=0;
        RepairCar.amountr=0;
    }
}