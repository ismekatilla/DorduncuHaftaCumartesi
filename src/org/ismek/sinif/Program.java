package org.ismek.sinif;

public class Program {

	public static void main(String[] args) {
		Otomobil otomobilNesnesi = new Otomobil();
		otomobilNesnesi.marka = "ABC";
		otomobilNesnesi.modelYili = 2017;
		otomobilNesnesi.renk = "SARI";
		otomobilNesnesi.kapiSayisi = 4;
		double vergiHesapla = otomobilNesnesi.vergiHesapla();
		System.out.println(
				otomobilNesnesi.marka + 
				" markalı aracınızın " + 
				vergiHesapla +
				" TL vergi ödemesi vardır");
	}
}