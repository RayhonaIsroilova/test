import java.util.Random;
import java.util.Scanner;

public class imkoniyat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Assalomu aleykum Super imkoniyatli o'yinga xush kelibsiz.");
        System.out.println("Biz bir son o'yladik.");
        System.out.println("Uni topish uchun sizga 3 ta imkoniyat taqdim etamiz!");
        System.out.println("1~10 gacha istalgan raqam kiriting:");

        int imkoniyat1 = scanner.nextInt();
        short schetchik = 0;

        Random random = new Random();
        int num = 1 + random.nextInt(10);


        if (imkoniyat1 == num) {
            System.out.println("Tabriklaymiz siz g'olib bo'ldingiz, biz bilan birga bo'lganingiz uchun tashakkur");
            return;
        } else {
            System.out.println("Afsuski yutqazdingiz,sizda 2ta imkoniyat qoldi, qayta urinib ko'ring");
        }
         int imkoniyat2 = scanner.nextInt();

         if  (imkoniyat2 ==num && schetchik==0) {
             System.out.println("Tabriklaymiz siz g'olib bo'ldingiz, biz bilan birga bo'lganingiz uchun tashakkur ");
             schetchik++;
              return;
         }else {
             System.out.println("Afsuski yutqazdingiz, sizda 1 ta imkoniyat qoldi, qayta urinib ko'ring");
         }
         int imkoniyat3 = scanner.nextInt();

         if  (imkoniyat3 ==num && schetchik==0) {
             System.out.println("Tabriklaymiz siz g'olib bo'ldingiz, biz bilan birga bo'lganingiz uchun tashakkur");
             schetchik++;

         }else{
             System.out.println("Afsuski yutqazdingiz, sizda imkoniyatlar qolmadi");
             System.out.println("To'g'ri javob "+num+" edi");
             System.out.println("E'tiboringiz uchun tashakkur");




         }
    }








}
