import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String kullaniciAdi, sifre, secim,tekrarDene;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adı: ");
        kullaniciAdi = inp.nextLine();

        System.out.print("Şifre: ");
        sifre = inp.nextLine();

        if(kullaniciAdi.equals("ahpap") && sifre.equals("java.101")){
            System.out.print("Başarıyla Giriş Yaptınız. ");
    }

        else {
            System.out.println("Kullanıcı adı veya şifreniz yanlış.\nLütfen tekrar deneyiniz veya şifrenizi sıfırlayınız \nŞifrenizi sıfırlamak ister misiniz?" );}
        secim = inp.nextLine();
        if(secim.equals("Evet")){
            System.out.println("Lütfen Yeni Şifrenizi Giriniz: ");
            sifre = inp.nextLine();
            if(sifre.equals("java.101")){
                System.out.println("Şifreniz Eski Şifrenizle Aynı Olamaz!\nTekrar Denemek İster misiniz?");
            }
            else{
                System.out.println("Şifreniz Başarıyla Değiştirildi");
            }
            tekrarDene = inp.nextLine();
            if (tekrarDene.equals("Evet")){
                System.out.println("Lütfen Şifrenizi Tekrar Giriniz: ");
                sifre = inp.nextLine();
                if (sifre.equals("java.101")){
                    System.out.println("Hesabınız Donduruldu!");
                }
                else{
                    System.out.println("Şifreniz Başarıyla Değiştirildi");
                }
            }

        } else if(secim.equals ("Hayır")){
            System.out.println("Lütfen Eski Şifrenizi Giriniz: ");
            sifre = inp.nextLine();
            if (sifre.equals("java.101")){
                System.out.println("Başarıyla Giriş Yaptınız");
            }
            else {
                System.out.println("Hesabınız Donduruldu");
            }
        }
    }
}