package ucakRezv;
import java.text.ParseException;
import java.util.*;
public class Rezervasyon {
	private static final int capacity = 0;
	String yolcuAdi;
	int ucakNo;
	Date date;
	
	
	 Rezervasyon(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Yolcunun İsmi: ");
		yolcuAdi = scanner.next();
		System.out.println("Uçak Numarasını Giriniz: ");
		ucakNo = scanner.nextInt();
		System.out.println("Tarih Giriniz   GG-AA-YYYY");
		String dateInput = scanner.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat ("GG-AA-YYYY");
		
		
		   date =  dateFormat.parse(dateInput);
		
		
	


	
	}


	public boolean isAvailable(ArrayList<Rezervasyon> rezervasyonlar, ArrayList<Ucak> ucakk) {
		int capacity = 0;
		for(Ucak ucak:ucakk) {
			if(ucak.getUcakNo() == ucakNo)
				capacity = ucak.getCapacity();
		}
		int booked = 0;
		for(Rezervasyon b:rezervasyonlar) {
			if(b.ucakNo == ucakNo && b.date.equals(date)) {
				booked++;
			}
		}
	 
	return booked<capacity?true:false;

		
	
	
		
	}


	


	
	

}
