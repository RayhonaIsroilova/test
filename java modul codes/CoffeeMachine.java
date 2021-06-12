import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        System.out.println("Welcome to R.I.M's cafe!!!");
        System.out.println("We have a lot of services for you. You can choose below things");
        kofeniyokisharbatnitanlasin();
        choykofelarnishifobaxshligi();
        smartrichchoylari();
        smartrichkofelari();
        issiqshokolad();
    }

    public static void kofeniyokisharbatnitanlasin() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Would you like to drink  something? ");
            System.out.println("   1) coffee. ");
            System.out.println("   2) juice.   ");
            System.out.println("   3) tea.  ");
            System.out.println("   4) hot chocolate of Smart and Rich.");
            choykofelarnishifobaxshligi();
            int coffee = scanner.nextInt();
            switch (coffee) {
                case 1:
                    System.out.println("We have 3 types coffee." +
                            "1) Copucino,    2) Espresso,     3) Latte.");
                    String coffe = scanner.nextLine();
                    String cofe = scanner.nextLine();
                    System.out.println("Would you like the coffee with suger or not?");
                    System.out.println("with suger.");
                    System.out.println("without suger.");
                    String choose = scanner.nextLine();
                    System.out.println("Would you like to drink coffee with milk or not?");
                    System.out.println("with milk.");
                    System.out.println("without milk.");
                    String milk = scanner.nextLine();
                    System.out.println("Would you like coffee with foam or not? ");
                    System.out.println("with foam.");
                    System.out.println("without foam.");
                    String kopik = scanner.nextLine();
                    System.out.println("Thanks  a lot for choosing our cafe. During  5 minuts we deliver  your " +
                            cofe + choose + milk + kopik + " coffee.");
                   /* System.out.println("The price of coffees:1) capucino's price is 5 $. ");
                    System.out.println("2) espresso's price is 6 $.");
                    System.out.println("3) latte's price is 4 $.");*/
                    break;
                case 2:
                    System.out.println("We have 16 types juices. ");
                    System.out.println("1) apple juice.");
                    System.out.println("2) peach juice.");
                    System.out.println("3) strawberry juice.");
                    System.out.println("4) pear juice.");
                    System.out.println("5) lemon juice.");
                    System.out.println("6) tomato juice.");
                    System.out.println("7) grapes juice.");
                    System.out.println("8) apricot juice.");
                    System.out.println("9) currant juice.");
                    System.out.println("10) quince juice.");
                    System.out.println("11) orange juice.");
                    System.out.println("12) pomegranate  juice.");
                    System.out.println("13) raspberry juice.");
                    System.out.println("14) pineapple juice.");
                    System.out.println("15) multifruits juice.");
                    System.out.println("16) kiwi juice.");
                    String zapas = scanner.nextLine();
                    String sharbat = scanner.nextLine();
                    System.out.println("Would you like juice hot, cold or cool?");
                    System.out.println("hot");
                    System.out.println("cold");
                    System.out.println("cool");
                    String issiqsovuqiliq = scanner.nextLine();
                    System.out.println("Thanks a lot for choose our cafe. " +
                            "We deliver your " + sharbat + issiqsovuqiliq + " juice during 5 minuts.");
                    break;
                case 3:
                    System.out.println("We have 4 types tea.");
                    System.out.println("1) green tea.");
                    System.out.println("2) black tea.");
                    System.out.println("3) lemon tea.");
                    System.out.println("4) briar tea.");
                    String zzapas = scanner.nextLine();
                    String tea = scanner.nextLine();
                    System.out.println("Would you like the tea hot, cold or cool?");
                    System.out.println("hot");
                    System.out.println("cold");
                    System.out.println("cool");
                    String sovuqissiqiliq = scanner.nextLine();
                    System.out.println("Thanks a lot for choose our cafe." +
                            "We deliver your " + tea + sovuqissiqiliq + " tea during 5 minuts.");
                    break;
                default:

            }

        }    }

        public static void choykofelarnishifobaxshligi () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("   5) we have healing teas of Smart and Rich company.");
            System.out.println("   6) we have healing coffees of Smart and Rich company.");

            int cofetarixi = scanner.nextInt();
            switch (cofetarixi) {
                case 4:
                    issiqshokolad();
                    break;
                case 5:
                smartrichchoylari();
                break;
                case 6:
                    smartrichkofelari();
                    break;
                default:


            }
        }

        public static void smartrichchoylari () {
            Scanner scanner = new Scanner(System.in);
           // while (true) {
                System.out.println("We have 5 types healing teas. ");
                System.out.println("1) green tea");
                System.out.println("2) black tea");
                System.out.println("3) white tea");
                System.out.println("4) red tea ");
                System.out.println("5) herbal tea");
                int choyturlari = scanner.nextInt();
                switch (choyturlari) {
                    case 1:
                        System.out.println("We have green tea with Reyshi(ganoderma). ");
                        System.out.println("There are 5 gramms in every pockets. The 'Lunzin' green tea adds 20% Reyshi.");
                        System.out.println("This tea is very useful for a lot of ills");
                        System.out.println("Would you like drink our 'Lunzin' green tea?");
                        System.out.println("yes");
                        System.out.println("no");
                        String zaapas = scanner.nextLine();
                        String choyichish = scanner.nextLine();
                        System.out.println("Thanks a lot for choose our services.");
                        break;
                    case 2:
                        System.out.println("We have black tea with Evrikoma(tongat ali).");
                        System.out.println("There are 5 gramms in every pockets. The 'Puer' black tea adds 20% Evrikoma.");
                        System.out.println("This tea is very useful for a lot of ills");
                        System.out.println("Would you like drink our 'Puer' black tea?");
                        System.out.println("yes");
                        System.out.println("no");
                        String zaapass = scanner.nextLine();
                        String choyichishsh = scanner.nextLine();
                        System.out.println("Thanks a lot for choose our services.");
                        break;
                    case 3:
                        System.out.println("We have white tea with Kollagens of sea.");
                        System.out.println("There are 5 gramms in every pockets. The 'Pyon' white tea adds 20% Kollagen of sea.");
                        System.out.println("This tea is very useful for a lot of ills");
                        System.out.println("Would you like drink our 'Pyon' white tea?");
                        System.out.println("yes");
                        System.out.println("no");
                        String zaaps = scanner.nextLine();
                        String choyichishh = scanner.nextLine();
                        System.out.println("Thanks a lot for choose our services.");
                        break;
                    case 4:
                        System.out.println("We have red tea with Cordyceps.");
                        System.out.println("There are 5 gramms in every pockets. The 'Lapsan su shong' red tea adds 20% Cordyceps.");
                        System.out.println("This tea is very useful for a lot of ills");
                        System.out.println("Would you like drink our 'Lapsan su shong' red tea?");
                        System.out.println("yes");
                        System.out.println("no");
                        String aaps = scanner.nextLine();
                        String coyichishh = scanner.nextLine();
                        System.out.println("Thanks a lot for choose our services.");
                        break;
                    case 5:
                        System.out.println("We have herbal tea with  medicinal herbs in Central Asia  of .");
                        System.out.println("There are 5 gramms in every pockets. The 'Lapsan su shong' herbal tea adds 20% medicinal herbs growing in Central Asia .");
                        System.out.println("This tea is very useful for a lot of ills");
                        System.out.println("Would you like drink our  herbal tea?");
                        System.out.println("yes");
                        System.out.println("no");
                        String aas = scanner.nextLine();
                        String coychishh = scanner.nextLine();
                        System.out.println("Thanks a lot for choose our services.");
                        break;
                    default:
                }
            }
        //}
        public static void smartrichkofelari(){
        Scanner str = new Scanner(System.in);
               // while (true) {
                    System.out.println("We have 5 types healing coffees.");
                    System.out.println("1) black coffee with Reyshi(ganoderma).");
                    System.out.println("2) black coffee with Evrikoma(tongat ali).");
                    System.out.println("3) black coffee with Kollagen of sea.");
                    System.out.println("4) black coffee with Cordyseps.");
                    System.out.println("5) black coffee with Mango of south Afrika.");
                    int kofeturlari = str.nextInt();
                    switch (kofeturlari) {
                        case 1:
                            System.out.println("We have black coffee with Reyshi(ganoderma). ");
                            System.out.println("There are 5 gramms in every pockets. The Arabika coffee adds 20% Reyshi.");
                            System.out.println("This tea is very useful for a lot of ills");
                            System.out.println("Would you like drink our black coffee with Reyshi?");
                            System.out.println("yes");
                            System.out.println("no");
                            String zaapas = str.nextLine();
                            String choyichish = str.nextLine();
                            System.out.println("Thanks a lot for choose our services.");
                            break;
                        case 2:
                            System.out.println("We have black coffee with Evrikoma(tongat ali). ");
                            System.out.println("There are 5 gramms in every pockets. The Arabika coffee adds 20% Evrikoma.");
                            System.out.println("This tea is very useful for a lot of ills");
                            System.out.println("Would you like drink our black coffee with Evrikoma?");
                            System.out.println("yes");
                            System.out.println("no");
                            String zapas = str.nextLine();
                            String choyichishg = str.nextLine();
                            System.out.println("Thanks a lot for choose our services.");
                            break;
                        case 3:
                            System.out.println("We have black coffee with Kollagen of Japan sea. ");
                            System.out.println("There are 5 gramms in every pockets. The Arabika coffee adds 20% Kollagen of Japan sea.");
                            System.out.println("This tea is very useful for a lot of ills");
                            System.out.println("Would you like drink our black coffee with Kollagen of Japan sea?");
                            System.out.println("yes");
                            System.out.println("no");
                            String zaapass = str.nextLine();
                            String choyicish = str.nextLine();
                            System.out.println("Thanks a lot for choose our services.");
                            break;
                        case 4:
                            System.out.println("We have black coffee with Cordyceps. ");
                            System.out.println("There are 5 gramms in every pockets. The Arabika coffee adds 20% Cordyceps.");
                            System.out.println("This tea is very useful for a lot of ills");
                            System.out.println("Would you like drink our black coffee with Cordyceps?");
                            System.out.println("yes");
                            System.out.println("no");
                            String zaappas = str.nextLine();
                            String choyichis = str.nextLine();
                            System.out.println("Thanks a lot for choose our services.");
                            break;
                        case 5:
                            System.out.println("We have black coffee with Mango of south Afrika. ");
                            System.out.println("There are 5 gramms in every pockets. The Arabika coffee adds 20% Mango of south Afrika.");
                            System.out.println("This tea is very useful for a lot of ills");
                            System.out.println("Would you like drink our black coffee with Mango of south Afrika?");
                            System.out.println("yes");
                            System.out.println("no");
                            String aapas = str.nextLine();
                            String hoyichish = str.nextLine();
                            System.out.println("Thanks a lot for choose our services.");
                            break;
                        default:
                    }
                }
            //}
        public static void issiqshokolad(){
        Scanner scanner = new Scanner(System.in);

            System.out.println("We have very awesome The hot chocolate of Smart and Rich company.");
            System.out.println("Hot chocolate's ingredent: cacao, arabika coffee and also Reyshi(ganoderma).");
            System.out.println(" The hot chocolate cause a lot of people take more results from headache. ");
            System.out.println("Would you like drink The hot chocolate?");
            System.out.println("yes");
            System.out.println("no");
            String ichishyokiichmaslik = scanner.nextLine();
            System.out.println("Thanks a lot  for choose our services.");
            return;
        }

      /*  public static void hisobkitobqilish(){
        Scanner hisob = new Scanner(System.in);
            while (true) {
                System.out.println("We have 3 types for paying." +
                        "1) by credit card,  2) by cash payment,   3)by money transfer.");
                int payment = hisob.nextInt();
                switch (payment){
                    case 1:
                        System.out.println("if you want paying money by credit card, you should use our credit card number.");
                        System.out.println("0123 2345 4567 6789");
                        int pultolash = hisob.nextInt();
                        System.out.println("Thank you for paying by credit card.");
                        break;
                    case 2:
                        System.out.println("Do you want paying money by cash payment?");
                        System.out.println("yes");
                        System.out.println("no");
                        String putolash = hisob.nextLine();
                        System.out.println("");



                        break;
                    case 3:
                        System.out.println("if you want paying money by oney transfer, you should use our credit card number.");
                        System.out.println("0123 2345 4567 6789");
                        int pultolsh = hisob.nextInt();
                        System.out.println("Thank you for paying by money transfer.");
                        break;
                    default:

                }
            }

    }*/




}