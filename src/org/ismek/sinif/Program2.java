package org.ismek.sinif;

public class Program2 {

	public static void main(String[] args) {
		MatematikIslemleri matematikIslemleri = new MatematikIslemleri();
		
		int sayi1 = 4;
		int sayi2 = 5;
		
		int carpim = matematikIslemleri.carp(sayi1, sayi2);
		System.out.println(carpim);
		
		int toplam = matematikIslemleri.topla(sayi1, sayi2);
		System.out.println(toplam);
		
		float bolum = matematikIslemleri.bol(sayi1, sayi2);
		System.out.println(bolum);
		
		int fark = matematikIslemleri.cikar(sayi1, sayi2);
		System.out.println(fark);
		
		System.out.println(matematikIslemleri.sayac);
	}

}
