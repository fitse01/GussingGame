import java.util.Scanner;
public class Gussinggame{
    public static void main(String[] args){
     int randomnum = (int)(Math.random()*101);

     Scanner scan = new Scanner(System.in);
    
    int maxguss =7;
    int numguss=0;
    System.out.println("HI WELCOM TO THE gussingame The rules to play the gussing game is :");
    System.out.println("  1, If you guss beyond the boundary (0_100) you will gonna be disqualified from the game.");
    System.out.println("  2, The maximum number of gussing is 7 times.");
    System.out.println("  3 ,The number you enter must be a positive  integer .");
     while(numguss<maxguss){
        
        System.out.println(" To play please enter the number u  want to guss in betwen 0 _100");
        int guss = scan.nextInt();
        if(guss>100){
            System.out.println("The number u guss is higher than the game range please try again b/n 0_100");
            break;
        }
         if(guss==randomnum){
            System.out.println("You guss a correct  number"+"  " + randomnum +"you have reached on the right gus after trying "+ " "+numguss+ "times");
              break;
         }else if(guss>randomnum){
            System.out.println( "The number you gus is higher than the corect answer");
                  
        }else if(guss<randomnum){
            System.out.println("The number you guss is lower than the corect answer"); 
            
        } numguss++;
         } 
           System.out.println("The game is over try again ");
            System.out.println("The corect answer  was "+ randomnum); 
            scan.close(); // close the Scanner
     }
    }

    
