package ucakRezv;


import java.util.ArrayList;
import java.util.Scanner;
public class UcakDemo {
	
	public static void main(String[] args) {
		 
		ArrayList<Ucak> ucakk = new ArrayList<Ucak>();
		ArrayList<Rezervasyon> rezervasyonlar = new ArrayList<Rezervasyon>();
		
		ucakk.add(new Ucak(1,true, 45));
		ucakk.add(new Ucak(2,false, 50));
		ucakk.add(new Ucak(3,true, 48));
		
		int secim = 1;
		Scanner scanner = new Scanner(System.in);
		
		for(Ucak b:ucakk) {
			b.displayUcakInfo();
		}
		
		while(secim==1) {
			System.out.println("1- Rezervasyon    2-Çıkış");
			secim = scanner.nextInt();
			if(secim == 1) {
				Rezervasyon rezervasyon = new Rezervasyon();
				if(( rezervasyon).isAvailable(rezervasyonlar,ucakk)) {
					rezervasyonlar.add(rezervasyon);
					
				}
				else
					System.out.println("Rezervasyonunuz Yapıldı."); 
			}
			
			
		}
		
	}

}
