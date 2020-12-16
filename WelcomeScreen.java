import java.util.*;//importing util package
import java.io.*;//importing input output package
public class WelcomeScreen//defining class
{
   public static void main()throws IOException
    {
        Scanner SC=new Scanner(System.in);
        System.out.println("\u000c");
        System.out.println("\t\t\t\t                     _____________________________________                                                                                   "); 
        System.out.println("\t\t\t\t                    |                                      |                                              "); 
        System.out.println("\t\t\t\t                    |                                      |                                            ");
        System.out.println("\t\t\t\t    ________________|______________________________________|___________________                       "); 
        System.out.println("\t\t\t\t   |             |                                         |                   |                        "); 
        System.out.println("\t\t\t\t   |             |           I K    AUTOMOBILES            |                   |                          "); 
        System.out.println("\t\t\t\t   |             |                                         |                   |                         "); 
        System.out.println("\t\t\t\t   |_____________|_________________________________________|___________________|                         ");  
        System.out.println("\t\t\t\t         |          |                                    |         |                                       "); 
        System.out.println("\t\t\t\t         |    .     |                                    |    .    |                                       "); 
        System.out.println("\t\t\t\t         |__________|                                    |_________|                                                           "); 
        System.out.println("\t\t\t\t                                                                                                        "); 
        Delay.main();
        System.out.println("\t\t\t\t                                                                                                        "); 
        System.out.println("\t\t\t\t                W E L C O M E    T O   I K       A U T O M O B I L E S                                                                                     "); 
         
       
          
        int N=3;
        for(int row = -N+1; row<=N-1; row++)//using for loop  
          {
            for(int col = -N+1; col<=N-1; col++)
            {
               if(Math.abs(row)+Math.abs(col)<=N-1) 
                    System.out.print("\t\t\t\t****** ");
               else
                    System.out.print("  ");
            }
            System.out.println();
          }  
          
       
        Delay.main(); 
        
        System.out.println("");
        System.out.print("Press M for Main menu             "); 
        char  ch =SC.nextLine().charAt(0);
         
        if(ch == 'M' ||ch=='m')
        {
            IkerAutomobiles.mainMenu();
            
        }
    }
    
}