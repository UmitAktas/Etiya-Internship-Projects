import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int rastgeleSayi = (int) (Math.random() * 3);
		String[] ifadeler = { "taş", "kağıt", "makas" };
		Scanner okunacakIfade = new Scanner(System.in);
		System.out.print("Taş-Kağıt-Makas ifadesinden birini yazınız: ");
		String kullanicidanGelenIfade = okunacakIfade.nextLine();
		if (kullanicidanGelenIfade.equals("taş")) {
			if (ifadeler[rastgeleSayi] == ifadeler[1]) {
				System.out.println("Üzgünüm, kaybettiniz.");
				System.out.println("Bilgisayarın yaptığı ifade: " + ifadeler[rastgeleSayi] + "  Sizin ifadeniz: "
						+ kullanicidanGelenIfade);
			} else if (ifadeler[rastgeleSayi] == ifadeler[2]) {
				System.out.println("Tebrikler, kazandınız.");
				System.out.println("Bilgisayarın yaptığı ifade: " + ifadeler[rastgeleSayi] + "  Sizin ifadeniz: "
						+ kullanicidanGelenIfade);
			} else {
				System.out.println("Berabere!");
				System.out.println("Bilgisayarın yaptığı ifade: " + ifadeler[rastgeleSayi] + "  Sizin ifadeniz: "
						+ kullanicidanGelenIfade);
			}
		}
		if (kullanicidanGelenIfade.equals("kağıt")) {
			if (ifadeler[rastgeleSayi] == ifadeler[2]) {
				System.out.println("Üzgünüm, kaybettiniz.");
				System.out.println("Bilgisayarın yaptığı ifade: " + ifadeler[rastgeleSayi] + "  Sizin ifadeniz: "
						+ kullanicidanGelenIfade);
			} else if (ifadeler[rastgeleSayi] == ifadeler[0]) {
				System.out.println("Tebrikler, kazandınız.");
				System.out.println("Bilgisayarın yaptığı ifade: " + ifadeler[rastgeleSayi] + "  Sizin ifadeniz: "
						+ kullanicidanGelenIfade);
			} else {
				System.out.println("Berabere!");
				System.out.println("Bilgisayarın yaptığı ifade: " + ifadeler[rastgeleSayi] + "  Sizin ifadeniz: "
						+ kullanicidanGelenIfade);
			}
		}
		if (kullanicidanGelenIfade.equals("makas")) {
			if (ifadeler[rastgeleSayi] == ifadeler[0]) {
				System.out.println("Üzgünüm, kaybettiniz.");
				System.out.println("Bilgisayarın yaptığı ifade: " + ifadeler[rastgeleSayi] + "  Sizin ifadeniz: "
						+ kullanicidanGelenIfade);
			} else if (ifadeler[rastgeleSayi] == ifadeler[1]) {
				System.out.println("Tebrikler, kazandınız.");
				System.out.println("Bilgisayarın yaptığı ifade: " + ifadeler[rastgeleSayi] + "  Sizin ifadeniz: "
						+ kullanicidanGelenIfade);
			} else {
				System.out.println("Berabere!");
				System.out.println("Bilgisayarın yaptığı ifade: " + ifadeler[rastgeleSayi] + "  Sizin ifadeniz: "
						+ kullanicidanGelenIfade);
			}
		}
	}
}