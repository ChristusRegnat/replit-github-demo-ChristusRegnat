import java.util.*;
class Main {   
   public static void main(String[] args) 
   {  
      final int QUARTS_IN_GALLON = 4;
      String quartsNeededStr = "";
      int quartsNeededInt = 18;
      int gallonsNeeded;
      boolean flag = false;
      int extraQuartsNeeded;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter quarts needed >> ");
      quartsNeededStr = input.next();
      while (flag == false)
      {
        try {
            quartsNeededInt = Integer.parseInt(quartsNeededStr);
            if (quartsNeededInt > 0)
                {
                    flag = true;
                }
            gallonsNeeded = quartsNeededInt / QUARTS_IN_GALLON;
            extraQuartsNeeded = quartsNeededInt % QUARTS_IN_GALLON;
            System.out.println("A job that needs " + quartsNeededInt +
            " quarts requires " + gallonsNeeded + " gallons plus " +
            extraQuartsNeeded + " quarts.");
            }
            catch (NumberFormatException e) {
            System.out.println("Incorrect Data - Please type number: ");
            quartsNeededStr = input.next();
            }
      }


   }
}
