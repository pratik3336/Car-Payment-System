import java.util.Scanner;

public class CarInsurance
{

public static void main()
{

Scanner sc=new Scanner(System.in);

double age, accidents, accident, surcharge, basic, total;

age= accidents= surcharge=accident=basic=total=0;

System.out.println( "Please insert your age ");

age=sc.nextDouble();

if (age==25)
{

System.out.println (" You dont have to pay the 100 surcharge" );
}
else if (age>25)
{
System.out.println ( "you are going to have to pay the 100 surcharge"  + basic);
total=(100+500);
System.out.println (" How many accidents have you had?" );
}
accidents=sc.nextDouble();
if ((accidents==1))
{
System.out.println ( "you are going to have to pay 50 accident surcharge " + basic);
total=(50+300);
}
else if ((accidents==2 )){

System.out.println (" you are going to have to pay rs 125 surcharge "+ basic);
total=(125+300);
}
else if ((accidents==3 )){
System.out.println( "you are going to have to pay 225 surcharge"  + basic);
total=(225+300);

}
if ((accidents==4 && accidents==4)){
System.out.println(" you are going to have to pay 375 surcharge"  + basic);
total=(375+300);
}
else if ((accidents==5 ))
{
System.out.println( "you are going to have to pay 575 surcharge"  + basic);
total=(575+300);
}
else if ((accidents==6)){

System.out.println( "Sorry you dont qualify for any insurance!" );

total=basic+surcharge; 
}
else 
{

System.out.println( "You are not entitled to insurance" );

}
System.out.println( "So you have to pay "+total+"for getting the insurance" );
System.out.println("\t\t\t\tThank you taking the car insurance");
} 

}

