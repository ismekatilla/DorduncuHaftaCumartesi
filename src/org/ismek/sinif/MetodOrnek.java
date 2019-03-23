package org.ismek.sinif;

public class MetodOrnek {

	
	static void ekranaSafakYaz() {
		System.out.println("ŞAFAK");
	}
	
	static void birdenOnaKadarYazdir() {
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
	}
	
	static void toplaVeEkranaYaz(int sayi1, int sayi2) {
		int sonuc = sayi1 + sayi2;
		System.out.println(sonuc);
	}
	
	static int topla(int sayi1, int sayi2) {
		int sonuc = sayi1 + sayi2;
		return sonuc;
	}
	
	public static void main(String[] args) {
//		ekranaSafakYaz();
//		birdenOnaKadarYazdir();
//		toplaVeEkranaYaz(3,4);
//		toplaVeEkranaYaz(50, 12132);
		int toplam = topla(2, 5);
		yazdir(toplam);
		
		int toplam2 = topla(5, 7);
		yazdir(toplam2);
	}
	
	static void yazdir(int toplam2) {
		if (toplam2 > 10) {
			System.out.println("TEBRİKLER " + toplam2);
		} else {
			System.out.println("ÜZGÜNÜM " + toplam2);
		}
	}
}