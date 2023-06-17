import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("İdman programına hoş geldiniz...");

        String idmanlar  = "Geçerli hareketler... \n"
                            + "Burpee \n"
                            + "Pushup(şınav)\n"
                            + "Situp(Mekik)\n"
                            + "Squat";
        System.out.println(idmanlar);

        System.out.println("Bir idman oluşturun...");

        System.out.println("Burpee sayısı : ");
        int burpee = scanner.nextInt();

        System.out.println("Pushup sayısı : ");
        int pushup = scanner.nextInt();

        System.out.println("Situp sayısı : ");
        int situp = scanner.nextInt();

        System.out.println("Squat sayısı : ");
        int squat = scanner.nextInt();

        scanner.nextLine();


        Idman idman = new Idman(burpee,pushup,situp,squat);

        System.out.println("İdmanınınız başlıyor.....");

        while(idman.idmanBittiMi() == false){

            System.out.println("Haraket Türü (Burpee,Pushup,Situp,Squat) : ");
            String tur = scanner.nextLine();

            System.out.println("Haraketi kaç tekrar yapacaksınız : ");
            int sayi = scanner.nextInt();
            scanner.nextLine();

            idman.hareketYap(tur,sayi);
        }

        System.out.println("İdmanınızı başarıyla bitirdiniz...");

    }
}
























