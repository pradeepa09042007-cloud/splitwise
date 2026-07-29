package splitwiseapp.splitwise;

import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> friendsList = new ArrayList<>();


        f1:while (true) {
            System.out.println("\n====Menu====");
            System.out.println("1. Record Expense");
            System.out.println("2. Add friends");
            System.out.println("3. List friends");
            System.out.println("0. Quit");
            System.out.print("choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Clears the newline character

            switch (choice) {
                case 1 -> {
                    System.out.println("=== Splitwise Console ===");
                    System.out.println("Track shared expenses with friends\n");

                    System.out.print("Who paid the expense: ");
                    String payerName = sc.nextLine();

                    System.out.print("Total amount paid: ");
                    double totalamt = sc.nextDouble();
                    sc.nextLine(); // Clears the newline after nextDouble()

                    String expLine = payerName + " paid :" + totalamt;
                    System.out.println(expLine);

                    int numfrnds = friendsList.size();

                    // Prevent division by zero
                    if (numfrnds == 0) {
                        System.out.println("You need to add friends first to split the bill!");
                    } else {
                        // Assuming the payer is part of the split, it should ideally be (numfrnds + 1)
                        // but sticking to your original logic for now:
                        double personshare = totalamt / numfrnds;
                        String shareLine = "each person pays :" + personshare;
                        System.out.println(shareLine);
                    }
                } // Removed the extra bracket that was here!

                case 2 -> {
                    addFriend(sc, friendsList);
                }

                case 3 -> {
                    if (friendsList.isEmpty()) {
                        System.out.println("No friends added yet. Add friends first!");
                    } else {
                        for (String name : friendsList) {
                            System.out.println("- " + name);
                        }
                    }
                }

                case 0 -> {
                    System.out.println("thank you ");
                    break f1;

                }

                default -> {
                    System.out.println("Invalid choice. Try again!");
                }
            }
        }
    }

    public static void addFriend(Scanner sc, ArrayList<String> friendsList) {
        System.out.print("Enter friend name: ");
        String friendName = sc.nextLine();
        friendsList.add(friendName);
        System.out.println("Added " + friendName);
    }
}