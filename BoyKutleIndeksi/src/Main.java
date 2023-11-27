import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main=new Main();
		main.bkeHesaplama(main.boyKiloIndeksi2());
		//main.BoyKiloIndeksi();
		Scanner scanner=new Scanner(System.in);
		System.out.print("Kişinin ismini giriniz:");
		String isim=scanner.nextLine();
		System.out.print("Kişinin soyismini  giriniz:");
		String soyIsim=scanner.nextLine();
		System.out.print("Kişinin  boyunu giriniz(M):");
		double boy=scanner.nextDouble();
		System.out.print("Kişinin kilosunu giriniz(KG):");
		double kilo=scanner.nextDouble();

		main.BoyKiloIndeksi1(isim,soyIsim,boy,kilo);
		
		

		

	}
	public void BoyKiloIndeksi() {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("--------------------------------");
		System.out.println("---Boy Kilo Indeksi Hesaplama---");
		System.out.println("--------------------------------");
		System.out.print("Adınızı ve Soy Adınızı Giriniz:");
		String adVeSoyad=scanner.nextLine();
		
		System.out.println("--------------------------------");
		System.out.print("Lütfen Kilonuzu Giriniz(KG):");
		double kilo=scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("----------------------------------");
		System.out.print("Lütfen Boyunuzu Giriniz(M):");
		double boy=scanner.nextDouble();
		scanner.nextLine();
		
		double bke=kilo/(boy*boy);
		
		if(bke<18.5) {
			System.out.println(adVeSoyad+" isimli kişisi zayıftır ");
			System.out.println("Boy kütle indeksi:"+bke);
		}
		else if(bke>18.5 && bke<25.0) {
			System.out.println(adVeSoyad+" isimli kişisi normaldir");
			System.out.println("Boy kütle indeksi:"+bke);
		}
		else if(bke>25.0 && bke<30.0) {
			System.out.println(adVeSoyad+" isimli kişisi biraz kiloludur");
			System.out.println("Boy kütle indeksi:"+bke);
		}
		else if(bke>=30 && bke<35.0) {
			System.out.println(adVeSoyad+" isimli kişisi obezite derecesinde kilolu");
			System.out.println("Boy kütle indeksi:"+bke);
		}
		else {
			System.out.println(adVeSoyad+" isimli kişisi obezdir");
			System.out.println("Boy kütle indeksi:"+bke);
		}
		
	}
	
	//Uygulama kısmı
	public void BoyKiloIndeksi1(String Ad,String Soyad,double boy,double kilo) {
		System.out.println("--------------------------------");
		System.out.println("---Boy Kilo Indeksi Hesaplama---");
		System.out.println("--------------------------------");
		
		double bke=kilo/(boy*boy);
		if(bke<18.5) {
			System.out.println(Ad+" "+Soyad+" isimli kişisi zayıftır ");
			System.out.println("Boy kütle indeksi:"+bke);
		}
		else if(bke>18.5 && bke<25.0) {
			System.out.println(Ad+" "+Soyad+" isimli kişisi normaldir");
			System.out.println("Boy kütle indeksi:"+bke);
		}
		else if(bke>25.0 && bke<30.0) {
			System.out.println(Ad+" "+Soyad+" isimli kişisi biraz kiloludur");
			System.out.println("Boy kütle indeksi:"+bke);
		}
		else if(bke>=30 && bke<35.0) {
			System.out.println(Ad+" "+Soyad+" isimli kişisi obezite  derecesinde kiloludur.");
			System.out.println("Boy kütle indeksi:"+bke);
		}
		else {
			System.out.println(Ad+" "+Soyad+" isimli kişisi obezdir");
			System.out.println("Boy kütle indeksi:"+bke);
		}
		
	}
	public double boyKiloIndeksi2() {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("--------------------------------");
		System.out.println("---Boy Kilo Indeksi Hesaplama---");
		System.out.println("--------------------------------");
		System.out.print("Ad ve soyadınızı giriniz:");
		String adVeSoyad=scanner.nextLine();
		
		System.out.println("--------------------------------");
		System.out.print("Lütfen kilonuzu giriniz(KG):");
		double kilo=scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("----------------------------------");
		System.out.print("Lütfen Boyunuzu giriniz(M):");
		double boy=scanner.nextDouble();
		scanner.nextLine();
		
		double bke=kilo/(boy*boy);
		return bke;
		
	}
	public void bkeHesaplama(double bke) {
		if(bke<18.5) {
			System.out.println(" isimli kişisi zayıftır ");
			System.out.println("Boy kütle indeksi:"+bke);
		}
		else if(bke>18.5 && bke<25.0) {
			System.out.println(" isimli kişisi normaldir");
			System.out.println("Boy kütle indeksi:"+bke);
		}
		else if(bke>25.0 && bke<30.0) {
			System.out.println(" isimli kişisi biraz kiloludur");
			System.out.println("Boy kütle indeksi:"+bke);
		}
		else if(bke>=30 && bke<35.0) { 
			System.out.println(" isimli kişisi obezite derecesinde kiloludur");
			System.out.println("Boy kütle indeksi:"+bke);
		}
		else {
			System.out.println(" isimli kişisi obezdir");
			System.out.println("Boy kütle indeksi:"+bke);
		}
		https://ay.live/Dx4E
	}

}
