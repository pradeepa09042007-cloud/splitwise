package splitwiseapp;

public class Main{
    public static void main(String[] args) {
        System.out.println("Splitwise ");

  
        String payerName = "max";
        double totalamt =500;

        
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
