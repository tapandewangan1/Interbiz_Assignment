import java.util.*;

public class Assignment1 {
    public static void minMax(int withdraw){
            long balance = 100000000;
            int max;
            int withdraw_original = withdraw; // Using third variable to store initial value of input amount
            int[] denomination = {2000, 500, 200, 100, 50}; // Array to check denominations
            int[] min = {0, 0, 0, 0, 0}; // Array to store counting of minimum notes
            // Loop to count number of Minimum notes , for the input withdrawal amount.
            System.out.print("Minimum : ");
            for (int i = 0; i < denomination.length; i++) {
                min[i] = withdraw / denomination[i];
                withdraw = withdraw % denomination[i];
                if (min[i] != 0) {
                    System.out.println(denomination[i] + " note = " + min[i]);
                }
            }
            // For counting the Maximum notes, for the input withdrawal amount.
            Arrays.sort(denomination); // Sorting for determining minimum denomination among the available denominations.
            int min_denomination = denomination[0];
            max = withdraw_original / min_denomination;
            System.out.println("Maximum :" + denomination[0] + " note = " + max);
            if(withdraw_original>=denomination[0]) {
                System.out.println("Available balance =" + (balance-withdraw_original));
            }
            else {
                System.out.println("Available balance =" + balance);
            }
            System.out.println("Change that cannot be withdrawn =" + withdraw + "Rs");
    }

    // Driver function
    public static void main(String[] args) {
        // try catch used to catch exception
        try {
            System.out.println("*****ATM Machine*****");
            System.out.println("Withdrawal limit is 50-95000 :");
            System.out.println("And the denominations available are 50,100,200,500,2000");
            Scanner sc = new Scanner(System.in);
            int withdraw = sc.nextInt();
            minMax(withdraw);
        }
        catch (Exception e){
            System.out.println("Wrong value entered. ");
            System.out.println("Please enter a valid withdrawal amount.");
        }
    }
}
