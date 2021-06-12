//#extraTask
//        Online Banking 2
//
//        Quyidagi attributelardan iborat Account klassini encapsulation prinsipi asosida yarating:
//        (int) cardNumber - karta nomeri,
//        (string) cardHolder - karta egasi,
//        (String) cardCompany - qaysi bankniki,
//        (int) balance - balansi,
//        (String) password - kartani paroli,
//        (boolean) status - karta xolati (password 3 martadan oshiq xato terilsa bloklansin)
//
//
//        Dastur ishga tushganda 5 ta Account boshlang'ich qiymatlari bilan ochiladi. Userdan cardNumber
//        kiritishingizni so'raydi, va cardNumber orqali kerakli Account topilib, parol kiritishi so'raladi.
//        Agar parol to'gri bo'lsa ma'lumotlari chiqib, bajarishi mumkin bo'lgan operatsiyalar ko'rinadi,
//        xato bo'lsa 3 martagacha imkon berib, keyin bloklanadi.
//
//        Operatsiyalar:
//        1-View (Karta haqida ma'lumot)
//        2-Deposit (Pul solish)
//        3-Withdraw (Pul yechish)
//        4-Transfer (Boshqa kartaga pul o'tkazish)
//        5-Change Password (Passwordni o'zgartirish)
//
//        *Boshqa kartaga pul o'tkazishda boshqa karta raqami kiritilib,
//        kerakli pul miqdori u hisobga o'tkazib qo'yiladi.
package uz.pdp.extratasks;

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
        System.out.println("Assalomu aleykum. Dear" + "<<" + Name + Surname + ">>" + " Welcome to R.I.M Bank's MyBank application.");
        System.out.println("<<<<<< MY BANK >>>>>>");
        boolean run = true;
        while (run) {
            System.out.println("1.Balance");
            System.out.println("2.Add money to card!!!");
            System.out.println("3.Withdraw money from card!!!");
            System.out.println("4.Change money from card to card!!!");
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
                        System.out.println("The money has been successfully withdrawed from your balance!");
                        break;
                    }
                case 5:
                    System.out.println("The administration of RIM's Bank would like to thank you for using our services");
                    run = false;
                    break;

            }
        }
    }
}