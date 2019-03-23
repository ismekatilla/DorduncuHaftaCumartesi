package org.ismek.sinif;

public class MatematikIslemleri {

	int sayac = 0;
	
	int carp(int sayi1, int sayi2) {
		sayac++;
		int sonuc = sayi1 * sayi2;
		return sonuc;
	}
	
	float bol(int sayi1, int sayi2) {
		sayac++;
		float sonuc = sayi1 / (float)sayi2;
		return sonuc;
	}
	
	int topla(int sayi1, int sayi2) {
		sayac++;
		int sonuc = sayi1 + sayi2;
		return sonuc;
	}
	
	int cikar(int sayi1, int sayi2) {
		sayac++;
		int sonuc = sayi1 - sayi2;
		return sonuc;
	}
}