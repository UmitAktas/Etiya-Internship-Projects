import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner alinacakVeri = new Scanner(System.in);
		System.out.println("Lütfen kilonuzu 'kg' cinsinden giriniz: ");
		int kilo = alinacakVeri.nextInt();
		System.out.println("Lütfen boyunuzu 'cm' cinsinden giriniz: ");
		int boy = alinacakVeri.nextInt();
		double vki = ((double)kilo/ (boy * boy))*10000;
		
		if(vki < 18.5) {
			System.out.println("Zayıfsınız.");
		}
		else if(vki < 24.9) {
			System.out.println("İdeal kilodasınız.");
		}
		else if(vki < 29.9) {
			System.out.println("Maalesef, şişmansınız.");
		}
		else if(vki < 34.9) {
			System.out.println("Maalesef, obezsiniz.");
		}
		else if(vki > 35) {
			System.out.println("Tehlikeli, aşırı obezsiniz.");
		}
		
		
	}
}