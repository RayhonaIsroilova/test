import java.util.Scanner;

public class BayramTilaklari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hurmatli foydalanuvchi ismingizni kiriting!!!");
        String surname = scanner.nextLine();
        System.out.println("Familyangizni ham kiriting!!!");
        String name = scanner.nextLine();
        System.out.println("Iltimos hozirgi yilni kiriting!!!");
        int year = scanner.nextInt();
            System.out.println(" Assalomu aleykum " +  surname   +   name + " bayram tilaklari nomli o'yinga  xush kelibsiz.");
            System.out.println("Iltimos yil davomidagi bayram sanalaridan birini kiriting!!! ");
            while (true){
                System.out.println(" 1) " + "1-yanvar Yangi Yil bayrami!!!");
                System.out.println(" 2) " + "8-mart Xalqaro Xotin-Qizlar kuni!!!");
                System.out.println(" 3) " + "21-mart Navro'z bayrami!!!");
                System.out.println(" 4) " + "9-may Xotira va Qadrlash kuni(G'alaba kuni)!!!");
                System.out.println(" 5) " + "1-iyun Bolalar kuni!!!");
                System.out.println(" 6) " + "1-sentabr Mustaqillik kuni!!!");
                System.out.println(" 7) " + "1-oktabr Ustoz va Murabbiylar kuni!!!");
                System.out.println(" 8) " + "8-dekabr Konstitutsiya kuni!!!");
                System.out.println("Iltimos raqamlardan birini tanlang!!!");
               int choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("Iltimos tabrik egasining ismini kiriting!!!");
                        String name0 = scanner.nextLine();
                        String name1 = scanner.nextLine();
                       System.out.println(" Iltimos kirib kelgan yilni kiriting!!!");
                        String  name2 = scanner.nextLine();
                        System.out.println("Tabrik yuboruvchining ismini kiriting!!!");
                        String name3 = scanner.nextLine();
                        System.out.println("Assalomu aleykum hurmatli " + name1 + " men sizni kirib kelgan " + name2 + " -yil bilan chin qalbdan muborakbod etaman.");
                        System.out.println("Bu yilda sizga omad, baxt, tinchlik va sog'liq tilayman. O'tgan yilda ushalmagan orzularingiz");
                        System.out.println(   name2 + "-yilda ushalishiga tilakdoshman. Avvalo Ota-Onangiz so'ngra esa Oilangiz, Do'stlaringiz,");
                        System.out.println("Yaqinlaringiz va Hamkasblaringizning baxtiga doimo sog' va salomat bo'lib, ");
                        System.out.println("Doimo kulib, yayrab, yashnab yuring!!!");
                        System.out.println("Hurmat bilan " + name3);
                    break;
                    case 2:
                        System.out.println("Iltimos tabrik egasining ismini kiriting!!!");
                        String name4 = scanner.nextLine();
                        String name5 = scanner.nextLine();
                        System.out.println("Tabrik yuboruvchining ismini kiriting!!!");
                        String name6 = scanner.nextLine();
                        System.out.println("Assalomu aleykum hurmatli " + name5 + "  men sizni 8-mart Xalqaro xotin-qizlar kuni bilan chin qalbdan muborakbod etaman.");
                        System.out.println("Sizga tuganmas baxt, omad, tinchlik, totuvlik, sog'lik va osoyishtalik tilayman.");
                        System.out.println("Ota-onangiz, do'stlaringiz, yaqinlaringiz va oilangiz baxtiga doimo sog' va salomat bo'lib yuring.");
                        System.out.println("Bu hayotda yayrab, yashnab, kulib va zavq olib yashang.");
                        System.out.println("Sizga 2 dunyo saodatini tilayman, u dunyoda ham, bu dunyoda ham birga bo'lishlik nasib qilsin.");
                        System.out.println(" Hurmat bilan " + name6);
                        break;
                    case 3:
                        System.out.println("Iltimos tabrik egasining ismini kiriting!!!");
                        String name7 = scanner.nextLine();
                        String name8 = scanner.nextLine();
                        System.out.println("Tabrik yuboruvchining ismini kiriting!!!");
                        String name9 = scanner.nextLine();
                        System.out.println("Assalomu aleykum hurmatli " + name8 + " men sizni O'zbek milliy bayramlaridan eng ajoyibi hisoblangan 21-mart Navro'z bayrami bilan qutlayman.");
                        System.out.println("Bu bayram biz uchun naqadar buyuk ekanligini bilasiz degan umiddaman.");
                        System.out.println("Chunki bu kuni kun va tun tenglashadi ya'ni kun ham, tun ham 12 soatga teng bo'ladi. ");
                        System.out.println("Bu kunni xalqimiz katta bayram sifatida nishonlashadi va bir-birlariga ezgu tilaklarni bag'ishlashadi. ");
                        System.out.println("Men ham shu tilaklardan bir qanchasini tilayman.");
                        System.out.println("Doimo sog' va omon bo'lib baxtli va zavqli umr kechirishingiz tilakdoshiman.");
                        System.out.println("Hurmat bilan " + name9);
                        break;
                    case 4:
                        System.out.println("Iltimos tabrik egasining ismini kiriting!!!");
                        String nam1 = scanner.nextLine();
                        String nam2 = scanner.nextLine();
                        System.out.println("Tabrik yuboruvchining ismini kiriting!!!");
                        String nam3 = scanner.nextLine();
                        System.out.println("Assalomu aleykum  hurmatli " + nam2 + " men sizni 9-may Xotira va Qadrlash kuni blan chin qalbdan muborakbod etaman.");
                        System.out.println("Bu kun butun dunyo xalqlari tarixida o'chmas iz qoldirgan kundir.");
                        System.out.println("1945-yilning ayni shu sanasida juda katta va quvonarli voqea sodir bo'lgan ya'ni 2-jahon urushi tamomlangan. ");
                        System.out.println("Mana shu kun munosabati bilan bizning o'zbek xalqimiz bu kunni shu jangda halok bo'laganlarning xotirasi uchun nishonlaydi.");
                        System.out.println("Bu kabi kunlar bizning hayotimizda hech qachon sodir bo'lmasin degan maqsadda  o'z ezgu tilakarimni sizga tilayman.");
                        System.out.println("Hamisha sog' va salomat bo'lib yuring. Boshingiz omon, Uyingiz tinch, Oilangiz esa Baxtli bo'lsin.");
                        System.out.println("Hurmat bilan sizni qutlovchi va qadrlovchi " + nam3);
                        break;
                    case 5:
                        System.out.println("Iltimos tabrik egasining ismini kiriting!!!");
                        String nam4 = scanner.nextLine();
                        String nam5 = scanner.nextLine();
                        System.out.println("Tabrik egasining yoshini kiriting!!!");
                        String na1 = scanner.nextLine();
                        System.out.println("Tabrik yuboruvchining ismini kiriting!!!");
                        String nam6 = scanner.nextLine();
                        System.out.println("Assalomu aleykum hurmatli " + nam5 + " men sizni 1-iyun Bolalar kuni bilan qutlayman.");
                        System.out.println("Bu kun yurtimizdagi jamiyki bolalar uchun o'ta quvonchli kun hisoblanadi. ");
                        System.out.println("Shu fursatdan foydalangan holda sizga sog'lik, tinchlik, baxt, omad va o'qishlaringizga zafarlar tilayman.");
                        System.out.println("Endigina " + na1 + " yoshda ekansiz hayot yo'lingizda faqat olg'a intiling.");
                        System.out.println("Axir kelajak siz yoshlarning qo'lingizdaku. sizga doimo yuqori martabalarni tilayman.");
                        System.out.println("Hurmat bilan tabrik yo'llovchi " + nam6);
                        break;

                    case 6:
                        System.out.println("Tabrik egasini  ismini  kiriting!!!");
                        String na2 = scanner.nextLine();
                        String na3 = scanner.nextLine();
                        System.out.println("Tabrik yuboruvchini ismini kiriting!!!");
                        String na4 = scanner.nextLine();
                        int year2 = 1991;
                        boolean b = true;
                        if(year > 1991){
                            year -= year2;
                        }
                        System.out.println("Assalomu aleykum hurmatli " + na3 + " men sizni 1-sentabr jannatmakon O'zbekistonimizning " + year + " yillik mustaqilligi bilan chin qalbdan muborakbod etaman.");
                        System.out.println("O'zbek xalqi shu kungacha qancha-qancha azoblarni tortib keldi.");
                        System.out.println("Bu kunni kimlar kutmagan edi, ulug' bobokalonlarimiz shu kunlar uchun jonlarini fido qildilarku.");
                        System.out.println("Mana o'sha orziqib kutilgan kunlar ham keldi.");
                        System.out.println("Bu kunlarni biz qadriga yetishimiz zarur. Shu fursatdan foydalangan holda sizga tinchlik va omonlik tilab qolaman.");
                        System.out.println("Hurmat bilan sizni qadrlovchi yaqiningiz " + na4);
                        break;
                    case 7:
                        System.out.println("Iltimos Ustozingizning ism va familyasini kriting!!!");
                        String ustozismi = scanner.nextLine();
                        String ustozfamilyasi = scanner.nextLine();
                        System.out.println("Tabrik yo'llovchining ismini kiriting!!!");
                        String oquvchiismi = scanner.nextLine();
                        System.out.println("assalomu aleykum hurmatli ustozim " + ustozismi + ustozfamilyasi + " men sizni 1-oktabr Ustoz va Murabbiylar kuni bilan chin dildan tabriklayman.");
                        System.out.println("Siz bizga necha yil ta'lim bergan bo'lsangiz, shu bilimlar asosoida shu darajaga yetishib kelayapmiz.");
                        System.out.println("Ustoz otangdek ulug' degan xalqimizda naql bor, chindan ham siz bizning hayotimizdagi eng aziz insonlardan birisiz.");
                        System.out.println("Men sizga doimo sog'lik, tinchlik, totuvlik, omad, oilangizga baxt, ishlaringizga rivoj, uyingizga esa qut-baraka tilayman.");
                        System.out.println("Biz shogirdlaringiz baxtiga doimo kulib yuring. Bizning siz kabi ustozimiz borligidan hamisha faxrlanamiz.");
                        System.out.println("Hurmat bilan sizni qadrlovchi, hurmat qiluvchi kamtarin o'quvchingiz " + oquvchiismi);
                        break;
                    case 8:
                        System.out.println("Tabrik egasini  ismini  kiriting!!!");
                        String nan = scanner.nextLine();
                        String nan1 = scanner.nextLine();
                        System.out.println("Tabrik yuboruvchini ismini kiriting!!!");
                        String nan2 = scanner.nextLine();
                        int yearr = 1992;
                        boolean a = true;
                        if(year > 1992) {
                            year -= yearr;
                        }
                        System.out.println("Assalomu aleykum hurmatli " + nan1 + " men sizni 8-dekabr O'bekiston Respublikasining Konstitutsiya bayrami chin qutlamoqchiman.");
                        System.out.println("Mana bugun konstitutsiyamizning  " + year + " yilligi munosabati bilan chin qalbdan qutlayman.");
                        System.out.println("Sizga tuganmas baxt, omad, tinchlik, totuvlik, sog'lik va osoyishtalik tilayman.");
                        System.out.println("Ota-onangiz, do'stlaringiz, yaqinlaringiz va oilangiz baxtiga doimo sog' va salomat bo'lib yuring.");
                        System.out.println("Bu hayotda yayrab, yashnab, kulib va zavq olib yashang.");
                        System.out.println("Sizga 2 dunyo saodatini tilayman, u dunyoda ham, bu dunyoda ham birga bo'lishlik nasib qilsin.");
                        System.out.println(" Hurmat bilan " + nan2);
                        break;
                    default:

                }

            }





        }




    }






