package leastbits;

import java.util.Scanner;

/**
 * @author lheberer
 */
public class LeastBits {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String ans;

        System.out.println("Enter an integer to find the smallest storage, or QUIT to end.");
        ans = kb.nextLine();
        
        while(!ans.equalsIgnoreCase("QUIT")){
            Long number = 0L;
            try{
                number = Long.parseLong(ans);
            }
            catch(NumberFormatException e){
                System.out.println("Your number input is too large or not a number.");
                number = Long.MAX_VALUE;
                System.out.println("the largest number allowed is " +number+ "\n");
            }
            System.out.println("Your number is "+ number);

            if((number <= Byte.MAX_VALUE) && (number >= Byte.MIN_VALUE)){
                //val = (byte)number;
                System.out.println("a byte (eight bits) will hold your number.");
            }
            else if ((number <= Short.MAX_VALUE) && (number >= Short.MIN_VALUE)){
                //val = (short)number;
                System.out.println("short (two bytes) will hold your number.");
            }
            else if ((number <= Integer.MAX_VALUE) && (number >= Integer.MIN_VALUE)){
                //val = (short)number;
                System.out.println("an integer (four bytes) will hold your number.");
            }
            else if ((number <= Long.MAX_VALUE) && (number >= Long.MIN_VALUE)){
                //val = (short)number;
                System.out.println("a long integer (eight bytes) will hold your number.");
            }
            System.out.println("\nEnter an integer to find the smallest storage, or QUIT to end.");
            ans = kb.nextLine();
        }
    }
    
}
