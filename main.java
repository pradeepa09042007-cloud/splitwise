package splitwiseapp;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         ArrayList<String> friendsList = new ArrayList<>();
       
   boolean runstate = true;
        while(runstate==true) {
            System.out.println("====Menu====");
            System.out.println("1. Record Expense");
             System.out.println("2. Add friends");
            System.out.println("3. List friends ");
            System.out.println("0. Quit");
            System.out.print("choice: ");
            int choice =  sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1 ->{
                        System.out.println("=== Splitwise Console ===");
                        System.out.println("Track shared expenses with friends");
                        System.out.println();
                        System.out.println("Ready. More features coming in the next lessons");
                        System.out.print("Who paid the expense:");

                        String payerName = sc.nextLine();
                        System.out.print("Total amount paid:");
                        double totalamt = sc.nextDouble();
                        String expLine = payerName + " paid :" + totalamt;
                        System.out.println(expLine);
                         int numfrnds = friendsList.size();
                        double personshare = totalamt / numfrnds;
                        String shareLine = "each person pays :" + personshare;
                        System.out.println(shareLine);
                     }
                }

                case 2 ->{
                    System.out.println("Enter friend name:");
                    String friendName = sc.nextLine();
                    friendsList.add(friendName);
                    System.out.println("added " + friendName);
                }

                case 3 ->{
                    if(friendsList.isEmpty()) System.out.println("No friends added yet.Add friends first!");
                    else{
                        for(String name:friendsList){
                            System.out.println("-" + name);
                        }
                    }
                }

                case 0 ->{
                    System.out.println("good bye");
                    runstate = false;
                }

                default ->{
                    System.out.println("Invalid choice.Try again!");
                }

            }
        }

    }
}
