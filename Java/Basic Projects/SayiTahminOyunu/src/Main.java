import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		int rastgeleSayi = (int)(Math.random()*10);
		Scanner okunacakSayi = new Scanner(System.in);
		System.out.print("Lütfen 0 ile 10 arasında bir sayı giriniz: ");
		int kullanicidanGelenSayi = okunacakSayi.nextInt();
		
		if(rastgeleSayi == kullanicidanGelenSayi) {
			System.out.println("Tebrikler, doğru tahmin ettiniz.");
		}
		else {
			System.out.println("Bilgisayarın aklındaki sayı: " + rastgeleSayi + "  Sizin tahmininiz: " + kullanicidanGelenSayi);
		}
		
	}
}
