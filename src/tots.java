import java.util.Scanner;



public class tots {
    public static void main(String[] args) {
        //Degiskenleri olustur
        int matematik , fizik , kimya , turkce , tarih , muzik;

        //Scanner sinifimizi tanimladık
        Scanner inp = new Scanner(System.in);

        //Kullanicidan degerini al
        System.out.print("Matematik notunuz : ");
        matematik = inp.nextInt();
        System.out.print("Fizik notunuz : ");
        fizik = inp.nextInt();
        System.out.print("Kimya notunuz : ");
        kimya = inp.nextInt();
        System.out.print("Türkçe notunuz : ");
        turkce = inp.nextInt();
        System.out.print("Tarih notunuz : ");
        tarih = inp.nextInt();
        System.out.print("Müzik notunuz : ");
        muzik = inp.nextInt();

        int toplam = matematik + fizik + kimya + turkce + tarih + muzik ;
        double sonuc = (toplam / 6);
        System.out.println(sonuc);
        System.out.println(sonuc > 60.0 ? "Sınıfı Geçti" : "Sıfta Kaldı");





    }
}