import java.util.Scanner;

public class MyBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lastoperation = "";
        System.out.println("Name :");
        String Name = scanner.nextLine();
        System.out.println("Surname :");
        String Surname = scanner.nextLine();
        System.out.println("Balance :");
        double Balance = scanner.nextDouble();
        System.out.println("Welcome to Administration of R.I.M's Bank");
        System.out.println("1.MyBank Application.");
        System.out.println("0. Exit from program!!!");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
        }

        System.out.println("Assalomu aleykum. Dear" + "<<" + Name + Surname + ">>" + " Welcome to R.I.M Bank's MyBank application.");
        System.out.println("<<<<<< MY BANK >>>>>>");
        while (true) {
            System.out.println("1.Balance");
            System.out.println("2.Add money");
            System.out.println("3.Withdraw money");
            System.out.println("4.Last operation");
            System.out.println("5.Exit from application");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Your Balance " + Balance);
                    lastoperation = "Balance";
                    break;
                case 2:
                    System.out.println("How many EURO add your balance?");
                    double balance1 = scanner.nextDouble();
                    boolean a = true;
                    if (Balance > 0) {
                        Balance += balance1;
                    }


                    // System.out.println("Balance  +=" +   balance1);
                    lastoperation = "Added money " + Balance;

                    System.out.println("The money has been successfully added to balance.");
                    break;
                case 3:
                    System.out.println("How much EURO you want to withdraw from your balance?");
                    double balance2 = scanner.nextDouble();
                    boolean b = true;
                    if (Balance > 1000) {
                        Balance -= balance2;


                    }
            }
        }
    }
}