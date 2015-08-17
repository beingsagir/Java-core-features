package constructor;

public class ASampleContructor {
	
	private int totalGears;
	private int totalSeats;
	private int totaldoors;
	
	public ASampleContructor(int gear, int seats, int doors){
		this.totalGears = gear;
		this.totalSeats = seats;
		this.setTotaldoors(doors);
	}

	public int getTotalGears() {
		return totalGears;
	}

	public void setTotalGears(int totalGear) {
		this.totalGears = totalGear;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public int getTotaldoors() {
		return totaldoors;
	}

	public void setTotaldoors(int totaldoors) {
		this.totaldoors = totaldoors;
	}
	

}
