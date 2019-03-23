package org.ismek.sinif;

public class Otomobil {

	public String marka;
	public int modelYili;
	public String renk;
	public byte kapiSayisi;
	
	// Yaşı 0-3 aralığı katsayı 10
	// Yaşı 3-6 aralığı katsayı 5
	// Yaşı 6- aralığı katsayı 2
	// İşlem Tutarı 100
	public double vergiHesapla() {
		int yas = 2019 - modelYili;
		double vergiTutari = 0d;
		if (yas <= 3) {
			vergiTutari = 10 * yas;
		} else if (yas <= 6) {
			vergiTutari = 5 * yas;
		} else {
			vergiTutari = 2 * yas;
		}
		return vergiTutari;
	}
	
	
}