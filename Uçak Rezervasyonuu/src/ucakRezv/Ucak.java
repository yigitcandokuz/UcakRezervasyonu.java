package ucakRezv;

public class Ucak {
	private int ucakNo;
	private int capacity;
	private boolean durum;
	
	Ucak(int no, boolean ac, int cap){
		this.ucakNo = no;
		this.capacity = cap;
		this.durum = ac;
		
	}
	public boolean isAc() {	
		return durum;
	}
	
	
	public void setAc(boolean acc) {
		durum = acc;
	}

	int getKapasite() {
		return capacity;
	}
	
	public void setKapasite(int cap) {
		capacity = cap;
	}
	public int getUcakNo() {
		return ucakNo;
		
	}
	public void displayUcakInfo() {
		System.out.println("Uçak No:" + ucakNo + "Toplam Kapasite: " + capacity);
	}

	public int getCapacity() {
		// TODO Auto-generated method stub
		return 0;
	}
}
