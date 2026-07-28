package splitwiseapp;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
        System.out.println("Splitwise ");

  
       System.out.print("Who paid the expense:");
        String payerName = sc.nextLine();
        System.out.print("Total amount paid:");
        double totalamt = sc.nextDouble();

        
        String expLine = payerName + " paid :" + totalamt;
        System.out.println(expLine);
        int numfrnds = 3;

        
        double personshare = totalamt/numfrnds;
       
        
        String shareLine = "each person pays :" + personshare;
        System.out.println(shareLine);

    }
}

    }
}
