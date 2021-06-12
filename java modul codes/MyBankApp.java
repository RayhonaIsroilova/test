package extratasks;
//Operatsiyalar:
//1-View (Karta haqida ma'lumot)
//2-Deposit (Pul solish)
//3-Withdraw (Pul yechish)
//4-Transfer (Boshqa kartaga pul o'tkazish)
//5-Change Password (Passwordni o'zgartirish)
//
//*Boshqa kartaga pul o'tkazishda boshqa karta raqami kiritilib, kerakli pul miqdori u hisobga o'tkazib qo'yiladi.
import java.util.Scanner;

public class MyBankApp {
    Scanner scanner = new Scanner(System.in);
    public static Mainof[] application = new Mainof[5];

    public static void main(String[] args) {
        application[0] = new Mainof(1, "Isroilova Raykhona", "KapitalBank", 12000, "12A34", true);
        application[1] = new Mainof(2, "Tursunova Nafisa", "Turon Bank", 12000, "56B78", true);
        application[2] = new Mainof(3, "Sodiqova Nozima", "Orient Finance Bank", 12000, "89C34", true);
        application[3] = new Mainof(4, "Siddiqova Durdona", "Qishloq Qurilish Bank", 12000, "45D26", true);
        application[4] = new Mainof(5, "Kamolova Adashxon", "Ipoteka Bank", 12000, "89E75", true);
        menu();
    }

    public static void getAccountList() {
        System.out.println("My Cards List !!!");
        for (int i = 0; i < application.length; i++) {
            System.out.println(i + 1 + " = " + application[i]);
        }

    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        String lastoperation = "";
        System.out.println("Name :");
        String Name = scanner.nextLine();
        System.out.println("Surname :");
        String Surname = scanner.nextLine();

        System.out.println("Welcome to Administration of R.I.M's Bank");
        System.out.println("Assalomu aleykum. Dear" + "<<" + Name + " " + Surname + ">>" + " Welcome to R.I.M Bank's MyBank application.");
        System.out.println("<<<<<< MY BANK >>>>>>");
        boolean run = true;
        while (run) {
//
            System.out.println("1.Information about cards!!!");
            System.out.println("2.Add money to card!!!");
            System.out.println("3.Withdraw money from card!!!");
            System.out.println("4.Transfer money from card to card!!!");
            System.out.println("5.Change password!!!");
            System.out.println("0.Exit from application!!!");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    getAccountList();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    transfer();
                    break;
                case 5:
                    changePassword();
                    break;
                case 0:
                    run = false;
                    System.out.print(
                            "The administration of R.I.M's bank would like to thank you for using our mybank application");
                    break;
                default:
                    System.out.print(
                            "The administration of R.I.M's bank would like to thank you for using our mybank application");
            }


        }
    }

    public static void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a cardNumber!");
        scanner = new Scanner(System.in);
        double id = scanner.nextInt();
        System.out.println("Please enter adding balance!");
        double amount = scanner.nextDouble();
        double ozgaruvchi = 0;
        for (int i = 0; i <= 4; i++) {
            if (ozgaruvchi > 0) {
                ozgaruvchi++;
            } else if (application[i].getCardNumber() == id) {
                application[i].setBalance(application[i].getBalance() + amount);
                System.out.println("The money Added Successfully!!!");
                break;
            } else if (ozgaruvchi < 0) {
                System.out.println("There is not this id!!!");
            }
        }
    }

    public static void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a cardNumber!");
        scanner = new Scanner(System.in);
        double id = scanner.nextInt();
        System.out.println("Please enter withdrawing balance!");
        double amount = scanner.nextDouble();
        double counter = 0;
        for (int i = 0; i <= 4; i++) {
//            if (application[i].setBalance(application[i].getBalance() - amount>=0)) {
//                System.out.println("You cannot withdraw money, since there is not more money!!!");
//                break;
            if (counter > 0) {
                counter++;
            } else if (application[i].getCardNumber() == id) {
                application[i].setBalance(application[i].getBalance() - amount);
                System.out.println("The money Withdrawed Successfully!!!");
                break;
            } else if (counter < 0) {
                System.out.println("There is not this id!!!");
            }
        }
    }

    public static void transfer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a Card Number!!!");
        double id = scanner.nextDouble();
        System.out.println("Please enter amount for transfering!!!");
        double amount = scanner.nextDouble();
        System.out.println("Please enter transfering Card NUmber!!!");
        double id2 = scanner.nextDouble();
        double counter = 0;
        for (int i = 0; i <= 4; i++) {
//            if (application[i].setBalance(application[i].getBalance() - amount>=0)) {
//                System.out.println("You cannot withdraw money, since there is not more money!!!");
//                break;
            if (counter > 0) {
                counter++;
            } else if (application[i].getCardNumber() == id) {
                application[i].setBalance(application[i].getBalance() - amount);

            } else if (application[i].getCardNumber() == id2) {
                application[i].setBalance(application[i].getBalance() + amount);
                System.out.println("The amount transfered successfully!!!");
                break;
            } else if (counter < 0) {
                System.out.println("Don't transfered money!!!");
            }

        }
    }

    public static void changePassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter id!");
        int id = scanner.nextInt();
        System.out.println("Please enter a new  password!!!");
        scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        for (int i = 0; i <= 4; i++) {
            boolean checkpassword = true;
            if (application[i].getCardNumber() == Integer.valueOf(id)) {
                checkpassword = false;
                boolean chekPass = application[i].getPassword().equals(password);
                if (checkpassword && chekPass) {
                    application[i].setPassword(password);
                    System.out.println("Password : " + application[i].getPassword());
                    break;
                } else if (!password.equals(application[i].getPassword())) {
                    int counter = 3;
                    while (!chekPass) {
                        counter--;
                        System.out.println("Please enter new password again!!!");
                        String chekingPas = scanner.nextLine();
                        if (!chekingPas.equals(application[i].getPassword())) {
                            application[i].setPassword(password);
                            System.out.println("Password : " + application[i].getPassword());
                            return;
                        }
                        if (counter == 1) {
                            System.out.println("Your card Blocked!");
                            application[i].setStatus(false);
                            return;
                        }
                        break;
                    }
                }

            }
        }

    }

}





















