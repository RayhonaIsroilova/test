package uz.pdp.extratasks;

import java.util.Scanner;

public class Main {

    //Task
    //1. telefon nomerni tekshirish 9talik bolishi kk yoki +9989 yana 9 xona
    //2. mail kiritayotgan @ belgisi bormi? oxiri @mail.ru yoki @gmail.com
    //3. ism minimum 3ta harfdan iborat
    //4. bor telefon nomer bolsa kiritish mumkin emas? mail un qilsa xam zor boladi?


    public static Scanner scanner = new Scanner(System.in);

    public static Contact[] contacts = new Contact[10];

    public static void main(String[] args) {

        contacts[0] = new Contact(1, "jafar", "12345", "bukhara", "mail");
        contacts[1] = new Contact(2, "avaz", "12345", "bukhara", "mail");
        contacts[2] = new Contact(3, "jasur", "12345", "bukhara", "mail");
        boolean run = true;
        int step = 0;
        System.out.println("Welcome to Contact App!!!");
        while (run) {

            switch (step) {
                case 0:
                    System.out.println("1 => My Contact List");
                    System.out.println("2 => Add Contact");
                    System.out.println("3 => Edit Contact");
                    System.out.println("4 => Delete Contact");
                    System.out.println("5 => Exit");
                    System.out.println("0 => Bosh menu");
                    break;
                case 1:
                    getContactList();
                    break;
                case 2:
                    addContact();

                    break;
                case 3:
                    editContact();
                    //edit contact
//                    System.out.println("Edit");
                    break;
                case 4:
                    //delete contact
                    deleteContact();
//                    System.out.println("Delete");
                    break;
                case 5:
                    run = false;
                    break;
                default:
                    System.out.println("Wrong Action! Please Try Again!");
            }

            System.out.println(" Action  : ");
            step = scanner.nextInt();
        }
    }

    public static void addContact() {
        Contact contact = new Contact(); //yango contact pustoy

        System.out.print("Enter contact name : ");
        contact.setName(scanner.next());

        System.out.print("Enter contact phoneNumber : ");
        contact.setPhoneNumber(scanner.next());

        System.out.print("Enter contact address : ");
        contact.setAddress(scanner.next());

        System.out.print("Enter contact mail : ");
        contact.setMail(scanner.next());


        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                contact.setId(i + 1);
                contacts[i] = contact;
                System.out.println("Added successfully!");
                break;
            }
            if (i == contacts.length - 1 && contacts[contacts.length - 1] != null) {
                System.out.println("Out off memory!");
            }
        }
    }

    public static void getContactList() {
        System.out.println("My contact List !!!");
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                System.out.println(i + 1 + " = > " + contacts[i]);
            }
        }

    }

    public static void deleteContact() {
        System.out.println(" Qaysi id li kontakt o'chsin : ");
        int number = scanner.nextInt(); //2
        if (10 < number || number < 0 || contacts[number - 1] == null) {
            System.out.println("Try Again!");

        } else {
            contacts[number - 1] = null; //bor obyektni topib olib null ga tenglab ochirib tashlash
            System.out.println("Deleted Successfully!");
        }
    }

    public static void editContact() {
        System.out.println("Qaysi idli kontaktni o'zgartirmoqchisz? ");
        int id = scanner.nextInt();

        if (contacts.length >= id && contacts[id - 1] != null) {
            System.out.println("Change name : ");
            contacts[id - 1].setName(scanner.next());

            System.out.println("Change phone : ");
            contacts[id - 1].setPhoneNumber(scanner.next());

            System.out.println("Change address : ");
            contacts[id - 1].setAddress(scanner.next());

            System.out.println("Change mail : ");
            contacts[id - 1].setMail(scanner.next());

            System.out.println("Edited SuccessFully!");
        } else {
            System.out.println("Try Again");
        }

    }
}
