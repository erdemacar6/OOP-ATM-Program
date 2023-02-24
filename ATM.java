import java.util.Scanner;

public class ATM {
    public void calis(Hesap hesap){

        Login login = new Login();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bankamıza hoş geldiniz.");

        System.out.println("-------------------------");
        System.out.println("Kullanıcı girişi");
        System.out.println("-------------------------");

        int giris_hakki = 5;

        while (true){
            if (login.login(hesap)){
                System.out.println("Giriş başarılı");
                break;
            }
            else {
                System.out.println("Giriş başarısız");
                giris_hakki -= 1;
                System.out.println("Kalan giriş hakkı : " + giris_hakki);
            }
            if (giris_hakki == 0){
                System.out.println("Giriş hakkınız kalmamıştır. Hesabını bloke olmuştur lütfen müşteri hizmetlini arayın.");
                return;
            }

        }
        System.out.println("-------------------------");
        String islemler = "1. Bakiye görüntüle\n"
                        + "2. Para yatırma\n"
                        + "3. Para çekme\n"
                        + "Çıkmak için q'ya basınız.";
        System.out.println(islemler);
        System.out.println("-------------------------");

        while (true){
            System.out.println("İşlemi seçiniz");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Sistemden çıkılıyor");
                scanner.nextLine();
                break;
            }
            else if (islem.equals("1")) {
                System.out.println("Bakiye : " + hesap.getBakiye());

            }
            else if (islem.equals("2")) {
                System.out.println("Yatırmak istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);
                System.out.println("Bakiye : " + hesap.getBakiye());

            }
            else if (islem.equals("3")){
                System.out.println("Çekmek istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCekme(tutar);

            }
            else {
                System.out.println("Geçersiz işlem");
            }
        }
    }
}
