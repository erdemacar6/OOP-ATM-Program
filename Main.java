public class Main {
    public static void main(String[] args){
        ATM atm = new ATM();

        Hesap hesap = new Hesap("Erdem Acar" , "12345" , 1000000);

        atm.calis(hesap);
        System.out.println("Sistemden çıkılıyor");

    }
}
