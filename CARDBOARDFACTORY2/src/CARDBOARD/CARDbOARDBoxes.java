package CARDBOARD;
import java.util.Scanner;

public class CARDbOARDBoxes
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of boxes (N): ");
        int n = in.nextInt();
        
        if (n < 1 || n > 1000) {
            System.out.println("INVALID INPUT");
            return;
        }

        int CARDbOARDSizes[] = {48, 24, 12, 6};

        int total = 0;
        int t = n;
        for (int i = 0; i < CARDbOARDSizes.length; i++) {
            int CARDbOARDCount = t / CARDbOARDSizes[i];
            t = t % CARDbOARDSizes[i];
            total += CARDbOARDCount;
            if (CARDbOARDCount != 0) {
                System.out.println(CARDbOARDSizes[i] + " * " + CARDbOARDCount + 
                    " = " + (CARDbOARDSizes[i] * CARDbOARDCount));
            }
        }

        
        if (t != 0) {
            System.out.println("Remaining boxes = " + t 
                + " * 1 = " + t);
            total++;
        }
        else {
            System.out.println("Remaining boxes = 0");
        }

        System.out.println("Total number of boxes = " + n);
        System.out.println("Total number of CARDbOARDs = " + total);
    }
}