package splitwise;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.String;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Friend> friendsList = new ArrayList<>();
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
                case 1 -> {
                    if (friendsList.isEmpty()) System.out.println("No friends yet.Add friends first!");
                    else {
                        System.out.println("=== Splitwise Console ===");
                        System.out.println("Track shared expenses with friends");
                        System.out.println();
                        System.out.println("Ready. More features coming in the next lessons");
                        System.out.print("Who paid the expense:");
                        String payerName = sc.nextLine();
                        System.out.print("Total amount paid:");
                        double totalamt = sc.nextDouble();
                        int numfrnds = friendsList.size();
                        Expense expObj =  new Expense(payerName,totalamt);
                        String expLine = expObj.getPayerName() + " paid :" + expObj.getAmount();
                        System.out.println(expLine);
                        double personshare = expObj.getAmount() / numfrnds;
                        String shareLine = "each person pays :" + personshare;
                        System.out.println(shareLine);
                    }
                }

                case 2 ->{
                    addFriend(sc,friendsList);
                }

                case 3 ->{
                    if(friendsList.isEmpty()) System.out.println("No friends added yet.Add friends first!");
                    else{
                        for(Friend name:friendsList){
                            System.out.println("-" + name.getName());
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
    public static void addFriend(Scanner sc, ArrayList<Friend> friendsList){
        System.out.println("Enter friend name:");
        String friendName = sc.nextLine();
        friendsList.add(new Friend(friendName));
        System.out.println("added " + friendName);


    }
}