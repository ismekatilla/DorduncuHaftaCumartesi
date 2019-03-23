package org.ismek.sinif;

import java.util.Scanner;

public class YasHesaplaMetod {

	static int dogumYili;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Doğum yılı giriniz");
		dogumYili = scanner.nextInt();
		int yas = yasHesapla();
		System.out.println(yas);
	}
	
	static int yasHesapla() {
		return 2019 - dogumYili;
	}

}
