package uz.pdp.extratasksforrepublic;
import java.util.Scanner;

public class Main {

    public static  Regions[] regions = new Regions[13];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("PLease enter your surname: ");
        String surname = scanner.nextLine();
        System.out.println("Dear " +"<<<<" + name + " " + surname + ">>>>" + " welcome to informations about Uzbekistan!");
        boolean run = true;
        while(run){
            System.out.println("1.Uzbekistan Republic!");
            System.out.println("2.Karakalpakistan Republic!");
            System.out.println("0.Exit from Program!");
            scanner = new Scanner(System.in);
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                   Uzbekistan();
                    break;
                case 2:

                    break;
                case 0:
                    run=false;
                    System.out.println("Thank you using our application!");
                    break;
                default:
            }

        }


    }
    public static void Uzbekistan(){
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("There are 12 regions of Uzbekistan! Please choose your region!");
            System.out.println("1.Andijan Region!");
            System.out.println("2.Bukhara Region!");
            System.out.println("3.Fergana Region!");
            System.out.println("4.Jizzakh Region!");
            System.out.println("5.Namangan Region!");
            System.out.println("6.Navoiy Region!");
            System.out.println("7.Qashqadaryo Region!");
            System.out.println("8.Samarqand Region!");
            System.out.println("9.Surkhandaryo Region!");
            System.out.println("10.Tashkent Region!");
            System.out.println("11.Khorezm Region!");
            System.out.println("12.Tashkent city! ");
            System.out.println("0.Exit from Regions to Republic!");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                   Andijan();
                    break;
                case 2:
                  Bukhara();
                    break;
                case 3:
                   Fergana();
                    break;
                case 4:
                  Jizzakh();
                    break;
                case 5:
                    Namangan();
                    break;
                case 6:
                   Navoiy();
                    break;
                case 7:
                   Qashqadaryo();
                    break;
                case 8:
                   Samarqand();
                    break;
                case 9:
                    Surkhandarya();
                    break;
                case 10:
                      Tashkent();
                    break;
                case 11:
                      Khorezm();
                    break;
                case 12:

                    break;
                case 0:
                    run = false;

                default:

            }
        }
    }
    public static void Andijan(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Andijan region is a region of the Republic of Uzbekistan");
        System.out.println("In the eastern part of the Fergana valley. Founded March 6, 1941. ");
        System.out.println("The area is 4.2 thousand km². The population is 2196.0 thousand people.");
        System.out.println("Andijan region has 14 rural districts, 11 urban and 95 rural assemblies. The center is the city of Andijan.");
        boolean  run = true;
        while (run){
            System.out.println("There are  14 districts in Andijan!Please choose your District!");
            System.out.println("1.Andijan District!");
            System.out.println("2.Asaka District!");
            System.out.println("3.Baliqchi District!");
            System.out.println("4.Bo'ston District!");
            System.out.println("5.Buloqboshi District!");
            System.out.println("6.Izboskan District!");
            System.out.println("7.Jalaquduq District!");
            System.out.println("8.Xo'jaobod District!");
            System.out.println("9.Kurgantepa District!");
            System.out.println("10.Marhamat District!");
            System.out.println("11.Oltinko'l District!");
            System.out.println("12.Paxtaobod District!");
            System.out.println("13.Shahrikhon District!");
            System.out.println("14.Ulug'nor District!");
            System.out.println("15.Exit to Regions!");
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    run=false;
                default:
                    System.out.println("There is not this District!");
            }


        }
    }
    public static void Bukhara(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("The territory of Bukhara region is located mainly in the Kyzylkum desert. The south-east is occupied by the Zarafshan valley. ");
        System.out.println("It is bordered by Khorezm region and the Republic of Karakalpakstan in the northwest, Navoi region in the north and east,");
        System.out.println( " Kashkadarya region in the southeast, and Turkmenistan in the southwest.");
        System.out.println("The area is 39.4 thousand km2. ");
        System.out.println("The population is more than 1443 thousand people.");
        System.out.println("There are 11 districts in Bukhara Region! Please choose your District!");
        boolean run = true;
        while (run){
            System.out.println("1.Olot District!");
            System.out.println("2.Bukhara District!");
            System.out.println("3.Gijduvon District!");
            System.out.println("4.Jondor District!");
            System.out.println("5.Kogon District!");
            System.out.println("6.Karako'l District!");
            System.out.println("7.Korovulbozor District!");
            System.out.println("8.Peshku District!");
            System.out.println("9.Romiton District!");
            System.out.println("10.Shofirkon District!");
            System.out.println("11.Vobkent District!");
            System.out.println("12.Exit to Regions!");
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    run=false;
                    break;
                default:
                    System.out.println("There is not this District!");

            }
        }
    }
    public static void Fergana(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fergana region is a region of the Republic of Uzbekistan. It was founded on January 15, 1938. ");
        System.out.println("It is located in the east of the republic, in the south of the Fergana valley.");
        System.out.println("It is bordered by Namangan and Andijan regions in the north, Kyrgyzstan in the south and east, and the Republic of Tajikistan in the west");
        System.out.println("The area is 6.8 thousand km2. The population is 3,317 thousand people. It consists of 15 districts");
        boolean run = true;
        while (run){
            System.out.println("There are 15 district in Fergana!Please choose your District!");
            System.out.println("1.Oltiariq District!");
            System.out.println("2.Bag'dod District!");
            System.out.println("3.Beshariq District!");
            System.out.println("4.Buvayda District!");
            System.out.println("5.Dangara District!");
            System.out.println("6.Fergana District!");
            System.out.println("7.Furqat District!");
            System.out.println("8.Qo'shtepa District!");
            System.out.println("9.Quva District!");
            System.out.println("10.Rishton District!");
            System.out.println("11.So'x District!");
            System.out.println("12.Toshloq District!");
            System.out.println("13.Uchko'prik District!");
            System.out.println("14.Uzbekistan District!");
            System.out.println("15.Yozyovon District!");
            System.out.println("16.Exit from  District to Regions!");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    break;
                case 16:
                    run=false;
                    break;
                default:
                    System.out.println("There is not this District!");
            }
        }
    }
    public static void Jizzakh(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" +
                "Jizzakh region is a region of the Republic of Uzbekistan. In the central part of the republic.");
        System.out.println("Founded on December 28, 1973. It is bordered by the Republic of Kazakhstan and the Syrdarya region in the northeast,");
        System.out.println("Samarkand and Navoi regions in the southwest, and the Republic of Tajikistan in the southeast. ");
        System.out.println("The area is 21.2 thousand km2. The population is 1,382.10 thousand people. There are 12 rural districts in Jizzakh region.");
        boolean run = true;
        while (run){
            System.out.println("There are 12 districts in Jizzakh! Please  choice your district!");
            System.out.println("1.Arnasoy District!");
            System.out.println("2.Baxmal District!");
            System.out.println("3.Do'stlik District!");
            System.out.println("4.Forish District!");
            System.out.println("5.Gallaorol District!");
            System.out.println("6.Sharof Rashidov District!");
            System.out.println("7.Mirzacho'l District!");
            System.out.println("8.Paxtakor District!");
            System.out.println("9.Yangiobod District!");
            System.out.println("10.Zomin District!");
            System.out.println("11.Zafarobod District!");
            System.out.println("12.Zarbdor District!");
            System.out.println("13.Exit from District to Regions!");
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    run=false;
                    break;
                default:
                    System.out.println("There is not this District!");


            }
        }
    }
    public static void Namangan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Namangan region is a region of the Republic of Uzbekistan. It was founded on March 11, 1941.");
        System.out.println("Namangan region is located in the east of the republic, in the north-western part of the Fergana Valley,");
        System.out.println(" on the slopes of the Qurama and Chatkal mountains of the Tianshan mountain range.");
        System.out.println("It is bordered by the Jalal-Abad region of the Kyrgyz Republic to the north and northeast, Andijan to the southeast,");
        System.out.println("Fergana to the south, Tashkent region to the north and northwest, and the Sughd region of Tajikistan.");
        System.out.println(" The area is 7.44 thousand km². The population is 1982.7 thousand people. There are 11 rural districts in Namangan region.");
        boolean run = true;
        while (run) {
            System.out.println("There are 11 districts in Namangan! Please choose your district!");
            System.out.println("1.Chortoq District!");
            System.out.println("2.Chust District!");
            System.out.println("3.Kosonsoy District!");
            System.out.println("4.Mingbuloq District!");
            System.out.println("5.Namangan District!");
            System.out.println("6.Norin District!");
            System.out.println("7.Pop District!");
            System.out.println("8.To'rako'rgon District!");
            System.out.println("9.Uchko'rgon District!");
            System.out.println("10.Uychi District!");
            System.out.println("11.Yangiko'rgon District!");
            System.out.println("12.Exit from districts to Regions!");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    run = false;
                    break;
                default:
                    System.out.println("There is not this District!");
            }
        }

    }
    public static void Navoiy(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Navoi region is a region of the Republic of Uzbekistan. It was formed on April 20, 1982 in Bukhara and partly in Samarkand regions. It was abolished as an administrative unit in 1988 and re-established in early 1992.");
        System.out.println("It is bordered by Kazakhstan to the north and northeast, Jizzakh and Samarkand to the southeast, Kashkadarya to the south, and Bukhara to the southwest.");
        System.out.println("The area is 111.0 thousand km². The population is about 802.3 thousand people. Navoi region consists of 8 rural districts.");
        boolean run = true;
        while (run) {
            System.out.println("There are 8  districts in Navoiy!Please choose your District!");
            System.out.println("1.Konimex District!");
            System.out.println("2.Karmana District!");
            System.out.println("3.Qiziltepa District!");
            System.out.println("4.Xatirchi District!");
            System.out.println("5.Navbahor District!");
            System.out.println("6.Nurota District!");
            System.out.println("7.Tomdi District!");
            System.out.println("8.Uchquduq District!");
            System.out.println("9.Exit from Districts to Regions!");
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    run=false;
                    break;
                default:
                    System.out.println("There is not this District!");

            }
        }
    }
    public static void Qashqadaryo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qashqadaryo Region is one of the regions of Uzbekistan, It has 13 rural Diatricts.");
        System.out.println(" located in the south-eastern part of the country in the basin of the Qashqadaryo River and on the western slopes of the Pamir-Alay mountains.");
        System.out.println("It borders with Tajikistan, Turkmenistan, Samarqand Region, Bukhara Region and Surxondaryo Region.");
        System.out.println(". It covers an area of 28,400 km². The population is estimated to be around 2,067,000, with some 73% living in rural areas.");
        boolean run = true;
        while (run){
            System.out.println("There 13 districts in Qashqadaryo! Please choose your District!");
            System.out.println("There are  14 districts in Andijan!Please choose your District!");
            System.out.println("1.Chirakchi District!");
            System.out.println("2.Dekhanabad District!");
            System.out.println("3.Guzar District!");
            System.out.println("4.Qamashi District!");
            System.out.println("5.Karshi District!");
            System.out.println("6.Koson District!");
            System.out.println("7.Kasby District!");
            System.out.println("8.Kitob District!");
            System.out.println("9.Myrishkor District!");
            System.out.println("10.Muborak District!");
            System.out.println("11.Nishon District!");
            System.out.println("12.Shakhrisabz District!");
            System.out.println("13.Yakkabog District!");
            System.out.println("14.Exit to Regions!");
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    run=false;
                default:
                    System.out.println("There is not this District!");
            }


        }
    }
    public static void Samarqand(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Samarqand Region (Samarkand Region) (Uzbek: Samarqand viloyati) is one of the regions of Uzbekistan");
        System.out.println(" It is located in the center of the country in the basin of Zarafshan River. It borders with Tajikistan, Navoiy Region, Jizzakh Region and Qashqadaryo Region. ");
        System.out.println("It covers an area of 16,773 km². The population is estimated to be around 3,651,700, with some 75% living in rural areas.");
        boolean run = true;
        while (run){
            System.out.println("There are 14 districts in Samarqand! Please choose your District!");
            System.out.println("1.Bulungur District!");
            System.out.println("2.Ishtikhon District!");
            System.out.println("3.Jomboy District!");
            System.out.println("4.Kattakurgan District!");
            System.out.println("5.Ko'shrabot District!");
            System.out.println("6.Narpay District!");
            System.out.println("7.Nurobod District!");
            System.out.println("8.Oqdarya District!");
            System.out.println("9.Pakhatchi District!");
            System.out.println("10.Payariq District!");
            System.out.println("11.Pastdargom District!");
            System.out.println("12.Samarqand District!");
            System.out.println("13.Toyloq District!");
            System.out.println("14.Urgut District!");
            System.out.println("15.Exit to Regions!");
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    run=false;
                default:
                    System.out.println("There is not this District!");
            }

        }
    }
    public static void Surkhandarya(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Surkhandarya Region is a viloyat (region) of Uzbekistan, located in the extreme south-east of the country. Established on March 6, 1941, ");
        System.out.println(" it borders on Qashqadaryo Region internally, and Turkmenistan, Afghanistan and Tajikistan externally, going anticlockwise from the north.");
        System.out.println(" It takes its name from the river Surxondaryo, that flows through the region. It covers an area of 20,100 km². The population is estimated at 1,925,100, with 80% living in rural areas.");
       boolean run = true;
       while (run){
           System.out.println("There are 13 districts in Surkhandarya! Please choose your District!");
           System.out.println("1.Angor District!");
           System.out.println("2.Boysun District!");
           System.out.println("3.Denov District!");
           System.out.println("4.Jarkurgan District!");
           System.out.println("5.Kizirik District!");
           System.out.println("6.Kumkurghan District!");
           System.out.println("7.Muzraobod District!");
           System.out.println("8.Oltinsoy District!");
           System.out.println("9.Sariosiyo District!");
           System.out.println("10.Sherobod District!");
           System.out.println("11.Sho'rchi District!");
           System.out.println("12.Termiz District!");
           System.out.println("13.Urgut District!");
           System.out.println("14.Exit to Regions!");
           int choose = scanner.nextInt();
           switch (choose){
               case 1:
                   break;
               case 2:
                   break;
               case 3:
                   break;
               case 4:
                   break;
               case 5:
                   break;
               case 6:
                   break;
               case 7:
                   break;
               case 8:
                   break;
               case 9:
                   break;
               case 10:
                   break;
               case 11:
                   break;
               case 12:
                   break;
               case 13:
                   break;
               case 14:
                   run=false;
               default:
                   System.out.println("There is not this District!");
           }


       }

    }
    public static void Tashkent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tashkent region is a region of the Republic of Uzbekistan. In the north-east of the republic.");
        System.out.println("It was founded on January 15, 1938. It is bordered by the Republic of Kazakhstan to the north and northwest, ");
        System.out.println("the Kyrgyz Republic to the northeast, the Namangan region to the east, the Republic of Tajikistan to the south, and the Syrdarya region. ");
        System.out.println(" Area (excluding Tashkent) is 15.3 thousand km. The population (excluding the population of Tashkent) is 2.4 million people. There are 15 districts in the region.");
        boolean run = true;
        while (run){
            System.out.println("There are 14 districts in Tashkent! Please choose your District!");
            System.out.println("1.Bekobod District!");
            System.out.println("2.Bostonliq District!");
            System.out.println("3.Buka District!");
            System.out.println("4.Chinoz District!");
            System.out.println("5.Kibray District!");
            System.out.println("6.Ohangaron District!");
            System.out.println("7.Okkurgan District!");
            System.out.println("8.Parkent District!");
            System.out.println("9.Piskent District!");
            System.out.println("10.Quyi Chirchiq District!");
            System.out.println("11.O'rta Chirchiq District!");
            System.out.println("12.Yangiyo'l District!");
            System.out.println("13.Yukori Chirchik District!");
            System.out.println("14.Zangiota District!");
            System.out.println("15.Exit to Regions!");
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    run=false;
                default:
                    System.out.println("There is not this District!");
            }

        }
    }
    public static void Khorezm(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("The Hkomkim in Khorezm is Farkhod Ermanov!");
        System.out.println("Khorezm Region as it is still more commonly known,is a viloyat (region) of Uzbekistan located in the northwest of the country in the lower reaches of the Amu-Darya River.");
        System.out.println("It borders with Turkmenistan, Karakalpakstan, and Bukhara Region. ");
        System.out.println("It covers an area of 6,464 square kilometres (2,496 sq mi). The population is estimated to be around 1,776,700, with some 80% living in rural areas.");
        boolean run = true;
        while (run){
            System.out.println("There are 10 districts in Khorezm! Please choose your district!");
            System.out.println("1.Bogot District!");
            System.out.println("2.Gurlen District!");
            System.out.println("3.Khiva District!");
            System.out.println("4.Ko'shko'pir District!");
            System.out.println("5.Shovot District!");
            System.out.println("6.Urgench District!");
            System.out.println("7.Xonqa District!");
            System.out.println("8.Xazorasp District!");
            System.out.println("9.Yangiariq District!");
            System.out.println("10.Yangibozor District!");
            System.out.println("11.Exit from districts to Regions!");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    run = false;
                    break;
                default:
                    System.out.println("There is not this District!");
            }

        }
    }
}
